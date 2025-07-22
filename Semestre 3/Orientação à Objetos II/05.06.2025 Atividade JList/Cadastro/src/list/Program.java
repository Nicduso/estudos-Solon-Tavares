package list;

import javax.swing.DefaultListModel;
import java.util.ArrayList;

public class Program extends javax.swing.JFrame {
    
    DefaultListModel model = new DefaultListModel();
    ArrayList<Pessoa> list = new ArrayList<>();

    public Program() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbFone = new javax.swing.JLabel();
        txtFone = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        scrlLista = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        scrlLista.setViewportView(jList);
        
        lbNome.setText("NOME:");

        lbCPF.setText("CPF:");

        lbFone.setText("TELEFONE:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbTitle.setText("Lista dos Cadastrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFone)
                            .addComponent(lbCPF)
                            .addComponent(lbNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCPF)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(txtFone)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrlLista))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFone)
                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnBuscar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addGap(18, 18, 18)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrlLista, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String nomeBuscado = txtNome.getText();

        DefaultListModel<String> filtroModel = new DefaultListModel<>();

        for (int i = 0; i < model.getSize(); i++) {
            String item = model.getElementAt(i).toString();

            if (item.startsWith(nomeBuscado)) {
                filtroModel.addElement(item);
            }
        }

        if (filtroModel.getSize() > 0) {
            jList.setModel(filtroModel); 
        } else {
            jList.setModel(model); 
        }
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        if (txtNome.getText().trim().isEmpty() || txtFone.getText().trim().isEmpty() || txtCPF.getText().trim().isEmpty()) {

        } else {

        Pessoa p = new Pessoa();
        p.setNome(txtNome.getText());
        p.setFone(txtFone.getText());
        p.setCpf(txtCPF.getText());

        list.add(p);

        model.addElement(p.getNome() + " - " + p.getFone() + " - " + p.getCpf()); 

        jList.setModel(model);
        
        }
        
    }

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {                                                                                 
        int index = jList.getSelectedIndex();

        if (index >= 0) {
            Pessoa p = list.get(index);
            p.setNome(txtNome.getText());
            p.setFone(txtFone.getText());
            p.setCpf(txtCPF.getText());

            String novoTexto = p.getNome() + " - " + p.getFone() + " - " + p.getCpf();
            model.set(index, novoTexto);
        }

    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int index = jList.getSelectedIndex();
        if (index >= 0) {
            model.remove(jList.getSelectedIndex());
            jList.setModel(model);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbFone;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JScrollPane scrlLista;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtNome;
    private javax.swing.JList<String> jList;
}
