package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WeatherActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    MaterialToolbar topAppBar;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Fragment pager = new CollectionFragment();
//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.pager, pager)
//                .commit();
//        ViewPager2 pager = findViewById(R.id.pager);
//        FragmentAdapter adapter = new FragmentAdapter(this);
//        pager.setAdapter(adapter);
//        TabLayout tabLayout = findViewById(R.id.tab_layout);
//        new TabLayoutMediator(tabLayout, pager, (tab, position) -> tab.setText("Page " + (position + 1))).attach();
//        for (StackTraceElement stelement : Thread.currentThread().getStackTrace()) {
//            Log.i("STLog", stelement.toString());
//        }
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        topAppBar = findViewById(R.id.topAppBar);

        // Set toolbar as ActionBar
        setSupportActionBar(topAppBar);

        // Setup drawer toggle (hamburger icon)
        toggle = new ActionBarDrawerToggle(this, drawerLayout, topAppBar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Handle navigation item clicks
        navigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_home) {
                Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show();
            } else if (id == R.id.nav_settings) {
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
            } else if (id == R.id.nav_about) {
                Toast.makeText(this, "About clicked", Toast.LENGTH_SHORT).show();
            }

            drawerLayout.closeDrawers();
            return true;
        });
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
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