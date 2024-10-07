import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();
        System.out.println("Digite o nome do produto: ");
        p.setNome(sc2.nextLine());
        System.out.println("Digite o código do produto: ");
        p.setCodigo(sc.nextInt());
        System.out.println("Digite a cor do produto:");
        p.setCor(sc.next());
        System.out.println("Digite o tamanho/peso do produto( Em número ): ");
        p.setTamanhopeso(sc.nextInt());
        System.out.println("Digite a quantidade do produto no estoque: ");
        p.setQuantidadeestoque(sc.nextInt());
        System.out.println("Digite o preço do produto: ");
        p.setPreco(sc.nextDouble());


        System.out.println("Escolha seu método de pagamento (Pix, Espécie, Transferência, Débito ou Crédito)");
        String formadepagamento = sc.next();

        if (formadepagamento.equalsIgnoreCase("Pix") ||
                formadepagamento.equalsIgnoreCase("Transferência") ||
                formadepagamento.equalsIgnoreCase("Débito")) {

            double valor = p.getPreco() * 0.95;
            System.out.printf("O preço já com o desconto é: %.2f%n", valor);
        } else if (formadepagamento.equalsIgnoreCase("Crédito")) {
            System.out.printf("O valor parcelado em 3x sem juros é: %.2f%n", p.getPreco() / 3);
        } else if (formadepagamento.equalsIgnoreCase("Espécie")) {
            System.out.println("Quanto você irá pagar?");
            double valor1 = sc.nextDouble();
            double valor2 = p.getPreco() * 0.95;
            double troco = valor1 - valor2;
            if (troco >= 0) {

                double valor = p.getPreco() * 0.95;
                System.out.printf("O preço já com o desconto é: %.2f%n", valor);
                System.out.printf("O troco é: %.2f%n", troco);

            } else {

                System.out.println("Pagamento inválido!");

            }
        }


        

    }
}
