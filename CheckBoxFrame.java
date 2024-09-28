
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.font.*;
import java.util.*;

public class CheckBoxFrame extends JFrame 
{
   private final JTextField textField; 
   private final JCheckBox boldJCheckBox; 
   private final JCheckBox italicJCheckBox; 
   private final JCheckBox underlineJCheckBox;

   
   public CheckBoxFrame()
   {
      super("JCheckBox Test");//titulo
      setLayout(new FlowLayout());

     
      textField = new JTextField("Watch the font style change", 20);
      textField.setFont (new Font ("Serif", Font.PLAIN, 14));
      add(textField); // add textField to JFrame

      boldJCheckBox = new JCheckBox("Bold"); 
      italicJCheckBox = new JCheckBox("Italic"); 
      underlineJCheckBox = new JCheckBox("underline");
      add(boldJCheckBox); // add bold checkbox to JFrame
      add(italicJCheckBox); // add italic checkbox to JFrame
      add(underlineJCheckBox);

      // register listeners for JCheckBoxes
      CheckBoxHandler handler = new CheckBoxHandler();
      boldJCheckBox.addItemListener(handler);
      italicJCheckBox.addItemListener(handler);
      underlineJCheckBox.addItemListener(handler);
   } 

   // private inner class for ItemListener event handling
   private class CheckBoxHandler implements ItemListener 
   {
      // respond to checkbox events
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         Font font = null; // stores the new Font

         // determine which CheckBoxes are checked and create Font
         if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
         else if (boldJCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD, 14);
         else if (italicJCheckBox.isSelected())
            font = new Font("Serif", Font.ITALIC, 14);
         else
            font = new Font("Serif", Font.PLAIN, 14);

         textField.setFont(font); 

         if(underlineJCheckBox.isSelected()) {
            font = textField.getFont();
            Map attributes = font.getAttributes();
            attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
            textField.setFont(font.deriveFont(attributes));
            font = new Font (attributes); 
         }
      }       
   }
}