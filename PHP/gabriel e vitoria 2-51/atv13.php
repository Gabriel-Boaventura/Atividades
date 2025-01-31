<?php

$a = $_POST['a'];
$r = $_POST['r'];

for ($i = 0; $i < 10; $i++) {
    $termo = $a + ($i * $r);
    echo "$termo ";
}

?>