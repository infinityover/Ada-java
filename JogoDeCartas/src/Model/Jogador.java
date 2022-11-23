package Model;

public class Jogador {
    private Deck deck;
    private int vida;
    private Campo campo;

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
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    public Jogador(Deck deck, int vida, Campo campo) {
        this.deck = deck;
        this.vida = vida;
        this.campo = campo;
    }


}
