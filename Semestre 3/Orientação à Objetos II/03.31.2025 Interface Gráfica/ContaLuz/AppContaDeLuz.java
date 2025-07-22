import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class ContaDeLuz {
    private String nome;
    private String numeroConta;
    private double consumo;

    public ContaDeLuz(String nome, String numeroConta, double consumo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.consumo = consumo;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getConsumo() {
        return consumo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nConta: " + numeroConta + "\nConsumo: " + consumo + " KW\n";
    }
}

public class AppContaDeLuz extends JFrame {
    private JTextField campoNome;
    private JTextField campoNumeroConta;
    private JTextField campoConsumo;
    private JTextArea areaExibicao;

    private ArrayList<ContaDeLuz> contas = new ArrayList<>();

    public AppContaDeLuz() {
        setTitle("Cadastro de Contas de Luz");
        setSize(400, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel labelNome = new JLabel("Nome:");
        labelNome.setPreferredSize(new Dimension(110, 20));
        add(labelNome);
        campoNome = new JTextField(20);
        add(campoNome);

        JLabel labelConta = new JLabel("Número da Conta:");
        labelConta.setPreferredSize(new Dimension(110, 20));
        add(labelConta);
        campoNumeroConta = new JTextField(20);
        add(campoNumeroConta);

        JLabel labelConsumo = new JLabel("Consumo (KW):");
        labelConsumo.setPreferredSize(new Dimension(110, 20));
        add(labelConsumo);
        campoConsumo = new JTextField(20);
        add(campoConsumo);

        JButton botaoAdicionar = new JButton("Adicionar Conta");
        add(botaoAdicionar);

        JButton botaoMaior = new JButton("Mostrar Maior Consumo");
        add(botaoMaior);

        JButton botaoMenor = new JButton("Mostrar Menor Consumo");
        add(botaoMenor);

        areaExibicao = new JTextArea(10, 30);
        areaExibicao.setEditable(false);
        add(new JScrollPane(areaExibicao));

        // Eventos
        botaoAdicionar.addActionListener(e -> adicionarConta());
        botaoMaior.addActionListener(e -> mostrarMaiorConsumo());
        botaoMenor.addActionListener(e -> mostrarMenorConsumo());
    }

    private void adicionarConta() {
        String nome = campoNome.getText().trim();
        String numero = campoNumeroConta.getText().trim();
        String consumoTexto = campoConsumo.getText().trim();

        if (nome.isEmpty() || numero.isEmpty() || consumoTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return;
        }

        try {
            double consumo = Double.parseDouble(consumoTexto);
            ContaDeLuz conta = new ContaDeLuz(nome, numero, consumo);
            contas.add(conta);

            areaExibicao.setText("Conta adicionada com sucesso!\n\n" + conta);
            campoNome.setText("");
            campoNumeroConta.setText("");
            campoConsumo.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Consumo deve ser um número válido.");
        }
    }

    private void mostrarMaiorConsumo() {
        if (contas.isEmpty()) {
            areaExibicao.setText("Nenhuma conta cadastrada.");
            return;
        }

        ContaDeLuz maior = contas.get(0);
        for (ContaDeLuz c : contas) {
            if (c.getConsumo() > maior.getConsumo()) {
                maior = c;
            }
        }

        areaExibicao.setText(">>> MAIOR CONSUMO <<<\n" + maior);
    }

    private void mostrarMenorConsumo() {
        if (contas.isEmpty()) {
            areaExibicao.setText("Nenhuma conta cadastrada.");
            return;
        }

        ContaDeLuz menor = contas.get(0);
        for (ContaDeLuz c : contas) {
            if (c.getConsumo() < menor.getConsumo()) {
                menor = c;
            }
        }

        areaExibicao.setText(">>> MENOR CONSUMO <<<\n" + menor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppContaDeLuz().setVisible(true));
    }
}
