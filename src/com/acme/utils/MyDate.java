package com.acme.utils;

public class MyDate {
    public int  day;public int year;public int month;
    public MyDate(){day=1;year=2000;month=1;}
    public MyDate(int m, int d, int y){
       this.setDate(m,d,y);
        }
public String toString (){
        return month+"/"+day+"/"+year; }

    public void setDate(int m, int d, int y){
        day=d;year=y;month=m;
    }

}
