package introducaoClasses.domain.teste;

import introducaoClasses.domain.User;

public class UserTeste {
    public static void main(String[] args) {
        User userA = new User();
        userA.firstName = "Vanessa";
        userA.lastName = "Pinheiro";
        String fullName = userA.getFullName();
        userA.criarConta();
        userA.somaDoisNumeros(32,21);
        int result = userA.divideDoisNum(20,0);
        System.out.println("Seguindo: " + result);
        System.out.println(fullName);

        User userB = new User();
        userB.firstName = "José";
        userB.lastName = "Souza";

    }
}
