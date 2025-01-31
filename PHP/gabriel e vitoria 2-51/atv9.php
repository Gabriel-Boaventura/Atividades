<?php 
$pares = 0;
$impares = 0;
$n1 = $_POST['n1'];

while ($n1 != 0) {
    
    if ($n1 % 2 == 0){
        $pares++;
    } else {
        $impares++;
    }

    
    $n1 = (int) readline("Digite um número (ou 0 para sair): ");
}

echo "Quantidade de números pares: $pares\n";
echo "Quantidade de números ímpares: $impares\n";

?>
<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="atv9.html">
    <input type="submit" value="voltar">
    </form>
</body>
</html>
