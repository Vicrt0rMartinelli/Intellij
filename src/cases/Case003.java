package cases;
import java.util.concurrent.ThreadLocalRandom;

public class Case003 {
    //Manda em tudo
    static void main(String[] args) {
        System.out.println("Processo Seletivo");
        selecaoCandidatos();


    }

    /*Parte que seleciona os candidatos com base no salario pretendido*/
    static void selecaoCandidatos (){
        String [] candidatos ={"MARIA","JOÃO","MIGUEL","JOSÉ","VICTOR","PABLO","JOSUARES","PEDRO","NICOLAS","MARCÃO"};
        String[] escolhidos = new String[5];
        int candidatosSelecionados=0;
        int candidatoAtual =0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual<candidatos.length){
            String candidato = candidatos[candidatoAtual];
            Double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+candidato+" possui o salário pretendido de "+salarioPretendido);

            if(salarioBase >= salarioPretendido ){
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
                escolhidos[candidatosSelecionados] = candidato; //armazena os escolhidos na lista
                candidatosSelecionados++;
            }else{
                System.out.println("O candidato "+candidato+" NÃO foi selecionado ");
            }
            candidatoAtual++;
        }imprimirEscolhidos(escolhidos);
    }
    //Imprimi os candidados escolhidos
    static void imprimirEscolhidos(String[] escolhidos){
        System.out.println("\n\nLista de candidatos escolhidos");
        for (int indice = 0; indice <5;indice++){

            System.out.println("Candidato: "+escolhidos[indice]);
        }
    }

    //Gera umvalor pretendido agora
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //Diz ação a ser feita
    static void analisaCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDAR RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
