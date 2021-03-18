public class Act5 {
    int x;
    int y;
    // X = {valor primer atributo}
    //Y = {valor segundo atributo}
    //Suma: {resultado suma atributos}
    //Resta: {resultado resta atributos}
    //Multiplicación: {resultado producto atributos}
    //División: {resultado división atributos}
    //Módulo: {resultado módulo atributos}

    public static void main(String[] args) {
        Act5 myObj = new Act5();
        myObj.x = 45;
        myObj.y = 12;
        System.out.println("X = " + myObj.x);
        System.out.println("Y = " + myObj.y);
        System.out.println("Suma = " + (myObj.x + myObj.y));
        System.out.println("Resta = " + (myObj.x - myObj.y));
        System.out.println("Multiplicación = " + (myObj.x * myObj.y));
        System.out.println("División = " + (myObj.x / myObj.y));
        System.out.println("Módulo = " + (myObj.x % myObj.y));
    }
}
