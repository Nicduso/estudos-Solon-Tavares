<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Loja de Tintas</title>
</head>
<body>
    <h1>Calculadora de Tinta</h1>
    <form method="POST">
        <label for="area">Informe o tamanho da área a ser pintada (m²):</label>
        <input type="number" name="area" step="0.01" required>
        <input type="submit" value="Calcular">
    </form>

    <?php
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $area = floatval($_POST["area"]);
            
            if ($area > 0) {
                $litros_por_m2 = 1 / 6;
                $folga = 1.1;
                $litros_necessarios = ceil($area * $litros_por_m2 * $folga);

                $lata_litros = 18;
                $galao_litros = 3.6;
                $preco_lata = 80.00;
                $preco_galao = 25.00;

                $qtd_latas = ceil($litros_necessarios / $lata_litros);
                $preco_total_latas = $qtd_latas * $preco_lata;

                $qtd_galoes = ceil($litros_necessarios / $galao_litros);
                $preco_total_galoes = $qtd_galoes * $preco_galao;

                $qtd_latas_misto = floor($litros_necessarios / $lata_litros);
                $restante = $litros_necessarios - ($qtd_latas_misto * $lata_litros);
                $qtd_galoes_misto = ceil($restante / $galao_litros);
                $preco_total_misto = ($qtd_latas_misto * $preco_lata) + ($qtd_galoes_misto * $preco_galao);

                echo "<h2>Resultado:</h2>";
                echo "<p>Área informada: {$area} m²</p>";
                echo "<p>Litros necessários (com 10% de folga): {$litros_necessarios} L</p>";

                echo "<h3>Opção 1: Apenas latas de 18L</h3>";
                echo "<p>Quantidade de latas: {$qtd_latas}</p>";
                echo "<p>Preço total: R$ " . number_format($preco_total_latas, 2, ',', '.') . "</p>";

                echo "<h3>Opção 2: Apenas galões de 3,6L</h3>";
                echo "<p>Quantidade de galões: {$qtd_galoes}</p>";
                echo "<p>Preço total: R$ " . number_format($preco_total_galoes, 2, ',', '.') . "</p>";

                echo "<h3>Opção 3: Mistura de latas e galões</h3>";
                echo "<p>Latas de 18L: {$qtd_latas_misto}</p>";
                echo "<p>Galões de 3,6L: {$qtd_galoes_misto}</p>";
                echo "<p>Preço total: R$ " . number_format($preco_total_misto, 2, ',', '.') . "</p>";
            } else {
                echo "<p style='color:red;'>Informe uma área válida maior que 0.</p>";
            }
        }
    ?>
</body>
</html>
