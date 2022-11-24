package Model;

import Cartas.Cartas;

import java.util.ArrayList;
import java.util.List;

public class CampoParty extends Campo {

    private int qtdCartasAtaque;
    private List<Cartas> cartasAtaque = new ArrayList();
    private List<Cartas> cartasAtaqueEspecial = new ArrayList();

    public boolean adicionarCarta(Cartas cartas, List<Jogador> jogadorList){
        int qtdCartasCampo =  jogadorList.stream().reduce(0, (subtotal, element ) ->
                subtotal + element.getCampo().getCartasAtaque().size(), Integer::sum);

        if("Ataque".equals(cartas.getTipo())){
            if(qtdCartasCampo<qtdCartasAtaque){
                cartasAtaque.add(cartas);
                return true;
            }else{

                return false;
            }
        }
        else if("AtaqueEspecial".equals(cartas.getTipo())){
            cartasAtaqueEspecial.add(cartas);
            return true;
        }
        return false;
    }

    public CampoParty(int qtdCartasAtaque) {
        this.qtdCartasAtaque = qtdCartasAtaque;
    }
}
