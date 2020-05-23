package Modelo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SistemaGestaoEntregas implements ISistemaGestaoEntregas{
    private Set<Utilizador> utilizadores;
    private Set<Voluntario> voluntarios ;
    private Set<Transportadora> empresas;
    private Set<Loja> lojas;

    public SistemaGestaoEntregas() {
        this.utilizadores = new HashSet<>();
        this.voluntarios = new HashSet<>();
        this.empresas = new HashSet<>();
        this.lojas = new HashSet<>();
    }


    public SistemaGestaoEntregas loadFromFile() {
        SistemaGestaoEntregas res = new SistemaGestaoEntregas();
        List<String> linhas = Parse.lerFicheiro("logs.txt"); //alterar nome do ficheiro
        String[] linhaPartida;
        for (String linha : linhas) {
            linhaPartida = linha.split(":", 2);
            switch(linhaPartida[0]){
                case "Utilizador":
                    Utilizador u = Parse.parseUtilizador(linhaPartida[1]); // criar um Utilizador
                    res.utilizadores.add(u);
                    break;
                case "Loja":
                    Loja l = Parse.parseLoja(linhaPartida[1]);
                    res.lojas.add(l);
                    break;
                case "Transportadora":
                    Transportadora t = Parse.parseTransportadora(linhaPartida[1]);
                    res.empresas.add(t);
                    break;
                case "Voluntario":
                    Voluntario v = Parse.parseVoluntario(linhaPartida[1]);
                    res.voluntarios.add(v);
                    break;
            }

        }
       return res;
    }

    @Override
    public String toString() {
        return "SistemaGestaoEntregas{" +
                "utilizadores=" + this.utilizadores.toString() +
                ", voluntarios=" + this.voluntarios.toString() +
                ", empresas=" + this.empresas.toString() +
                ", lojas=" + this.lojas.toString() +
                '}';
    }
}
