<?php

    class CadastroDAO {

        public function inserir($cadastro) {
            try {
                $sql = "INSERT INTO cadastro(nome, nasc) VALUES(:nome,:nasc)";
                $p_sql = Conexao::getInstance()->prepare($sql);
                $p_sql->bindValue(':nome',$cadastro->getNome());
                $p_sql->bindValue(':nasc',$cadastro->getNasc());

                return $p_sql->execute();
            } catch(Exception $e) {
                echo "Erro ao cadastrar: ".$e->getMessage();
            }
        }
    }

?>