<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Princípio PHP</title>
</head>
<body>
<h1>Dados informados</h1>
    <?php
        echo "<p>Nome: {$_POST['nome']}</p>";
        echo "<p>Idade: {$_POST['idade']}</p>";
        echo "<p>Sua linguagem preferida é: {$_POST['linguagem']}</p>"
    ?>
</body>
</html>