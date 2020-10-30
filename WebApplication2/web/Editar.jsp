<%-- 
    Document   : Editar.jsp
    Created on : 29/10/2020, 06:24:01 PM
    Author     : Adriana P
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="Globalpackage.GlobalVariables"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Editar.jsp">
            <%=request.getParameter("Prod_Id") %>
        <%
            GlobalVariables globalvariables = new GlobalVariables();
            Connection miConexion = null;
            PreparedStatement st = null;
            int prod_Id = Integer.parseInt(request.getParameter("Prod_Id"));
            try{
                Class.forName("org.postgresql.Driver");
                miConexion = DriverManager.getConnection(globalvariables.db, globalvariables.user, globalvariables.password);
                //obtengamos el id
                
                String traerDatos = "SELECT * FROM PUBLIC.\"Productos\" WHERE \"Prod_Id\"=" + prod_Id + ";";
                
                ResultSet result;
                st = miConexion.prepareStatement(traerDatos);
                result = st.executeQuery(); 
                while(result.next()){
                   %>
        
                <div class="form-group">
                  <label for="formGroupExampleInput">Nombre del producto</label>
                  <input class="form-control" name="txtname" type="text" readonly="" value="<%=result.getString("Prod_Nombre")%>"/>
                </div>
                <div class="form-group">
                  <label for="formGroupExampleInput2">Costo</label>
                  <input  readonly="" name="txtcost" type="text" class="form-control" value="<%=result.getString("Prod_Costo")%>"/>
                </div>
                <div class="form-group">
                  <label for="formGroupExampleInput2">Existencia</label>
                  <input  readonly="" name="txtext" type="text" class="form-control" value="<%=result.getString("Prod_Existencia")%>"/>
                </div>
                <button type="submit" class="btn btn-primary">Dar de baja</button>
        </form>
        <%  }//fin while
        }//fin try
        catch(Exception e){
        %>
        <h3>Error</h3>
        <%
        }
        %>
    </body>
</html>

<%
    int estado = 0;
    String nombre = request.getParameter("txtname"), costo = request.getParameter("txtcost"), exitencia = request.getParameter("txtext");
    String actualizar = "UPDATE PUBLIC.\"Productos\" SET  \"Prod_Estado\"="+estado + " WHERE \"Prod_Id\"="+prod_Id;
    st = miConexion.prepareStatement(actualizar);
    st.executeUpdate();
    response.sendRedirect("Productos.jsp");
%>
