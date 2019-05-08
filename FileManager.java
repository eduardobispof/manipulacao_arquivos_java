import java.io.BufferedReader;
import java.io.FileReader;

public class FileManager {
    FileReader arquivo;
    BufferedReader arquivoBuffer;

    public FileManager() {
        setArquivo(arquivo);
    }

    /**
     * @return the arquivo
     */
    public FileReader getArquivo() {
        return arquivo;
    }

    /**
     * @param arquivo the arquivo to set
     */
    public void setArquivo(FileReader arquivo) {
        this.arquivo = arquivo = new FileReader("estoque.csv");
    }
}