import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 0, resultado = 0;
        String nome = "";
        
        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("Digite um numero: ");
        n1 = scan.nextInt();
        
        System.out.println("Digite outro numero: ");
        n2 = scan.nextInt();

        resultado = n1 + n2;
        
        System.out.printf("%s, a soma de %d com %d eh igual a %d",nome,n1,n2,resultado);
        scan.close();
    }
}
