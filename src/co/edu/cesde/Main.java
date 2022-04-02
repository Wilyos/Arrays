package co.edu.cesde;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner inputData = new Scanner(System.in);

    int students;
    double average=0, average2= 0, grade=0;

        System.out.println("ingrese el numero de estudiantes que desea subir las notas: ");
        students = Integer.parseInt(inputData.nextLine());

        double[]grades = new double[students];
        for (int i = 0; i < grades.length; i++) {
            String[]names= new String[grades.length];
            for (int j = 0; j <grades.length; j++) {
                System.out.println("Ingrese el nombre del estudiante: ");
                names[j]= inputData.nextLine();
            }
            double[]grades1= new double[3];
            for (int j = 0; j <3; j++) {
                System.out.println("Ingrese la nota del estudiante "+names[i]+": ");
                grades1[j] = Double.parseDouble(inputData.nextLine());
                grade = grade+grades1[j];
            }
            average = grade / 3;
            grades[i]=average;
            average2 = average2 + grades[i];

            System.out.println("la nota de "+names[i]+" es: "+ grades[i]);
        }
        System.out.println("El promedio de los estudiantes en general es: "+average/students);

        }
    }

