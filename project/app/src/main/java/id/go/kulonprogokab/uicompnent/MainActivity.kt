package id.go.kulonprogokab.uicompnent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgBtn = findViewById<ImageButton>(R.id.imgButtonAdd)
        imgBtn.setOnClickListener {
            Toast.makeText(this@MainActivity, "Event handling Add Berhasil", Toast.LENGTH_LONG).show()
        }

        val imgBtn2 = findViewById<ImageButton>(R.id.imgButtonCancel)
        imgBtn2.setOnClickListener {
            Toast.makeText(this@MainActivity, "Event handling Cancel Berhasil", Toast.LENGTH_LONG).show()
        }

    }


}