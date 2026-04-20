package van.edu.thigk2nguyenthithuvan

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.OnApplyWindowInsetsListener
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Cau2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Hiển thị list view
        // B1: Cần có dữ liệu để hiển thị
        // từ cơ sở dữ liệu(SQL, MySQL, XML,...)
        // Ở bài này hard-code dữ liệu trực tiếp
        // Cần biến phù hợp để chứa dữ liệu
        val dsTenTinhThanh = ArrayList<String?>() // tạo thể hiện cụ thể
        // Thêm dữ liệu ở đây
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

        // B2: Tạo Adapter
        val adapterTinhThanh = ArrayAdapter<String?>(
            this, android.R.layout.simple_list_item_1, dsTenTinhThanh
        )
        // B3: Gắn vào điều khiển hiện thị ListView
        // 3.1 Tìm điều khiển hiện thị ListView
        val lvTenTinhThanh = findViewById<ListView?>(R.id.lvDanhSachTT)
        // 3.2 Gắn Adapter vào ListView
        lvTenTinhThanh.setAdapter(adapterTinhThanh)
        // 3.3 Lắng nghe và xử lý sự kiện user tương tác để sau
        // Tạo bộ lắng nghe và xử lý sự kiện OnItemClick, đặt vào một biến
        lvTenTinhThanh.setOnItemClickListener(object : OnItemClickListener {
            // Thay đổi trong MainActivity.java tại phần setOnItemClickListenerlvTenTinhThanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            override fun onItemClick(
                adapterView: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Lấy tên tỉnh thành tại vị trí được click
                val tenTinhThanh = dsTenTinhThanh.get(position)
                // Hiển thị thông báo
                Toast.makeText(
                    this@MainActivity,
                    "Bạn vừa chọn: " + tenTinhThanh,
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
        ViewCompat.setOnApplyWindowInsetsListener(
            findViewById<View?>(R.id.main),
            OnApplyWindowInsetsListener { v: View?, insets: WindowInsetsCompat? ->
                val systemBars = insets!!.getInsets(WindowInsetsCompat.Type.systemBars())
                v!!.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            })
    }
}