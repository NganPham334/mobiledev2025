package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment forecast = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_view, forecast).commit();
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