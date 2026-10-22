
package com.maxsports.analytics;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(32, 48, 32, 32);

        TextView title = new TextView(this);
        title.setText("MAX SPORTS ANALYTICS");
        title.setTextSize(24);
        layout.addView(title);

        String[] sports = {
            "FUTBOL", "NFL", "NBA", "NHL", "MLB"
        };

        for (String sport : sports) {
            Button button = new Button(this);
            button.setText(sport);
            layout.addView(button);
        }

        setContentView(layout);
    }
}
