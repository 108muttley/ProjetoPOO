public class Voluntario {
    private String codVoluntario;
    private String nome ;
    private Gps gps;
    private double raio;

    public Voluntario(){
        this.codVoluntario = "Invalid";
        this.nome = "Invalid";
        this.gps = new Gps();
        this.raio = 0;
    }
    public Voluntario(String codVoluntario, String nome, Gps gps, double raio) {
        this.codVoluntario = codVoluntario;
        this.nome = nome;
        this.gps = gps.clone();
        this.raio = raio;
    }

    public Voluntario(Voluntario outro){
        this.codVoluntario = outro.codVoluntario;
        this.nome = outro.nome;
        this.gps = outro.gps.clone();
        this.raio = outro.raio;
    }

    public String getCodVoluntario() {
        return this.codVoluntario;
    }

    public void setCodVoluntario(String codVoluntario) {
        this.codVoluntario = codVoluntario;
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

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Voluntario a = (Voluntario) obj;
        return this.codVoluntario.equals(a.getCodVoluntario()) && this.nome.equals(a.getNome())
                && this.gps.equals(a.getGps()) && this.raio == a.getRaio();
    }

    @Override
    public Voluntario clone() {
        return new Voluntario(this);
    }

    @Override
    public String toString() {
        return "Código de voluntário: " + this.codVoluntario + " Nome: " + this.nome + this.gps.toString()
                + " Raio: " + this.raio;
    }
}
