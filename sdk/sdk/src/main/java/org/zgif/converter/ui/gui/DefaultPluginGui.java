/**
 * 
 */
package org.zgif.converter.ui.gui;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

import org.zgif.converter.plugin.PluginComponent;
import org.zgif.converter.plugin.PluginConfiguration;
import org.zgif.converter.plugin.input.ImportPluginConfiguration;
import org.zgif.converter.plugin.output.ExportPluginConfiguration;

/**
 * @author phoudek
 * 
 */
public class DefaultPluginGui<PluginConfig extends PluginConfiguration> extends PluginComponent<PluginConfig> {
    class FilePanel extends JPanel {
        JLabel     lbl  = new JLabel();
        JTextField tf   = new JTextField();
        JButton    btn  = new JButton("...");

        File       file = null;

        public void openFileDialog() {
            JFileChooser fc = new JFileChooser((file == null) ? USER_DIR : file.getParentFile());
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.setDialogTitle("Wählen Sie eine CSV-Datei");
            fc.setFileFilter(new FileFilter() {

                @Override
                public String getDescription() {
                    return ".CSV";
                }

                @Override
                public boolean accept(File f) {
                    String fileName = file.getName();
                    return file != null && fileName != null && (fileName.toLowerCase().endsWith(".csv") || file.isDirectory());
                }
            });
            int result = fc.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                file = fc.getSelectedFile();
                try {
                    tf.setText(file.getCanonicalPath());
                } catch (IOException e) {
                    file = null;
                }
            }
        }

        public FilePanel(String text) {
            this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

            lbl.setText(text);
            lbl.setPreferredSize(new Dimension(130, 24));

            tf.setEditable(false);
            tf.setPreferredSize(new Dimension(160, 24));

            btn.setPreferredSize(new Dimension(40, 24));

            MouseListener x = new MouseListener() {
                public void mouseReleased(MouseEvent e) {
                }

                public void mousePressed(MouseEvent e) {
                }

                public void mouseExited(MouseEvent e) {
                }

                public void mouseEntered(MouseEvent e) {
                }

                public void mouseClicked(MouseEvent e) {
                    openFileDialog();
                }
            };
            tf.addMouseListener(x);
            btn.addMouseListener(x);

            this.add(lbl);
            this.add(tf);
            this.add(btn);
        }
    }

    static final File USER_DIR = new File(System.getProperty("user.home"));

    /**
     * @author phoudek
     */
    public DefaultPluginGui(PluginConfig emptyConfiguration) {
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        String[] ids = { "meta", "periods", "company", "property", "land", "build", "lease", "unit", "term" };
        int numLines = ids.length;

        Set<String> requiredInputStreams = null;
        if (emptyConfiguration instanceof ImportPluginConfiguration) {
            requiredInputStreams = ((ImportPluginConfiguration) emptyConfiguration).getStreams().keySet();
        }

        if (requiredInputStreams != null) {
            for (String requiredInputStream : requiredInputStreams) {
                FilePanel fp = new FilePanel(requiredInputStream + "-CSV-Datei:");
                this.add(fp);
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.zgif.converter.plugin.PluginComponent#getConfiguration()
     */
    @Override
    public PluginConfig getConfiguration() {
        return null;
    }

}
