package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Aceite {
    private List<Encomenda> encomendasAceites = new ArrayList<>();

    public Aceite (){
        this.encomendasAceites = new ArrayList<>();
    }

    public Aceite(List<Encomenda> encomendasAceites) {
        for (Encomenda a:
             encomendasAceites) {
            this.encomendasAceites.add(a.clone());
        }
    }

    public Aceite(Aceite outro){
        for (Encomenda a:
             outro.encomendasAceites) {
                this.encomendasAceites.add(a.clone());
        }
    }

    public List<Encomenda> getEncomendasAceites() {
        List<Encomenda> ret = new ArrayList<>();
        for (Encomenda a: this.encomendasAceites) {
            ret.add(a.clone());
        } return ret;
    }

    public void setEncomendasAceites(List<Encomenda> encomendasAceites) {
        this.encomendasAceites = new ArrayList<>();
        for (Encomenda a:
                encomendasAceites) {
            this.encomendasAceites.add(a.clone());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Aceite a = (Aceite) obj;
        return this.encomendasAceites.equals(a.getEncomendasAceites());

    }

    @Override
    protected Aceite clone() throws CloneNotSupportedException {
        return new Aceite(this);
    }

    @Override
    public String toString() {
        return "Encomendas Aceites :" + this.encomendasAceites.toString();
    }
}
