package cases;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class Case004 {
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

        while(candidatosSelecionados < escolhidos.length && candidatoAtual<candidatos.length){
            String candidato = candidatos[candidatoAtual];
            Double salarioPretendido = valorPretendido();

            System.out.printf("O candidato "+candidato+" possui o salário pretendido de R$%.2f \n",salarioPretendido);

            if(salarioBase >= salarioPretendido ){
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga\n");
                escolhidos[candidatosSelecionados] = candidato; //armazena os escolhidos na lista
                candidatosSelecionados++;
            }else{
                System.out.println("O candidato "+candidato+" NÃO foi selecionado\n ");
            }
            candidatoAtual++;
        }imprimirEscolhidos(escolhidos);//manda os canidatos selecionados para imporimir
        entrandoEmContado(escolhidos);


    }

    //Imprimi os candidados escolhidos
    static void imprimirEscolhidos(String[] escolhidos){
        System.out.println("\n\nLista de candidatos escolhidos");
        for (int indice = 0; indice <5;indice++){

            System.out.println("Candidato: "+escolhidos[indice]);
        }
    }

    static void entrandoEmContado(String[] candidato){
        System.out.println("\n\nEntrando em contado com os candidatos\n");
        for(int i = 0; i< candidato.length;i++) {
        int tentaivasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
            do {
                atendeu = atender();
                continuarTentando = !atendeu;
                if (continuarTentando) {
                    tentaivasRealizadas++;
                } else {
                    System.out.println("\nCONTATO REALIZADO COM SUCESSO");
                    System.out.println("Candidato "+candidato[i]);
                }
            } while (continuarTentando && tentaivasRealizadas < 3);
            if (atendeu) {
                System.out.println("Conseguimos contado com o candidato " + candidato[i] + " na tentativa numero: " + tentaivasRealizadas);
            } else {
                System.out.println("\nNão consegumos contado com o candidaro " + candidato[i] + " numero maximo de tentativa: " + tentaivasRealizadas);
            }
        }
    }

    //Gera umvalor pretendido agora
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    //Metodo atender
    static boolean atender(){
        return new Random().nextInt(3) ==1;
    }
}
