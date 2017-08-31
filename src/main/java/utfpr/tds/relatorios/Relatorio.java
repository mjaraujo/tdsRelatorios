/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.tds.relatorios;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import utfpr.tds.relatorios.jdbc.ConnectionFactory;
import utfpr.tds.relatorios.utils.RelatorioUtils;

/**
 *
 * @author Giuvane
 */
public class Relatorio {
    public void abrirRelatorio() throws JRException {
        InputStream inputStream = getClass().getResourceAsStream("/relatorios/RelatorioClientes.jasper");
        Map parametros = new HashMap();
        
      
        try {
            RelatorioUtils.openReport("Clientes", inputStream, parametros, ConnectionFactory.getLocadoraFilmes());
        } catch (SQLException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
