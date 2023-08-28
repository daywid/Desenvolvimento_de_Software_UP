package Solid_aula4;

public class App {
	private MessageService messageService;

    public App(MessageService messageService) {
        this.messageService = messageService;
    }

    public void displayMessage() {
        String message = messageService.getMessage();
        System.out.println(message);
    }
}
