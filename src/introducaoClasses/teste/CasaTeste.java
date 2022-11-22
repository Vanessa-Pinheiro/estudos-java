package introducaoClasses.domain.teste;

import introducaoClasses.domain.Casa;

public class CasaTeste {
    public static void main(String[] args) {
        Casa casaUm = new Casa();
        casaUm.localidade = "Casa de praia";
        casaUm.quartos = 3;

        Casa casaDois = new Casa();
        casaDois.localidade = "Ap Papicu";
        casaDois.quartos = 2;

        System.out.println(casaDois.localidade);
    }
}
