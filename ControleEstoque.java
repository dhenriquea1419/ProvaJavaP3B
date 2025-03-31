import java.util.Scanner;

public class ControleEstoque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = lerProduto(scanner);

        System.out.print("Quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();

        System.out.println("\nInformações do produto antes da venda:");
        produto.exibirInformacoes();

        if (quantidadeVendida > produto.getQuantidadeEstoque()) {
            System.out.println("\nEstoque insuficiente para realizar a venda.");
        } else {
            produto.vender(quantidadeVendida);

            System.out.println("\nInformações do produto após a venda:");
            produto.exibirInformacoes();
        }

        scanner.close();
    }
