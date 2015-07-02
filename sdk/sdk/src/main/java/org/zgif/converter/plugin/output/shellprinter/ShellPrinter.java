package org.zgif.converter.plugin.output.shellprinter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.zgif.converter.plugin.PluginComponent;
import org.zgif.converter.plugin.output.ExportPlugin;
import org.zgif.converter.plugin.output.ExportPluginConfiguration;
import org.zgif.model.datatype.enumeration.Subset;
import org.zgif.model.node.AbstractNode;
import org.zgif.model.node.AbstractZGif;
import org.zgif.model.node.Meta;
import org.zgif.model.node.Period;
import org.zgif.model.node.entity.AbstractEntityNode;

/**
 * simple export plugin that prints the hierarchy of a zgif object to console
 * 
 * @author phoudek
 * 
 */
public class ShellPrinter implements ExportPlugin {
    private static Logger        logger            = Logger.getLogger(ShellPrinter.class);
    public static final Subset[] SUPPORTED_SUBSETS = { Subset.S5_1 };

    protected AbstractZGif       zgif              = null;

    private String               prefix            = "";

    /**
     * returns the list of supported subsets of this import plugin
     * 
     * @author phoudek
     * @return list of supported subsets
     */
    @Override
    public List<Subset> getSupportedSubsets() {
        return Arrays.asList(SUPPORTED_SUBSETS);
    }

    /**
     * @author phoudek
     * @see ExportPlugin#doExport()
     */
    @Override
    public void doExport() {
        exportMeta(zgif.getMeta());

        System.out.println(prefix + "Data:");
        Method getPeriods = null;
        try {
            getPeriods = zgif.getClass().getMethod("getPeriods");
        } catch (SecurityException e) {
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (getPeriods != null) {
            try {
                @SuppressWarnings("unchecked")
                Map<String, Period<?>> periods = (Map<String, Period<?>>) getPeriods.invoke(zgif);
                exportPeriods(periods.values());
            } catch ( InvocationTargetException e) {
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    private void exportPeriods(Collection<Period<?>> periods) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (periods != null && periods.size() > 0) {
            prefix += "  ";
            // System.out.println(prefix + periods.size() + "x Periods:");
            for (Period<?> period : periods) {
                System.out.println(prefix + "- Period " + period.toString() + " (" + period.getIdentifier() + "; " + period.getFrom() + "->" + period.getTo()
                    + ")");
                exportNode(period.getData());
            }
            prefix = prefix.substring(2);
        }
    }

    private void exportNode(AbstractNode node) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.print(prefix + " - " + node.getClass().getSimpleName());
        if (node instanceof AbstractEntityNode) {
            AbstractEntityNode eNode = (AbstractEntityNode) node;
            System.out.print(" (id=" + eNode.getObjectIdSender() + "; label=" + eNode.getLabel() + ")");
        }
        System.out.println();

        Method[] methods = node.getClass().getDeclaredMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            if (methodName.startsWith("getListOf")) {
                @SuppressWarnings("unchecked")
                Map<String, AbstractNode> nodes = (Map<String, AbstractNode>) method.invoke(node);
                if (nodes != null) {
                    exportNodes(nodes.values());
                }
            }
        }
    }

    private void exportNodes(Collection<AbstractNode> nodes) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (nodes != null && !nodes.isEmpty()) {
            prefix += "  ";

            // AbstractNode firstNode = nodes.iterator().next();
            // System.out.println(prefix + nodes.size() + "x " +
            // firstNode.getClass().getSimpleName() + ":");
            for (AbstractNode node : nodes) {
                exportNode(node);
            }

            prefix = prefix.substring(2);
        }
    }

    protected void exportMeta(Meta meta) {
        if (meta != null) {
            System.out.println("Meta:");
            System.out.println(" - format    = " + meta.getFormat());
            System.out.println(" - subset    = " + meta.getProcess());
            System.out.println(" - version   = " + meta.getVersion());
            System.out.println(" - creator   = " + meta.getCreator());
            System.out.println(" - publisher = " + meta.getPublisher());
            System.out.println(" - created   = " + meta.getCreated());
        }
    }

    /* (non-Javadoc)
     * @see org.zgif.converter.plugin.output.ExportPlugin#load(org.zgif.converter.plugin.PluginConfiguration, org.zgif.model.node.AbstractZGif)
     */
    @Override
    public void load(ExportPluginConfiguration config, AbstractZGif zgif) {
        this.zgif = zgif;        
    }

    /* (non-Javadoc)
     * @see org.zgif.converter.plugin.output.ExportPlugin#unload()
     */
    @Override
    public void unload() {        
    }

    /* (non-Javadoc)
     * @see org.zgif.converter.plugin.output.ExportPlugin#getConfigGui()
     */
    @Override
    public PluginComponent<ExportPluginConfiguration> getConfigGui() {
        return null;
    }
}