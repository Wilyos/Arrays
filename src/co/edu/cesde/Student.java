package co.edu.cesde;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

   private String photoUrl;
   private List<Double> grade = new ArrayList<>();
   private String email;
   private double finalGrade;

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }


    public void addGrade(double grade) {

        this.grade.add(grade);

    }
    public List<Double> getGrade() {
        return grade;
    }

    public void setGrade(List<Double> grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
