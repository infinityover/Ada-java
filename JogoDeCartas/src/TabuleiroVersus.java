import Cartas.Cartas;
import Model.Campo;
import Model.Deck;
import Model.Jogador;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroVersus implements Tabuleiro {

    List<Jogador> jogadores = new ArrayList<>();
    List<Deck> decks = new ArrayList<>();
    List<Campo> campos =  new ArrayList<>();


    @Override
    public void inserirDeck(Deck deck) {
        decks.add(deck);
    }

    public void iniciaJogo(Deck deck1, Deck deck2){

//        TODO: validar que tem somente 50 cartas
//        if(deck1.)
        jogadores.add(new Jogador(deck1, 20, new Campo(5,2)));
        jogadores.add(new Jogador(deck2, 20, new Campo(5,2)));

        inserirDeck(deck1);
        inserirDeck(deck2);

    }

    @Override
    public boolean jogarCarta(Cartas cartaAtaque, int campo){
        return jogadores.get(campo).getCampo().adicionarCarta(cartaAtaque);
    }


    @Override
    public boolean fimDeJogo(){

    }
}
