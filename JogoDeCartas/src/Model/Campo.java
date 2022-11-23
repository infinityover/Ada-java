package Model;

import Cartas.Cartas;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private int qtdCartasAtaque;
    private int qtdCartasAtaqueEspeciais;
    private List cartasAtaque = new ArrayList();
    private List cartasAtaqueEspecial = new ArrayList();

    public boolean adicionarCarta(Cartas cartas){
        if("Ataque".equals(cartas.getTipo())){
            if(cartasAtaque.size()<qtdCartasAtaque){
                cartasAtaque.add(cartas);
                return true;
            }else{

                return false;
            }
        }
        else if("AtaqueEspecial".equals(cartas.getTipo())){
            if(cartasAtaqueEspecial.size()<qtdCartasAtaqueEspeciais){
                cartasAtaqueEspecial.add(cartas);
                return true;
            }else{

                return false;
            }
        }
        return false;
    }

    public Campo(int qtdCartasAtaque, int qtdCartasAtaqueEspeciais) {
        this.qtdCartasAtaque = qtdCartasAtaque;
        this.qtdCartasAtaqueEspeciais = qtdCartasAtaqueEspeciais;
    }
}
