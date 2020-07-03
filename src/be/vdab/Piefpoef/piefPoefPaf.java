package Oplossing;

public class piefPoefPaf {
    public static void main(String[] args) {
    int countNumbers = 0;

    while (countNumbers < 11) {
        int numberOutcome = (int)(Math.random() * 100);
        System.out.println(numberOutcome + "/n");
        countNumbers++;
        
        if (numberOutcome < 250)
        System.out.println("PIEF");
        if(numberOutcome < 500)
        System.out.println("POEF" + "/n");
        else {
            System.out.println("PAF" + "/n");
            }
        }
    }
}
