package vn.edu.usth.usthweather;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.VERTICAL);
        TextView text = new TextView(getActivity());
        text.setText("Thursday");
        layout.addView(text);
        ImageView image = new ImageView(getActivity());
        image.setImageResource(R.drawable.forcastshit);
        layout.addView(image);
        return layout;
    }
}