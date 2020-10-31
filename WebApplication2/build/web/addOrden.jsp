
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
            String prodR=request.getParameter("Prod_Nombre");
           GlobalVariables globalvariables = new GlobalVariables();
            String tipoenvio = request.getParameter("tipo");
            String diasenvio = request.getParameter("dias");
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            String link;
             Class.forName("org.postgresql.Driver");
            
            PreparedStatement ps;
            String obtP =request.getParameter("name");
            ps=globalvariables.connection().prepareStatement("SELECT * FROM PUBLIC.\"Productos\" WHERE \"Prod_Nombre\"=" + prodR + ";");
            //String traerP = request.getParameter("Producto");
            boolean exist=false;
            boolean showform=true;
            if((user==null && pass==null && tipoenvio==null && diasenvio==null)||showform){
        %>
        <%if(obtP!=null){%>
    
                <h1 class="tituloProd">Iniciar Sesion</h1>
                <label>nombre</label><br/>
                <input type="text" class="field" name="user" id="user"><br/><br/>
                
                <label>Contraseña </label><br/>
                <input type="password" class="field" name="pass" id="pass"><br/><br/>
                <a href="registrarse.jsp">¿No tienes una cuenta?</a><br/><br/>
                <h3 class="tituloProd"> Ingrese los datos del envío</h3>
                
                <label>tipo de envio</label><br/>
                <div>  
                <input class="form-check-input" name="boxE" type="checkbox" id="gridCheck"> Envio a bodega
                </div><br/>
                <input class="form-check-input" name="boxI" type="checkbox" id="gridCheck"> Envio a domicilio 
                 <br/><br/>
                <label>Dias de envío </label><br/>
                <input type="text" class="field" name="dias" id="dias"><br/><br/>
                <button type="submit" class="btnn btnn-green brd" name="addn">Ordenar</button><br/><br/>
                  <%   
                }
                    
                    if(showform && user!=null && pass!=null){ 
                    String traerDatos = "SELECT * FROM PUBLIC.";
                   // GlobalVariables globalvariables = new GlobalVariables(); 
                    String IdUsuarios=null, Usuario_Nombre = null;
        String Usuario_Contrasenia;
        
        ArrayList<Usuario> arr_user = new ArrayList<Usuario>();
        Usuario usuario = null;
        try{
            Connection miConexion ; 
                miConexion = globalvariables.connection();
            Class.forName("org.postgresql.Driver");
            Statement st = miConexion.createStatement();
            traerDatos = traerDatos + "\"Usuarios\";";
            ResultSet result = st.executeQuery(traerDatos);
            while(result.next()){
                IdUsuarios = result.getString("Usuario_Id");
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
                        showform=false;
                        exist=true;
                        
                        Create cr = new Create();
                         //String dias = request.getParameter("dias");
                        if(request.getParameter("boxE")!=null){
                        Orden o ;
                        o=new Orden(Integer.parseInt(IdUsuarios) ,0.0, "Envio a bodega",1,0);
                        cr.insertOrden(o, prodR);      
                        }
                        if(request.getParameter("boxI")!=null){
                        Orden o ;
                        o=new Orden(Integer.parseInt(IdUsuarios) ,25.0, "Envio a domicilio",1,Integer.parseInt(diasenvio));

                        cr.insertOrden(o, prodR);      
                        
                        }
                        %>
                         <script language="Javascript">
                        alert('   Su compra fue realizada con éxito\n\n   Gracias por preferir la tienda AutoPartes');
                        </script>
                <%
                    }//if de usuario y password
        }//fin for
                    if(!exist){%>
                    <script language="Javascript">
                        alert('   Nombre o contraseña incorrectos');
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


