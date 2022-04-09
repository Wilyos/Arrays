package co.edu.cesde;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner inputData = new Scanner(System.in);
    int numStudents=2;

        Student[] students = new Student[numStudents];
        for (int i = 0; i <students.length; i++) {

            Student person = new Student();
            System.out.println("ingrese el nombre: ");
            person.setName(inputData.nextLine());
            System.out.println("ingrese la identificacion: ");
            person.setIdentification(inputData.nextLine());

            students[i] = person;
        }
        for (int i = 0; i <numStudents; i++) {

            System.out.println(students[i].getName());
            System.out.println(students[i].getIdentification());
        }
        }
    }

