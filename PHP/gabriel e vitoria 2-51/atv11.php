<?php

$guardar=0;

for($i=1;$i<=500;$i++) {
    if($i % 3 == 0 && $i % 2 <> 0){
        $guardar = $guardar + $i;
    }
}  
echo" valor é : $guardar";


?>