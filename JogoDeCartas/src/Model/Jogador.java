package Model;

public class Jogador {
    private Deck deck;
    private int vida;
    private Campo campoVersus;

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public int getVida() {
        return vida;
    }

    public void receberCura(int cura) {
        this.vida = this.vida+cura;
    }

    public void receberDano(int dano) {
        this.vida = this.vida-dano;
    }

    public Campo getCampo() {
        return campoVersus;
    }

    public void setCampo(Campo campoVersus) {
        this.campoVersus = campoVersus;
    }

    public Jogador(Deck deck, int vida, Campo campoVersus) {
        this.deck = deck;
        this.vida = vida;
        this.campoVersus = campoVersus;
    }


}
