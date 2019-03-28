package br.iesb.projeto;

import br.iesb.projeto.apresentacao.JFramePrincipal;
import java.awt.EventQueue;
import java.awt.Frame;

public class Principal {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFramePrincipal jFramePrincipal = new JFramePrincipal();
                jFramePrincipal.setVisible(true);
                jFramePrincipal.setExtendedState(Frame.MAXIMIZED_BOTH);
            }
        });
    }
}
