package desafio.javamacjoptionpane.utils;

public class CalculadoraIdade {
    public int calculaDiferenca(int idade1, int idade2) {
        int diferencaEmAnos = idade1 - idade2;
        return diferencaEmAnos > 0 ? diferencaEmAnos : diferencaEmAnos * (-1);
    }
}
