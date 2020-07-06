/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oreizy.everest.xaspen.structure;

/**
 *
 * @author eoreizy
 */
public class Xdate {
    
    private int year;
    private int month;
    private int day;
    private int order;
    
    private final String ws = " "; //Whitespace
    
    public Xdate(int _day, int _month, int _year){
        this.day = _day;
        this.month = _month;
        this.year = _year;
    }
    
    static String monthToStr(int _month){
        switch (_month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "-1";
        }
    }
    
    public int getDay(){
        return day;
    }
    
    public int getMonth(){
        return month;
    }
    
    public String getMonthStr(){
        return monthToStr(month);
    }
    
    public int getYear(){
        return year;
    }
    
    public String getMonthDayStr(){
        return this.getMonthStr() + ws + getDay();
    }
}
