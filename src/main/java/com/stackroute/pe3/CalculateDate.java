package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculateDate {


    public String[] checkFirstAndLastDateOfWeek() {

        // Get calendar set to current date and time
        Calendar c = Calendar.getInstance();

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();
        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        String firstDate=(df.format(c.getTime()));

        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        String lastDate=(df.format(c.getTime()));
        String[] date={firstDate, lastDate};
        return  date;


    }



}
