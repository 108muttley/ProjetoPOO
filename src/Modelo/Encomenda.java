package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Encomenda {
    private String codEncomenda;
    private String codUtilizador;
    private String codLoja;
    private double peso;
    private List<LinhaEncomenda> linhadeEncomenda = new ArrayList<>();

    public Encomenda(){
        this.codEncomenda = "Invalid";
        this.codUtilizador = "invalid";
        this.codLoja = "Invalid";
        this.peso = 0;
        this.linhadeEncomenda = new ArrayList<>();
    }

    public Encomenda(String codEncomenda, String codUtilizador, String codLoja, double preco,
                     List<LinhaEncomenda> linhadeEncomenda) {
        this.codEncomenda = codEncomenda;
        this.codUtilizador = codUtilizador;
        this.codLoja = codLoja;
        this.peso = peso;
        for (LinhaEncomenda a:
             linhadeEncomenda) {
            this.linhadeEncomenda.add(a.clone());
        }
    }

    public Encomenda(Encomenda outro){
        this.codEncomenda = outro.codEncomenda;
        this.codUtilizador = outro.codUtilizador;
        this.codLoja = outro.codLoja;
        this.peso = outro.peso;
        for (LinhaEncomenda a:
             outro.linhadeEncomenda) {
            this.linhadeEncomenda.add(a.clone());
        }
    }

    public String getCodEncomenda() {
        return this.codEncomenda;
    }

    public void setCodEncomenda(String codEncomenda) {
        this.codEncomenda = codEncomenda;
    }

    public String getCodUtilizador() {
        return this.codUtilizador;
    }

    public void setCodUtilizador(String codUtilizador) {
        this.codUtilizador = codUtilizador;
    }

    public String getCodLoja() {
        return this.codLoja;
    }

    public void setCodLoja(String codLoja) {
        this.codLoja = codLoja;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public List<LinhaEncomenda> getLinhadeEncomenda() {
        List<LinhaEncomenda> ret = new ArrayList<>();
        for (LinhaEncomenda a:
             this.linhadeEncomenda) {
            ret.add(a.clone());
        } return ret;
    }

    public void setLinhadeEncomenda(List<LinhaEncomenda> linhadeEncomenda) {
        this.linhadeEncomenda = new ArrayList<>();
        for (LinhaEncomenda a:
             linhadeEncomenda) {
            this.linhadeEncomenda.add(a);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj==null || obj.getClass() != this.getClass()) return false;
        Encomenda a = (Encomenda) obj;
        return this.codEncomenda.equals(a.getCodEncomenda())
                && this.codUtilizador.equals(a.getCodUtilizador())
                && this.codLoja.equals(a.getCodLoja())
                && this.peso == a.getPeso()
                && this.linhadeEncomenda.equals(a.getLinhadeEncomenda());
    }

    @Override
    public Encomenda clone() {
        return new Encomenda(this);
    }

    @Override
    public String toString() {
        return "Código da encomenda: " + this.codEncomenda
                + " Código do utilizador: " + this.codUtilizador
                + " Código da loja " + this.codLoja
                + " Peso " + this.peso
                + this.linhadeEncomenda.toString();
    }
}
