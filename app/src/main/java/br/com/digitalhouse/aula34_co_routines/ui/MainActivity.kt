package br.com.digitalhouse.aula34_co_routines.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import br.com.digitalhouse.aula34_co_routines.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import java.lang.Runnable

class MainActivity : AppCompatActivity() {
    val scope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Thread(
//            Runnable {
//                Thread.sleep(2000)
//                startActivity(Intent(this, HomeActivity::class.java))
//                finish()
//            }
//        ).start()

//        Handler(Looper.getMainLooper()).postDelayed({
//            startActivity(Intent(this, HomeActivity::class.java))
//            finish()
//        }, 2000)

        scope.launch {
            delay(2000)
            startActivity(Intent(this@MainActivity, HomeActivity::class.java))
            finish()
        }
    }
}