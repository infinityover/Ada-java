import Cartas.Cartas;
import Model.Deck;

import java.util.Collections;
import java.util.List;

public interface Tabuleiro {
    void inserirDeck(Deck deck);
    boolean jogarCarta(Cartas cartaAtaque, int campo);
    boolean fimDeJogo();
}
