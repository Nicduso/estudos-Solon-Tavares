<?php

    class CadastroDAO {

        public function inserir($cadastro) {
            try {
                $sql = "INSERT INTO cadastro(nome, nasc) VALUES(:nome,:nasc)";
                $p_sql = Conexao::getInstance()->prepare($sql);
                $p_sql->bindValue(':nome', $cadastro->getNome());
                $p_sql->bindValue(':nasc', $cadastro->getNasc());

                return $p_sql->execute();
            } catch(Exception $e) {
                echo "Erro ao cadastrar: ".$e->getMessage();
            }
        }

        public function buscaNome($nome) {
            try {
                $sql = "SELECT * FROM cadastro WHERE nome LIKE :nome";
                $p_sql = Conexao::getInstance()-> prepare($sql);
                $p_sql->bindValue(":nome", "%{$nome}%");
                $p_sql->execute();
                $lista = $p_sql->fetchAll(PDO::FETCH_ASSOC);

                return $lista;
            } catch(Exception $e) {
                echo "Erro ao consultar Cadastro".$e->getMessage(); 
            }

        }

        public function excluir($cod) {
            try {
                $sql = "DELETE FROM cadastro WHERE cod = :cod";
                $p_sql = Conexao::getInstance()-> prepare($sql);
                $p_sql->bindValue(":cod", $cod);

                return $p_sql->execute();
            } catch(Exception $e) {
                echo "Não foi possível excluir.".$e->getMessage(); 
            }
        }

        public function alterar($cod, Cadastro $cadastro) { 
            try {
                $sql = "UPDATE cadastro SET nome = :nome, nasc = :nasc WHERE cod = :cod";
                $p_sql = Conexao::getInstance()->prepare($sql);
                
                $p_sql->bindValue(":cod", $cod);
                $p_sql->bindValue(':nome', $cadastro->getNome());
                $p_sql->bindValue(':nasc', $cadastro->getNasc());
        
                return $p_sql->execute();
            } catch (Exception $e) {
                echo "Erro ao alterar cadastro: " . $e->getMessage();
            }
        }
        
    }

?>