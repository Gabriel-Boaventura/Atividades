<?php

    $usuario = "admin";
    $senha = "1234";

    if($_POST['usuario'] == $usuario && $_POST['senha'] == $senha){
        echo "<h2>Usuário logado com sucesso, Boas vindas!!!</h2>";
    }else{
        echo "<h2>Erro!!! Usuário não autenticado</h2>";
    }
   
?>