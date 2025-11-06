<%-- 
    Document   : Pesquisa.jsp
    Created on : 6 de nov. de 2025, 09:56:50
    Author     : alunocmc
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="model.PesquisaBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Dados do Formulário</h1>
        <%
            //Pegando os atributos do index
            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            int r1 = Integer.parseInt(request.getParameter("r1"));
            int r2 = Integer.parseInt(request.getParameter("r2"));
            int r3 = Integer.parseInt(request.getParameter("r3"));
            int r4 = Integer.parseInt(request.getParameter("r4"));
            
            //instanciando a classe PesquisaBean
            PesquisaBean pesq = new PesquisaBean();
            
            //encapsulando
            pesq.setNome(nome);
            pesq.setEmail(email);
            pesq.setR1(r1);
            pesq.setR2(r2);
            pesq.setR3(r3);
            pesq.setR4(r4);
            
            //testando
            JOptionPane.showMessageDialog(null,
                    "nome: " + pesq.getNome()+
                    "\nemail: " + pesq.getEmail()+
                    "\nr1: " + pesq.getR1()+
                    "\nr2: " + pesq.getR2()+
                    "\nr3: " + pesq.getR3()+
                    "\nr4: " + pesq.getR4());
         %>  
    </body>
</html>
