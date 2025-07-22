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
    <div style="width: 600px; margin: 0 auto;">
        <fieldset><legend>Sistema de cadastro</legend>
            <form action="#" method="POST">
                <label>Nome:</label>
                <input type="text" name="nome"><br><br>
                <label>Data de nascimento:</label>
                <input type="date" name="data"><br><br>
                <input type="submit" value="Alterar">
            </form>
        </fieldset>
        <a href="../index.html">Voltar</a>
        <br>

        <?php
            if (isset($_GET['codn'])) {
                if ($_SERVER['REQUEST_METHOD'] == 'POST') {
                    $nome = $_POST['nome'];
                    $data = $_POST['data'];

                        $dao = new CadastroDAO();
                        $cadastro = new Cadastro();
                        $cadastro->setNome($nome);
                        $cadastro->setNasc($data);

                        $dao->alterar($_GET['codn'], $cadastro);

                        echo "
                            <p style='color: green;'>Alteração efetuada!</p>
                            Voltar para: <a href='../localizar.php'>Localizar cadastro</a>
                            ";
                        
                }
            }
        ?>

    </div>

</body>
</html>