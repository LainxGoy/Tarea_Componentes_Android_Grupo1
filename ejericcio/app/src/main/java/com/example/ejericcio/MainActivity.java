package com.example.ejericcio;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editText);
        LinearLayout rootLayout = findViewById(R.id.rootLayout);
        SwitchCompat switchMode = findViewById(R.id.switch1);
        Button button = findViewById(R.id.button);
        switchMode.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                rootLayout.setBackgroundColor(Color.BLACK);
                TEXT_SERVICES_MANAGER_SERVICE(Color.WHITE);
            } else {
                rootLayout.setBackgroundColor(Color.WHITE);
            }
        });




        button.
                setOnClickListener(v -> {
            String textoIngresado = editText.getText().toString();
            if (!textoIngresado.isEmpty()) {
                Toast.makeText(MainActivity.this, "Texto: " + textoIngresado, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Ingrese un nombre", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void TEXT_SERVICES_MANAGER_SERVICE(int white) {
    }
}
