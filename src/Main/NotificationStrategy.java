/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Main;

/**
 *
 * @author luiza
 */

// Interface da estratégia de envio (Strategy Pattern)
public interface NotificationStrategy {
    void send(Message message, String recipient);
}
