import java.io.IOException;

class Principal {
    public static void main(String[] args) {

        try {
            FileManager arquivo = new FileManager();
            Estoque estoque = new Estoque();

            arquivo.setArquivo();

            arquivo.setArquivoBuffer(arquivo.getArquivo());

            arquivo.listarProdutos(estoque, arquivo.getArquivoBuffer());

            System.out.println("Quantidade de items em estoque: " + estoque.getQuantidadeGeral());

            System.out.printf("Preço médio dos Produtos: R$ %.2f %n", (estoque.getPrecoMedio()));

            estoque.maisCaros();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}