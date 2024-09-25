
import java.awt.FlowLayout; // está importando componente de um módulo de biblioteca (pacote) 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.SwingConstants;
import javax.swing.Icon; 
import javax.swing.ImageIcon; 

public class LabelFrame extends JFrame // Está declarando a classe LabelFrame que está  herdando (extends) o compontente JFrame
// iniciando o bloco de notas da classe LabelFrame
{
   private final JLabel label1;  // declarações de variáveis //private não exporta a variável
   private final JLabel label2;  // final serve para variável somente leitura
   private final JLabel label3;  // JLabel é o tipo da variável

   
   public LabelFrame() //puclic pode ser variável, flexível// construtor deve ter o mesmo nome da classe que tem o mesmo nome do arquivo
   {
      // super significa que estamos definindo o título
      super("Testando JLabel");
     // Vai definir o desenho do quadro (layout) como vai ficar as camadas // FlowLayout(tipo)
      setLayout(new FlowLayout()); 

      // Está recebendo um novo objeto (JLabel)  
      label1 = new JLabel("Rótulo com texto");
      // Está definindo um texto na ferramenta de dica (quando colocar o mouse encima do texto vai aparecer a dica)
      label1.setToolTipText("Esse é o label1");
      // Adicionar o label1 // add (injetar)
      add(label1); 
     
      // variável bug tipo icon que está recebendo // get class(apropriar-se da classe LabelFrame
      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
      // Está recebendo um novo objeto do tipo JLabel //"," serve como separador de parametros/matriz/... // swingconstants serve como alinhamento
      label2 = new JLabel("Rótulo com texto e ícone", bug, 
         SwingConstants.LEFT);
      label2.setToolTipText("Esse é o label2");
      add(label2); // add label2 to JFrame

      // texto introduzido 
      label3 = new JLabel(); // JLabel constructor no arguments
      // definindo texto 
      label3.setText("Rótulo com ícone e texto abaixo");
      // definindo icone
      label3.setIcon(bug); 
      //definindo a posição horizontal do texto
      label3.setHorizontalTextPosition(SwingConstants.CENTER);
      // definindo a posição vertical do texto
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);
      label3.setToolTipText("Esse é o label3") ;
      add(label3); 
   } 
} 