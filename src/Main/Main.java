package Main;

import java.util.Scanner;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Message welcomeMessage = MessageFactory.createMessage("SIMPLE", "Bem-vindo(a) ao nosso sistema!");
        Message alertMessage = MessageFactory.createMessage("URGENT", "Falha crítica detectada no servidor XYZ. Ação imediata requerida.");
        Message promoMessage = MessageFactory.createMessage("PROMOTIONAL", "Desconto de 20% nos nossos produtos");

        NotificationService notificationService = new NotificationService();

        System.out.println(ANSI_GREEN + "--- Usando Estratégia de Email ---" + ANSI_RESET);
        notificationService.setStrategy(new EmailNotificationStrategy());
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o tipo de mensagem:");
        System.out.println(ANSI_BLUE + "1 - SIMPLES" + ANSI_RESET);
        System.out.println(ANSI_RED + "2 - URGENTE" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "3 - PROMOÇÃO" + ANSI_RESET);

        String op = scanner.nextLine().trim().toUpperCase();

        switch (op) {
            case "1":
            case "SIMPLES":
                notificationService.sendNotification(welcomeMessage, "aluno@exemplo.com");
                break;
            case "2":
            case "URGENTE":
                notificationService.sendNotification(alertMessage, "admin@exemplo.com ");
                break;
            case "3":
            case "PROMOÇÃO":
                notificationService.sendNotification(promoMessage, "cliente@exemplo.com");
                break;
        }

        System.out.println("\n --- Mudando para Estratégia de SMS --- \n");
        notificationService.setStrategy(new SMSNotificationStrategy());
        notificationService.sendNotification(welcomeMessage, "+5511912345678");
        notificationService.sendNotification(alertMessage, "+5521987654321");
        notificationService.sendNotification(promoMessage, "+5511987654321");

        System.out.println("-------------USANDO FACTORY METHOD --------------- \n\n");

        notificationService = new NotificationService();

        System.out.println(ANSI_GREEN + "--- Usando Estratégia de Email ---" + ANSI_RESET);

        notificationService.setStrategy(new EmailNotificationStrategy());

        MessageCreator creator = null;
        Message message = null;

        while (true) {
            System.out.println("\nDigite o tipo de mensagem:");
            System.out.println(ANSI_BLUE + "1 - SIMPLES" + ANSI_RESET);
            System.out.println(ANSI_RED + "2 - URGENTE" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "3 - PROMOÇÃO" + ANSI_RESET);

            op = scanner.nextLine().trim().toUpperCase();

            switch (op) {
                case "1":
                case "SIMPLES":
                    creator = new SimpleMessageCreator();
                    message = creator.createMessage("Bem-vindo(a) ao nosso sistema!");
                    notificationService.sendNotification(message, "aluno@exemplo.com");
                    break;
                case "2":
                case "URGENTE":
                    creator = new UrgentMessageCreator();
                    message = creator.createMessage("Falha crítica detectada no servidor XYZ. Ação imediata requerida.");
                    notificationService.sendNotification(message, "admin@exemplo.com");
                    break;
                case "3":
                case "PROMOÇÃO":
                    creator = new PromotionalMessageCreator();
                    message = creator.createMessage("Desconto de 20% nos nossos produtos");
                    notificationService.sendNotification(message, "cliente@exemplo.com");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }
            break;
        }

        System.out.println("--- Mudando para Estratégia de SMS --- \n");
        notificationService.setStrategy(new SMSNotificationStrategy());

        notificationService.sendNotification(
                new SimpleMessageCreator().createMessage("Mensagem simples via SMS"),
                "+5511912345678");

        notificationService.sendNotification(
                new UrgentMessageCreator().createMessage("Mensagem urgente via SMS"),
                "+5521987654321");

        notificationService.sendNotification(
                new PromotionalMessageCreator().createMessage("Promoção via SMS"),
                "+5511987654321");

    }

}
