package Model;

import Cartas.Cartas;

import java.util.ArrayList;
import java.util.List;

public abstract class Campo {

    private int qtdCartasAtaque;
    private int qtdCartasAtaqueEspeciais;
    private List cartasAtaque = new ArrayList();
    private List cartasAtaqueEspecial = new ArrayList();

    public void setQtdCartasAtaque(int qtdCartasAtaque) {
        this.qtdCartasAtaque = qtdCartasAtaque;
    }

    public void setQtdCartasAtaqueEspeciais(int qtdCartasAtaqueEspeciais) {
        this.qtdCartasAtaqueEspeciais = qtdCartasAtaqueEspeciais;
    }

    public int getQtdCartasAtaque() {
        return qtdCartasAtaque;
    }

    public int getQtdCartasAtaqueEspeciais() {
        return qtdCartasAtaqueEspeciais;
    }

    public List getCartasAtaque() {
        return cartasAtaque;
    }

    public List getCartasAtaqueEspecial() {
        return cartasAtaqueEspecial;
    }

    public abstract boolean adicionarCarta(Cartas cartas, List<Jogador> jogadorList);
    public boolean adicionarCarta(Cartas cartas){
        return adicionarCarta(cartas, null);
    }

}
