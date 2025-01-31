<?php

$a = $_POST['a'];
$n = $_POST['n'];
$soma = 0;
  for ($i = $a; $i <= $n; $i++) { 
    if ($i % 3 == 0 && $i % 2 != 0) {
      $soma += $i;
    }
  }
  echo "A soma dos números ímpares múltiplos de 3 entre $a e $n é: $soma";
?>