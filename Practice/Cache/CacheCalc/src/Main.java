import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter RAM capacity (in GB): ");
            double ramCapacity = sc.nextDouble();

            System.out.print("Enter Data Bus Width (in bits): ");
            double dataBusWidth = sc.nextDouble();

            System.out.print("Enter Words in Line: ");
            double wordsInLine = sc.nextDouble();

            System.out.print("Enter Cache Divider: ");
            double cacheDivider = sc.nextDouble();

            System.out.print("Enter k for set-associative cache: ");
            double k = sc.nextDouble();
            System.out.println("******************************************************");

            //Step1
            double cacheMemSize = ramCapacity * Math.pow(2,30) / cacheDivider;
            System.out.println("Cache Memory Size in (Mb): " + (int)(cacheMemSize/Math.pow(2,20)));

            //Step2
            double addressBusWidth = Math.log(ramCapacity * Math.pow(2,30)) / Math.log(2);
            System.out.println("Address Bus Width (in bits): " + (int)addressBusWidth);

            //Step3
            double offSet = Math.log(wordsInLine) / Math.log(2);
            System.out.println("OFFSET (in bits): " + (int)offSet);

            //Step4
            double cacheLineSize = (wordsInLine * dataBusWidth) / 8;
            System.out.println("Cache Line Size (in bytes): " + (int)cacheLineSize);

            //Step4.1
            double setK1 = Math.log(cacheMemSize / cacheLineSize) / Math.log(2);
            System.out.println("SET k=1: " + (int)setK1);

            //Step4.2
            double setK4 = setK1 - Math.log(k)/Math.log(2);
            System.out.println("SET K=4: " + (int)setK4);

            //Step5
            double tagK1 = addressBusWidth - offSet - setK1;
            System.out.println("TAG k=1: " + (int)tagK1);

            double tagK4 = addressBusWidth - offSet - setK4;
            System.out.println("TAG k=4: " + (int)tagK4);

            double tagK = addressBusWidth - offSet - 0;
            System.out.println("TAG k: " + (int)tagK);

            System.out.println("******************************************************");


            System.out.println("------------------------------------------------------------------");
            System.out.println("| k=1               | k=4                 | k=num of cache lines |");
            System.out.println("| (direct-mapped)   | (k-way associative) | (fully associative)  |");
            System.out.println("|-------------------|---------------------|----------------------|");
            System.out.println("| TAG | SET | OFFSET| TAG | SET | OFFSET  | TAG | SET | OFFSET   |");
            System.out.println("|-------------------|---------------------|----------------------|");
            System.out.println("|  " + (int)tagK1 + "  |  " + (int)setK1 + " |   " + (int)offSet + "   | " +
                    (int)tagK4 + "  |  " + (int)setK4 + " |    " + (int)offSet + "    | " + (int)tagK +
                    "  |  0 " + " |    " + (int)offSet + "     |");
            System.out.println("------------------------------------------------------------------");
        }
    }
}
