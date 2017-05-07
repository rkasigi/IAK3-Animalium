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


    RecyclerView recyclerView;
    List<AnimalModel> animalModelList;
    AnimalAdapter animalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String loginName = getIntent().getStringExtra("loginName");
        ((TextView)findViewById(R.id.textViewTitleDisplay)).setText("Selamat datang " + loginName);

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
        animalModelList.add(new AnimalModel("Ayam", "Chicken", R.drawable.anchick));
        animalModelList.add(new AnimalModel("Kepiting", "Crab", R.drawable.ancrab));
        animalModelList.add(new AnimalModel("Rubah", "Fox", R.drawable.anfox));
        animalModelList.add(new AnimalModel("Landak", "Hedgehong", R.drawable.anhedgehog));
        animalModelList.add(new AnimalModel("Kuda Nil", "Hippopotamus", R.drawable.anhippopotamus));
        animalModelList.add(new AnimalModel("Koala", "Koala", R.drawable.ankoala));
        animalModelList.add(new AnimalModel("Kukang", "Lemur", R.drawable.anlemur));
        animalModelList.add(new AnimalModel("Babi", "Pig", R.drawable.anpig));
        animalModelList.add(new AnimalModel("Harimau", "Tiger", R.drawable.antiger));
        animalModelList.add(new AnimalModel("Ikan Paus", "Whale", R.drawable.anwhale));
        animalModelList.add(new AnimalModel("Zebra", "Zebra", R.drawable.anzebra));
    }
}
