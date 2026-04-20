package van.edu.thigk2nguyenthithuvan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Cau1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cau1)

        val edtDai = findViewById<EditText>(R.id.edtDai)
        val edtRong = findViewById<EditText>(R.id.edtRong)
        val btnTinh = findViewById<Button>(R.id.btnTinh)
        val txtKq = findViewById<TextView>(R.id.txtKq)

        btnTinh.setOnClickListener {
            val dai = edtDai.text.toString().toDoubleOrNull()
            val rong = edtRong.text.toString().toDoubleOrNull()

            if (dai != null && rong != null) {
                val chuVi = (dai + rong) * 2
                val dienTich = dai * rong

                txtKq.text = "Chu vi: $chuVi\nDiện tích: $dienTich"
            } else {
                txtKq.text = "Vui lòng nhập đầy đủ số hợp lệ"
            }
        }
    }
}