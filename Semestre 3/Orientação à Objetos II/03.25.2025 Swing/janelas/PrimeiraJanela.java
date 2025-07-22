package window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PrimeiraJanela extends JFrame {

    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir;

	public PrimeiraJanela() {

        super("Exemplo soma.");

        //AWT:
        Container tela = getContentPane();
        tela.setBackground(new Color(190, 182, 220));

        //Swing:

        setLayout(null);
        rotulo1 = new JLabel("Número 1: ");
        rotulo2 = new JLabel("Número 2: ");
        exibir = new JLabel("");
        texto1 = new JTextField(5); // texto1 = new JTextField(quantos caracteres dentro do campo);
        texto2 = new JTextField(5);
        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        multiplicar = new JButton("Multiplicar");
        dividir = new JButton ("Dividir");

        rotulo1.setBounds(50, 20, 100, 20); //rotulo1.setBounds(coluna, linha, largura, altura); tudo em pixels.
        rotulo2.setBounds(50, 60, 100, 20);
        exibir.setBounds(50,120,300,20);
        exibir.setVisible(false);
        texto1.setBounds(140, 20, 100, 20);
        texto2.setBounds(140,60,100,20);
        somar.setBounds(40, 100, 80, 20);
        subtrair.setBounds(120, 100, 80, 20);
        multiplicar.setBounds(200, 100, 80, 20);
        dividir.setBounds(280, 100, 80, 20);

        somar.addActionListener(
            new ActionListener() { //importação do awt.event necessária
                public void actionPerformed(ActionEvent e) {
                    float n1, n2, soma = 0;
                    n1 = Float.parseFloat(texto1.getText());
                    n2 = Float.parseFloat(texto2.getText());
                    soma = n1 + n2;
                    exibir.setVisible(true);
                    exibir.setText("A soma é "+soma);
                }
            }
        );

        subtrair.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    float n1, n2, menos = 0;
                    n1 = Float.parseFloat(texto1.getText());
                    n2 = Float.parseFloat(texto2.getText());
                    menos = n1 - n2;
                    exibir.setVisible(true);
                    exibir.setText("A subtração é "+menos);
                }
            }
        );

        multiplicar.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    float n1, n2, mult = 0;
                    n1 = Float.parseFloat(texto1.getText());
                    n2 = Float.parseFloat(texto2.getText());
                    mult = n1 * n2;
                    exibir.setVisible(true);
                    exibir.setText("A multiplicação é "+mult);
                }
            }
        );

        dividir.addActionListener(
            new ActionListener() { //importação do awt.event necessária
                public void actionPerformed(ActionEvent e) {
                    float n1, n2, divd = 0;
                    n1 = Float.parseFloat(texto1.getText());
                    n2 = Float.parseFloat(texto2.getText());
                    divd = n1 / n2;
                    exibir.setVisible(true);
                    exibir.setText("A divisão é "+divd);
                }
            }
        );

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(exibir);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);

		setSize(400, 250);  //Necessário vir depois de localizar as labels.
		setVisible(true);
        //setExtendedState(MAXIMIZED_BOTH); //iniciar programa com a janela maximizada.
        //setResizable(false); //impede que seja maximizada.
        setLocationRelativeTo(null); //abre inicialmente no centro da tela.
	}

}
