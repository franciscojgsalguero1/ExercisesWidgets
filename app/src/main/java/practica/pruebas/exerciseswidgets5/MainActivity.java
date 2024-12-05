package practica.pruebas.exerciseswidgets5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvRadioGroup = findViewById(R.id.tv_radio_group);
        TextView tvLinearLayout = findViewById(R.id.tv_linear_layout);
        TextView tvRelativeLayout = findViewById(R.id.tv_relative_layout);
        TextView tvOverlap = findViewById(R.id.tv_overlap);
        TextView tvForm = findViewById(R.id.tv_form);

        tvRadioGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RadioGroupActivity.class));
            }
        });

        tvLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LinearLayoutActivity.class));
            }
        });

        tvRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RelativeLayoutActivity.class));
            }
        });

        tvOverlap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OverlapActivity.class));
            }
        });

        tvForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FormActivity.class));
            }
        });
    }
}
