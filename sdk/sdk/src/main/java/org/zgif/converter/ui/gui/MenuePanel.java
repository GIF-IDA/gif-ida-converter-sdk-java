/*******************************************************************************
 * Copyright (c) 2015 Martin Fluegge (Berlin, Germany) and others..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Martin Fluegge - initial API and implementation and/or initial documentation
 *  
 *******************************************************************************/
/**
 * 
 */
package org.zgif.converter.ui.gui;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
