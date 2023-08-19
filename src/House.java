/*Crea una classe chiamata House che ha 3 variabili di istanza:
      un indirizzo di stringa
      un int numberOfFloors
      Definire un metodo di costruzione per House che stamperà in console un messaggio non appena viene creato un oggetto House
      Definisci una classe di test (ad es. Tester, Start o un altro nome ragionevole che preferisci) con un metodo principale dove:
      dichiari due variabili House house1 e house2
      crei due oggetti House e li assegni alle variabili house1 e house2*/







public class House {
    String address;
    int numberOfFlores;

    House(String address, int numberOfFlores) {
        this.address = address;
        this.numberOfFlores = numberOfFlores;
        System.out.println("A new House has been created!");
    }
}
