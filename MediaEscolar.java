import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        System.out.println("MEDIA ESCOLAR");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = scan.nextInt();

        System.out.println("Digite a segunda nota: ");
        float nota2 = scan.nextInt();

        float media = (nota1 + nota2)/2;

        System.out.printf("A media final eh %.1f.\n", media);
        if(media >= 6){
            System.out.println("Aprovado");
        } else if(media < 6 && media >= 3){
            System.out.println("Recuperacao");
        } else{
            System.out.println("Reprovado");
        }
        scan.close();
    }
}