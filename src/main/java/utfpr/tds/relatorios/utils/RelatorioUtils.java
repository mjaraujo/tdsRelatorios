/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.tds.relatorios.utils;

import java.awt.BorderLayout;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Map;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Giuvane
 */
public class RelatorioUtils {

    public static void openReport(
            String titulo, 
            InputStream inputStream,
            Map parametros,
            Connection conexao) throws JRException {
        
        JasperPrint print = JasperFillManager.fillReport(inputStream, parametros, conexao);
        
        viewReportFrame (titulo, print);
    }
    
    private static void viewReportFrame (String titulo, JasperPrint print) {
        JRViewer viewer = new JRViewer(print);
        JFrame frameRelatorio = new JFrame(titulo);
        frameRelatorio.add(viewer, BorderLayout.CENTER);
        frameRelatorio.setSize(500, 500);
        frameRelatorio.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frameRelatorio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameRelatorio.setVisible(true);
    }
    
    
    
}
