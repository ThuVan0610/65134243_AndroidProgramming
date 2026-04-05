package van.edu.fragmentex_statically;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity implements FooterFragment.OnFooterButtonClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // First launch: show Fragment1 by default. On rotation, let FragmentManager restore state.
        if (savedInstanceState == null) {
            showFragment(1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    public void onFooterButtonSelected(int index) {
        showFragment(index);
    }

    private void showFragment(int index) {
        Fragment fragment;
        switch (index) {
            case 2:
                fragment = new Fragment2();
                break;
            case 3:
                fragment = new Fragment3();
                break;
            case 1:
            default:
                fragment = new Fragment1();
                break;
        }

        getSupportFragmentManager()
                .beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}