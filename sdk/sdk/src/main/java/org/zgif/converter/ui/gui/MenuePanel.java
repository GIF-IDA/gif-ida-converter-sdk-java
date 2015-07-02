/**
 * 
 */
package org.zgif.converter.ui.gui;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.zgif.converter.ui.gui.SubsetComboBox.SubsetComboBoxModel;

/**
 * @author phoudek
 * 
 */
public class MenuePanel extends JPanel {
    private SubsetComboBox subsetBox;
    
    public MenuePanel() {
        subsetBox = new SubsetComboBox();
        
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.add(new JLabel("Subset:"));
        this.add(subsetBox);
        this.add(new JButton("konvertieren"));
    }

    
    public void addSubsetChangedListener(ActionListener listener) {
        subsetBox.addActionListener(listener);
    }
}
