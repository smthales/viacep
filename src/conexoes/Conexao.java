package conexoes;
import excecoes.EntradaErradaException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Conexao {

    private String cep;

    public Conexao(String cep) {

        if(cep.length() < 8) {
            throw new EntradaErradaException("Formato incorreto de CEP");
        }


        this.cep = cep;
    }

    public String fazerConexao() throws IOException, InterruptedException {
        HttpClient client = HttpClient
                .newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/" + this.cep + "/json/"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
