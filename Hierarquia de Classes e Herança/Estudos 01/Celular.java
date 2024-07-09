public class Celular {
    private String marca;
    private String modelo;
    private int ano;
    private String numeroSerie;
    private double preco;
    
    public Celular(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        if (numeroSerie != null) {
            System.out.println("Número de Série: " + numeroSerie);
        }
        if (preco != 0.0) {
            System.out.println("Preço: R$" + preco);
        }
        System.out.println();
    }
}
