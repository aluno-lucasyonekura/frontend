// Na linha abaixo etá importando a biblioteca (pacote)
import javax.swing.JOptionPane; 
// Na linha abaixo está sendo declarada a classe Addition
public class Addition 
// Na linha abixo está sendo aberto o bloco de códigos da classe Addition
{
   public static void main(String[] args)
   {
      // Para obter entrada do usuário nas caixas de diálogo de entrada do JOptionPane 
      String firstNumber = 
         JOptionPane.showInputDialog("Enter first integer");
      String secondNumber =
          JOptionPane.showInputDialog("Enter second integer");

      // Para converter entradas de String em valores int para uso em um cálculo
      int number1 = Integer.parseInt(firstNumber); 
      int number2 = Integer.parseInt(secondNumber);

      int sum = number1 + number2; // add numbers

      // Para exibir o resultado em uma caixa de diálogo de mensagem JOptionPane
      JOptionPane.showMessageDialog(null, "The sum is " + sum, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
   } 
} 