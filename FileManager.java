import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

    public static void main(String[] args) {
        try {
            FileManager teste = new FileManager();
            teste.setArquivo();
            teste.setArquivoBuffer(teste.getArquivo());
            teste.setLinha(teste.getArquivoBuffer());

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Fim do programa");
        }
        System.out.println("OK");
    }

}