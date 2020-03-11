
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
	src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Ajouter Produit</title>
</head>


<!-- 	private Long idMedicament;
	private String nomMedicament;
	private Integer quantite;
	private ArrayList<Date> heurePrise;   -->

<body>
	<div class="card-body">
		<form action="saveProduit" method="post">

			<div class="form-group">
				<label class="control-label">Nom Medicament :</label> <input
					type="text" name="nomMedicament" class="form-control" />
			</div>

			<div class="form-group">
				<label class="control-label">Quantité Medicament :</label> <input
					type="text" name="quantite" class="form-control" />
			</div>

			<div class="form-group">
				<label class="control-label">La Dose de Medicament par
					prise:</label> <input type="text" name="dose" class="form-control" />
			</div>
			
			<div class="form-group">
				<label class="control-label">L'heures heures de prises </label> 
				<input class="form-control" type="datetime-local" value="2011-08-19T13:45:00" name="heurePrise" id="example-datetime-local-input">
<!-- 		"yyyy-MM-dd@HH:mm:ss.SSSZ"		<input class="form-control" type="time" value="13:45:00" name="heurePrise" id="example-time-input"> -->
<!-- 				<input class="form-control" type="date" value="2011-08-19" name="heurePrise" id="example-date-input"> -->
			</div>

			<div>
				<button type="submit" class="btn btn-primary">Ajouter</button>
			</div>
		</form>
	</div>
	${msg}
	<br />
	<br />
	<a href="ListeMedicaments">Liste Produits</a>
</body>
</html>

