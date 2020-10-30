<%-- 
    Document   : CompleteOrder
    Created on : 29/10/2020, 03:26:33 AM
    Author     : deleo
--%>
<%@page import="MasterClases.Producto"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="CRUD.Read"%>
<%@page import="CRUD.Create"%>
<%@page import="MasterClases.Orden"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement" %>
<%@page import="Globalpackage.GlobalVariables"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Datos de entrega</title>
        <link rel="stylesheet" type="text/css" href="styles/pstyles.css">  
       <%-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" crossorigin="anonymous">
        --%>
</head>
    <body>
        <% 
            String tipoenvio = request.getParameter("tipo");
            String diasenvio = request.getParameter("dias");
            String a =data.lecdataUserTipo();
            if(tipoenvio==null&&diasenvio==null){
                Orden o=new Orden();
                
        %>   
                   <div class="pwrapper">
           
        <div class="">
            <div class="orden contenedor listado">
            <form  action=".jsp">
                <h3 class="tituloProd"><%=a%> Ingresa los datos del envío</h3>
                
                <label>tipo de envio</label><br/>
                   <div class="form-group">
                    <select name="tipo" class="form-control" id="exampleFormControlSelect2">
                      <option name="tia"><%=Orden.envioDomicilio%></option>
                      <option name="tipb"><%=Orden.envioBodega%></option>
                    </select>
                  </div>
                    
                    
                    <br/><br/>
                <label>Dias de envío </label><br/>
                <input type="text" class="field" name="dias" id="dias"><br/><br/>
                <button type="submit" class="btnn btnn-green brd" name="addn">Ordenar</button><br/><br/>
                  <%   
                }else{ 
                   // data d=new data();
                   data.toOrder("x");
                //almacena los datos en Db orden
                //Create cr= new Create();
                //String a=data.lecdataUserTipo();
               // System.out.println("el nombre es:" +a);
                //cr.insertOrden(orden);
}

                  %>
                  
            </form>
          </div>
               
        </div>
</div>         
       
    </body>
</html>



