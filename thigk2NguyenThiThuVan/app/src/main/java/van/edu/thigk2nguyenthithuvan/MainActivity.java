package van.edu.thigk2nguyenthithuvan;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnCau1).setOnClickListener {
            startActivity(Intent(this, Cau1Activity::class.java))
        }
        findViewById<Button>(R.id.btnCau2).setOnClickListener {
            startActivity(Intent(this, Cau2Activity::class.java))
        }
        findViewById<Button>(R.id.btnCau3).setOnClickListener {
            startActivity(Intent(this, Cau3Activity::class.java))
        }
        findViewById<Button>(R.id.btnCau4).setOnClickListener {
            startActivity(Intent(this, Cau4Activity::class.java))
        }
    }
}