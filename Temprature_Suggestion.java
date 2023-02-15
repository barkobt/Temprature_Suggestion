import java.util.Scanner;

/*
Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
 */
public class Temprature_Suggestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz:");
        double heat = input.nextDouble();
        if (heat < 5) {
            System.out.println("Hava kayak yapmak için çok uygun.");
        } else if (heat < 25) {
            if (heat <= 15) {
                System.out.println("Bu havada sinemaya gitmek mantıklı olacaktır.");
            }
            if (heat >= 10) {
                System.out.println("Piknik yapmak için harika bir gün.");

            }


        } else {

            System.out.println("Bu havada denize gidip serinlemek dışında bir şey hastanelik olmana sebep olabilir.");

        }
    }
}
