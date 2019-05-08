import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        ArrayList<Produto> l = new ArrayList<>();

        try {

            FileReader arq = new FileReader("produtos.csv");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();

            while ((linha = lerArq.readLine()) != null) {

                String tupla[] = linha.split(";");

                String nome = tupla[0];
                String marca = tupla[1];
                double pr = Double.parseDouble(tupla[2]);

                Produto p = new Produto(nome, marca, pr);
                l.add(p);
            }

            System.out.println("Quantidade de Produtos: " + l.size());
            System.out.println();

            for (int i = 0; i < l.size(); i++) {
                System.out.println("Produto " + i + ":");
                Produto produto = l.get(i);
                System.out.println("Nome: " + produto.nome);
                System.out.println("Marca: " + produto.marca);
                System.out.println("Preco: " + produto.preco);
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
