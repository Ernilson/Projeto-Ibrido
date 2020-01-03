<%-- 
    Document   : editar
    Created on : 11/02/2019, 13:23:15
    Author     : S60254831168
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="resources/css/style.css"/>" rel="stylesheet" type="text/css"/>        
    </head>
    <body>
    
        <div  class="container">
            <div class="col-md-6 cadastro">
                <h1>Atualizar Cadastro</h1>
                <div>
                    <form method="POST">
                        <label> Nome:</label>
                        <input type="text" name="nome" id="nome" class="form-control" value="${lista.nome}">              
                        <label> Endereço:</label>
                        <input type="text" name="ender" id="ender" class="form-control" value="${lista.ender}">              
                        <label> Telefone:</label>
                        <input type="number" name="fone" id="fone" class="form-control" value="${lista.fone}">                
                        <label> Email:</label>
                        <input type="email" name="email" id="email" class="form-control" value="${lista.email}"><br>                
                        <input type="submit" value="Grava" class="btn btn-primary" >
                        <a href="index.htm">Voltar</a>                
                    </form>
                </div>
            </div>
        </div>
    </body>
   
</html>
