package aula01;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ImportaData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ImportaData objImportaData = new ImportaData();
        objImportaData.imprimeData();
        System.out.println("O maior  e:" + objImportaData.imprimeMaiorNumero(5, 10));

    }

    public void imprimeData() {

        Date objDate = new Date();
        System.out.println("A data atual e:" + objDate.getTime());

    }

    public int imprimeMaiorNumero(int n1, int n2) {

        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }

    }

}
