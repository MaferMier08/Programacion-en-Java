import java.util.Scanner;

public class Act6 {

    public static void main(String[] args) {
        // Pedir nombre
        Scanner name = new Scanner(System.in);
        System.out.printf("Ingrese el nombre del estudiante: ");
        String student = name.nextLine();

        // Pedir las 5 calificaciones
        int[] grades = new int[5];
        Scanner grade = new Scanner(System.in);
        for (int i = 0; i < grades.length; i++){
            System.out.printf("Calificación " + (i + 1)+ ": ");
            grades[i] = grade.nextInt();
        }
        Imprimir(student, grades);
    }

    //Promedio
    public static float Average (int grades[]){
        int addition = 0;
        for(int i=0; i< grades.length; i++){
            addition += grades[i];
        }
        float average = addition/5;
        return average;

    }

    // Promedio en letra
    public static char Letter (int average){
        char letter = 'Z';
        if (average <= 50){
            letter = 'F';
        }else if (average >50 && average < 61){
            letter = 'E';
        }else if (average >60 && average < 71){
            letter = 'D';
        }else if (average > 70 && average < 81){
            letter = 'C';
        }else if (average >80 && average < 91){
            letter = 'B';
        }else if (average >90 && average < 101) {
            letter = 'A';
        }
        return letter;
    }

    //Imprimir
    public static void Imprimir  (String student, int grades[]){
        System.out.println("Nombre del estudiante: " + student);
        for (int i = 0; i < grades.length; i++){
            System.out.println("Calificación " + (i + 1)+ ": "+grades[i]);
        }
        int average =(int)Average(grades);
        System.out.println("Promedio: "+ average);
        System.out.println("Calificación: "+ Letter(average));

    }
}
