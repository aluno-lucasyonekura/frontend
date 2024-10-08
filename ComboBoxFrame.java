import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxFrame extends JFrame //extends: herança 
{
   private final JComboBox<String> imagesJComboBox; //private final: somente leitura
   private final JLabel label; 

   private static final String[] names = 
      {"bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif"};
   private final Icon[] icons = { 
      new ImageIcon(getClass().getResource(names[0])),
      new ImageIcon(getClass().getResource(names[1])), 
      new ImageIcon(getClass().getResource(names[2])),
      new ImageIcon(getClass().getResource(names[3]))};

   // ComboBoxFrame constructor adds JComboBox to JFrame
   public ComboBoxFrame()
   {
      super("Testing JComboBox");
      setLayout(new FlowLayout()); // set frame layout     

      imagesJComboBox = new JComboBox<String>(names); // set up JComboBox
      imagesJComboBox.setMaximumRowCount(3); // display three rows

      imagesJComboBox.addItemListener(
         new ItemListener() // anonymous inner class
         {
            // handle JComboBox event
            @Override
            public void itemStateChanged(ItemEvent event)
            {
               // determine whether item selected
               if (event.getStateChange() == ItemEvent.SELECTED)
                  label.setIcon(icons[
                     imagesJComboBox.getSelectedIndex()]);
            } 
         } // end anonymous inner class
      ); // end call to addItemListener

      add(imagesJComboBox); // add combobox to JFrame
      label = new JLabel(icons[0]); // display first icon
      add(label); // add label to JFrame
   }
} // end class ComboBoxFrame


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
