<?php
    require_once("../controller/CadastroDAO.class.php");
    require_once("../model/Cadastro.class.php");
    require_once("../model/conexao.class.php");
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Buscar dados</title>
</head>
<style>
    table, tr, th, td {
        border: 1px #000000 solid; 
        border-collapse: collapse;
        padding: 5px 10px;
        margin: 0 auto; 
    }
    table {
        margin-top: 15px;
    }
</style>
<body>
    <div style="width: 600px; margin: 0 auto;">
        <fieldset>  
            <legend>Localizar por nome:</legend>
            <form method="POST">
                <label>Nome:</label>
                <input type="text" name="nome">
                <input type="submit" value="Buscar">
            </form>
        </fieldset>
        <a href="index.html">Voltar</a>

        <?php

            if(isset($_GET['cod'])) {
                $dao = new CadastroDAO();
                $dao->excluir($_GET['cod']);
            }

            if($_SERVER['REQUEST_METHOD'] == 'POST') {
                $dao = new CadastroDAO();

                if($lista = $dao->buscaNome($_POST['nome'])) {
                    echo"
                        <table>
                            <tr>
                                <th>Código</th>
                                <th>Nome</th>
                                <th>Data de Nascimento</th>
                                <th colspan=2>Ação</th>
                            </tr>";
                    
                    foreach($lista as $l) {
                        $nasc = date("d/m/Y", strtotime($l['nasc']));
                        echo"
                            <tr>
                                <td>{$l['cod']}</td>
                                <td>{$l['nome']}</td>
                                <td>{$nasc}</td>
                                <td><a href='?cod={$l['cod']}'>Excluir</a></td> 
                                <td><a href='form_update.php/?codn={$l['cod']}'>Alterar</a></td>
                            </tr>
                            ";
                    }

                    echo "</table>";

                } else {
                    echo "<p style='color: red;'>Nenhum cadastro encontrado.</p>";
                }
            }
        ?>

    </div>
</body>
</html>