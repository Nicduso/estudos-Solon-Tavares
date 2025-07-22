<?php
    require_once("../controller/CadastroDAO.class.php");
    require_once("../model/Cadastro.class.php");
    require_once("../model/conexao.class.php");
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Cadastro Banco de Dados</title>
</head>
<body>
    <fieldset><legend>Sistema de cadastro</legend>
        <form action="#" method="POST">
            <label>Nome:</label>
            <input type="text" name="nome"><br><br>
            <label>Data de nascimento:</label>
            <input type="date" name="data"><br><br>
            <input type="submit" value="Cadastrar">
        </form>
    </fieldset>

    <?php
        if($_SERVER['REQUEST_METHOD'] == 'POST') {
            $cadastro = new Cadastro();
            $cadastro->setNome($_POST['nome']);
            $cadastro->setNasc($_POST['data']);

            $dao = new CadastroDAO();
            if($dao->inserir($cadastro) != NULL) {
                echo "Cadastro efetuado!";
            }
        }
    ?>

</body>
</html>