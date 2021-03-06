package com.acme.utils;

import java.util.Calendar;

public class MyDate {
    private byte  day;private byte month;private short year;
    static public void leapYears(){
        int year = 1752;
        while(year<= Calendar.getInstance().get(Calendar.YEAR)) {

            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println("The year "+year+" is a leap year");
year+=1;
        }
    }
    private boolean valid(byte day, byte month, short year){if (day > 31 || day < 1 || month > 12 || month < 1 ){System.out.println("Attempting to create a non-valid date " + month + "/" + day + "/" + year);return false;}switch (month){case 4: case 6:case 9:case 11:  return  (day <= 30);case 2:  return day <= 28 || ( day == 29 && year % 4 == 0) ;}return true;}

    public MyDate(){day=1; year=1900 ;month=1;}
    public MyDate(int m, int d, int y){
       this.setDate((byte)m,(byte)d,(short)y);
        }

public String toString (){
        return month+"/"+day+"/"+year; }

    public void setDate(int m, int d, int y){
        if (valid((byte)m,(byte)d,(short)y))
            day=(byte)d;year=(short)y;month=(byte)m;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (valid((byte)month,(byte)day,(short)year))
        this.year = (short)year;
    }

    public void setMonth(int month) {
        if (valid((byte)month,(byte)day,(short)year))
        this.month = (byte)month;
    }

    public void setDay(int day) {
        if (valid((byte)month,(byte)day,(short)year))
        this.day = (byte)day;
    }
}
