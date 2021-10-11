package com.example.vacationhomes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class VacationHomeFinderActivity extends AppCompatActivity {
    private VacationExpert expert = new VacationExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacation_home_finder);
    }

    public void onClickFindHome(View view){
        //Get reference to the textView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Get reference to the spinner
        Spinner feature = (Spinner) findViewById(R.id.feature);
        //Get the selected item in the spinner
        String homeType = String.valueOf(feature.getSelectedItem());
        //Display the selected item
        brands.setText(homeType);

        List<String> brandsList = expert.getVacationHomes(homeType);
        StringBuilder brandsFormatted = new StringBuilder();
        for(String brand : brandsList){
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
    }
}