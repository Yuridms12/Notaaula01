import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc2.nextLine();
        System.out.println("Digite sua primeira nota");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota");
        double nota3 = sc.nextDouble();
        double resultado = (nota1 + nota2 + nota3)/3;
        System.out.printf("Sua média é %.2f%n", resultado);

        if (resultado >= 70) {
            System.out.printf("%s, você está aprovado!", nome);

        } else if (resultado >= 40 && resultado < 70){
            System.out.printf("%s, você está na final", nome);

        } else {
            System.out.printf("%s, você está na final", nome);
        }





    }
}