package com.stud.prathmesh.android.studentrecruit.Finder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.stud.prathmesh.android.studentrecruit.R;

import java.util.ArrayList;
import java.util.List;

public class SchoolFinder1 extends AppCompatActivity {

    UniversityFinderDB myDB;
    Universities universities;

    EditText greScore;
    EditText toeflScore;
    EditText underScore;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_finder2);
        greScore = (EditText) findViewById(R.id.greFinder);
        toeflScore = (EditText) findViewById(R.id.toeflFinder);
        underScore = (EditText) findViewById(R.id.undergraduateScore);
        submitButton = (Button) findViewById(R.id.shoot_button);


        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        List<String> list = new ArrayList<String>();
        list.add("Aerospace Engineering ");
        list.add("Civil & Environmental Engineering");
        list.add("Computer Engineering");
        list.add("Computer Science ");
        list.add("Electrical Engineering ");
        list.add("Mechanical Engineering ");
        list.add("Software Engineering");
        list.add("Management Information System ");
        list.add("Chemical Engineering ");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

    }



    public void onClickUnivList(View view) {


        if(!validate()){
            String gre = greScore.getText().toString();
            int greValue = Integer.parseInt(gre);
            Intent intent = new Intent(SchoolFinder1.this, ListviewFinderUniversities.class);


            intent.putExtra("Gre",greValue);
            startActivity(intent);
        }




    }


    private boolean validate(){
        if(greScore.getText().toString().trim().length()<=0){

            Toast.makeText(SchoolFinder1.this, "Enter gre score between 260 and 340", Toast.LENGTH_SHORT).show();
            return true;
        }else if (toeflScore.getText().toString().trim().length()<=0){

            Toast.makeText(SchoolFinder1.this, "Enter toefl", Toast.LENGTH_SHORT).show();
            return true;
        }else if (underScore.getText().toString().trim().length()<=0){

            Toast.makeText(SchoolFinder1.this, "Enter undergraduate score", Toast.LENGTH_SHORT).show();
            return true;
        }

        return false;
    }

}
