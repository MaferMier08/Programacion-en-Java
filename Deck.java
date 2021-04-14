import java.util.*;

public class Deck {
    private ArrayList<Object> deck = new ArrayList<>();

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.create();
        Scanner scanner = new Scanner(System.in);
        int value = 5;
        System.out.println("Bienvenido a Poker!");
        System.out.println("Selecciona una opción:");
        System.out.println("1 Mezclar deck");
        System.out.println("2 Sacar una carta");
        System.out.println("3 Carta al azar");
        System.out.println("4 Generar una mano de 5 cartas");
        System.out.println("0 Salir");

        do {
            System.out.print("Ingrese el número que quiera probar: ");
            value = scanner.nextInt();
            switch (value)
            {
                case 1:  deck.shuffle();
                    break;
                case 2:  deck.head();
                    break;
                case 3:  deck.pick();
                    break;
                case 4:  deck.hand();
                    break;
                case 0:
                    System.out.println("Adiós!");
                    break;
                default: System.out.println("Opción no válida");
            }
        } while (value != 0);

    }

    //crear deck
    public void create(){
        Card card = new Card();
        int j = 0, k = 0, l = 0;

        for (int i=0; i < 52; i++ ){
            if (i < 13){
                deck.add(card.Palo[0]+", "+card.Color[1]+", "+card.Valor[i]);
            } else if(i > 12 & i < 26){
                deck.add(card.Palo[1]+", "+card.Color[0]+", "+card.Valor[j]);
                j++;
            } else if(i > 25 & i <39){
                deck.add(card.Palo[2]+", "+card.Color[1]+", "+card.Valor[k]);
                k++;
            } else {
                deck.add(card.Palo[3]+", "+card.Color[0]+", "+card.Valor[l]);
                l++;
            }
        }
    }

    //mezclar el deck
    public void shuffle (){
        Collections.shuffle(deck);
        System.out.println("Se mezcló el deck");
    }

    //mostrar la primera carta del deck y removerla
    public void head(){
        System.out.println("La primera carta del deck");
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan: "+deck.size());
    }

    //seleccionar una carta al azar y removerla
    public void pick(){
        int value = (int)((Math.random()*50));
        System.out.println("Una carta random del deck");
        System.out.println(deck.get(value));
        deck.remove(value);
        System.out.println("Quedan: "+deck.size());
    }

    //regresará un arreglo de cinco cartas del deck, y las removerá
    public void hand(){
        int i = 50;
        for(int j=0; j < 5; j++){
            int value = (int)((Math.random()*i));
            System.out.println(deck.get(value));
            deck.remove(value);
            i--;
        }
        System.out.println("Quedan: "+deck.size());
    }
}
