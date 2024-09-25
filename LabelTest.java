// A linha abaixo importará o compontente Jframe do módulko swing da biblioteca (pacote) javax
import javax.swing.JFrame;
// A linha abaixo está decalrando a classe LabelTest
public class LabelTest
// ... 
{
   // Declarando o método main   
   public static void main(String[] args)
   // ...
   { 
      // A linha abaixo está declarando a variável LabelFrame
      LabelFrame labelFrame = new LabelFrame();
      // A linha abaixo está invocando o método 
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // A linha abaixo está declarando o tamanho 
      labelFrame.setSize(260, 180); 
      // A linha abaixo renderiza 
      labelFrame.setVisible(true); 
      // Encerra bloco de notas do método
   } 
   // Encerra bloco de códigos da classe
} 