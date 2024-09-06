package conversores;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

import modelos.Endereco;
import com.google.gson.Gson;
import excecoes.EntradaErradaException;

public class ConversorJsonParaEndereco {
    private String cep;

    public ConversorJsonParaEndereco(String cep) {
        if((cep.length() != 8) || (!cep.matches("\\d{8}"))) {
            throw new EntradaErradaException("Entrada incorreta de CEP");
        }
        this.cep = cep;
    }

    public Endereco converterJsonParaEndereco() throws IOException, InterruptedException {
        HttpClient client = HttpClient
                .newHttpClient();
        HttpRequest request = HttpRequest.
                newBuilder(URI.create("https://viacep.com.br/ws/" + this.cep + "/json/")).
                build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();

        return gson.fromJson(response.body(), Endereco.class);
    }
}
