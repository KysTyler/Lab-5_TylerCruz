/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_tylercruz;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Tyler C
 */
public class Pais {
    // Tendrán Nombre, Fecha de Fundación, Nombre del Himno Nacional, Color de la Bandera
    private String name;
    private Date fundacion;
    private String nombreHimno;
    private Color colorBandera;

    public Pais() {
    }

    public Pais(String name, Date fundacion, String nombreHimno, Color colorBandera) {
        this.name = name;
        this.fundacion = fundacion;
        this.nombreHimno = nombreHimno;
        this.colorBandera = colorBandera;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFundacion() {
        return fundacion;
    }

    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }

    public String getNombreHimno() {
        return nombreHimno;
    }

    public void setNombreHimno(String nombreHimno) {
        this.nombreHimno = nombreHimno;
    }

    public Color getColorBandera() {
        return colorBandera;
    }

    public void setColorBandera(Color colorBandera) {
        this.colorBandera = colorBandera;
    }

    @Override
    public String toString() {
        return name ;
    }
    

    
}
