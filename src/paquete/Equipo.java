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
public class Equipo {
    
    private int idEquipo;
    private int idCliente;
    private String descripcionEquipo;
    private String marcaEquipo;
    private String modeloEquipo;
    private int piezas;
    
    
    public Equipo(){
    }
    
    
    public Equipo (int idEquipo,int IdCliente,  String descripcionEquipo, String marcaEquipo, String modeloEquipo, int piezas){
        this.idEquipo=idEquipo;
        this.marcaEquipo=marcaEquipo;
        this.modeloEquipo=modeloEquipo;
        this.descripcionEquipo=descripcionEquipo;
        this.idCliente=IdCliente;
        this.piezas=piezas;
    }
    public Equipo (int IdCliente,  String descripcionEquipo, String marcaEquipo, String modeloEquipo, int piezas){
        this.marcaEquipo=marcaEquipo;
        this.modeloEquipo=modeloEquipo;
        this.descripcionEquipo=descripcionEquipo;
        this.idCliente=IdCliente;
        this.piezas=piezas;
    }
    public Equipo (int idEquipo, String marcaEquipo){
        this.idEquipo=idEquipo;
        this.marcaEquipo=marcaEquipo;
    }
    public Equipo (String modeloEquipo, int idEquipo){
        this.idEquipo=idEquipo;
        this.modeloEquipo=modeloEquipo;
    }
    public Equipo (int idEquipo){
        this.idEquipo=idEquipo;
    }
       
    public void  setIdCliente (int idCliente){
        this.idCliente=idCliente;
    }
    public void setpiezas (int piezas){
        this.piezas=piezas;
    }
   
    public void  setIdEquipo (int idEquipo){
        this.idEquipo=idEquipo;
    }
    public void setMarcaEquipo (String marcaEquipo){
        this.marcaEquipo=marcaEquipo;
    }
    public void setmodeloEquipo (String modeloEquipo){
        this.modeloEquipo=modeloEquipo;
    }
    public void setdescripcionEquipo (String descripcionEquipo){
        this.descripcionEquipo=descripcionEquipo;
    }
    public int getIdEquipo(){
        return idEquipo;
    }
    public String getMarcaEquipo (){
        return marcaEquipo;
    }
    public String getmodeloEquipo (){
        return modeloEquipo;
    }
    public String getdescripcionEquipo(){
        return descripcionEquipo;
    }
    public int getIdCliente(){
        return idCliente;
    }
    public int getPiezas(){
        return piezas;
    }
}
