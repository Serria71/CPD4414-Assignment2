/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author c0640780
 */
public class Student {
    public String name;
    public String id;
    public String gender;
    public double grade;
    
    public void Student(){
        this.name = "";
        this.id = "";
        this.gender = "";
        this.grade = 0;
    }
    public void Student(String name, String id, String gender, double grade){
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        double value = Double.parseDouble(grade);
        this.grade = value;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Student)){
            return false;
        } else if((obj instanceof Student) && (name.equals(name)) && (id.equals(id))){
            return true;
        } else if((obj instanceof Student) && (name.equals(name)) && (!id.equals(id))) {
            return false;
        } else if((obj instanceof Student) && (!name.equals(name)) && (id.equals(id))){
            return false;
        } else if((obj instanceof Student) && (!name.equals(name)) && (!id.equals(id))){
            return false;
        }
        return true;
    }
    public String toString(){
       return "{ \"name\" : \"" + name + "\", \"id\" : \"" + id + "\", \"gender\" : \"" + gender + "\", \"grade\" : " + grade + " }";
    }
}
