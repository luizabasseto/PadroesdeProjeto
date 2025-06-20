/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author luiza
 */

// Contexto no Strategy Pattern - controla a estratégia atual e delega o envio
public class NotificationService {
    private NotificationStrategy strategy;

    public NotificationService() {}

    public NotificationService(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    
    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

      // Cliente que usa a estratégia para enviar a mensagem
    public void sendNotification(Message message, String recipient) {
        if (strategy == null) {
            System.out.println("Erro: Nenhuma estratégia de notificação foi definida.\n");
            return;
        }
        if (message == null) {
            System.out.println("Erro: Mensagem não pode ser nula.\n");
            return;
        }
        strategy.send(message, recipient);
    }
}