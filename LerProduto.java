private static Produto LerProduto(Scanner scanner) {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade inicial em estoque: ");
        int quantidadeInicial = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente

        return new Produto(nome, preco, quantidadeInicial);
    }
}
