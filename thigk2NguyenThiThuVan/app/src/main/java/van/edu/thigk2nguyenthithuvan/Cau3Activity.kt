package van.edu.thigk2nguyenthithuvan

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class Cau3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cau3)

        val lv = findViewById<ListView>(R.id.lvDuLich)

        val ds = listOf(
            DiaDiem(R.drawable.ic_launcher_background, "Vinpearl", "Đảo Hòn Tre"),
            DiaDiem(R.drawable.ic_launcher_background, "Tháp Bà", "Vĩnh Phước"),
            DiaDiem(R.drawable.ic_launcher_background, "Hòn Chồng", "Vĩnh Phước"),
            DiaDiem(R.drawable.ic_launcher_background, "Chùa Long Sơn", "Phương Sơn"),
            DiaDiem(R.drawable.ic_launcher_background, "Chợ Đầm", "Vạn Thạnh")
        )

        lv.adapter = DiaDiemAdapter(this, ds)
    }
}