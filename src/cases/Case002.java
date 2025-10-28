package cases;

import java.util.concurrent.ThreadLocalRandom;

public class Case002 {

    static void main(String[] args) {
        System.out.println("Processo Seletivo");
        selecaoCandidatos();

    }
    static void selecaoCandidatos (){
        String [] candidatos ={"MARIA","JOÃO","MIGUEL","JOSÉ","VICTOR","PABLO","JOSUARES","PEDRO","NICOLAS","MARCÃO"};
        //System.out.println(candidatos);
        int candidatosSelecionados=0;
        int candidatoAtual =0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual<candidatos.length){
            String candidato = candidatos[candidatoAtual];
            Double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+candidato+" possui o salário pretendido de "+salarioPretendido);

            if(salarioBase >= salarioPretendido ){
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
                candidatosSelecionados++;
            }else{
                System.out.println("O candidato "+candidato+" NÃO foi selecionado ");
            }
            candidatoAtual++;
        }
    }


    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


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
