
import javax.swing.JFrame;
// declaração da tecla button test
public class ButtonTest 
// inicio    
{
   // declaração do método main
   public static void main(String[] args)
   // inicio do método principal
   { 
      // declaração do tipo ButtonFrame
      ButtonFrame buttonFrame = new ButtonFrame(); 
      // operação de fechamento padrão
      buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // tamanho
      buttonFrame.setSize(275, 110); 
      // para mostrar a tela
      buttonFrame.setVisible(true); 
   } 
} 