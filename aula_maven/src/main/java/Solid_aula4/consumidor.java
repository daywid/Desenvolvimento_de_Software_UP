package Solid_aula4;

public class consumidor {

	public static void main(String[] args) {
		MessageService emailService = new EmailService();
        App appWithEmailService = new App(emailService);
        appWithEmailService.displayMessage();

        MessageService smsService = new SMSService();
        App appWithSMSService = new App(smsService);
        appWithSMSService.displayMessage();

	}

}
