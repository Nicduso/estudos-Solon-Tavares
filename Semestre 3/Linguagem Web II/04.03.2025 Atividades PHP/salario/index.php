<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cálculo salário</title>
</head>
<body>
    <h1>Informe as informações solicitadas:</h1>
    <form method="POST">
        <label>Qual o seu valor hora?</label>
        <input type="number" name="valor">
        <label>Quantas horas trabalhou este mês?</label>
        <input type="number" name="hora">
        <input type="submit" value="Calcular">
    </form>
    <!-- 
Faça um script que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um script que nos dê:salário bruto.quanto pagou ao INSS.quanto pagou ao sindicato.o salário líquido.calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido. 
-->
    <?php
        if ($_SERVER ["REQUEST_METHOD"] == "POST"){
            $valor = floatval($_POST["valor"]);
            $hora = floatval($_POST["hora"]);

            if ($valor > 0 && $hora > 0) {
                $bruto = $valor * $hora;
                $renda = $bruto * 0.11;
                $inss = $bruto * 0.08;
                $sindicato = $bruto * 0.05;
                $desconto = $renda + $inss + $sindicato;
                $liquido = $bruto - $desconto;

                echo "<h2>Resultados:</h2>";
                echo "<p><strong>Salário bruto:</strong> R$ $bruto</p>";
                echo "<p><strong>Descontos:</strong></p>";
                echo "<p> - Imposto de Renda: R$ $renda</p>";
                echo "<p> - INSS: R$ $inss</p>";
                echo "<p> - Sindicato: R$ $sindicato</p>";
                echo "<p><strong>Total de descontos:</strong> R$ $desconto</p>";
                echo "<p><strong>Salário líquido:</strong> R$ $liquido</p>";

            } else {
                echo "<p style='color: #d31111'>Preencha todos os campos corretamente.</p>";
            }


        }
    ?>
</body>
</html>