package net.rkasigi.iak.animalium;

import android.support.v4.util.ArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String loginName;
    RecyclerView recyclerView;
    List<AnimalModel> animalModelList;
    AnimalAdapter animalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginName = getIntent().getStringExtra("loginName");
        ((TextView)findViewById(R.id.textViewTitleDisplay)).setText("Hallo " + loginName);

        //Toast.makeText(this, loginName, Toast.LENGTH_LONG).show();

        animalModelList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewMain);
        animalAdapter = new AnimalAdapter(animalModelList, getApplicationContext());


        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(animalAdapter);
        prepareData();
    }

    private void prepareData() {

        animalModelList.add(new AnimalModel("Banteng", "Bull", R.drawable.anbull));
        animalModelList.add(new AnimalModel("Anak Ayam", "Chick", R.drawable.anchick));
    }
}
