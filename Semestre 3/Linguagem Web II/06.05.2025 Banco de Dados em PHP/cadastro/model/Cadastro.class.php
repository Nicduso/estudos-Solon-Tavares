<?php

    class Cadastro {
        private $cod;
        private $nome;
        private $nasc;

        public function setCod($cod) {
            $this->cod = $cod;
        }

        public function getCod() {
            return $this->cod;
        }

        public function setNome($nome) {
            $this->nome = $nome;
        }

        public function getNome() {
            return $this->nome;
        }

        public function setNasc($nasc) {
            $this->nasc = $nasc;
        }

        public function getNasc() {
            return $this->nasc;
        }

    }

?>