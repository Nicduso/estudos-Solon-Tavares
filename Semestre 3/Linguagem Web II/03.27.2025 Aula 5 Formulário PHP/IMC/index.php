<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="styles.css">
    <title>Calculadora IMC</title>
</head>
<body>
<div id="container">
<h1>Calculadora IMC</h1>
<p>Informe abaixo seu peso e medidas para saber o resultado.</p>

<form method="POST">
    <label>Peso (Quilos):</label>
    <input type="text" name="peso" required>
    <label>Altura (Metros):</label>
    <input type="text" name="altura" required>
    <label>Gênero:</label>
    <select name="genero">
        <option value="0">Masculino</option>
        <option value="1">Feminino</option>
    </select>
    <input type="submit" value="Calcular">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $peso = floatval(str_replace(',', '.', $_POST["peso"])); // Substitui vírgula por ponto e converte
    $altura = floatval(str_replace(',', '.', $_POST["altura"]));
    $genero = $_POST["genero"];

    if ($peso > 0 && $altura > 0) {
        $imc = $peso / ($altura * $altura);
        $imcFormatado = number_format($imc, 2, ',', '.');

        // Lógica de classificação, igual ao JavaScript
        if ($genero == 0) { // Masculino
            if ($imc <= 21.9) {
                $classificacao = "Cuidado! Você está abaixo do peso.";
            } elseif ($imc <= 27.0) {
                $classificacao = "Parabéns, seu peso é o ideal.";
            } elseif ($imc <= 30.0) {
                $classificacao = "Você está um pouco acima do peso.";
            } elseif ($imc <= 35.0) {
                $classificacao = "Cuidado! Você está obeso.";
            } elseif ($imc <= 39.9) {
                $classificacao = "Cuidado! Você está obeso.";
            } else {
                $classificacao = "Urgente! Você está obeso mórbido.";
            }
        } else { // Feminino
            if ($imc <= 21.9) {
                $classificacao = "Cuidado! Você está abaixo do peso.";
            } elseif ($imc <= 27.0) {
                $classificacao = "Parabéns, seu peso é o ideal.";
            } elseif ($imc <= 32.0) {
                $classificacao = "Você está um pouco acima do peso.";
            } elseif ($imc <= 37.0) {
                $classificacao = "Cuidado! Você está obeso.";
            } elseif ($imc <= 41.9) {
                $classificacao = "Cuidado! Você está obeso.";
            } else {
                $classificacao = "Urgente! Você está obeso mórbido.";
            }
        }

        // Exibe o resultado
        echo "<h2>Seu IMC: $imcFormatado</h2>";
        echo "<p>$classificacao</p>";
    } else {
        echo "<p>Erro: Insira valores válidos.</p>";
    }
}
?>
    <table>
        <tr>
            <th class="title" colspan="2">Feminino</th>
            <th class="title" colspan="2">Masculino</th>
        </tr>
        <tr>
            <th class="title">IMC</th>
            <th class="title">Classificação</th>
            <th class="title">IMC</th>
            <th class="title">Classificação</th>
        </tr>
        <tr>
            <td>Abaixo de 21,9</td>
            <td>Abaixo do peso</td>
            <td>Abaixo de 21,9</td>
            <td>Abaixo do peso</td>
        </tr>
        <tr>
            <td>Entre 22,0 e 27,0</td>
            <td>Peso Normal</td>
            <td>Entre 22,0 e 27,0</td>
            <td>Peso Normal</td>
        </tr>
        <tr>
            <td>Entre 27,1 e 32,0</td>
            <td>Sobrepeso</td>
            <td>Entre 27,1 e 30,0</td>
            <td>Sobrepeso</td>
        </tr>
        <tr>
            <td>Entre 32,1 e 37,0</td>
            <td>Obesidade grau I</td>
            <td>Entre 30,1 e 35,0</td>
            <td>Obesidade grau I</td>
        </tr>
        <tr>
            <td>Entre 37,1 e 41,9</td>
            <td>Obesidade grau II (severa)</td>
            <td>Entre 35,1 e 39,9</td>
            <td>Obesidade grau II (severa)</td>
        </tr>
        <tr>
            <td>42,0 ou mais</td>
            <td>Obesidade grau III (mórbida)</td>
            <td>40,0 ou mais</td>
            <td>Obesidade grau III (mórbida)</td>
        </tr>
    </table>
    </div>
</body>
</html>