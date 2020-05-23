package Modelo;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Parse {

    //...

    public void parse(){
        List<String> linhas = lerFicheiro("../../logs.txt"); //alterar nome do ficheiro
        String[] linhaPartida;
        for (String linha : linhas) {
            linhaPartida = linha.split(":", 2);
            switch(linhaPartida[0]){
                case "Utilizador":
                    Utilizador u = parseUtilizador(linhaPartida[1]); // criar um Utilizador
                    System.out.println(u.toString()); //enviar para o ecrÃ¡n apenas para teste
                    break;
                case "Loja":
                    Loja l = parseLoja(linhaPartida[1]);
                    System.out.println(l.toString());
                    break;
                //...
                default:
                    System.out.println("Linha invÃ¡lida.");
                    break;
            }

        }
        System.out.println("done!");
    }


    public static Utilizador parseUtilizador(String input){
        String[] campos = input.split(",");
        String nome = campos[0];
        String codUtilizador = campos[1];
        double gpsx = Double.parseDouble(campos[2]);
        double gpsy = Double.parseDouble(campos[3]);

        return new Utilizador(codUtilizador , nome ,new Gps(gpsx , gpsy));
    }

    public static Loja parseLoja(String input){
        String[] campos = input.split(",");
        String codLoja = campos[0];
        String nomeLoja = campos[1];
        //(...)
        return new Loja(codLoja , nomeLoja);
    }

    public static Transportadora parseTransportadora(String input){
        String[] campos = input.split(",");
        String codEmpresa = campos[0];
        String nome = campos[1];
        double gpsx = Double.parseDouble(campos[2]);
        double gpsy = Double.parseDouble(campos[3]);
        String nif = campos[4];
        double raio = Double.parseDouble(campos[5]);
        double precoKm = Double.parseDouble(campos[6]);
        return new Transportadora(codEmpresa , nome , new Gps(gpsx , gpsy) , nif , raio , precoKm);
    }

    public static Voluntario parseVoluntario(String input) {
        String[] campos = input.split(",");
        String codVoluntario = campos[0];
        String nome = campos[1];
        double gpsx = Double.parseDouble(campos[2]);
        double gpsy = Double.parseDouble(campos[3]);
        double raio = Double.parseDouble(campos[4]);
        return new Voluntario(codVoluntario, nome, new Gps(gpsx, gpsy), raio);
    }

    public static Encomenda parseEncomenda(String input) {
        String[] campos = input.split(",");
        String codEncomenda = campos[0];
        String codUtilizador = campos[1];
        String codLoja = campos[2];
        double preco = Double.parseDouble(campos[3]);
        List<LinhaEncomenda> res = new ArrayList<>();
        for (int i =4 ; i<campos.length ; i+=4){
            res.add(new LinhaEncomenda(campos[i], campos[i + 1], Double.parseDouble(campos[i+2]),Double.parseDouble( campos[i + 3])));
        }
        return new Encomenda(codEncomenda , codUtilizador , codLoja , preco ,res );
    }
    public static List<String> lerFicheiro(String nomeFich) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(nomeFich).toAbsolutePath().normalize(), StandardCharsets.UTF_8);
            System.out.println("Eu li");
        } catch(IOException exc) {
            System.out.println("Erro a ler ficheiro.");
            System.out.println(exc.getMessage());
        }
        return lines;
    }

// mais mÃ©todos

}
