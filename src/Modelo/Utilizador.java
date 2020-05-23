package Modelo;

public class Utilizador {
    private String codUtilizador ;
    private String nome;
    private Gps gps = new Gps();

    public Utilizador(){
        this.codUtilizador = "Invalid";
        this.nome = "Invalid";
        this.gps = new Gps();
    }
    public Utilizador(String codUtilizador, String nome, Gps gps) {
        this.codUtilizador = codUtilizador;
        this.nome = nome;
        this.gps = gps.clone();
    }
    public Utilizador(Utilizador outro){
        this.codUtilizador = outro.codUtilizador;
        this.nome = outro.nome;
        this.gps = outro.gps.clone();
    }

    public String getCodUtilizador() {
        return this.codUtilizador;
    }

    public void setCodUtilizador(String codUtilizador) {
        this.codUtilizador = codUtilizador;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Gps getGps() {
        return this.gps.clone();
    }

    public void setGps(Gps gps) {
        this.gps = gps.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Utilizador a = (Utilizador) obj;
        return this.codUtilizador.equals(a.getCodUtilizador()) && this.nome.equals(a.getNome())
                && this.gps.equals(a.getGps());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Código: " + this.codUtilizador + " Nome de utilizador: " + this.nome + this.gps.toString();
    }
}
