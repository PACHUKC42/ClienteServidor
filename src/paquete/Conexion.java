/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Efrain
 */
public class Conexion {
    
    private Connection con = null;
    private String datos[] = new String[7];
    private String datos1[] = new String[100];
    private String datos2[] = new String[100];
    private String datos3[] = new String[5];
    private String datos4[] = new String[5];
    private String datos5[] = new String[2];
    static Statement sentencia;
    static ResultSet resultado;
    public Conexion(){
    
        conectar();
        
    }
    
    public void conectar(){
    
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://189.155.42.160/pizzas?user=root&password=");
            System.out.println("Conectado");
        
        
        }catch(ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage());
        
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        
        }
        
    }
    
    public void desconectar (){
    
        try{
        
            if(con!=null){ 
                con.close();
                System.out.println("Desconectado");
            }
        
        }catch(Exception e){
        
            e.printStackTrace();
        
        }
    
    }
   //executeUpdate si no es consulta
   //executeQuery si es un consulta
    
  //  public void crearTablas(){
    
    //    String sentenciaDDL = "CREATE TABLE Tareas("+
      //  "idTarea INTEGER NOT NULL PRIMARY KEY,"+
      //  "nombreTarea VARCHAR(25) NOT NULL,"+
      //  "descTarea VARCHAR(100) NOT NULL,"+
       // "idAutor INTEGER NOT NULL"+
       // ")";
        
       // try{
       //     Statement stm = con.createStatement();
        //    stm.executeUpdate(sentenciaDDL);
          //  System.out.println("Tabla Creada");
        
        
        //}catch(SQLException e){
        
          //  System.err.println(e.getMessage());
            
        //}
    
    //}
    
    //public void Autor(){
    
     //   String sentenciaDDL = "CREATE TABLE Autor("+
       // "idAutor INTEGER NOT NULL PRIMARY KEY,"+
     //   "nombreAutor VARCHAR(25) NOT NULL,"+
     //   "apeAutor VARCHAR(100) NOT NULL,"+
      //  "paisAutor VARCHAR(25) NOT NULL"+
       // ")";
        
       // try{
         //   Statement stm = con.createStatement();
           // stm.executeUpdate(sentenciaDDL);
            //System.out.println("Tabla Creada");
        
        
        //}catch(SQLException e){
        
          //  System.err.println(e.getMessage());
            
        //}
    
    //}
    
    public void altaPieza(Pieza obj){
    
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("INSERT INTO piezas (matricula_equipo, nombrepieza) VALUES (?,?)");
            
            ps.setInt(1, obj.getIdEquipo());
            ps.setString(2, obj.getNombrePieza());
            ps.executeUpdate();
                        
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }

    
    public void altaEquipo(Equipo obj){
    
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("INSERT INTO equipo (clave_cliente, descripcion, marca, modelo, piezas) VALUES (?,?,?,?,?)");
            
            ps.setInt(1, obj.getIdCliente());
            ps.setString(2, obj.getdescripcionEquipo());
            ps.setString(3, obj.getMarcaEquipo());
            ps.setString(4, obj.getmodeloEquipo());
            ps.setInt(5, obj.getPiezas());
            ps.executeUpdate();
                        
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }
    public void altaCliente(Cliente obj){
    
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("INSERT INTO cliente (nombrecliente, apellidopaterno, apellidomaterno, calle,"
                    + " numero, colonia, telefono) VALUES (?,?,?,?,?,?,?)");
            
            ps.setString(1, obj.getNombreCliente());
            ps.setString(2, obj.getApeCliente());
            ps.setString(3, obj.getApeMCliente());
            ps.setString(4, obj.getCalleCliente());
            ps.setString(5, obj.getnumCliente());
            ps.setString(6, obj.getcolCliente());
            ps.setString(7, obj.gettelCliente());
            ps.executeUpdate();
                        
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }
    public void altaReparacion(Reparacion obj){
    
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("INSERT INTO revision (clave_equipo, diagnostico, acciones, tipo,"
                    + " duracion) VALUES (?,?,?,?,?)");
            
            ps.setInt(1, obj.getClaveeq());
            ps.setString(2, obj.getDiagnostico());
            ps.setString(3, obj.getAcciones());
            ps.setString(4, obj.getTipo());
            ps.setString(5, obj.getDuracion());
            ps.executeUpdate();
                        
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }
    public void modificaEquipo(Equipo obj){
    
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("UPDATE equipo SET clave_cliente=?, descripcion=?, marca=?, modelo=?, piezas=? WHERE clave_equipo = ?");
            
            ps.setInt(1, obj.getIdCliente());
            ps.setString(2, obj.getdescripcionEquipo());
            ps.setString(3, obj.getMarcaEquipo());
            ps.setString(4, obj.getmodeloEquipo());
            ps.setInt(5, obj.getPiezas());
            ps.setInt(6, obj.getIdEquipo());
            
            int filas = ps.executeUpdate();
            System.out.println("Fueron afectados "+ filas+" registros");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }
    public void modificaCliente(Cliente obj){
    
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("UPDATE cliente SET nombrecliente=?, apellidopaterno=?, apellidomaterno=?, calle=?,"
                    + " numero=?, colonia=?, telefono=? WHERE clave_cliente = ?");
            
            ps.setString(1, obj.getNombreCliente());
            ps.setString(2, obj.getApeCliente());
            ps.setString(3, obj.getApeMCliente());
            ps.setString(4, obj.getCalleCliente());
            ps.setString(5, obj.getnumCliente());
            ps.setString(6, obj.getcolCliente());
            ps.setString(7, obj.gettelCliente());
            ps.setInt(8, obj.getIdCliente());

            int filas = ps.executeUpdate();
            System.out.println("Fueron afectados "+ filas+" registros");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }
    public void modificaPieza(Pieza obj){
    
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("UPDATE piezas SET matricula_equipo = ?, nombrepieza = ? WHERE clave_piezas = ?");
            
            ps.setInt(1, obj.getIdEquipo());
            ps.setString(2, obj.getNombrePieza());
            ps.setInt(3, obj.getIdPieza());

            int filas = ps.executeUpdate();
            System.out.println("Fueron afectados "+ filas+" registros");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }

    public void modificaReparacion(Reparacion obj){
    
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("UPDATE revision SET clave_equipo=?, diagnostico=?, acciones=?, tipo=?,"
                    + " duracion=? WHERE clave_revision = ?");
            
            ps.setInt(1, obj.getClaveeq());
            ps.setString(2, obj.getDiagnostico());
            ps.setString(3, obj.getAcciones());
            ps.setString(4, obj.getTipo());
            ps.setString(5, obj.getDuracion());
            ps.setInt(6, obj.getClaverep());

            int filas = ps.executeUpdate();
            System.out.println("Fueron afectados "+ filas+" registros");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }
    public void modificaTelCliente(Cliente obj){
    
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("UPDATE cliente SET telefono = ? WHERE idCliente = ?");
            
            ps.setString(1, obj.gettelCliente());
            ps.setInt(2, obj.getIdCliente());

            int filas = ps.executeUpdate();
            System.out.println("Fueron afectados "+ filas+" registros");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }
    public void eliminaCliente(Cliente obj){
    
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("DELETE FROM cliente WHERE clave_cliente = ?");
            
            ps.setInt(1, obj.getIdCliente());

            int filas = ps.executeUpdate();
            System.out.println("Fueron afectados "+ filas+" registros");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }
    public void eliminaReparacion(Reparacion obj){
    
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("DELETE FROM revision WHERE clave_revision = ?");
            
            ps.setInt(1, obj.getClaverep());

            int filas = ps.executeUpdate();
            System.out.println("Fueron afectados "+ filas+" registros");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }
    public void eliminaEquipo(Equipo obj){
    
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("DELETE FROM equipo WHERE clave_equipo = ?");
            
            ps.setInt(1, obj.getIdEquipo());

            int filas = ps.executeUpdate();
            System.out.println("Fueron afectados "+ filas+" registros");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }
    public String[] llenarCliente(String valores[]){
        String res;
        ResultSet rs;
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("SELECT clave_cliente FROM cliente;");
            
            rs = ps.executeQuery();
            int i=0;
            while(rs.next()){
                this.datos1[i] = rs.getString(valores[0]);
                i=i+1;
            }
            this.datos1[i]="y";
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return this.datos1;
    }
    public String[] llenarEquipo(String valores[]){
        String res;
        ResultSet rs;
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("SELECT clave_equipo FROM equipo;");
            
            rs = ps.executeQuery();
            int i=0;
            while(rs.next()){
                this.datos2[i] = rs.getString(valores[0]);
                i=i+1;
            }
            this.datos2[i]="y";
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return this.datos2;
    }
    public String[] llenarReparacion(String valores[]){
        String res;
        ResultSet rs;
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("SELECT clave_revision FROM revision;");
            
            rs = ps.executeQuery();
            int i=0;
            while(rs.next()){
                this.datos2[i] = rs.getString(valores[0]);
                i=i+1;
            }
            this.datos2[i]="y";
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return this.datos2;
    }
    public String[] llenarPieza(String valores[]){
        String res;
        ResultSet rs;
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("SELECT clave_piezas FROM piezas;");
            
            rs = ps.executeQuery();
            int i=0;
            while(rs.next()){
                this.datos2[i] = rs.getString(valores[0]);
                i=i+1;
            }
            this.datos2[i]="y";
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return this.datos2;
    }
    public void equipoCliente(Equipo obj){
    
        ResultSet rs;
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("SELECT equipo.descripcion, equipo.modelo, cliente.clave_cliente FROM equipo,cliente WHERE equipo.clave_cliente= ? ");
            
            ps.setInt(2, obj.getIdEquipo());
            rs = ps.executeQuery();
            while(rs.next()){
                
                System.out.println(rs.getString(1)+"|---|"+rs.getString(2)+"|---|"+rs.getString(3));
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }
    
    public String[] buscaCliente(Cliente obj, String valores[]){
        
        ResultSet rs;
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("SELECT nombrecliente, apellidopaterno, apellidomaterno, calle, numero,"
                    + " colonia, telefono FROM cliente WHERE clave_cliente= ? ");
            
            ps.setInt(1, obj.getIdCliente());
            rs = ps.executeQuery();
            while(rs.next()){
                
                for(int i = 0; i<datos.length; i++){
                    this.datos[i] = rs.getString(valores[i]);
                } 
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return this.datos;
    }
        public String[] buscaReparacion(Reparacion obj, String valores[]){
        
        ResultSet rs;
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("SELECT clave_equipo, diagnostico, acciones, tipo, duracion FROM revision WHERE clave_revision= ? ;");
            
            ps.setInt(1, obj.getClaverep());
            rs = ps.executeQuery();
            while(rs.next()){
                
                for(int i = 0; i<datos3.length; i++){
                    this.datos3[i] = rs.getString(valores[i]);
                } 
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return this.datos3;
    }
    public String[] buscaEquipo(Equipo obj, String valores[]){
        
        ResultSet rs;
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("SELECT clave_cliente, descripcion, marca, modelo, piezas FROM equipo WHERE clave_equipo= ? ;");
            
            ps.setInt(1, obj.getIdEquipo());
            rs = ps.executeQuery();
            while(rs.next()){
                
                for(int i = 0; i<datos4.length; i++){
                    this.datos4[i] = rs.getString(valores[i]);
                } 
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return this.datos4;
    }
    public String[] buscaPiezas(Pieza obj, String valores[]){
        
        ResultSet rs;
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("SELECT nombrepieza, matricula_equipo FROM piezas WHERE clave_piezas= ? ;");
            
            ps.setInt(1, obj.getIdPieza());
            rs = ps.executeQuery();
            while(rs.next()){
                
                for(int i = 0; i<datos5.length; i++){
                    this.datos5[i] = rs.getString(valores[i]);
                } 
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return this.datos5;
    }
    public void moverTabla(Reparacion obj){
        
        try{
            PreparedStatement ps = con.prepareStatement    
            ("INSERT INTO terminada SELECT * FROM revision WHERE clave_revision = ?");
            ps.setInt(1, obj.getClaverep());
            ps.executeUpdate();
            PreparedStatement ps1 = con.prepareStatement    
            ("DELETE FROM revision WHERE clave_revision = ?");
            ps1.setInt(1, obj.getClaverep());
            ps1.executeUpdate();
        }catch(SQLException e){}
            
    }
    public void moverTabla2(Reparacion obj){
        
        try{
            PreparedStatement ps = con.prepareStatement    
            ("INSERT INTO revision SELECT * FROM terminada WHERE clave_revision = ?");
            ps.setInt(1, obj.getClaverep());
            ps.executeUpdate();
            PreparedStatement ps1 = con.prepareStatement    
            ("DELETE FROM terminada WHERE clave_revision = ?");
            ps1.setInt(1, obj.getClaverep());
            ps1.executeUpdate();
        }catch(SQLException e){}
            
    }

    public static Connection conectarTabla(){
        Connection cn= null;
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            
            cn = DriverManager.getConnection("jdbc:mysql://localhost/tallerc?user=root&password=");        
        
        }catch(ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage());
        
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        
        }
        return cn;
    }
    
    public static ResultSet getTabla(String consulta){
        Connection cn = conectarTabla();
        Statement st;
        ResultSet datos=null;
        
        try{
            st=cn.createStatement();
            datos=st.executeQuery(consulta);
        }catch(Exception e){}
        
        return datos;
    }
    public static ResultSet getTabla2(String consulta){
        Connection cn = conectarTabla();
        Statement st;
        ResultSet datos=null;
        
        try{
            st=cn.createStatement();
            datos=st.executeQuery(consulta);
        }catch(Exception e){}
        
        return datos;
    }
    
    
    
    public void piezasequipo (Pieza obj){
        
        ResultSet rs;
        try{
        
            PreparedStatement ps = con.prepareStatement    
            ("SELECT piezas.nombrepieza FROM piezas,equipo WHERE piezas.matricula_equipo=? ");
            
            ps.setInt(1, obj.getIdPieza());
            rs = ps.executeQuery();
            while(rs.next()){
                
                System.out.println("|"+rs.getString(1)+"|---|");
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        
    }
    
    public DefaultTableModel RemoveRenglon(int renglon, DefaultTableModel tabla1, DefaultTableModel tabla2) {
        String[] remueve = new String[tabla1.getColumnCount()];
        for (int i = 0; i <= tabla1.getColumnCount() - 1; i++) {
            remueve[i] = tabla1.getValueAt(renglon, i).toString();
        }

        tabla2.addRow(remueve);
        return tabla2;
    }
    
    
    
    
    public void altaBatch(Pieza obj){
    
        try{
            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement("INSERT INTO tareas VALUES(?, ?, ?, ?);");    
            //stm.addBatch("DELETE FROM tareas WHERE idTarea=10");
            ps.setInt(1, obj.getIdPieza());
            ps.setString(2, obj.getDescPieza());
            ps.setString(3, obj.getNombrePieza());
            ps.setInt(4, obj.getIdEquipo());
            ps.addBatch();
            PreparedStatement ps1 = con.prepareStatement("DELETE FROM tareas WHERE idTarea=6");
            ps1.addBatch();
            //stm.addBatch("UPDATE tareas SET nombreTarea='LOL' WHERE idTarea=9");

            
            
            
            int [] contadoractualizaciones = ps.executeBatch();
            
            
            for (int x = 0; x< contadoractualizaciones.length; x++){
                System.out.println(contadoractualizaciones[x]);
        
            }
            int [] contadoractualizaciones2 = ps1.executeBatch();
            
            
            for (int x = 0; x< contadoractualizaciones2.length; x++){
                System.out.println(contadoractualizaciones2[x]);
        
            }
            
            con.setAutoCommit(true);
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }
    public void altaBatchC(){
    
        try{
            con.setAutoCommit(false);
            Statement stm = con.createStatement();
            
           stm.addBatch("DELETE FROM tareas WHERE idTarea=10");
           stm.addBatch("INSERT INTO tareas VALUES(40, 'GHJ','GHJ' , 9)");
           stm.addBatch("UPDATE tareas SET nombreTarea='LOL' WHERE idTarea=9");

            
            
            
            int [] contadoractualizaciones = stm.executeBatch();
            
            for (int x = 0; x< contadoractualizaciones.length; x++){
                System.out.println(contadoractualizaciones[x]);
        
            }
            
            con.setAutoCommit(true);
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }    
    }
 public void altaBatchO(Pieza obj, Autor ob){
    
        try{
            con.setAutoCommit(false);
            String sql="INSERT INTO tareas VALUES(?, ?, ?, ?);";
           
            
            PreparedStatement ps = con.prepareStatement(sql);   
            
            
            ps.setInt(1, obj.getIdPieza());
            ps.setString(2, obj.getDescPieza());
            ps.setString(3, obj.getNombrePieza());
            ps.setInt(4, obj.getIdEquipo());
            sql=ps.toString();
            ps.addBatch();
            
            String sql1="DELETE FROM autor WHERE idAutor=?;";
            ps = con.prepareStatement(sql1);
            ps.setInt(1, ob.getIdAutor());
            sql1=ps.toString();
            ps.addBatch();
            //stm.addBatch("UPDATE tareas SET nombreTarea='LOL' WHERE idTarea=9");
            
            ps.executeBatch();
            ps.executeBatch();
            
            con.setAutoCommit(true);
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    
    }
}




