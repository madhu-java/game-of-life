package life;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int seed = scanner.nextInt();
        Random random = new Random(seed);
        
        char[][] startOfUniverseArray = new char[n][n];
        for(int i=0;i<n; i++){
            for(int j=0;j<n;j++){
                startOfUniverseArray[i][j]= (random.nextBoolean()?'O':' ');
            }
        }
        for(int i=0;i<n; i++){
            for(int j=0;j<n;j++){
                System.out.print(startOfUniverseArray[i][j]);
            }
            System.out.println();
        }
    }
}
