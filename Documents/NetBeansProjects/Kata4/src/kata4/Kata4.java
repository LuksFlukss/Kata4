
package kata4;

import java.util.List;


public class Kata4 {


    public static void main(String[] args) {
        
        String nameFile = new String("email.txt");
        List<Mail> mailList = MailHistogramReader.read(nameFile);
    }
    
}