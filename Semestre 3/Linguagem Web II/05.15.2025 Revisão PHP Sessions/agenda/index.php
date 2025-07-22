<?php session_start(); ?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agenda</title>
</head>
<style>
    table, tr, th, td {
        border: 1px solid #000000;
        border-collapse: collapse;
        padding: 2px 10px;
    }
</style>
<body>
    <h1>Agendar sala de reunião</h1>
    <form method="POST">
        <label>Nome do responsável:</label>
        <input type="text" name="nome"> <br>
        <label>Data:</label>
        <input type="date" name="dia">
        <label>Horário inicial:</label>
        <input type="time" name="hora"> <br>
        <label>Selecione a sala que deseja reservar:</label>
        <select name="sala">
            <option value="Sala 1">Sala 1</option>
            <option value="Sala 2">Sala 2</option>
            <option value="Sala 3">Sala 3</option>
            <option value="Sala 4">Sala 4</option>
        </select> <br>
        <label>Selecione os equipamentos que precisará:</label> <br>
        <input type="checkbox" name="equipamento[]" value="Projetor 1"> Projetor 1 <br>
        <input type="checkbox" name="equipamento[]" value="Projetor 2"> Projetor 2 <br>
        <input type="checkbox" name="equipamento[]" value="Projetor 3"> Projetor 3 <br>
        <input type="checkbox" name="equipamento[]" value="Caixa de Som 1"> Caixa de Som 1 (com microfone) <br>
        <input type="checkbox" name="equipamento[]" value="Caixa de Som 2"> Caixa de Som 2 (com microfone) <br><br>
        <input type="submit" value="Adicionar">
    </form>
    <br>
    <table>  
        <tr>
            <th>Sala reservada</th>
            <th>Data</th>
            <th>Hora inicial</th>
            <th>Hora final</th>
            <th>Equipamentos</th>
            <th>Responsável</th>
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

            if (isset($_POST['nome']) && isset($_POST['dia']) && isset($_POST['hora']) && isset($_POST['sala'])) {
                $hora_inicio = $_POST['hora'];
                $hora_final = date("H:i", strtotime($hora_inicio . " +2 hours")); 
                $sala = $_POST['sala'];
                $dia = date("d/m/Y", strtotime($_POST['dia']));
            
                $equipamentos = $_POST['equipamento'] ?? [];
            
                foreach ($_SESSION['lista'] ?? [] as $reserva) {
                    if ($reserva['sala'] == $sala && $reserva['dia'] == $dia) {
                        if ($hora_inicio >= $reserva['hora'] && $hora_inicio <= $reserva['hora_final']) {
                            echo "<p style='color: red;'>Erro: Sala já reservada nesse horário!</p>";
                            exit;
                        }
                    }
            
                    if (!empty($equipamentos) && !empty(array_intersect($equipamentos, $reserva['equipamento'])) && $reserva['dia'] == $dia) {
                        if ($hora_inicio >= $reserva['hora'] && $hora_inicio <= $reserva['hora_final']) {
                            echo "<p style='color: red;'>Erro: Equipamento(s) já reservados nesse horário!</p>";
                            exit;
                        }
                    }
                }
            
                $_SESSION['lista'][] = [
                    "nome" => $_POST['nome'],
                    "dia" => $dia,
                    "hora" => $hora_inicio,
                    "hora_final" => $hora_final,
                    "sala" => $sala,
                    "equipamento" => $equipamentos
                ];
            }
            
            if (!empty($_SESSION['lista'])) {
                foreach ($_SESSION['lista'] as $key => $conteudo) {
                    $equipamentosStr = !empty($conteudo['equipamento']) ? implode(", ", $conteudo['equipamento']) : "Nenhum equipamento selecionado";
            
                    echo "
                    <tr> 
                        <td>{$conteudo['sala']}</td>
                        <td>{$conteudo['dia']}</td>
                        <td>{$conteudo['hora']}</td>
                        <td>{$conteudo['hora_final']}</td>
                        <td>{$equipamentosStr}</td>
                        <td>{$conteudo['nome']}</td>
                        <td><a href='?excluir={$key}'>Excluir</a></td>
                    </tr>";
                }
            }            
        ?>
    </table>

    <a href="?limpa=1">Limpar lista</a>
</body>
</html>
