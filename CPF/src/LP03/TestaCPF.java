package LP03;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class TestaCPF {

	public static void main(String[] args) {
		
        Scanner ler = new Scanner(System.in);
        
        String CPF;
        String nome;

        nome = JOptionPane.showInputDialog("Digite o nome: ");
        CPF = JOptionPane.showInputDialog("Digite o CPF: ");
        JOptionPane.showMessageDialog(null, "Nome: "+nome,"Informa��o",JOptionPane.INFORMATION_MESSAGE);

        if (ValidaCPF.isCPF(CPF) == true)
        	JOptionPane.showMessageDialog(null, "CPF v�lido: "+ ValidaCPF.imprimeCPF(CPF));
  
        else 
        	JOptionPane.showMessageDialog(null, "CPF inv�lido!");
        }
    }
