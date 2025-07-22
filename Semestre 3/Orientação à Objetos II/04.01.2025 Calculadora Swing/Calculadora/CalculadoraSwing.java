import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraSwing extends JFrame {
    private JTextField campoDisplay;
    private double primeiroNumero = 0;
    private String operacao = "";

    public CalculadoraSwing() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        campoDisplay = new JTextField();
        campoDisplay.setFont(new Font("Arial", Font.PLAIN, 24));
        campoDisplay.setHorizontalAlignment(JTextField.RIGHT);
        campoDisplay.setEditable(false);
        add(campoDisplay, BorderLayout.NORTH);

        // Painel dos botões
        JPanel painelBotoes = new JPanel(new GridLayout(4, 4, 10, 10));
        String[] botoes = {
            "1", "2", "3", "+",
            "4", "5", "6", "-",
            "7", "8", "9", "/",
            "C", "0", "=", "*"
        };

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.setFont(new Font("Arial", Font.BOLD, 20));
            painelBotoes.add(botao);

            botao.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String textoBotao = botao.getText();

                    if (textoBotao.matches("[0-9]")) {
                        campoDisplay.setText(campoDisplay.getText() + textoBotao);
                    } else if (textoBotao.matches("[+\\-*/]")) {
                        operacao = textoBotao;
                        try {
                            primeiroNumero = Double.parseDouble(campoDisplay.getText());
                        } catch (NumberFormatException ex) {
                            primeiroNumero = 0;
                        }
                        campoDisplay.setText("");
                    } else if (textoBotao.equals("=")) {
                        try {
                            double segundoNumero = Double.parseDouble(campoDisplay.getText());
                            double resultado = calcular(primeiroNumero, segundoNumero, operacao);
                            campoDisplay.setText(String.valueOf(resultado));
                        } catch (NumberFormatException ex) {
                            campoDisplay.setText("Erro");
                        }
                    } else if (textoBotao.equals("C")) {
                        campoDisplay.setText("");
                        primeiroNumero = 0;
                        operacao = "";
                    }
                }
            });
        }

        add(painelBotoes, BorderLayout.CENTER);
    }

    private double calcular(double a, double b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> b != 0 ? a / b : 0;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraSwing().setVisible(true));
    }
}
