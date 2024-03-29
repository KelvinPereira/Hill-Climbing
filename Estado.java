package hill_climbing;

import hill_climbing.Algoritmo;
import java.util.ArrayList;
import java.util.List;

public class Estado {

    private String nome;
    private List<Estado> vizinhos;
    private int valor;
    private int getValor;

    //construtor
    public Estado(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
        this.vizinhos = new ArrayList<>();
    }


    //geters e seters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estado> getVizinhos() {
        return vizinhos;
    }

    //  public void setVizinhos(List<Estado> vizinhos) {
    //      this.vizinhos = vizinhos;
    //  }
    
    public void addVizinhos(Estado vizinhos) {
        this.vizinhos.add(vizinhos);
        System.out.println("adicionou vizinho " +vizinhos.nome + " com valor " + vizinhos.valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    //metodo que retorna o maior vizinho

    public Estado maiorVizinho() {
        int tmp;
        int indice_maior = 0;//armazena indice com maior valor
        int maior_valor = 0;

//        System.out.println("Array:" + vizinhos.size());
        for (int i = 0; i < vizinhos.size(); i++) {
            tmp = vizinhos.get(i).getValor;

            if (tmp > maior_valor) {
                maior_valor = tmp;
                indice_maior = i;
            }
        }
        return vizinhos.get(indice_maior);
    }
}