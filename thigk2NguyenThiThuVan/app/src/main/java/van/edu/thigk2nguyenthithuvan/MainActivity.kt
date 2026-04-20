package van.edu.thigk2nguyenthithuvan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCau1 = findViewById<Button>(R.id.btnCau1)
        val btnCau2 = findViewById<Button>(R.id.btnCau2)
        val btnCau3 = findViewById<Button>(R.id.btnCau3)
        val btnCau4 = findViewById<Button>(R.id.btnCau4)

        btnCau1.setOnClickListener {
            val intent = Intent(this, Cau1Activity::class.java)
            startActivity(intent)
        }

        btnCau2.setOnClickListener {
            val intent = Intent(this, Cau2Activity::class.java)
            startActivity(intent)
        }

        btnCau3.setOnClickListener {
            val intent = Intent(this, Cau3Activity::class.java)
            startActivity(intent)
        }

        btnCau4.setOnClickListener {
            val intent = Intent(this, Cau4Activity::class.java)
            startActivity(intent)
        }
    }
}