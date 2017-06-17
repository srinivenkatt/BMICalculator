package com.candy.srini.bmicalculator;

/**
 * Created by Srini on 17-06-2017.
 */

public class Convert {

    public String[] convert(String w, String h) {
        double weight;
        double height;
        double bmi;
        String msg = "";
        String[] arr = new String[2];

            weight = Double.parseDouble(w);
            height = Double.parseDouble(h);

            bmi = height * height;
            bmi = weight / bmi;

            arr[0] = String.valueOf(bmi);

            if (bmi < 18.5) {
                msg = "Underweight !!";
            } else if (bmi > 18.5 && bmi < 25) {
                msg = "Normal";
            } else if (bmi > 25) {
                msg = "Overweight !!";
            }

            arr[1] = msg;

        return arr;
    }
}
