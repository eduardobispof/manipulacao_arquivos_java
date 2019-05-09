import java.util.Collections;
import java.util.Comparator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Estoque {

    double precoMedio;
    int quantidadeGeral;
    ArrayList<Produto> produtos;

    public void maisCaros() {

        for (int i = 0; i < getProdutos().size(); i++) {
            Produto prod = this.produtos.get(i);
            System.out.println("Produto: " + prod.getNome());
            System.out.println("Preco: R$ " + prod.getPreco());
        }

    }

    public void setPrecoMedio(int quantidade, double valorTotal) {
        this.precoMedio = valorTotal / quantidade;
    }

    public double getPrecoMedio() {
        return this.precoMedio;
    }

    public void setQuantidadeGeral(int total) {
        this.quantidadeGeral = total;
    }

    public int getQuantidadeGeral() {
        return this.quantidadeGeral;
    }

    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }

}
