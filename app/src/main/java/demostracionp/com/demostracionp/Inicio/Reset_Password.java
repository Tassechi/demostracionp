package demostracionp.com.demostracionp.Inicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import demostracionp.com.demostracionp.R;

public class Reset_Password extends AppCompatActivity {

    private EditText inputEmail;
    private Button btnReset, btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset__password);

            btnBack = (Button) findViewById(R.id.btn_reset_password);


            btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
    }
}
