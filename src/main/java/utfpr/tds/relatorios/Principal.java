/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.tds.relatorios;

import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Giuvane
 */
public class Principal {
    public static void main(String[] args) throws JRException {
        Relatorio rel = new Relatorio();
        rel.abrirRelatorio();
    }
}
