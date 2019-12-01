package com.example.prichecker;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);

        //This is my code


        Person john = new Person("John","12-20-1998", "Male");
        Person andie1 = new Person("Andie","12-20-1996", "Female");
        Person andie2 = new Person("Andie","12-20-1996", "Female");
        Person andie3 = new Person("Andie","12-20-1996", "Female");
        Person andie4 = new Person("Andie","12-20-1996", "Female");


        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(john);
        peopleList.add(andie1);
        peopleList.add(andie2);
        peopleList.add(andie3);
        peopleList.add(andie4);

        PersonListAdapter adapter = new PersonListAdapter (this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }
}
