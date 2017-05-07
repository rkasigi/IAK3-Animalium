package net.rkasigi.iak.animalium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String loginName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginName = getIntent().getStringExtra("loginName");

        Toast.makeText(this, loginName, Toast.LENGTH_LONG).show();
    }
}
