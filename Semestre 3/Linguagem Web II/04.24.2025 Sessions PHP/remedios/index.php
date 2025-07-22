<?php session_start(); ?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Lista de Remédios</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Lista de Remédios</h1>
    <form method="POST">
        <fieldset>
            <legend>Adicionar medicamento</legend>
            Nome Paciente: <input type="text" name="nome">
            Remédio: <input type="text" name="remedio">
            Tempo tratamentos (dias): <input type="number" name="tempo">
            Vezes por dia: <input type="number" name="qtd">
            Dosagem (mg): <input type="number" name="dose">
            <input type="submit" value="Adicionar">
        </fieldset>
    </form>

    <table>
        <tr>
            <th>Paciente</th>
            <th>Medicamento</th>
            <th>Tratamento (dias)</th>
            <th>Vezes por dia</th>
            <th>Dosagem (mg)</th>
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
                    $_SESSION['lista'] = array_values($_SESSION['lista']); // Reorganiza os índices
                    header("Location: index.php");
                }
            }

            if(isset($_POST['nome']) && isset($_POST['remedio'])){
                $_SESSION['lista'][] = $_POST;
            }

            if (!empty($_SESSION['lista'])) {
                foreach($_SESSION['lista'] as $key => $conteudo){
                    echo "
                    <tr>
                        <td>{$conteudo['nome']}</td>
                        <td>{$conteudo['remedio']}</td>
                        <td>{$conteudo['tempo']}</td>
                        <td>{$conteudo['qtd']}</td>
                        <td>{$conteudo['dose']}</td>
                        <td><a href='?excluir={$key}'>Excluir</a></td>
                    </tr>
                    ";
                }
            }
        ?>
    </table>
    <a href="?limpa=1">Limpar lista</a>

</body>
</html>
