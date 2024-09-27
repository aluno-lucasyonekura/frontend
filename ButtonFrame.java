
import java.awt.FlowLayout;// como os objetos vão ser rendarizados renderizadas
import java.awt.event.ActionListener;// são responsaveis para quando clicar nos botões mostra outras coisas
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;// mensagem que aparece quando clicar no botão
public class ButtonFrame extends JFrame // declaração de classe// extends (herança)// JFrame deixou herança para o ButtonFrame
{
   private final JButton plainJButton; //declarações de tipo
   private final JButton fancyJButton; 


      public ButtonFrame()
   {
      super("Testing Buttons");//definidor de título
      setLayout(new FlowLayout()); //definidor de layout

      plainJButton = new JButton("Plain Button"); //adiciona a mensagem 
      add(plainJButton); 

      Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));// declarando a variavel e atribuido a outro icon
      Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
      fancyJButton = new JButton("Fancy Button", bug1); // defini valor de fancyJButton
      fancyJButton.setRolloverIcon(bug2); // quando rolar por cima do bug1 muda pro bug2
      add(fancyJButton); 
      
      ButtonHandler handler = new ButtonHandler();// executa a funçao manualmente
      fancyJButton.addActionListener(handler);
      plainJButton.addActionListener(handler);
   }

   
   private class ButtonHandler implements ActionListener 
   { //new ActionListener
     
      @Override
      public void actionPerformed(ActionEvent event)// como ele age dentro da ação
      {
         JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
            "You pressed: %s", event.getActionCommand()));
      }
   } 
} 