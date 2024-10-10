import java.awt.*;//importando classes
import java.awt.event.*;
import javax.swing.*;


public class MultipleSelectionFrame extends JFrame 
{
   private final JList<String> colorJList; 
   private final JList<String> fruitJList; 
   private final JList<String> copyJList; 
   private final JList<String> copyJList2; 
   private JButton copyJButton1; 
   private JButton copyJButton2; 
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow"};
      private static final String[] fruitNames = {"banana","aplle","orange","pear","watermelon","lemon","mango"};

   public MultipleSelectionFrame()
   {
      super("Multiple Selection Lists");
      setLayout(new FlowLayout());

      colorJList = new JList<String>(colorNames);
      colorJList.setVisibleRowCount(5); 
      colorJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(colorJList)); 

      copyJButton1 = new JButton("Copy >>>"); // atribuindo ao copyJButton
      copyJButton1.addActionListener(
         new ActionListener() 
         {  
           
            @Override
            public void actionPerformed(ActionEvent event)//actionPerformed:ação acontecida //overrride:sobrescrever
            {
              
               copyJList.setListData(
                  colorJList.getSelectedValuesList().toArray(//getSelectedValuesList: seleciona os valores da primeira lista //toArray: transforma os valores em matriz// new String[0]: começa pelo 0 
                     new String[0]));
            }
         } 
      ); 

      add(copyJButton1); //adiciona o botão de cópia

      copyJList = new JList<String>(); 
      copyJList.setVisibleRowCount(5); 
      copyJList.setFixedCellWidth(100); 
      copyJList.setFixedCellHeight(15); 
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList));//adiciona o copyJlist em um novo objeto 

      fruitJList = new JList<String>(fruitNames);
      fruitJList.setVisibleRowCount(5); 
      fruitJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(fruitJList)); 



      copyJButton2 = new JButton("Copy Fruits >>>");
        copyJButton2.addActionListener(event -> 
            copyJList.setListData(fruitJList.getSelectedValuesList().toArray(new String[0]))
        ); 
        add(copyJButton2); 

      
        copyJList2 = new JList<String>(); 
        copyJList2.setVisibleRowCount(5); 
        copyJList2.setFixedCellWidth(100); 
        copyJList2.setFixedCellHeight(15); 
        copyJList2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList2));
    }

    public static void main(String[] args) {
        MultipleSelectionFrame frame = new MultipleSelectionFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
   






   
