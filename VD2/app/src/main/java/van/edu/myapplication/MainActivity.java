package van.edu.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TimDieuKien();
        // gắn bộ lắng nghe sự kiện và code xử lý cho từng nút
        View.OnClickListener bolangngheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // xu ly cong o day
            }
        };
        nutCong.setOnClickListener(bolangngheCong);
        View.OnClickListener bolangngheTru = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // xu ly Tru o day
            }
        };
        nutTru.setOnClickListener(bolangngheTru);
        View.OnClickListener bolangngheNhan = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // xu ly Nhan o day
            }
        };
        nutNhan.setOnClickListener(bolangngheNhan);
        View.OnClickListener bolangngheChia = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // xu ly chia o day
            }
        };
        nutChia.setOnClickListener(bolangngheChia);
    }
    void TimDieuKien(){
        editTextSo1 = findViewById(R.id.edtSo1);
        editTextSo2 = findViewById(R.id.edtSo2);
        editTextKQ = findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
    // xử lý cộng
    public void XuLyCong(View v){

        String sothu1 = editTextSo1.getText().toString();
        String sothu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);

        float Tong = soA + soB;

        String chuoiKQ = String.valueOf(Tong);

        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyTru(View v){

        String sothu1 = editTextSo1.getText().toString();
        String sothu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);

        float Hieu = soA - soB;

        String chuoiKQ = String.valueOf(Hieu);

        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyNhan(View v){

        String sothu1 = editTextSo1.getText().toString();
        String sothu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);

        float Tich = soA * soB;

        String chuoiKQ = String.valueOf(Tich);

        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyChia(View v){

        String sothu1 = editTextSo1.getText().toString();
        String sothu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);

        float Thuong = soA / soB;

        String chuoiKQ = String.valueOf(Thuong);

        editTextKQ.setText(chuoiKQ);
    }
}