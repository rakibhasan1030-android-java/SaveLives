package com.example.savelives.models;

import java.util.ArrayList;

public class MonthNames {

    private static ArrayList<MonthNames> monthNamesArrayList;

    int id;
    String name;

    public MonthNames(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void initMonths(){

        monthNamesArrayList = new ArrayList<>();

        MonthNames jan = new MonthNames(0, "Jan");
        monthNamesArrayList.add(jan);

        MonthNames feb = new MonthNames(0, "Feb");
        monthNamesArrayList.add(feb);

        MonthNames mar = new MonthNames(0, "Mar");
        monthNamesArrayList.add(mar);

        MonthNames apr = new MonthNames(0, "Apr");
        monthNamesArrayList.add(apr);

        MonthNames may = new MonthNames(0, "May");
        monthNamesArrayList.add(may);

        MonthNames jun = new MonthNames(0, "Jun");
        monthNamesArrayList.add(jun);

        MonthNames jul = new MonthNames(0, "Jul");
        monthNamesArrayList.add(jul);

        MonthNames aug = new MonthNames(0, "Aug");
        monthNamesArrayList.add(aug);

        MonthNames sep = new MonthNames(0, "Sep");
        monthNamesArrayList.add(sep);

        MonthNames oct = new MonthNames(0, "Oct");
        monthNamesArrayList.add(oct);

        MonthNames nov = new MonthNames(0, "Nov");
        monthNamesArrayList.add(nov);

        MonthNames dec = new MonthNames(0, "Dec");
        monthNamesArrayList.add(dec);
    }

    public static ArrayList<MonthNames> getMonthNamesArrayList() {
        return monthNamesArrayList;
    }

    public static String[] allMonthNames(){
        String[] names = new String[monthNamesArrayList.size()];
        for (int i = 0; i<monthNamesArrayList.size(); i++){
            names[i] = monthNamesArrayList.get(i).name;
        }
        return names;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
