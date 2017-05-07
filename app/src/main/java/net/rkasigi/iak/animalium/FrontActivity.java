package net.rkasigi.iak.animalium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FrontActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        final EditText textName = (EditText) findViewById(R.id.editTextName);
        Button buttonMasuk = (Button) findViewById(R.id.buttonEnter);
        final Intent i = new Intent(this, MainActivity.class);


        buttonMasuk.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String name = textName.getText().toString();
                i.putExtra("loginName", name);
                startActivity(i);
                finish();
            }
        });
    }
}
