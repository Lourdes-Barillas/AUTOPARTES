<%-- 
    Document   : DardebajaUsuarios
    Created on : 29/10/2020, 10:24:47 PM
    Author     : Adriana P
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Globalpackage.GlobalVariables"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="DardebajaUsuarios.jsp">
            <%=request.getParameter("Cliente_Id") %>
        <%
            GlobalVariables globalvariables = new GlobalVariables();
            Connection miConexion = null;
            PreparedStatement st = null;
            int cliente_Id = Integer.parseInt(request.getParameter("Cliente_Id"));
            try{
                Class.forName("org.postgresql.Driver");
                miConexion = DriverManager.getConnection(globalvariables.db, globalvariables.user, globalvariables.password);
                //obtengamos el id
                
                String traerDatos = "SELECT * FROM PUBLIC.\"Clientes\" WHERE \"Cliente_Id\"=" + cliente_Id + ";";
                
                ResultSet result;
                st = miConexion.prepareStatement(traerDatos);
                result = st.executeQuery(); 
                while(result.next()){
                   %>
        
                <div class="form-group">
                  <label for="formGroupExampleInput">Tipo</label>
                  <input class="form-control" name="txttipo" type="text" readonly="" value="<%=result.getString("Cliente_TipoCliente")%>"/>
                </div>
                <div class="form-group">
                  <label for="formGroupExampleInput2">Id de usuario</label>
                  <input  readonly="" name="txtid" type="text" class="form-control" value="<%=result.getString("Cliente_UsuarioId")%>"/>
                </div>
                <div class="form-group">
                  <label for="formGroupExampleInput2">Estado</label>
                  <input  readonly="" name="txtestado" type="text" class="form-control" value="<%=result.getString("Cliente_Estado")%>"/>
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
    String tipo = request.getParameter("txttipo"), id = request.getParameter("txtid"), estadoencampo = request.getParameter("txtestado");
    String actualizar = "UPDATE PUBLIC.\"Clientes\" SET \"Cliente_Estado\"="+estado + " WHERE \"Cliente_Id\"="+cliente_Id;
    st = miConexion.prepareStatement(actualizar);
    st.executeUpdate();
    response.sendRedirect("Usuarios.jsp");
%>
