<?php session_start(); ?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Simulação de Empréstimo</title>
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
            <?php for ($i = 1; $i <= 18; $i++) echo "<option value='$i'>$i</option>"; ?>
        </select>
        <input type="submit" value="Calcular">
        <a href="?limpar=1">Limpar histórico</a>
    </form>

    <?php
        if (isset($_GET['limpar'])) {
            unset($_SESSION['emprestimos']);
            session_destroy();
            header("Location: index.php");
        }

        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $nome = $_POST["nome"];
            $tel = $_POST["tel"];
            $banco = $_POST["banco"];
            $valor = floatval($_POST["valor"]);
            $parcela = floatval($_POST["parcelas"]);

            if (!empty($nome) && !empty($tel) && $valor > 0) {
                if ($banco == 0) {
                    $banco = "Banrisul";
                    $juros = ($parcela < 4) ? 0 : (($parcela < 11) ? 0.09 : 0.1);
                } else if ($banco == 1) {
                    $banco = "Itaú";
                    $juros = ($parcela < 5) ? 0.05 : (($parcela < 10) ? 0.1 : 0.13);
                } else {
                    $banco = "Bradesco";
                    $juros = ($parcela < 3) ? 0 : (($parcela < 11) ? 0.09 : 0.12);
                }

                $total = $valor + ($valor * $juros);
                $tparcela = $total / $parcela;

                $_SESSION['emprestimos'][] = [
                    "nome" => $nome,
                    "tel" => $tel,
                    "banco" => $banco,
                    "valor" => number_format($valor, 2, ',', '.'),
                    "parcela" => $parcela,
                    "tparcela" => number_format($tparcela, 2, ',', '.'),
                    "total" => number_format($total, 2, ',', '.')
                ];
            } else {
                echo "<p style='color: #d31111;'>Preencha todos os campos corretamente.</p>";
            }
        }

        if (!empty($_SESSION['emprestimos'])) {
            echo "<h2>Histórico de Simulações:</h2>";
            echo "<table border='1'>";
            echo "<tr><th>Nome</th><th>Telefone</th><th>Banco</th><th>Valor</th><th>Parcelas</th><th>Parcela</th><th>Total</th><th>Ação</th></tr>";

            foreach ($_SESSION['emprestimos'] as $key => $dados) {
                echo "<tr>
                    <td>{$dados['nome']}</td>
                    <td>{$dados['tel']}</td>
                    <td>{$dados['banco']}</td>
                    <td>R$ {$dados['valor']}</td>
                    <td>{$dados['parcela']}x</td>
                    <td>R$ {$dados['tparcela']}</td>
                    <td>R$ {$dados['total']}</td>
                    <td><a href='?excluir=$key'>Excluir</a></td>
                </tr>";
            }
            echo "</table>";
        }

        if (isset($_GET['excluir'])) {
            $indice = $_GET['excluir'];
            if (isset($_SESSION['emprestimos'][$indice])) {
                unset($_SESSION['emprestimos'][$indice]);
                $_SESSION['emprestimos'] = array_values($_SESSION['emprestimos']); // Reorganiza os índices
                header("Location: index.php");
            }
        }
    ?>
</body>
</html>
