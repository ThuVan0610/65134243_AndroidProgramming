package van.edu.usingrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewData;
    RecyclerView recyclerViewLand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // 1. chuẩn bị dữ liệu
        recyclerViewData = getDataForRecyclerView();

        // 2. tìm RecyclerView
        recyclerViewLand = findViewById(R.id.recyclerLand);

        // 3. layout dạng grid 2 cột
        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 2);
        recyclerViewLand.setLayoutManager(layoutGrid);

        // 4. adapter
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewData);

        // 5. gán adapter
        recyclerViewLand.setAdapter(landScapeAdapter);
    }

    // 👉 Đặt method ra ngoài onCreate
    private ArrayList<LandScape> getDataForRecyclerView() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<>();

        dsDuLieu.add(new LandScape("r2", "Chung cư 2 phòng ngủ"));
        dsDuLieu.add(new LandScape("r3", "Chung cư 3 phòng ngủ"));
        dsDuLieu.add(new LandScape("r4", "Chung cư 1 phòng đơn gác"));
        dsDuLieu.add(new LandScape("r5", "Chung cư 2 phòng đôi"));
        dsDuLieu.add(new LandScape("r6", "Chung cư 2 phòng đơn"));
        dsDuLieu.add(new LandScape("r7", "Chung cư 1 phòng đôi 2 phòng đơn"));

        return dsDuLieu;
    }
}