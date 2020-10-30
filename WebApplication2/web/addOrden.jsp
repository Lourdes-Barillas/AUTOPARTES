
<%@page import="MasterClases.Usuario"%>
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
        
        <title>Añadir Orden</title>
        <link rel="stylesheet" type="text/css" href="styles/pstyles.css">  
       <%-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" crossorigin="anonymous">
        --%>
</head>
    <body>
       
        <%  
            String tipoenvio = request.getParameter("tipo");
            String diasenvio = request.getParameter("dias");
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            String link;
            boolean exist=false;
            boolean showform=true;
            if((user==null && pass==null && tipoenvio==null && diasenvio==null)||showform){
        %>
             
        
        <div class="pwrapper">
           
        <div class="">
            <div class="orden contenedor listado">
            <form  action="addOrden.jsp" >
                 <h1 class="tituloProd">Iniciar Sesion</h1>
                <label>nombre</label><br/>
                <input type="text" class="field" name="user" id="user"><br/><br/>
                
                <label>Contraseña </label><br/>
                <input type="password" class="field" name="pass" id="pass"><br/><br/>
                <a href="registrarse.jsp">¿No tienes una cuenta?</a><br/><br/>
                <h3 class="tituloProd"> Ingrese los datos del envío</h3>
                
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
                }
                    
                    if(showform && user!=null && pass!=null){ 
                    String traerDatos = "SELECT * FROM PUBLIC.";
                    GlobalVariables globalvariables = new GlobalVariables(); 
                    String IdUsuarios=null, Usuario_Nombre = null;
        String Usuario_Contrasenia;
        
        ArrayList<Usuario> arr_user = new ArrayList<Usuario>();
        Usuario usuario = null;
        try{
            Connection miConexion = globalvariables.connection();
            Class.forName("org.postgresql.Driver");
            Statement st = miConexion.createStatement();
            traerDatos = traerDatos + "\"Usuarios\";";
            ResultSet result = st.executeQuery(traerDatos);
            while(result.next()){
                IdUsuarios = result.getString("IdUsuarios");
                Usuario_Nombre = result.getString("Usuario_Nombre");
                Usuario_Contrasenia = result.getString("Usuario_Contrasenia");
                usuario = new Usuario(Integer.parseInt(IdUsuarios),Usuario_Nombre,Usuario_Contrasenia) ;
                arr_user.add(usuario);
            }
            result.close();
            st.close();
        }catch(Exception e){
            System.out.println(e.getCause());
        }
        for(int i=0;i<arr_user.size();i++){
                System.out.println(user);
                System.out.println(arr_user.get(i).getUsuario_Nombre());
                if(user.equalsIgnoreCase(arr_user.get(i).getUsuario_Nombre())
                && pass.equalsIgnoreCase(arr_user.get(i).getUsuario_Contrasenia())){
                        System.out.println("como diablos llegan aca?");
                        showform=false;
                        exist=true;
                        //guardar en la base de datos 
                        Create cr = new Create();
                        Orden o = new Orden(Integer.parseInt(IdUsuarios) ,10.5,"domicilio",1,6);
                        cr.insertOrden(o);
                        //obtenener los datos del producto seleccionado
                        //realizar los registos en itemorden
                        //crear el registro en orden
                        %>
                         <script language="Javascript">
                        alert('registro guardado');
                        </script>
                
                <%
                   
                   /*
                    cr.insertOrden(orden);
                    */
                    
                    }//if de usuario y password
        }//fin for
                    if(!exist){%>
                    <script language="Javascript">
                        alert('no se encontró al usuario');
                        </script>
        <%}
            
                
                }

                  %>
                    
            </form>
          </div>
               
        </div>
</div>
    </body>
</html>


