package van.edu.appmonan;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvDSMonAn;
    ArrayList<MonAn> dsMonAn;
    MonAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDSMonAn = findViewById(R.id.lvDSMonAn);

        dsMonAn = new ArrayList<>();
        dsMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Ngon tuyệt", R.drawable.cts));
        dsMonAn.add(new MonAn("Cơm sườn trứng", 25000, "Đậm đà", R.drawable.cst));
        dsMonAn.add(new MonAn("Gà xối mỡ", 30000, "Giòn rụm", R.drawable.cg));
        dsMonAn.add(new MonAn("Sườn bì chả", 30000, "Đặc trưng", R.drawable.sb));
        dsMonAn.add(new MonAn("Đặc biệt", 40000, "Full topping", R.drawable.db));

        adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);

        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonAn monAn = dsMonAn.get(position);
                Toast.makeText(MainActivity.this, monAn.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}