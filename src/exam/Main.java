package exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       Student student0 = new Student("Aijamal Asan", 18, "aijamal.email",Gender.FEMALE);
        Student student1 = new Student("Munarjan Aibek ", 22, "munarjan.email",Gender.FEMALE);
        Student student2 = new Student("Maksat Akyl", 25, "maksat.email",Gender.MALE);
        Student student3 = new Student("Rahim Bazarbai", 18, "rahim.email",Gender.MALE);

        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        switch (name){
            case "Aijamal":
                System.out.println("Aijamal: " + student0);
                break;
            case  "Munarjan":
                System.out.println("Munarjan: " + student1);
            case  "Maksat":
                System.out.println("Maksat: " + student2);
            case  "Rahim":
                System.out.println("Rahim: " + student1);
            default:
                System.out.println("null");
        }


        Student [ ] students = {new Student("Aijamal Asan", 18, "aijamal.email",Gender.FEMALE),
                new Student("Munarjan ", 22, "munarjan.email",Gender.FEMALE),
                new Student ("Maksat Akyl", 25, "maksat.email",Gender.MALE),
                new Student("Rahim Bazarbai", 18, "rahim.email",Gender.MALE)};

        for (Student student:students){
            System.out.println(student);
        }



        Student [ ] students = {new Student("Aijamal Asan", 18, "aijamal.email",Gender.FEMALE),
                new Student("Munarjan ", 22, "munarjan.email",Gender.FEMALE),
                new Student ("Maksat Akyl", 25, "maksat.email",Gender.MALE),
                new Student("Rahim Bazarbai", 18, "rahim.email",Gender.MALE)};

        for (Student student:students){

            if (student.gender.equals(Gender.FEMALE)) {
                System.out.println(student);
            }
        }

        Student [ ] students = {new Student("Aijamal Asan", 18, "aijamal.email",Gender.FEMALE),
                new Student("Munarjan ", 22, "munarjan.email",Gender.FEMALE),
                new Student ("Maksat Akyl", 25, "maksat.email",Gender.MALE),
                new Student("Rahim Bazarbai", 18, "rahim.email",Gender.MALE)};

        for (Student student:students){

            if (student.gender.equals(Gender.MALE)) {

                System.out.println(student);
            }
        }




    }
}
