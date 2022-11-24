package Model;

import Cartas.Cartas;

import java.util.ArrayList;
import java.util.List;

public class CampoVersus extends Campo {

    public boolean adicionarCarta(Cartas cartas, List<Jogador> jogador){
        if("Ataque".equals(cartas.getTipo())){
            if(getCartasAtaque().size()<getQtdCartasAtaque()){
                getCartasAtaque().add(cartas);
                return true;
            }else{

                return false;
            }
        }
        else if("AtaqueEspecial".equals(cartas.getTipo())){
            if(getCartasAtaqueEspecial().size()<getQtdCartasAtaqueEspeciais()){
                getCartasAtaqueEspecial().add(cartas);
                return true;
            }else{

                return false;
            }
        }
        return false;
    }

    public CampoVersus(int qtdCartasAtaque, int qtdCartasAtaqueEspeciais) {
        this.setQtdCartasAtaque(qtdCartasAtaque);
        this.setQtdCartasAtaqueEspeciais(qtdCartasAtaqueEspeciais);
    }
}
