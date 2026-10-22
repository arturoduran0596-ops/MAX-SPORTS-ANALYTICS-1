package com.maxsports.analytics;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(32, 48, 32, 32);
        layout.setBackgroundColor(Color.rgb(12, 22, 38));
        TextView title = new TextView(this);
        title.setText("MAX SPORTS ANALYTICS");
        title.setTextColor(Color.WHITE);
        title.setTextSize(25);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);
        TextView subtitle = new TextView(this);
        subtitle.setText("Versión inicial • Sin datos en vivo");
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setTextSize(15);
        subtitle.setGravity(Gravity.CENTER);
        layout.addView(subtitle);
        TextView result = new TextView(this);
        result.setTextColor(Color.WHITE);
        result.setTextSize(17);
        result.setPadding(0, 35, 0, 0);
        result.setText("Selecciona un deporte para comenzar.");
        for (String sport : new String[]{"Fútbol", "NFL", "NBA", "NHL", "MLB"}) {
            Button button = new Button(this);
            button.setText(sport);
            button.setOnClickListener(v -> result.setText(sport + ": módulo preparado para integrar estadísticas, modelos y pronósticos. Todavía no hay resultados reales ni predicciones verificadas."));
            layout.addView(button);
        }
        layout.addView(result);
        setContentView(layout);
    }
}
