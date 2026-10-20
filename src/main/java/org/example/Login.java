package org.example;

import java.util.Scanner;

public class Login {

    private static final String USUARIO_CORRETO = "anderson";
    private static final String SENHA_CORRETA = "1234";

    public static String verificar(String usuario, String senha) {
        if (usuario.trim().equalsIgnoreCase(USUARIO_CORRETO) && senha.equals(SENHA_CORRETA)) {
            return "Acesso permitido";
        } else {
            return "Acesso negado";
        }
    }

    public static void executar(Scanner entrada) {
        System.out.print("Usuário: ");
        String usuario = entrada.next();

        System.out.print("Senha: ");
        String senha = entrada.next();

        System.out.println(verificar(usuario, senha));
    }
}
