package Oplossing;

/**
 * Klassennamen beginnen altijd met een hoofdletter.
 * Lees een keer Clean Code van Robert Martin of kijk een van zijn talks op youtube!
 * Grappige gast maar hij legt ook heel begrijpelijk uit waarom deze kleine regeltjes bestaan.
 * Het zal je zeker motiveren om meer aandacht aan detail te geven.
 */
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
