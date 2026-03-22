package van.edu.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKq;
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
    }
    void TimDieuKien(){
        EditText editTextSo1 = findViewById(R.id.edtSo1);
        EditText editTextSo2 = findViewById(R.id.edtSo2);
        EditText editTextKQ = findViewById(R.id.edtKetQua);
    }
    // xử lý cộng
    void XuLyCong(View v){
        EditText editTextSo1 = findViewById(R.id.edtSo1);
        EditText editTextSo2 = findViewById(R.id.edtSo2);

        String sothu1 = editTextSo1.getText().toString();
        String sothu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);

        float Tong = soA + soB;

        EditText editTextKQ = findViewById(R.id.edtKetQua);

        String chuoiKQ = String.valueOf(Tong);

        editTextKQ.setText(chuoiKQ);
    }
    void XuLyTru(View v){
        EditText editTextSo1 = findViewById(R.id.edtSo1);
        EditText editTextSo2 = findViewById(R.id.edtSo2);

        String sothu1 = editTextSo1.getText().toString();
        String sothu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);

        float Tong = soA - soB;

        EditText editTextKQ = findViewById(R.id.edtKetQua);

        String chuoiKQ = String.valueOf(Tong);

        editTextKQ.setText(chuoiKQ);
    }
    void XuLyNhan(View v){
        EditText editTextSo1 = findViewById(R.id.edtSo1);
        EditText editTextSo2 = findViewById(R.id.edtSo2);

        String sothu1 = editTextSo1.getText().toString();
        String sothu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);

        float Tong = soA * soB;

        EditText editTextKQ = findViewById(R.id.edtKetQua);

        String chuoiKQ = String.valueOf(Tong);

        editTextKQ.setText(chuoiKQ);
    }
    void XuLyChia(View v){
        EditText editTextSo1 = findViewById(R.id.edtSo1);
        EditText editTextSo2 = findViewById(R.id.edtSo2);

        String sothu1 = editTextSo1.getText().toString();
        String sothu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(sothu1);
        float soB = Float.parseFloat(sothu2);

        float Tong = soA / soB;

        EditText editTextKQ = findViewById(R.id.edtKetQua);

        String chuoiKQ = String.valueOf(Tong);

        editTextKQ.setText(chuoiKQ);
    }
}