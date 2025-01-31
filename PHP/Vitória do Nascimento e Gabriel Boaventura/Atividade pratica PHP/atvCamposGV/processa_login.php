<?php

    $nome = $_POST['nome'];
    $email = $_POST['email'];
    $mensagem = $_POST['mensagem'];

    if($_POST['nome'] == "" || $_POST['email'] == "" || $_POST['mensagem'] == ""){
        echo "";
        header('location: '. "http://localhost/atvCamposGV/login.php");
        
    }else{
        echo "<h2>dados captados com sucesso!!</h2>";
        echo "$nome <br> $email <br> $mensagem";
    }
   
?>