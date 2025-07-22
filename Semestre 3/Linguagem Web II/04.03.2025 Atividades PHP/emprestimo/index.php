<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Empréstimo</title>
</head>
<body>
    <h1>Simulação de Empréstimo</h1>
    <h2>Informe seus dados:</h2>
    <form method="POST">
        <label for="">Nome:</label>
        <input type="text" name="nome">
        <label for="">Telefone:</label>
        <input type="text" name="tel">
        <label for="">Banco:</label>
        <select name="banco">
            <option value="0">Banrisul</option>
            <option value="1">Itaú</option>
            <option value="2">Bradesco</option>
        </select>
        <label for="">Valor do Empréstimo:</label>
        <input type="number" name="valor">
        <label for="">Número de parcelas:</label>
        <select name="parcelas">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
            <option value="13">13</option>
            <option value="14">14</option>
            <option value="15">15</option>
            <option value="16">16</option>
            <option value="17">17</option>
            <option value="18">18</option>
        </select>
        <input type="submit" value="Calcular">
    </form>

    <?php
        if($_SERVER["REQUEST_METHOD"] == "POST"){
            $nome = $_POST["nome"];
            $tel = $_POST["tel"];
            $banco = $_POST["banco"];
            $valor = floatval($_POST["valor"]);
            $parcela = floatval($_POST["parcelas"]);

            if ($nome != "" && $tel != "" && $valor > 0) {

                if($banco == 0){
                    $banco = "Banrisul";
                    if($parcela < 4) {
                        $tparcela = $valor / $parcela;
                        $total = $valor;
                    } else if ($parcela > 3 && $parcela < 11 ){
                        $total = $valor + $valor * 0.09;
                        $tparcela = $total / $parcela; 
                    } else {
                        $total = $valor + $valor * 0.1;
                        $tparcela = $total / $parcela; 
                    }
                }else if($banco == 1) {
                    $banco = "Itaú";
                    if($parcela < 5) {
                        $total = $valor + $valor * 0.05;
                        $tparcela = $total / $parcela; 
                    } else if ($parcela > 4 && $parcela < 10 ){
                        $total = $valor + $valor * 0.1;
                        $tparcela = $total / $parcela; 
                    } else {
                        $total = $valor + $valor * 0.13;
                        $tparcela = $total / $parcela; 
                    }
                }else if($banco == 2){
                    $banco = "Bradesco";
                    if($parcela < 3) {
                        $tparcela = $valor / $parcela;
                        $total = $valor;
                    } else if ($parcela > 2 && $parcela < 11 ){
                        $total = $valor + $valor * 0.09;
                        $tparcela = $total / $parcela; 
                    } else {
                        $total = $valor + $valor * 0.12;
                        $tparcela = $total / $parcela; 
                    }
                }
                echo "<h2>Resultados:</h2>";
                echo "<p>Nome do requirente: $nome</p>";
                echo "<p>Telefone do requirente: $tel</p>";
                echo "<p>Banco selecionado: $banco</p>";
                echo "<p>Empréstimo solicitado: R$ $valor</p>";
                echo "<p>Número de parcelas: Em $parcela X</p>";
                echo "<br><h3>Valor das parcelas: $parcela X de R$ $tparcela</h3>";
                echo "<h3>Total a ser pago com juros: R$ $total</h3>";
            } else {
                echo "<p style='color: #d31111;'>Preencha todos os campos corretamente.</p>";
            } 
        }
    ?>
</body>
</html>