/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pollastroalessioprodotto;

/**
 *
 * @author pollastro.alessio
 */
public class Prodotto 
{
    private String nome;
    private double peso;
    private double prezzo;
    private int nPezziPresenti;
    

    /**
     * Costruttore della classe Prodotto.
     *
     * @param nome           Il nome del prodotto.
     * @param peso           Il peso del prodotto.
     * @param prezzo         Il prezzo del prodotto.
     * @param nPezziPresenti Il numero di pezzi inizialmente disponibili.
     */
    public Prodotto(String nome, double peso, double prezzo, int nPezziPresenti) {
        this.nome = nome;
        this.peso = peso;
        this.prezzo = prezzo;
        this.nPezziPresenti = Math.max(nPezziPresenti, 0);
    }



    /**
     * Consente di vendere una determinata quantità del prodotto.
     *
     * @param  nPezziDaVendere Il numero di pezzi da vendere.
     * @return true se i pezzi presenti sono sufficienti e la vendita ha successo, false altrimenti.
     */
    public boolean vendiProdotto(int nPezziDaVendere) 
    {
        if (nPezziDaVendere > 0 && this.nPezziPresenti >= nPezziDaVendere)
        {
            this.nPezziPresenti -= nPezziDaVendere;
            return true;
        }
        return false;
    }

    /**
     * Rifornisce il prodotto incrementando i pezzi presenti.
     *
     * @param nPezziDaAggiungere La quantità di pezzi da aggiungere.
     */
    public void rifornisci(int nPezziDaAggiungere)
    {
        if (nPezziDaAggiungere > 0)
        {
            this.nPezziPresenti += nPezziDaAggiungere;
        }
    }

/**
 * Confronta se questo prodotto è uguale a un altro prodotto fornito.
 *
 * @param altroProdotto L'oggetto Prodotto da confrontare.
 * @return true se hanno gli stessi dati, false altrimenti.
 */
public boolean confronta(Prodotto altroProdotto) 
{
    if (this == altroProdotto) {
        return true;
    }
    
    return altroProdotto != null &&
           this.nome.equalsIgnoreCase(altroProdotto.nome) &&
           this.peso == altroProdotto.peso &&
           this.prezzo == altroProdotto.prezzo;
}
    //metodi getter e setter

    /**
     * Restituisce il nome del prodotto.
     * @return Il nome del prodotto.
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * Imposta il nome del prodotto.
     * @param nome Il nuovo nome.
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**
     * Restituisce il peso del prodotto.
     * @return Il peso del prodotto.
     */
    public double getPeso()
    {
        return peso;
    }

    /**
     * Imposta il peso del prodotto.
     * @param peso Il nuovo peso.
     */
    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    /**
     * Restituisce il prezzo del prodotto.
     * @return Il prezzo del prodotto.
     */
    public double getPrezzo()
    {
        return prezzo;
    }

    /**
     * Imposta il prezzo del prodotto.
     * @param prezzo Il nuovo prezzo.
     */
    public void setPrezzo(double prezzo)
    {
        this.prezzo = prezzo;
    }

    /**
     * Restituisce il numero di pezzi presenti.
     * @return Il numero di pezzi disponibili.
     */
    public int getnPezziPresenti()
    {
        return nPezziPresenti;
    }

    /**
     * Imposta il numero di pezzi presenti.
     * @param nPezziPresenti Il nuovo numero di pezzi.
     */
    public void setnPezziPresenti(int nPezziPresenti)
    {
        this.nPezziPresenti = Math.max(nPezziPresenti, 0);
    }

    /**
     * Restituisce una rappresentazione in formato stringa del prodotto.
     * @return Stringa descrittiva.
     */
    @Override
    public String toString()
    {
        return "Prodotto{" +
                "nome='" + nome + ", peso=" + peso + ", prezzo=" + prezzo + ", nPezziPresenti=" + nPezziPresenti;
    }
}


