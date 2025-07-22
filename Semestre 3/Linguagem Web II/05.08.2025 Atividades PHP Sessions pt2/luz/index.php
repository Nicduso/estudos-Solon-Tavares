<?php session_start(); ?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Consumo de luz</title>
</head>
<body>
    <h1>Consumo de Luz em KWh</h1>
    <form method="POST">
        <fieldset>
            <legend>Registrar consumo</legend>
            Nome Usuário: <input type="text" name="nome"> <br>
            Registro: <input type="text" name="registro"> <br>
            Consumo (KWh): <input type="number" name="kwh"> <br>
            <input type="submit" value="Adicionar">
        </fieldset>
    </form>

    <table>
        <tr>
            <th>Usuário</th>
            <th>Nº Registro</th>
            <th>Consumo (KWh)</th>
            <th>Ação</th>
        </tr>

        <?php
            if (isset($_GET['limpa']) && $_GET['limpa'] == 1) {
                unset($_SESSION['lista']);
                session_destroy();
                header("Location: index.php");
            }

            if (isset($_GET['excluir'])) {
                $indice = $_GET['excluir'];
                if (isset($_SESSION['lista'][$indice])) {
                    unset($_SESSION['lista'][$indice]);
                    $_SESSION['lista'] = array_values($_SESSION['lista']); 
                    header("Location: index.php");
                }
            }

            if (isset($_POST['nome']) && isset($_POST['registro']) && isset($_POST['kwh'])) {
                $_SESSION['lista'][] = [
                    "nome" => $_POST['nome'],
                    "registro" => $_POST['registro'],
                    "kwh" => floatval($_POST['kwh'])
                ];
            }

            function comparacao($a, $b) {
                return $a['kwh'] <=> $b['kwh']; 
            }

            if (!empty($_SESSION['lista'])) {
                usort($_SESSION['lista'], "comparacao");

                $menor = $_SESSION['lista'][0]['kwh'];
                $maior = $_SESSION['lista'][count($_SESSION['lista']) - 1]['kwh'];

                echo "<h2>Menor consumo registrado: {$menor} KWh</h2>";
                echo "<h2>Maior consumo registrado: {$maior} KWh</h2>";

                foreach ($_SESSION['lista'] as $key => $conteudo) {
                    echo "
                    <tr> 
                        <td>{$conteudo['nome']}</td>
                        <td>{$conteudo['registro']}</td>
                        <td>{$conteudo['kwh']} KWh</td>
                        <td><a href='?excluir={$key}'>Excluir</a></td>
                    </tr>";
                }
            }
        ?>
    </table>
    <a href="?limpa=1">Limpar lista</a>
</body>
</html>
