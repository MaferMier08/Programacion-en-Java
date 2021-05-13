package act12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        String name="";
        String phone="";
        String phoneD="";
        int menu=0;
        do {
            System.out.println("Agenda Telefónica");
            System.out.println("1. Ver contactos.");
            System.out.println("2. Crear un contacto.");
            System.out.println("3. Eliminar un contacto.");
            System.out.println("0. Salir.");
            System.out.println("Elige una opción: ");
            menu = scanner.nextInt();
            switch (menu){
                case 1:
                    addressBook.load();
                    addressBook.list();
                    break;
                case 2:
                    Scanner scannerN = new Scanner(System.in);
                    System.out.println("Ingrese nombre del contacto");
                    name = scannerN.nextLine();
                    Scanner scannerP = new Scanner(System.in);
                    System.out.println("Ingrese numero del contacto");
                    phone = scannerP.nextLine();
                    addressBook.create(phone, name);
                    break;
                case 3:
                    Scanner scannerD = new Scanner(System.in);
                    System.out.println("Ingrese numero del contacto que quiere eliminar");
                    phoneD = scannerD.nextLine();
                    addressBook.delete(phoneD);
                case 0:
                    addressBook.save(phone,name);
                    break;
                default:
                    System.out.println("No es una opción, intentelo de nuevo");
            }
        }while (menu != 0);



    }
}
