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
        //buscar estudiante
        System.out.println("Ingrese el nombredel estudiante a buscar");
        String name = inputData.nextLine();
        for (int i = 0; i < students.size() ; i++) {
            if(students.get(i).getName().equalsIgnoreCase(name)){
                System.out.println("El estudiante: "+name+" su identificacion es: "+students.get(i).getIdentification());
                break;
            }

        }
        // eliminar estudiante
        System.out.println("Ingrese la identificacion del estudiante que desea eliminar: ");
        String delete = inputData.nextLine();
        for (int i = 0; i < students.size() ; i++) {
            if(students.get(i).getIdentification().equalsIgnoreCase(delete)){
                students.remove(i);
                break;
            }

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



    }
}

