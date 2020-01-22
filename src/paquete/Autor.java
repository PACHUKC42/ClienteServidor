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
public class Autor {
    
    private int idAutor;
    private String nombreAutor;
    private String apeAutor;
    private String paisAutor;
    
    public Autor(){
    }
    
    
    public Autor (int idAutor, String nombreAutor, String apeAutor, String paisAutor){
        this.idAutor=idAutor;
        this.nombreAutor=nombreAutor;
        this.apeAutor=apeAutor;
        this.paisAutor=paisAutor;
    }
    public Autor (int idAutor, String nombreAutor){
        this.idAutor=idAutor;
        this.nombreAutor=nombreAutor;
    }
    public Autor (String apeAutor, int idAutor){
        this.idAutor=idAutor;
        this.apeAutor=apeAutor;
    }
    public Autor (int idAutor){
        this.idAutor=idAutor;
    }
      
    public void  setIdAutor (int idAutor){
        this.idAutor=idAutor;
    }
    public void setNombreAutor (String nombreAutor){
        this.nombreAutor=nombreAutor;
    }
    public void setApeAutor (String apeAutor){
        this.apeAutor=apeAutor;
    }
    public void setPaisAutor (String paisAutor){
        this.paisAutor=paisAutor;
    }
    public int getIdAutor(){
        return idAutor;
    }
    public String getNombreAutor (){
        return nombreAutor;
    }
    public String getApeAutor (){
        return apeAutor;
    }
    public String getPaisAutor(){
        return paisAutor;
    }
}
