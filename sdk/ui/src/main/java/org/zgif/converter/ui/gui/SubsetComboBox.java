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

import java.util.Arrays;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.event.ListDataListener;

import org.zgif.model.datatype.enumeration.Subset;

/**
 * @author phoudek
 *
 */
public class SubsetComboBox extends JComboBox<Object> {
    private static final long serialVersionUID = -2060191791068569157L;

    class SubsetComboBoxModel implements ComboBoxModel<Object> {
        Vector<Subset> values = new Vector<Subset>(Arrays.asList(Subset.values()));
        int selected = -1;

        public int getSize() {
            return values.size();
        }

        public String getElementAt(int index) {
            try {
                Subset curSubset = values.elementAt(index);
                if (curSubset == Subset.NONE) {
                    return "bitte wählen";
                } else {
                    return curSubset.toString();
                }
            } catch (Exception e) {

            }
            return null;
        }

        public void setSelectedItem(Object anItem) {
            try {
                selected = values.indexOf(Subset.fromString(anItem.toString()));
            } catch (Exception e) {
                selected = 0;
            }
        }

        public Object getSelectedItem() {
            return getElementAt(selected);
        }

        public void addListDataListener(ListDataListener l) {
        }

        public void removeListDataListener(ListDataListener l) {
        }

        public Subset getSelectedSubset() {
            return values.elementAt(selected);
        }
    }

    private SubsetComboBoxModel model;

    public SubsetComboBox() {
        model = new SubsetComboBoxModel();
        this.setModel(model);
    }

    public Subset getSelectedSubset() {
        return model.getSelectedSubset();
    }
}
