<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>


<!DOCTYPE html>



<html>
<head>
    <title>Credit simulateur</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .form-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        .form-container h2 {
            margin-bottom: 20px;
            font-size: 24px;
            text-align: center;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .form-group button {
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            border: none;
            border-radius: 4px;
            color: #fff;
            font-size: 16px;
            cursor: pointer;
        }
        .form-group button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h2>Credit simulateur</h2>
    <form action="controler-servlet" method="POST">
        <div class="form-group">
            <label for="montant">Montant</label>
            <input type="text" id="montant" name="montant" placeholder="Entrer Montant"
                   value="${credit.montant}">
        </div>
        <div class="form-group">
            <label for="taux">Taux</label>
            <input type="text" id="taux" name="taux" placeholder="Entrer Taux"
                   value="${credit.taux}">
        </div>
        <div class="form-group">
            <label for="duree">Duree</label>
            <input type="text" id="duree" name="duree" placeholder="Entrer Duree"
                   value="${credit.duree}">
        </div>
        <div class="form-group">
            <button type="submit">Calculer</button>
        </div>
    </form>
    <p>Monsualite ${credit.monsualite}</p>
</div>
</body>
</html>