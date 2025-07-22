    <!DOCTYPE html>
    <html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Consumo Combustível</title>
    </head>
    <body>
        <h1>Cálculo de consumo de Combustível</h1>
        <form method="POST">
            <label>Informe os quilômetros percorridos:</label>
            <input type="number" name="km">
            <label>Informe o consumo de litros no total do percurso:</label>
            <input type="number" name="litros">
            <input type="submit" value="Calcular">
        </form>
        <?php
            if($_SERVER ["REQUEST_METHOD"] == "POST") {
                $km = floatval($_POST["km"]);
                $litro = floatval($_POST["litros"]);
                
                if ($km > 0 && $litro > 0) {
                    $consumo = $km / $litro;
                    echo "<h2>O consumo médio deste trajeto foi de: $consumo km/litro.</h2>";
                } else {    
                    echo "<p style = 'color: #d31111;'> Preencha todos os campos </p>";
                }
            }
        ?>
    </body>
    </html>