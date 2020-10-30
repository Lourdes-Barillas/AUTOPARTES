<%-- 
    Document   : AgregarProducto
    Created on : 29/10/2020, 11:38:38 AM
    Author     : Adriana P
--%>

<%@page import="Globalpackage.GlobalVariables"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="CRUD.Create"%>
<%@page import="MasterClases.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles/Style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        
        
        
        <title>Autopartes</title>
    </head>
    <body>
        <main>
            <div class="centrado listado orden pad" align="center">
                <form action="AgregarProducto.jsp" class="orden form-alineado">
                <h1>Agregar Producto</h1>
                <div class="form-group row">
                  <label align="left" for="formGroupExampleInput">Nombre del producto</label>
                  <input align="right" name="txtnombre" type="text" class="form-control" >
                </div>
                <div class="form-group row">
                  <label align="left" for="formGroupExampleInput2">Costo</label>
                  <input align="right"  placeholder="Puedes escribir en decimal" name="txtcosto" type="text" class="form-control">
                </div>
                <div class="form-group row">
                  <label align="left" for="formGroupExampleInput2">Existencia</label>
                  <input align="right" placeholder="No escribas en decimal" name="txtexistencia" type="text" class="form-control">
                </div>
                <%
                    try {
                            Double precio = Double.parseDouble(request.getParameter("txtcosto"));
                            String nombre = request.getParameter("txtnombre");
                            String costo = request.getParameter("txtcosto");
                            String existencia = request.getParameter("txtexistencia");
                            GlobalVariables globalvariables = new GlobalVariables();
                            String values = " VALUES(?,?,?);";
                            String consulta = "INSERT INTO public.\"Productos\" (\"Prod_Nombre\", \"Prod_Costo\", \"Prod_Existencia\") " + values;
                            //la consulta será INSERT INTO PRODUCTOS VALUES('PROD_NOMBRE', 'PROD_PRECIO');
                                try {
                                    //1. Crear la conexión
                                    Connection miConexion = null;
                                    PreparedStatement miStatement = null;
                                    Class.forName("org.postgresql.Driver");
                                    miConexion = DriverManager.getConnection(globalvariables.db, globalvariables.user, globalvariables.password);

                                    miStatement =  miConexion.prepareStatement(consulta);
                                    miStatement.setString(1, nombre);
                                    miStatement.setDouble(2, Double.parseDouble(costo));
                                    miStatement.setInt(3, Integer.parseInt(existencia));
                                    //Si fue insertado, busquemos el uno
                                    miStatement.executeUpdate();
                                    miStatement.close();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }//fin catch 2
                            } catch (Exception e) {
                            }//fin catch 1
                %>
                <div class="col-sm-10" align="center">
                    <button align="center" type="submit" class="btn btn-primary">Agregar</button>
                </div>
                
            </form>
            </div>    
        </main>
    </body>
</html>
