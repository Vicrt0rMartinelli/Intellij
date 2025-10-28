public class Case001 {

    static void main(String[] args) {
        System.out.println("Processo Seletivo");
        analisaCanditado(1900.0);
        analisaCanditado(2000.0);
        analisaCanditado(2200.0);
    }
    static void analisaCanditado(double salariioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salariioPretendido) {
            System.out.println("LIGAR PARA O CANTIDATO");
        }else if(salarioBase==salariioPretendido){
            System.out.println("LIGAR PARA O CANTIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDAR RESULTADO DOS DEMAIS CANDITADOS");
        }
    }
}

