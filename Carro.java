package trabalhoCarro;

public class Carro {
    private   String cor;
    private   double potencia;
    private   String modelo;
    private    String listaTipo;
    private   String tCombustivel;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getListaTipo() {
        return listaTipo;
    }

    public void setListaTipo(String listaTipo) {
        this.listaTipo = listaTipo;
    }

    public String gettCombustivel() {
        return tCombustivel;
    }

    public void settCombustivel(String tCombustivel) {
        this.tCombustivel = tCombustivel;
    }

    @Override
    public String toString() {
        return "Carro{" + "cor='" + cor + '\'' +", potencia=" + potencia +", modelo='" + modelo + '\'' +
                ", listaTipo='" + listaTipo + '\'' +", tCombustivel='" + tCombustivel + '\'' +'}';
    }
}