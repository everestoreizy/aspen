/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oreizy.everest.xaspen.structure;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author eoreizy
 */
public class Timeslot {
    
    public ArrayList<Task> tasks;
    
    public Xdate date; //day, month, year
    public String title;
    
    public Timeslot(Xdate _date, String _title){
        this.date = _date;
        this.title = _title;
        this.tasks = new ArrayList<Task>();
    }
    
    public Timeslot(Xdate _date, String _title, ArrayList<Task> _taskArr){
        this.tasks = _taskArr;
        this.title = _title;
        this.date = _date;
    }
    
}
