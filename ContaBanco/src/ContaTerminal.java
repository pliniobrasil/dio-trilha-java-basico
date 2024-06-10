import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        ContaTerminal terminalAccount = new ContaTerminal();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        NumberFormat formatter = DecimalFormat.getNumberInstance();        
        double balance = terminalAccount.generateBalance();

        formatter.setMaximumFractionDigits(2);    
        formatter.setRoundingMode(RoundingMode.DOWN);
        
        System.out.println("Olá, seja bem vindo ao Banco Terminal Java, digite o seu nome para iniciarmos!");
        String clientName = scanner.next();

        System.out.println("Agora digite o número da sua agência! Ex.: 223-4");
        String agency = scanner.next();
        
        System.out.println("Por fim, o número da sua conta!");
        int account = scanner.nextInt();

        System.out.println(
            "Olá "
            .concat(clientName)
            +", obrigado por criar uma conta em nosso banco, sua agência é "
            .concat(agency)
            +", conta "
            +account
            +" e seu saldo R$"
            +formatter.format(balance)
            +" já está disponível para saque!"
        );

        scanner.close();
    }

    public double generateBalance() {                
        Calendar calendar = generateCalendar();
        double balance = Math.random() * (calendar.get(Calendar.YEAR) * calendar.get(Calendar.SECOND));
       
        return balance;
    } 

    public Calendar generateCalendar() {
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        return calendar;
    }
}