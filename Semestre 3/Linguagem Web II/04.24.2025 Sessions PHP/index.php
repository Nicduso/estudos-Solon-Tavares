<?php session_start(); ?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tarefas</title>
</head>
<body>
    <h1>Gerenciador de tarefas</h1>
    <form method="POST">
        <fieldset>
            <legend>Nova tarefa</legend>
            Tarefa: <input type="text" name="nome"><br>
            Data: <input type="date" name="data"><br>
            <input type="submit" value="Cadastrar"><br>
            <a href="?limpa=1">Limpar lista</a>
        </fieldset>
    </form>

    <table border="1">
        <tr>
            <th>Tarefa</th>
            <th>Data</th>
        </tr>

        <?php

            if(isset($_GET['limpa']) && $_GET['limpa'] == 1){
                unset($_SESSION['nome']);
                unset($_SESSION['data']);
                session_destroy();
                Header("Location: index.php");
            }

            //$lista_tarefa = array(); - antigo código

            if(isset($_POST['nome']) && $_POST['data']){
                //echo "<h2>Tarefa: {$_POST['nome']} - Data: {$_POST['data']}</h2>"; - antigo código

                $_SESSION['lista'][] = $_POST;

                //$lista_tarefa['nome'] = $_POST['nome']; - antigo código
                //$lista_tarefa['data'] = $_POST['data']; - antigo código

                foreach ($_SESSION['lista'] as $texto){
                    echo "
                        <tr>
                            <td>{$texto['nome']}</td>
                            <td>{$texto['data']}</td>
                        </tr>";
                }
            }
        ?>

    </table>
</body>
</html>