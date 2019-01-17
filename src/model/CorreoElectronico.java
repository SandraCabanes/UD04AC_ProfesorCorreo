/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sandra
 */
public class CorreoElectronico {
    private int idCorreo;
    private String direccionCorreo;
    private Profesor IdProfesor;

    public CorreoElectronico() {
    }

    public CorreoElectronico(int idCorreo, String direccionCorreo, Profesor IdProfesor) {
        this.idCorreo = idCorreo;
        this.direccionCorreo = direccionCorreo;
        this.IdProfesor = IdProfesor;
    }

    public int getIdCorreo() {
        return idCorreo;
    }

    public void setIdCorreo(int idCorreo) {
        this.idCorreo = idCorreo;
    }

    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    public Profesor getIdProfesor() {
        return IdProfesor;
    }

    public void setIdProfesor(Profesor IdProfesor) {
        this.IdProfesor = IdProfesor;
    }

    @Override
    public String toString() {
        return "CorreoElectronico{" + "idCorreo=" + idCorreo + ", direccionCorreo=" + direccionCorreo + ", IdProfesor=" + IdProfesor + '}';
    }

    
    
    
}
