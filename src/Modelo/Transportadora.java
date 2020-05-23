package Modelo;

public class Transportadora {
    private String codEmpresa;
    private String nomeEmpresa;
    private Gps gps = new Gps();
    private String nif;
    private double raio;
    private double precoKm;

    public Transportadora (){
        this.codEmpresa = "Invalid";
        this.nomeEmpresa = "Invalid";
        this.gps = new Gps();
        this.nif = "Invalid";
        this.raio = 0;
        this.precoKm = 0;
    }
    public Transportadora(String codEmpresa, String nomeEmpresa, Gps gps, String nif, double raio, double precoKm) {
        this.codEmpresa = codEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.gps = gps.clone();
        this.nif = nif;
        this.raio = raio;
        this.precoKm = precoKm;
    }
    public Transportadora (Transportadora outro){
        this.codEmpresa = outro.codEmpresa;
        this.nomeEmpresa = outro.nomeEmpresa;
        this.gps = outro.gps.clone();
        this.nif = outro.nif;
        this.raio = outro.raio;
        this.precoKm = outro.precoKm;
    }

    public String getCodEmpresa() {
        return this.codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getNomeEmpresa() {
        return this.nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public Gps getGps() {
        return this.gps.clone();
    }

    public void setGps(Gps gps) {
        this.gps = gps.clone();
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPrecoKm() {
        return this.precoKm;
    }

    public void setPrecoKm(double precoKm) {
        this.precoKm = precoKm;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return true;
        Transportadora a = (Transportadora) obj;
        return this.codEmpresa.equals(a.getCodEmpresa())
                && this.nomeEmpresa.equals(a.getNomeEmpresa())
                && this.gps.equals(a.getGps())
                && this.nif.equals(a.getNif())
                && this.raio == a.getRaio()
                && this.precoKm == a.getPrecoKm();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Transportadora(this);
    }

    @Override
    public String toString() {
        return "Código do Empresa " + this.codEmpresa + " Nome da Empresa: " + this.nomeEmpresa
                + this.gps.toString() + " Nif: " + this.nif + "Raio: " + this.raio + " Preço por Km: " + this.precoKm;
    }
}
