<?php

$n1 = $_POST['n1'];
$n2 = $_POST['n2'];
$n3 = $_POST['n3'];
$maior;

if($n1 > $n2 ){
    $maior = $n1;
}if($n1 < $n2){
    $maior = $n2;
}else{
    $maior = $n3;
}

$media = $n1+$n2+$n3/3;
echo" o maior numero é: $maior e a media foi: $media"
?>