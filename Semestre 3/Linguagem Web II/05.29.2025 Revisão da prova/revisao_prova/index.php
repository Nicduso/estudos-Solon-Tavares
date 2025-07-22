<?php session_start(); ?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Pede Lanches</title>
</head>
<style>
    table, tr, th, td {
        border: 1px solid #000000;
        border-collapse: collapse;
        padding: 5px 10px;
    }
</style>
<body>
    <h1>Peça um lanche:</h1>
    <form method="POST">
        <label>Nome:</label>
        <input type="text" name="nome"><br><br>
        <label>Itens:</label>
        <select name="item">
            <option value="Xis Bacon">Xis Bacon - R$ 28,00</option>
            <option value="Xis Salada">Xis Salada - R$ 25,00</option>
            <option value="Cachorro Quente">Cachorro Quente - R$ 18,00</option>
            <option value="Hamburguer">Hamburguer Simples - R$ 20,00</option>
            <option value="Baurú">Baurú - R$ 32,00</option>
            <option value="Batata Frita">Porção de Batata Frita - R$ 12,00</option>
        </select><br><br>
        <label>Quantidade</label>
        <input type="number" name="qtd"><br><br>
        <input type="submit" value="Enviar">

    </form>

    <br><br>
    
    <table>
        <tr>
            <th>Número</th>
            <th>Nome</th>
            <th>Quantidade</th>
            <th>Pedido</th>
            <th>Desconto</th>
            <th>Valor total</th>
        </tr>

        <?php
            if (isset($_GET['limpa']) && $_GET['limpa'] == 1) {
                unset($_SESSION['lista']);
                session_destroy();
                header("Location: index.php");
                exit;
            }

            if (!isset($_SESSION['lista'])) {
                $_SESSION['lista'] = [];
            }

            if (isset($_POST['nome']) && isset($_POST['item']) && isset($_POST['qtd'])) {
                $nome = $_POST['nome'];
                $item = $_POST['item']; 
                $qtd = intval($_POST['qtd']); 

                if ($item == "Xis Bacon") { 
                    $valor = 28; 
                } else if ($item == "Xis Salada") { 
                    $valor = 25; 
                } else if ($item == "Cachorro Quente") { 
                    $valor = 18; 
                } else if ($item == "Hamburguer") { 
                    $valor = 20; 
                } else if ($item == "Baurú") { 
                    $valor = 32; 
                } else if ($item == "Batata Frita") { 
                    $valor = 12; 
                }

                $valor = $valor * $qtd;
                $desconto = 0;

                if ($qtd >= 4) {
                    $desconto = $valor * 0.05;
                    $valor = $valor - $desconto;
                }

                $_SESSION['lista'][] = [
                    "numero" => array_key_last($_SESSION['lista']) + 1,
                    "nome" => $nome,
                    "item" => $item,
                    "qtd" => $qtd,
                    "valor" => number_format($valor, 2, ',', '.'),
                    "desconto" => number_format($desconto, 2, ',', '.')
                ];
            }

            foreach ($_SESSION['lista'] as $conteudo) {
                echo "
                <tr>
                    <td>{$conteudo['numero']}</td>
                    <td>{$conteudo['nome']}</td>
                    <td>{$conteudo['qtd']}</td>
                    <td>{$conteudo['item']}</td>
                    <td>R$ {$conteudo['desconto']}</td>
                    <td>R$ {$conteudo['valor']}</td>
                </tr>";
            }
        ?>
    </table>
    <a href="?limpa=1">Limpar lista</a>
</body>
</html>
