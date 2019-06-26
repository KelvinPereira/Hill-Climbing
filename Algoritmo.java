package hill_climbing;

import hill_climbing.Estado;

public class Algoritmo {

//    Estado estado_atual = new Estado("A", 10);
//    Estado estado_inicial = new Estado("A", 10);

    public Estado hill(Estado estado_atual) {

        while(true) 
        {
            Estado vizinho = estado_atual.maiorVizinho();
            if (vizinho.getValor() < estado_atual.getValor()) {
//                System.out.println("estado local maior: " + estado_atual.getNome() + estado_atual.getValor() );
                return estado_atual;}
             else 
                estado_atual = vizinho;    
        }     
    }  
}
