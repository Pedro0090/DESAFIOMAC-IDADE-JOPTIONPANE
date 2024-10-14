package desafio.javamacjoptionpane.utils;

public class Verificador {
    public boolean validaNomePessoa(String nome) {
        if (nome != null)
            return nome.length() > 0;
        return false;
    }

    public boolean validaIdadePessoa(int idade) {
        return idade > 0;
    }
}
