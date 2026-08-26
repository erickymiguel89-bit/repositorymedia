package project04;
import javax.swing.JOptionPane;
public class main {
public static void main(String[] args) {
double soma = 0;
int notasValidasLidas = 0;
while (notasValidasLidas < 10) {
double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota " + (notasValidasLidas + 1) + ":"));
if (nota >= 0 && nota <= 10) {
soma += nota;
notasValidasLidas++;
} else {
JOptionPane.showMessageDialog(null, "Nota inválida! Digite um valor entre 0 e 10.");
}
}
double media = soma / 10;
JOptionPane.showMessageDialog(null, "A média das 10 notas válidas é: " + media);
}
}