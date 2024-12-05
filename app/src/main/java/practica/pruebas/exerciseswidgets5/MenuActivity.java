package practica.pruebas.exerciseswidgets5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Find buttons by their IDs
        Button game1Button = findViewById(R.id.game1Button);

        // Set click listeners for the buttons
        game1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // recuperamos el menú del juego y lo adaptamos. La clase a la que apunta es provisional
                // Navigate to Game 1 Activity
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
