class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void vender(int quantidade) {
        this.quantidadeEstoque -= quantidade;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
