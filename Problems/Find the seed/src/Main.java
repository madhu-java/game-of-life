import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int a =  scanner.nextInt();
        int b =  scanner.nextInt();
        int n =  scanner.nextInt();
        int k =  scanner.nextInt();
        Random random = new Random();
        int seedArrayLength ;
        if(a==0) {
            seedArrayLength = (b - a + 1);
        }else {
            seedArrayLength =(b-a+1)+a;
        }
        int[] seedArray = new int[seedArrayLength];
        int array[] =new int[n];
        int maxIntInEachSeedArray =0;
        int minNumber = k;
        int [][] seedmaxIntArray = new int [seedArrayLength][2];
        //Random randomintArrayForEachSeed = new Random();
        for(int i=a;i<seedArrayLength;i++){
            maxIntInEachSeedArray=0;
         seedArray[i] = i;//random.nextInt(b-a+1)+a;
            //System.out.println(seedArray[i]);
            Random r = new Random(seedArray[i]);
          for(int j=0;j<n;j++){
              array[j] = r.nextInt(k);
              //System.out.println(array[j]);
              maxIntInEachSeedArray =Math.max(maxIntInEachSeedArray,array[j]);
              //System.out.println("max: "+maxIntInEachSeedArray);
              
          }
          seedmaxIntArray[i][0]=seedArray[i];
          seedmaxIntArray[i][1]= maxIntInEachSeedArray;
          minNumber = Math.min(minNumber,maxIntInEachSeedArray);
          //System.out.println("min: "+minNumber);
         
        }
        int count=0;
        int minMaxSeed=b+1;
        for(int i=0;i<seedArrayLength;i++){
            if(seedmaxIntArray[i][1]==minNumber){
                count++;
                minMaxSeed =Math.min(minMaxSeed,seedmaxIntArray[i][0]);

            }

        }
        System.out.println(minMaxSeed);
        System.out.println(minNumber);
}
}
