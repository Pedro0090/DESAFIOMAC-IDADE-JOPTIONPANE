package desafio.javamacjoptionpane.app;

import javax.swing.JOptionPane;
import desafio.javamacjoptionpane.model.Pessoa;
import desafio.javamacjoptionpane.utils.CalculadoraIdade;
import desafio.javamacjoptionpane.utils.Verificador;
import java.util.Scanner;

import static javax.swing.JOptionPane.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = informacoesDaPessoa("primeira");
        Pessoa pessoa2 = informacoesDaPessoa("segunda");

        CalculadoraIdade calculadoraIdade = new CalculadoraIdade();
        int diferenca = calculadoraIdade.calculaDiferenca(pessoa1.getIdade(), pessoa2.getIdade());

        String msg = "A diferença de idade de " + pessoa1.getNome() + " para " + pessoa2.getNome() + " é de: " +
                diferenca + " Anos";

        showMessageDialog(null, msg);
    }

    public static Pessoa informacoesDaPessoa(String posicaoPessoa) throws Exception {
        Verificador verificador = new Verificador();

        String nomePessoa;
        int idadePessoa = 0;


        nomePessoa = showInputDialog(null, "Informe o nome da " + posicaoPessoa + " pessoa:");
        if (!verificador.validaNomePessoa(nomePessoa)) {
            showMessageDialog(null, "Erro! Você não pode deixar o campo nome vazio!", "Error", 2);
            throw new RuntimeException("CAMPO VAZIO");
        }

        try {
            idadePessoa = Integer.parseInt(showInputDialog(null, "Escreva a idade da " + posicaoPessoa + " pessoa:"));
        } catch (Exception NoSuchElementException) {
            showMessageDialog(null, "Erro! Não é possível escrever letras, símbolos ou deixar o idade vazio!", "Error", 2);
            throw new RuntimeException("LETRAS, SÍMBOLOS OU VAZIO");
        }

        if (!verificador.validaIdadePessoa(idadePessoa)) {
            showMessageDialog(null, "Erro! Idade inválida!", "Error", 2);
            throw new RuntimeException("IDADE INVÁLIDA");
        }
        return new Pessoa(nomePessoa, idadePessoa);
    }
}
