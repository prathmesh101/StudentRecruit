package com.stud.prathmesh.android.studentrecruit.Finder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.stud.prathmesh.android.studentrecruit.R;

import java.util.List;

public class ListviewFinderUniversities extends AppCompatActivity {






    UniversityFinderDB myDB;
    Universities universities;

    ListView finderListview;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_finder_universities);


         myDB = new UniversityFinderDB(this);
         universities = new Universities();

        int gre = getIntent().getIntExtra("Gre",0);


        finderListview = (ListView) findViewById(R.id.finderListView);

//       List<Universities> data= myDB.executeSelectEvents(gre);
        List<String> data = myDB.getData(gre);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListviewFinderUniversities.this, android.R.layout.simple_list_item_1, data);

        finderListview.setAdapter(adapter);
    }


  //  private void loadUnivFromDb() {



       // if(data.size()>0){
        //    eventData=data;
          //  createUnivAdapter();
        //}else {
     //       Toast.makeText(getApplicationContext(),"NoEvents",Toast.LENGTH_SHORT).show();
       // }

   // }







}
