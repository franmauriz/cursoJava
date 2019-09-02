/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilerias;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author ptl28sev000
 */
public class Conversion {
    
    private static final String FORMATO_FECHA="dd-MM-YYYY";
    
    public static String format(Date fecha){
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }
}
