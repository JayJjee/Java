public class ex03 {
    public static void main(String[] args){

        // == < > <= >= != ! (true or false)

        int nota = 10;
        int falta = 10;
        int maxFalta = 5;
        int media = 6;
        /*
            Operacao ternaria

        String resultado;
        resultado = (nota >= media? "Aprovado" : "Reprovado");*/

        if(nota >= media && falta <= maxFalta){
            System.out.println("Aprovado");
        } else if(nota >= 4){
            System.out.println("Recuperacao");
        } else{
            System.out.println("Reprovado");
        }
        System.out.println("Fim do programa");
    }
}
