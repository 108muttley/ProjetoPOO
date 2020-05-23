package Controlador;
import Modelo.SistemaGestaoEntregas;
import Visualizador.Visualizador;
public class Controlador implements IControlador{
    SistemaGestaoEntregas sge;

    public Controlador() {
        this.sge = new SistemaGestaoEntregas();
    }

    @Override
    public void run() {
        String input = "";
        while(!(input.equalsIgnoreCase("quit"))){
            input = Input.lerString();
            switch (input.toLowerCase()) {
                case "quit":
                    System.out.println("Obrigado. Volte sempre.");
                    break;
                case "print sge":
                    Visualizador.printString(this.sge.toString());
                    break;
                case "load":
                    this.sge = sge.loadFromFile();
                    System.out.println("Loaded");
                    break;
                default:
                    System.out.println("Comando Inválido. Tente de novo.");
                    break;
            }
        }
    }
}
