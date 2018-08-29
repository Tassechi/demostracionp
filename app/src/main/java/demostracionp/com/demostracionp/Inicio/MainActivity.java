package demostracionp.com.demostracionp.Inicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import demostracionp.com.demostracionp.Main2Activity;
import demostracionp.com.demostracionp.R;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (PreferenceManager.checkPref(this, PreferenceManager.PREF_SW1)) {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
            finish();

        }

        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = ((EditText) findViewById(R.id.user)).getText().toString();
                String password = ((EditText) findViewById(R.id.pass)).getText().toString();

                if (username.equals("Edutec") & password.equals("12345")) {
                    PreferenceManager.setPref(v.getContext(), PreferenceManager.PREF_SW1,"1");
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();

                }

            }
        });




    }
}

