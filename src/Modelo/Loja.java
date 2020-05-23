package Modelo;

public class Loja {
    private String codLoja;
    private String nomeLoja;

    public Loja(){
        this.codLoja = "Invalid";
        this.nomeLoja = "Invalid";
    }
    public Loja(String codLoja, String nomeLoja) {
        this.codLoja = codLoja;
        this.nomeLoja = nomeLoja;
    }
    public Loja( Loja outro) {
        this.codLoja = outro.codLoja;
        this.nomeLoja = outro.nomeLoja;
    }

    public String getCodLoja() {
        return this.codLoja;
    }

    public void setCodLoja(String codLoja) {
        this.codLoja = codLoja;
    }

    public String getNomeLoja() {
        return this.nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj==null && obj.getClass() != this.getClass()) return false;
        Loja a = (Loja) obj;
        return this.nomeLoja.equals(a.getNomeLoja()) && this.codLoja.equals(a.getCodLoja());
    }

    @Override
    public Loja clone() {
        return new Loja(this);
    }

    @Override
    public String toString() {
        return "Código da loja: " + this.codLoja + " Nome da loja: " + this.nomeLoja;
    }
}
