/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioWeb;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.io.*;
import java.sql.*;
import javax.jws.WebMethod;
import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
@WebService(serviceName = "proceso_wc")
public class proceso_wc {

    private int id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String sexo;
    
    @WebMethod
    public boolean insertarUsuario(String ce,String no,String ap, String dir, String se){ 
        String conexionBD = "jdbc:mysql://127.0.0.1/datos_almacenados_ws";
        Connection conexion = null;
        boolean funciono = false;
        String con;
 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(conexionBD, "root","4589");
 
            Statement s = conexion.createStatement();
            con = "INSERT INTO USUARIOS VALUES (NULL,'"+ce+"','"+no+"','" + ap +"','"+ dir +"','"+se+"')";
            s.executeUpdate(con);
            funciono = true;
        }catch(Exception e){
            System.out.println("No se ha completado la peticion");
        }
        return funciono;
    }
    
    @WebMethod
    public boolean buscarUsuarioCedula(String ced){
        String conexionBD = "jdbc:mysql://127.0.0.1/datos_almacenados_ws";
        Connection conexion = null;
        boolean funciono = false;
        String con;
        ResultSet rs;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(conexionBD, "root","12345");
            Statement s = conexion.createStatement();
            con = "SELECT * FROM usuarios where cedula = '" + ced + "'" ;
            rs = s.executeQuery (con); {
 
            while (rs.next()) {
                cedula = rs.getString("cedula");
                nombre = rs.getString("nombre");
                apellido = rs.getString("apellido");
                direccion = rs.getString("direccion");
                sexo = rs.getString("sexo");
                funciono = true;

                mostrarCedula();
                mostrarNombre();
                mostrarApellido();
                mostrarDireccion();
                mostrarSexo();

                break;
            }
            }
        }catch(Exception e){
            System.out.println("No se ha completado la peticion");
        }
            return funciono;
    }
    
    @WebMethod
    public String mostrarNombre(){
        String nomb;
        nomb = "";
        nomb = nombre;
        return nomb;
    }
 
    @WebMethod
    public String mostrarApellido(){
        String apell;
        apell = "";
        apell = apellido;
        return apell;
    }
 
    @WebMethod
    public String mostrarCedula(){
        String codi;
        codi = "";
        codi = cedula;
        return codi;
    }
 
    @WebMethod
    public String mostrarDireccion(){
        String dire;
        dire = "";
        dire = direccion;
        return dire;
    }
 
    @WebMethod
    public String mostrarSexo(){
        String se;
        se = "";
        se = sexo;
        return se;
    }
    
    @WebMethod
    public boolean actualizarUsuario(String ced, String no,String ap, String dir, String se){
        String conexionBD="jdbc:mysql://127.0.0.1/datos_almacenados_ws";
        Connection conexion = null;
        boolean funciono = false;
        String con;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(conexionBD, "root","12345");
            Statement s = conexion.createStatement();
            con= "update usuarios set nombre='"+no+"',apellido='"+ap+"',direccion='"+dir+"',sexo='"+se+"' where cedula='"+ced+"'";
            s.executeUpdate(con);
            funciono = true;
        }catch(Exception e){
            System.out.println("No se ha completado la peticiÃ³n...");
        }
            return funciono;
    }
    
    @WebMethod
    public boolean eliminarUsuario(String ced){
        String conexionBD = "jdbc:mysql://127.0.0.1/datos_almacenados_ws";
        Connection conexion = null;
        boolean funciono = false;
        String con;
    
        try{
            Class.forName("com.mysql.jdbc.Driver");//el driver de mysql
            conexion=DriverManager.getConnection(conexionBD, "root","12345");//conexion a la base de datos
            Statement s = conexion.createStatement();
            con = "delete from usuarios where cedula='"+ced+"'";
            s.executeUpdate(con);
            funciono = true;
        }catch(Exception e){
            System.out.println("No se ha completado la peticiÃ³n...");
        }
        return funciono; 
    }
    
    
}
