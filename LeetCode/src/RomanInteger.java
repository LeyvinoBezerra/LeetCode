import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class RomanInteger {public class InteiroParaRomano {
    public static String intParaRomano(int num) {
        // Define os valores e símbolos dos algarismos romanos
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romano = new StringBuilder();

        // Itera sobre os valores e símbolos
        for (int i = 0; i < valores.length; i++) {
            while (num >= valores[i]) {
                romano.append(simbolos[i]);
                num -= valores[i];
            }
        }

        return romano.toString();
        }
    }
    public static void main (String[] args) {
    // Testando com exemplos fornecidos
        System.out.println(RomanInteger.InteiroParaRomano.intParaRomano(2));    // Saída: II
        System.out.println(RomanInteger.InteiroParaRomano.intParaRomano(12));   // Saída: XII
        System.out.println(RomanInteger.InteiroParaRomano.intParaRomano(27));   // Saída: XXVII

    // Testes adicionais
        System.out.println(RomanInteger.InteiroParaRomano.intParaRomano(4));    // Saída: IV
        System.out.println(RomanInteger.InteiroParaRomano.intParaRomano(9));    // Saída: IX
        System.out.println(RomanInteger.InteiroParaRomano.intParaRomano(58));   // Saída: LVIII
        System.out.println(RomanInteger.InteiroParaRomano.intParaRomano(1994)); // Saída: MCMXCIV
}
}


