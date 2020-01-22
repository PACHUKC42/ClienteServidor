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
public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private String apeCliente;
    private String apeMCliente;
    private String calleCliente;
    private String numCliente;
    private String colCliente;
    private String telCliente;


    
    public Cliente(){
    }
    
    
    public Cliente (String nombreCliente, String apeCliente, String apeMCliente, String calleCliente,String numCliente, String colCliente, String telCliente ){
        this.nombreCliente=nombreCliente;
        this.apeCliente=apeCliente;
        this.apeMCliente= apeMCliente;
        this.calleCliente= calleCliente;
        this.numCliente=numCliente;
        this.colCliente=colCliente;
        this.telCliente=telCliente;
    }
    public Cliente (int idCliente, String nombreCliente, String apeCliente, String apeMCliente, String calleCliente,String numCliente, String colCliente, String telCliente ){
        this.idCliente=idCliente;
        this.nombreCliente=nombreCliente;
        this.apeCliente=apeCliente;
        this.apeMCliente= apeMCliente;
        this.calleCliente= calleCliente;
        this.numCliente=numCliente;
        this.colCliente=colCliente;
        this.telCliente=telCliente;
    }
    public Cliente (int idCliente, String nombreCliente){
        this.idCliente=idCliente;
        this.nombreCliente=nombreCliente;
    }
    public Cliente (String apeCliente, int idCliente){
        this.idCliente=idCliente;
        this.apeCliente=apeCliente;
    }
    public Cliente (int idCliente){
        this.idCliente=idCliente;
    }
      
    public void  settelCliente (String telCliente){
        this.telCliente=telCliente;
    }
    
    public void  setcolCliente (String colCliente){
        this.colCliente=colCliente;
    }
    
    public void  setnumCliente (String numCliente){
        this.numCliente=numCliente;
    }
    
    public void  setIdCliente (int idCliente){
        this.idCliente=idCliente;
    }
    
    public void setNombreCliente (String nombreCliente){
        this.nombreCliente=nombreCliente;
    }
    public void setApeCliente (String apeCliente){
        this.apeCliente=apeCliente;
    }
    public void setApeMCliente (String apeMCliente){
        this.apeMCliente=apeMCliente;
    }
    public void setPaisCliente (String calleCliente){
        this.calleCliente=calleCliente;
    }
    public int getIdCliente(){
        return idCliente;
    }
    public String getNombreCliente (){
        return nombreCliente;
    }
    public String getApeCliente (){
        return apeCliente;
    }
    public String getApeMCliente (){
        return apeMCliente;
    }
    public String getCalleCliente(){
        return calleCliente;
    }
    public String getcolCliente(){
        return colCliente;
    }
    public String gettelCliente(){
        return telCliente;
    }
    public String getnumCliente(){
        return numCliente;
    }
}
