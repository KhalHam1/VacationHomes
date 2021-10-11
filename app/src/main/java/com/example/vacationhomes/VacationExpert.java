package com.example.vacationhomes;

import java.util.ArrayList;
import java.util.List;

public class VacationExpert {
    List<String> getVacationHomes(String vacationHomeFeature){
        List<String> brands = new ArrayList<String>();
        if(vacationHomeFeature == "Beach") {

            brands.add("Grafton Beach Resort");
            brands.add("Mt. Irvine Beach Hotel");
        }
        else{

            brands.add("Hyatt Regency");
            brands.add("Blue Waters Inn");
        }
        return brands;
    }
}
