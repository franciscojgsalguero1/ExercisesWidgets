package practica.pruebas.exerciseswidgets5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class RadioGroupActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private LinearLayout orientation;
    private LinearLayout gravity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        orientation = findViewById(R.id.orientation_layout);
        gravity = findViewById(R.id.gravity_layout);

        RadioGroup radioGroup = findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(this);

        // botón para volver al menú
        findViewById(R.id.buttonBackToMenu).setOnClickListener(view -> {
            Intent intent = new Intent(RadioGroupActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish(); // Opcional, para cerrar la actividad actual
        });
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        /*switch (checkedId) {
            case R.id.horizontal:
                orientation.setOrientation(LinearLayout.HORIZONTAL);
                break;

            case R.id.vertical:
                orientation.setOrientation(LinearLayout.VERTICAL);
                break;

            case R.id.left:
                gravity.setGravity(Gravity.LEFT);
                break;

            case R.id.center:
                gravity.setGravity(Gravity.CENTER_HORIZONTAL);
                break;

            case R.id.right:
                gravity.setGravity(Gravity.RIGHT);
                break;
        }*/
    }
}
