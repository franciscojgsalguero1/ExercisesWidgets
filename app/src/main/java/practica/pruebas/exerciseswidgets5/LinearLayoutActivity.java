package practica.pruebas.exerciseswidgets5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        Button buttonOne = findViewById(R.id.button_one);
        Button buttonTwo = findViewById(R.id.button_two);
        Button buttonThree = findViewById(R.id.button_three);
        TextView message = (TextView) findViewById(R.id.changeText);
        message.setText("Welcome to LinearLayout Activity");

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // añadimos el texto al TextView
                message.setText("Button One clicked");
                // mostramos un mensaje en el Toast
                Toast.makeText(LinearLayoutActivity.this, "Button One Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message.setText("Button Two clicked");
                Toast.makeText(LinearLayoutActivity.this, "Button Two Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message.setText("Button Three clicked");
                Toast.makeText(LinearLayoutActivity.this, "Button Three Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.buttonBackToMenu).setOnClickListener(view -> {
            Intent intent = new Intent(LinearLayoutActivity.this, MenuActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish(); // Opcional, para cerrar la actividad actual
        });

    }
}
