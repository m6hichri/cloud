<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
	<c:url value="/css/main.css" var="jstlCss" />
	<link href="${jstlCss}" rel="stylesheet" />
	<script type="text/javascript" src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste Produits</title>
</head>
<body>
<div class="container">
<div class="card">
  <div class="card-header">
    Liste des Produits
  </div>
  <div class="card-body">
       
       <!-- 		this.idMedicament = idMedicament;
		this.nomMedicament = nomMedicament;
		this.quantite = quantite;
		this.dose = dose;
		this.heurePrise = heurePrise; -->
      <table class="table table-striped">
        <tr>
          <th>ID</th><th>Nom Medicament</th><th>quantite</th><th>dose</th><th>heurePrise</th><th>Suppression<th>Edition</th>
         </tr>
         <!--  "${produits}" ,==> c'est le modéle envoyé par le controller -->
         <c:forEach items="${produits}" var="p">
           <tr>
              <td>${p.idMedicament }</td>
              <td>${p.nomMedicament }</td>
              <td>${p.quantite }</td>
              <td>${p.dose }</td>
              <td>${p.heurePrise }</td>
              <td><a onclick="return confirm('Etes-vous sûr ?')" href="supprimerProduit?id=${p.idMedicament }">Supprimer</a></td>
               <td><a href="modifierProduit?id=${p.idMedicament }">Edit</a></td>
           </tr>
         </c:forEach>        
      </table>
  </div>
</div>
</div>
</body>
</html>