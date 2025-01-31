<?php

$ini = $_POST['ini'];
$fim = $_POST['fim'];

$pares = 0;
$impares = 0;
$multiplos = 0;

for($i = $ini; $i<=$fim; $i++){
    if($i % 2 == 0){
        $pares++;
        if($i % 3 == 0){
            $multiplos++;
        }
    } else {
        $impares++;
    }
}

echo "Números pares: $pares <br>";

echo "Números ímpares: $impares <br>";

echo "Números múltiplos de 3: $multiplos <br>";

?>