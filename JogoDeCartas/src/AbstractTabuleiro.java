import Cartas.Cartas;
import Model.Deck;
import Model.Jogador;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractTabuleiro implements Tabuleiro {


    private List<Jogador> jogadores = new ArrayList<>();
    private List<Deck> decks = new ArrayList<>();

    @Override
    public void inserirDeck(Deck deck) {
        decks.add(deck);
    }

    @Override
    public boolean jogarCarta(Cartas cartaAtaque, int campo){
        return jogadores.get(campo).getCampo().adicionarCarta(cartaAtaque, getJogadores());
    }


    @Override
    public Jogador fimDeJogo(){
        List<Jogador> jogadoresComVida =  getJogadores().stream().filter(jogador -> jogador.getVida()>0).collect(Collectors.toList());
        return jogadoresComVida.size()==1 ? jogadoresComVida.get(0) : null;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public List<Deck> getDecks() {
        return decks;
    }

    public void setDecks(List<Deck> decks) {
        this.decks = decks;
    }
}
