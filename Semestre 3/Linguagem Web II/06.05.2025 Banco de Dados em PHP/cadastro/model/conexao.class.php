<?php

    class Conexao {
        public static $instance;

        public static function getInstance() {
            try {
                self::$instance = new PDO('mysql:host=localhost;dbname=cadastro31ti','root','');
                self::$instance->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
                return self::$instance;
            } catch(Exception $e) {
                echo "Erro ao conectar o Banco de Dados: ".$e->getMessage();
            }
        }
    }

?>