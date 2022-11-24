package Cartas;

public class CartasAtaqueEspecialImpl extends CartasAtaqueImpl implements CartasAtaqueEspecial {
    private String efeito;

    public CartasAtaqueEspecialImpl(String nome, String tipo, int custo, int poder, int resitencia, String efeito) {
        super(nome, tipo, custo, poder, resitencia);
        this.efeito = efeito;
    }

    @Override
    public String getEfeito() {
        return efeito;
    }
}
