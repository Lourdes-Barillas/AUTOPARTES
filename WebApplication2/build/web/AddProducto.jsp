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
        
        <title>Añadir Producto</title>
        <link rel="stylesheet" type="text/css" href="styles/pstyles.css">  
       <%-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" crossorigin="anonymous">
        --%>
</head>
    <body>
       
        <%  
            String producto = request.getParameter("producto");
            String costo = request.getParameter("costo");
            String id = request.getParameter("id");
             if(producto==null && costo==null){
        %>
        <div class="pwrapper">
           
        <div class="">
            <div class="orden contenedor listado">
            <form  action="AddProducto.jsp"  method="POST">
                 <h1 class="tituloProd"> Añadir Producto</h1>
                <label>Producto</label><br/>
                <input type="text" class="field" name="producto" id="producto"><br/><br/>
                
                <label>Costo: </label><br/>
                <input type="text" class="field" name="costo" id="costo"><br/><br/>
             
                <button type="submit" class="btnn btnn-green brd" name="addn">Guardar</button><br/><br/>
                    <% 

                        }else{
                int insertado;
                Double precio=Double.parseDouble(costo);
                String insert = "INSERT INTO ";
                String values = " VALUES(?,?);";
                 GlobalVariables globalvariables = new GlobalVariables();
         values = " VALUES(?,"+producto+","+precio+");";
        String consulta = insert + "public.\"Productos\" (\"Prod_Nombre\", \"Prod_Costo\", \"Prod_Existencia\") " + values;
        //la consulta será INSERT INTO PRODUCTOS VALUES('PROD_NOMBRE', 'PROD_PRECIO');
        try {
            //1. Crear la conexión
            Connection miConexion = null;
            miConexion = globalvariables.connection();
            Class.forName("org.postgresql.Driver");
            PreparedStatement miStatement = null;
            miStatement = miConexion.prepareStatement(consulta);
            miStatement.setString(1, producto);
            miStatement.setDouble(2, precio);
            miStatement.setInt(3, 10);
            //Si fue insertado, busquemos el uno
            insertado = miStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
           //
        }
                    }
            %>
            </form>
          </div>
               
        </div>
</div>

    </body>
</html>


