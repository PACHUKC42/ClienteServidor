/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author pachu
 */
public class Reparacion {
    private int claverep;
    private int claveeq;
    private String diagnostico;
    private String acciones;
    private String tipo;
    private String duracion;
    
    public Reparacion(){
    }
    
    public Reparacion (int claverep, int claveeq, String diagnostico, String acciones, String tipo, String duracion){
        this.claverep=claverep;
        this.claveeq=claveeq;
        this.diagnostico=diagnostico;
        this.acciones=acciones;
        this.tipo=tipo;
        this.duracion=duracion;
    }
    public Reparacion (int claveeq, String diagnostico, String acciones, String tipo, String duracion){
        this.claveeq=claveeq;
        this.diagnostico=diagnostico;
        this.acciones=acciones;
        this.tipo=tipo;
        this.duracion=duracion;
    }  
    public Reparacion (int claverep){
        this.claverep=claverep;
    }
    public void  setClaverep (int claverep){
        this.claverep=claverep;
    }
    public void  setClaveeq (int claveeq){
        this.claveeq=claveeq;
    }
    public void setDiagnostico (String diagnostico){
        this.diagnostico=diagnostico;
    }
    public void setAcciones (String acciones){
        this.acciones=acciones;
    }
    public void setTipo (String tipo){
        this.tipo=tipo;
    }
    public void setDuracion (String duracion){
        this.duracion=duracion;
    }
    public int getClaverep (){
        return claverep;
    }
    public int getClaveeq (){
        return claveeq;
    }
    public String getDiagnostico (){
        return diagnostico;
    }
    public String getAcciones (){
        return acciones;
    }
    public String getTipo (){
        return tipo;
    }
    public String getDuracion (){
        return duracion;
    }
    
}
