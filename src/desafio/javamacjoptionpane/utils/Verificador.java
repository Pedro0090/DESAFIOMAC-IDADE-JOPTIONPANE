package desafio.javamacjoptionpane.utils;

import java.util.Objects;

import javax.swing.JOptionPane;

public class Verificador {
	
    public static void validaNomePessoa(String nome) {
    	if(Objects.equals(nome, "") || Objects.isNull(nome)) {
    		JOptionPane.showMessageDialog(null, "Erro! Você não pode deixar o campo nome vazio!", "Error", 2);
            throw new RuntimeException("CAMPO VAZIO");
    	}
    }

    public static void validaIdadePessoa(int idade) {
    	if(idade <= 0) {
    		JOptionPane.showMessageDialog(null, "Erro! Idade inválida!", "Error", 2);
            throw new RuntimeException("IDADE INVÁLIDA");
    	}
    }
}
