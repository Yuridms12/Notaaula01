public class Produto {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTamanhopeso() {
        return tamanhopeso;
    }

    public void setTamanhopeso(double tamanhopeso) {
        this.tamanhopeso = tamanhopeso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeestoque() {
        return quantidadeestoque;
    }

    public void setQuantidadeestoque(int quantidadeestoque) {
        this.quantidadeestoque = quantidadeestoque;
    }

    private String nome;
    private String cor;
    private double preco;
    private double tamanhopeso;
    private int codigo;
    private int quantidadeestoque;

}
