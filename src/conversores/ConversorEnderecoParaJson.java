package conversores;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelos.Endereco;
import java.io.FileWriter;
import java.io.IOException;

public class ConversorEnderecoParaJson {
    private Endereco endereco;

    public ConversorEnderecoParaJson(Endereco endereco) {
        this.endereco = endereco;
    }

    public void converterObjetoParaJson() throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("enderecos.json");

        escrita.write(gson.toJson(this.endereco));

        escrita.close();
    }
}
