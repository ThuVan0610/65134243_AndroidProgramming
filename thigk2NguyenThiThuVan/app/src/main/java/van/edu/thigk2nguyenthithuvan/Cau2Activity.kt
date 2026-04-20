package van.edu.thigk2nguyenthithuvan

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Cau2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cau2)

        val dsTenTinhThanh = ArrayList<String>()

        dsTenTinhThanh.add("Hà Nội")
        dsTenTinhThanh.add("Hồ Chí Minh")
        dsTenTinhThanh.add("Đà Nẵng")
        dsTenTinhThanh.add("Cần Thơ")
        dsTenTinhThanh.add("An Giang")
        dsTenTinhThanh.add("Bà Rịa - Vũng Tàu")
        dsTenTinhThanh.add("Bạc Liêu")
        dsTenTinhThanh.add("Bắc Kạn")
        dsTenTinhThanh.add("Bắc Giang")
        dsTenTinhThanh.add("Bắc Ninh")
        dsTenTinhThanh.add("Bến Tre")
        dsTenTinhThanh.add("Bình Dương")
        dsTenTinhThanh.add("Bình Định")
        dsTenTinhThanh.add("Bình Phước")
        dsTenTinhThanh.add("Bình Thuận")
        dsTenTinhThanh.add("Cà Mau")
        dsTenTinhThanh.add("Cao Bằng")

        val adapterTinhThanh = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            dsTenTinhThanh
        )

        val lvTenTinhThanh = findViewById<ListView>(R.id.lvDanhSachTT)

        lvTenTinhThanh.adapter = adapterTinhThanh

        lvTenTinhThanh.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position, _ ->
                val tenTinhThanh = dsTenTinhThanh[position]

                Toast.makeText(
                    this@Cau2Activity,
                    "Bạn vừa chọn: $tenTinhThanh",
                    Toast.LENGTH_SHORT
                ).show()
            }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}