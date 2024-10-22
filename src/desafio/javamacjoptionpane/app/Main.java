package desafio.javamacjoptionpane.app;

import javax.swing.JOptionPane;

import desafio.javamacjoptionpane.model.Pessoa;
import desafio.javamacjoptionpane.utils.CalculadoraIdade;
import desafio.javamacjoptionpane.utils.Verificador;

public class Main {
    public static void main(String[] args) throws Exception {
    	try {
    		Pessoa pessoa1 = informacoesDaPessoa("primeira");
            Pessoa pessoa2 = informacoesDaPessoa("segunda");

            int diferenca = CalculadoraIdade.calculaDiferenca(pessoa1.getIdade(), pessoa2.getIdade());

            String msg = "A diferença de idade de " + pessoa1.getNome() + " para " + pessoa2.getNome() + " é de: " +
                    diferenca + " Anos";

            JOptionPane.showMessageDialog(null, msg);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "FINALIZANDO PROCESSO POR ERRO", "Error", 2);
		}
    }

    public static Pessoa informacoesDaPessoa(String posicaoPessoa) throws Exception {
        String nomePessoa;
        int idadePessoa = 0;

        nomePessoa = JOptionPane.showInputDialog(null, "Informe o nome da " + posicaoPessoa + " pessoa:");
        Verificador.validaNomePessoa(nomePessoa);

        try {
            idadePessoa = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva a idade da " + posicaoPessoa + " pessoa:"));
        } catch (Exception NoSuchElementException) {
            JOptionPane.showMessageDialog(null, "Erro! Não é possível escrever letras, símbolos ou deixar o idade vazio!", "Error", 2);
            throw new RuntimeException("LETRAS, SÍMBOLOS OU VAZIO");
        }

        Verificador.validaIdadePessoa(idadePessoa);
        
        return new Pessoa(nomePessoa, idadePessoa);
    }
}
