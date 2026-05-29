import java.util.Arrays;
import java.util.List;

/**
 * Exercício: Filtro de nomes usando Lambda e Functional Interface
 * 
 * @author Seu Nome
 * @version 1.0
 */
@FunctionalInterface
interface FiltroNome {
    boolean testar(String nome);
}

public class FiltroNomesLambda {

    public static void main(String[] args) {
        
        // 1. Lista de nomes
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos", "Amanda", "Beatriz", "Arthur", "Alice");

        System.out.println("=== Todos os nomes ===");
        nomes.forEach(System.out::println);

        System.out.println("\n=== Nomes que começam com 'A' (usando Lambda + Functional Interface) ===");

        // 2. Instanciando a interface funcional com Lambda
        FiltroNome filtroComA = nome -> nome.startsWith("A");

        // 3. Usando Stream + filter com method reference
        nomes.stream()
             .filter(filtroComA::testar)
             .forEach(System.out::println);
    }
}
