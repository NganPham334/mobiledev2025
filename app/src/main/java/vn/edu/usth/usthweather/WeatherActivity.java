package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Fragment pager = new CollectionFragment();
//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.pager, pager)
//                .commit();
        ViewPager2 pager = findViewById(R.id.pager);
        FragmentAdapter adapter = new FragmentAdapter(this);
        pager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        new TabLayoutMediator(tabLayout, pager, (tab, position) -> tab.setText("Page " + (position + 1))).attach();
        for (StackTraceElement stelement : Thread.currentThread().getStackTrace()) {
            Log.i("STLog", stelement.toString());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        for (StackTraceElement stelement : Thread.currentThread().getStackTrace()) {
            Log.i("STLog", stelement.toString());
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        for (StackTraceElement stelement : Thread.currentThread().getStackTrace()) {
            Log.i("STLog", stelement.toString());
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        for (StackTraceElement stelement : Thread.currentThread().getStackTrace()) {
            Log.i("STLog", stelement.toString());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        for (StackTraceElement stelement : Thread.currentThread().getStackTrace()) {
            Log.i("STLog", stelement.toString());
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        for (StackTraceElement stelement : Thread.currentThread().getStackTrace()) {
            Log.i("STLog", stelement.toString());
        }
    }
}