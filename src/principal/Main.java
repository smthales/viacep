package principal;

import java.io.IOException;
import java.util.Scanner;

import conversores.ConversorJsonParaEndereco;
import excecoes.EntradaErradaException;
import modelos.Endereco;
import conversores.ConversorEnderecoParaJson;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            ConversorJsonParaEndereco conversorJsonParaEndereco = new ConversorJsonParaEndereco(sc.nextLine());
            Endereco endereco = conversorJsonParaEndereco.converterJsonParaEndereco();
            System.out.println(endereco);

            ConversorEnderecoParaJson conversor = new ConversorEnderecoParaJson(endereco);
            conversor.converterObjetoParaJson();

        } catch(EntradaErradaException e) {
            System.out.println(e.getMessage());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            sc.close();
        }

    }
}