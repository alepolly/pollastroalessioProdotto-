/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pollastroalessioprodotto;

/**
 *
 * @author pollastro.alessio
 */
public class PollastroAlessioProdotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Istanzia dei oggetti della classe Prodotto
        Prodotto p1 = new Prodotto("Tastiera", 0.5, 45.0, 20);
        Prodotto p2 = new Prodotto("Monitor", 3.2, 180.0, 5);
        Prodotto p3 = new Prodotto("Tastiera", 0.5, 45.0, 10);

        System.out.println("stato iniziale dei prodotti ");
        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);
        System.out.println("P3: " + p3);
        System.out.println();

        //vendita del prodotti
        System.out.println("vendita ");
        boolean venditaRiuscita = p1.vendiProdotto(5);
        
        if (venditaRiuscita) {
            System.out.println("Vendita di 5 pezzi di " + p1.getNome() + " effettuata con successo");
        } else {
            System.out.println("Vendita fallita per " + p1.getNome() + ": quantità insufficiente.");
        }
        System.out.println("Pezzi rimasti per p1: " + p1.getnPezziPresenti());
        System.out.println();

        //rifornimento dei prodotti
        System.out.println("rifornimento ");
        p2.rifornisci(10);
        System.out.println("Rifornimento di 10 pezzi effettuato su " + p2.getNome());
        System.out.println("Nuova quantita pezzi p2: " + p2.getnPezziPresenti());
        System.out.println();

        //confronto dei prodotti
        System.out.println("confronto ");
        boolean prodottiUguali = p1.confronta(p3);
        System.out.println("p1 e p3 sono lo stesso prodotto (nome, peso, prezzo)? " + prodottiUguali);
        
        boolean diversi = p1.confronta(p2);
        System.out.println("p1 e p2 sono lo stesso prodotto? " + diversi);
    }
    
}
