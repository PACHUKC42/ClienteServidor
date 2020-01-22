/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Efrain
 */
public class Pieza {
    private int idPieza;
    private String nombrePieza;
    private String descPieza;
    private int idEquipo;
    
    public Pieza(){
    }
    
    public Pieza (int idPieza, String nombrePieza, String descPieza, int idEquipo){
        this.idPieza=idPieza;
        this.nombrePieza=nombrePieza;
        this.descPieza=descPieza;
        this.idEquipo=idEquipo;
    }
    public Pieza (String nombrePieza, int idEquipo){
        this.nombrePieza=nombrePieza;
        this.idEquipo=idEquipo;
    }
    public Pieza (int idPieza, String nombrePieza, int idEquipo){
        this.idPieza=idPieza;
        this.nombrePieza=nombrePieza;
        this.idEquipo=idEquipo;
    }
    public Pieza (int idPieza){
        this.idPieza=idPieza;
    }
    public void  setIdPieza (int idPieza){
        this.idPieza=idPieza;
    }
    public void setNombrePieza (String nombrePieza){
        this.nombrePieza=nombrePieza;
    }
    public void setDescPieza (String descPieza){
        this.descPieza=descPieza;
    }
    public void setidEquipo (int idEquipo){
        this.idEquipo=idEquipo;
    }
    public int getIdPieza(){
        return idPieza;
    }
    public String getNombrePieza (){
        return nombrePieza;
    }
    public String getDescPieza (){
        return descPieza;
    }
    public int getIdEquipo(){
        return idEquipo;
    }
}
