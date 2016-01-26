/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author c0640780
 */
public class Course {
    List<Student> plist = new ArrayList<>();
    
    public static void Course(){
        
    }
    //Not 100% sure how to make the method that goes here.
    public static void add(Student student){
        //No idea why this is erroring.
    }
    public static void remove(String id){
        
    }
    public static void insert(Student student, int position){
        
    }
    public static void get(String id){
        return Student; //Errors
    }
    public static void get(int position){
        return Student; //More errors.
    }
    public static void getAll(){
        return List<Student>; //Even more errors.
    }
    public boolean equals(Object obj){
        return true;
    }
    public String toString(){
       return "0";
    }
    public static void getAllByGender(String gender){
        return Set<Student>; //These errors are getting old.
    }
    public static void getGradeMap(){
        return Map<String,Set<Student>>; //Yay errors >_>
    }
}
