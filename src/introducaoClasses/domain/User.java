package introducaoClasses.domain;

public class User {
    private boolean isLogged;
    public String firstName;
    public String lastName;

    public String fullName;

    // Métodos
    public void criarConta(){
        System.out.println("Nome de usuário disponível!");
    }
    // Métodos com parametros
    public void somaDoisNumeros(int num, int num1){
        System.out.println("Seguidores: " + num * num1);
    }

    // Métodos com return
    public int divideDoisNum(int num0, int num2){
        if (num2 == 0){
            return 0;
        }
        return num0 / num2;
    }


    public String getFullName (){
        return firstName + " " + lastName;
    }

    public void setLogged (boolean logged){
        isLogged = logged;
    }
}
