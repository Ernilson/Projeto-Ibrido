<%-- 
    Document   : Lista
    Created on : 11/02/2019, 08:54:05
    Author     : S60254831168
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
    </head>
       
    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a href="add.htm">Novo Cadastro</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nome</th>
                                <th>Endereço</th>
                                <th>Telefone</th>
                                <th>Email</th>
                                <th>Editar</th>
                                <th>Excluir</th>
                            </tr>
                        </thead>
                        <tbody>                           
                          
                            <c:forEach items="${lista}" var="lis">
                            <tr>
                                <td>${lis.id}</td>
                                <td>${lis.nome}</td>
                                <td>${lis.ender}</td>
                                <td>${lis.fone}</td>
                                <td>${lis.email}</td>
                                
                                <td>
                                    <a href="editar.htm?id=${lis.id}" class="btn btn-warning">Alterar</a>
                                </td>
                                <td>
                                    <a href="apagar.htm?id=${lis.id}" class="btn btn-danger">Apagar</a>
                                </td>
                                
                            </tr>                            
                           
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>

