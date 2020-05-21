public class Gps {
    private double x;
    private double y;

    public Gps(){
        this.x = 0;
        this.y = 0;
    }
    public Gps(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Gps (Gps outro){
        this.x = outro.x;
        this.y = outro.y;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public Gps clone() {
        return new Gps(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (this.getClass() != obj.getClass() || obj==null) return false;
        Gps a = (Gps) obj;
        return this.x == a.getX() && this.y == a.getY();
    }

    @Override
    public String toString() {
        return "Coordenadas do GPS: x-> " + this.x + " y-> " + this.y;
    }
}
