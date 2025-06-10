package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Message welcomeMessage = MessageFactory.createMessage("SIMPLE", "Bem-vindo(a) ao nosso sistema!");
        Message alertMessage = MessageFactory.createMessage("URGENT", "Falha crítica detectada no servidor XYZ. Ação imediata requerida.");
        Message promoMessage = MessageFactory.createMessage("PROMOTIONAL", "Desconto de 20% nos nossos produtos");

        NotificationService notificationService = new NotificationService();

        System.out.println("--- Usando Estratégia de Email ---");
        notificationService.setStrategy(new EmailNotificationStrategy());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de mensagem:\n"
                + "1- SIMPLES\n"
                + "2- URGENTE \n"
                + "3- PROMOÇÃO \n");
        String op = scanner.next();
        switch (op) {
            case "SIMPLES":
                notificationService.sendNotification(welcomeMessage, "aluno@exemplo.com");
                break;
            case "URGENTE":
                notificationService.sendNotification(alertMessage, "admin@exemplo.com");
                break;
            case "PROMOÇÃO":
                notificationService.sendNotification(promoMessage, "cliente@exemplo.com");
                break;
        }

        System.out.println("--- Mudando para Estratégia de SMS ---");
        notificationService.setStrategy(new SMSNotificationStrategy());
        notificationService.sendNotification(welcomeMessage, "+5511912345678");
        notificationService.sendNotification(alertMessage, "+5521987654321");
        notificationService.sendNotification(promoMessage, "+5511987654321");

    }
}
