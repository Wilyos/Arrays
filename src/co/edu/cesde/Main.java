package co.edu.cesde;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String answer="si";
        while(answer.equals("si")) {


            Student person = new Student();
            System.out.println("ingrese el nombre: ");
            person.setName(inputData.nextLine());
            System.out.println("ingrese la identificacion: ");
            person.setIdentification(inputData.nextLine());
            students.add(person);

            //agregar notas al estudiante
            double finalGrade = 0;
            for (int i = 0; i <9; i++) {

                System.out.println("Ingrese nota");
                double grade = Double.parseDouble(inputData.nextLine());
                finalGrade = finalGrade + grade;
                person.addGrade(grade);
            }
            finalGrade = finalGrade / person.getGrade().size();

            person.setFinalGrade(finalGrade);



            System.out.println("¿Desea introducir otro estudiante? SI - NO");
            String stop = inputData.nextLine();

            if(stop.equalsIgnoreCase("no")){
                answer= "no"; //break; es otra forma de pararlo
            }
        }


        //mostrar lista
        for (int i = 0; i <students.size() ; i++) {

            System.out.println("Nombre: "+ students.get(i).getName());
        }



        //actualizar
        System.out.println("Ingrese la identificacion del estudiante que desea actualizar: ");
        String actualizar = inputData.nextLine();
        for (int i = 0; i < students.size() ; i++) {
            if(students.get(i).getIdentification().equalsIgnoreCase(actualizar)){
                Student student = students.get(i);
                System.out.println("ingrese la nueva id: ");
                String ident = inputData.nextLine();
                student.setIdentification(ident);
                students.set(i,student);
                break;
            }

        }

        System.out.println("Identifique su funcion: ");
        System.out.println("1: Estudiante");
        System.out.println("2: Docente");
        int person = inputData.nextInt();


        switch (person) {
            case 1 -> System.out.println("sus notas son:");
            case 2 -> {  //buscar estudiante
                System.out.println("Ingrese el nombre del estudiante a buscar");
                String name = inputData.nextLine();
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getName().equalsIgnoreCase(name)) {
                        System.out.println("El estudiante: " + name + " su identificacion es: " + students.get(i).getIdentification());
                        System.out.println("Y sus notas son: " + students.get(i).getGrade());
                        System.out.println("La nota promedio es: "+students.get(i).getFinalGrade());
                        break;
                    }

                }
            }
        }


    }





}


