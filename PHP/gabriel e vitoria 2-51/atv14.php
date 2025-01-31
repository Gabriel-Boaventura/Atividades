<?php

$massa = $_POST['m'];
$tempo = 0;

while($massa > 0.5){
    $massa = $massa/2;
    $tempo += 50; 
}

echo" Massa final sera: $massa";
echo" O tempo decorrido foi de $tempo";

?>