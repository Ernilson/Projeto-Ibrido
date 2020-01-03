<%-- 
    Document   : add
    Created on : 10/02/2019, 19:23:14
    Author     : eupen
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="resources/css/style.css"/>" rel="stylesheet" type="text/css"/>
        
        <title>JSP Page</title>
    </head>
    <body>
        <div  class="container">
            <div class="col-md-6 cadastro">
        <h1>Maravilha! ${nome}</h1>
        <div>
            <form method="POST">
                <div class="form-group">
                    Nome:
                    <input type="text" name="nome" id="nome" class="form-control" required="">
                </div>
                 <div class="form-group">
                    Endereço:
                    <input type="text" name="ender" id="ender" class="form-control" required="">
                </div>
                 <div class="form-group">
                    Fone:
                    <input type="number" name="fone" id="fone" class="form-control" required="">
                </div>
                <div class="form-group">
                    Email:
                    <input type="email" name="email" id="email" class="form-control" required="">
                </div>
                <div class="form-group">
                    <input type="submit" id="submit" class="btn btn-primary" value="Cadastrar">
                    <a href="index.htm">Voltar</a>
                </div>
            </form>
        </div>
        </div>
        </div>
    </body>
   
</html>