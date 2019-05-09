import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    FileReader arquivo;
    BufferedReader arquivoBuffer;
    String linha;

    /**
     * @return the arquivo
     */
    public FileReader getArquivo() {
        return this.arquivo;
    }

    /**
     * @param arquivo the arquivo to set
     */
    public void setArquivo() throws IOException {
        this.arquivo = new FileReader("estoque.csv");
    }

    /**
     * @return the arquivoBuffer
     */
    public BufferedReader getArquivoBuffer() {
        return this.arquivoBuffer;
    }

    /**
     * @param arquivoBuffer the arquivoBuffer to set
     */
    public void setArquivoBuffer(FileReader arquivoBuffer) {
        this.arquivoBuffer = new BufferedReader(arquivoBuffer);
    }

    /**
     * @return the linha
     */
    public String getLinha() {
        return this.linha;
    }

    /**
     * @param linha the linha to set
     */
    public void setLinha(BufferedReader arquivoBuffer) throws IOException {
        this.linha = getArquivoBuffer().readLine();
    }

    public void listarProdutos(Estoque estoque, BufferedReader lista) throws IOException {

        // contador para somar o valor total dos cprodutos
        double precoTotal = 0;

        // valor para somar a quantidade em estoque dos produtos
        int quantidadeTotal = 0;

        // contador para somar o numero de produtos cadastrados
        int quantidadeProdutos = 0;

        estoque.produtos = new ArrayList<Produto>();

        String linhas = lista.readLine();

        while ((linhas = lista.readLine()) != null) {
            // separa a linhas com o delimitador ';' e transforma em um array onde cada
            // coluna vida um elemento
            String pedacos[] = linhas.split(";");

            // converte o indice 3 do array (estoque) de string para inteiro
            int convertQuantidade = Integer.parseInt(pedacos[3]);

            // converte o indice 2 do array (preco) de string para double
            double convertPreco = Double.parseDouble(pedacos[2]);

            // a cada vez que o laco é executado o atributo recebe o valor dele mais o valor
            // do produto atual

            // recebe e soma o valor dos preços para calcular a média
            precoTotal += convertPreco;

            // recebe e soma o valor em estoque de cada produto
            quantidadeTotal += convertQuantidade;

            // conta o numero de produtos cadastrados
            quantidadeProdutos++;

            Produto prod = new Produto(pedacos[0], pedacos[1], convertPreco, convertQuantidade);

            // adiciona os produtos ao atributo produtos
            estoque.produtos.add(prod);

            estoque.setQuantidadeGeral(quantidadeTotal);

            estoque.setPrecoMedio(quantidadeProdutos, precoTotal);
        }
        System.out.println(quantidadeProdutos);
    }
}