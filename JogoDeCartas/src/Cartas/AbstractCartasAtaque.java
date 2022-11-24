package Cartas;

public abstract class AbstractCartasAtaque implements CartasAtaque{
    private String nome;
    private String tipo;
    private int custo;
    private int poder;
    private int resitencia;

    public AbstractCartasAtaque(String nome, String tipo, int custo, int poder, int resitencia) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
        this.poder = poder;
        this.resitencia = resitencia;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public int getCusto() {
        return custo;
    }

    @Override
    public int getPoder() {
        return poder;
    }

    @Override
    public int getResistencia() {
        return resitencia;
    }
}
