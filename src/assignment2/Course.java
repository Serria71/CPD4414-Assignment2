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
public class Course extends Student{
    List<Student> sList = new ArrayList<>();
    
    public static void Course(){
        
    }
    //Not 100% sure how to make the method that goes here.
    public void add(Student student){
        sList.add(new Student());
    }
    public void remove(String id){
        sList.remove(id);
    }
    public void insert(Student student, int position){
        
    }
    public void get(String id){
        
    }
    public void get(int position){
        
    }
    public void getAll(){
        
    }
    public boolean equals(Object obj){
        return false;
    }
    public String toString(){
       return "0";
    }
    public void getAllByGender(String gender){
        
    }
    public void getGradeMap(){
        
    }
}
