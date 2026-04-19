package van.edu.itend

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MHDangNhap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mhdang_nhap)
    }

    fun QuayVe(v: View?) {
        val iMHChinh = Intent(this@MHDangNhap, MainActivity::class.java)
        startActivity(iMHChinh)
    }
}
