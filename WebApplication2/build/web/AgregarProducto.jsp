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
            <form action="AgregarProducto.jsp">
                <div class="form-group">
                  <label for="formGroupExampleInput">Nombre del producto</label>
                  <input name="txtnombre" type="text" class="form-control" id="formGroupExampleInput">
                </div>
                <div class="form-group">
                  <label for="formGroupExampleInput2">Costo</label>
                  <input name="txtcosto" type="text" class="form-control" id="formGroupExampleInput2">
                </div>
                <div class="form-group">
                  <label for="formGroupExampleInput2">Existencia</label>
                  <input name="txtexistencia" type="text" class="form-control" id="formGroupExampleInput2" >
                </div>
                <%
                    try {
                            Double precio = Double.parseDouble(request.getParameter("txtcosto"));
                            Producto producto = new Producto(request.getParameter("txtnombre"), precio);
                            producto.setCantidad(Integer.parseInt("txtexistencia"));
                            int cantidad = producto.getCantidad();

                            String values = " VALUES(?,?,?);";
                            String consulta = "INSERT INTO public.\"Productos\" (\"Prod_Nombre\", \"Prod_Costo\", \"Prod_Existencia\") " + values;
                            //la consulta será INSERT INTO PRODUCTOS VALUES('PROD_NOMBRE', 'PROD_PRECIO');
                            try {
                                //1. Crear la conexión
                                GlobalVariables globalvariables = new GlobalVariables();
                                Connection miConexion = DriverManager.getConnection(globalvariables.db, globalvariables.user, globalvariables.password);
                                Class.forName("org.postgresql.Driver");
                                PreparedStatement miStatement = miConexion.prepareStatement(consulta);
                                miStatement.setString(1, producto.getProducto());
                                miStatement.setDouble(2, producto.getPrecio());
                                miStatement.setInt(3, cantidad);
                                //Si fue insertado, busquemos el uno
                                miStatement.executeUpdate();
                                miStatement.close();
                                miConexion.close();
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
        
                            %><%=precio %><%
                    } catch (Exception e) {
                    }
                %>
                <button type="submit" class="btn btn-primary">Agregar</button>
            </form>
                
        </main>
    </body>
</html>
