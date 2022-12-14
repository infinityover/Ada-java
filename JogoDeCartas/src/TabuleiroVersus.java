import Cartas.Cartas;
import Model.CampoVersus;
import Model.Deck;
import Model.Jogador;

import java.util.List;

public class TabuleiroVersus extends AbstractTabuleiro {

    private final int QTDJOGADORES = 2;
    private final int TAMANHODECK = 50;

    @Override
    public void iniciaJogo(List<Deck> decks){

        if(decks.size()==QTDJOGADORES){
            for (Deck deck : decks){
                if(deck.getDecklist().size()==TAMANHODECK){
                    super.getJogadores().add(new Jogador(deck, 20, new CampoVersus(5,2)));
                    inserirDeck(deck);
                }else{
                    throw new IllegalArgumentException();
                }
            }
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean jogarCarta(Cartas cartaAtaque, int campo){
        return super.getJogadores().get(campo).getCampo().adicionarCarta(cartaAtaque);
    }


}
