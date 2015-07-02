/**
 * 
 */
package org.zgif.converter.ui.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import org.zgif.converter.ui.gui.PluginChooserPanel.PluginChooserType;

/**
 * @author phoudek
 * 
 */
public class GuiMain {
    static final Integer FRAME_WIDTH  = 600;
    static final Integer FRAME_HEIGHT = 400;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }

        JFrame mainFrame = new JFrame("zgif-Converter");

        mainFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.setLayout(new BorderLayout());

        MenuePanel menue = new MenuePanel();
        menue.addSubsetChangedListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println(((SubsetComboBox) e.getSource()).getSelectedSubset());
            }
        });
        mainFrame.add(menue, BorderLayout.NORTH);
        JSplitPane sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new PluginChooserPanel(PluginChooserType.IMPORT),
            new PluginChooserPanel(PluginChooserType.EXPORT)), new JLabel("..."));

        mainFrame.add(sp, BorderLayout.CENTER);

        mainFrame.setVisible(true);

    }

}
