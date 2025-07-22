<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Princípio PHP</title>
</head>
<body>
    <h1>Primeira página em PHP</h1>
    <?php
        echo "<p>Olá Mundo!</p>";
        echo "<h3>Variáveis em PHP</h3>";
        $nome = "Seu Madruga";
        $idade = 50;

        echo "<p>Nome: {$nome}, Idade: ".$idade."</p>";
    ?>
    <h2>Manipular dados de formulãrios</h2>
    <form action="recebe.php" method="POST">
        <label>Nome: </label>
        <input type="text" name="nome"><br><br>
        <label>Idade</label>
        <input type="text" name="idade"><br><br>
        <label>Linguagens Preferidas</label><br>
        <input type="radio" name="linguagem" value="Java">Java<br>
        <input type="radio" name="linguagem" value="PHP">PHP<br>
        <input type="radio" name="linguagem" value="Javascript">Javascript<br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>