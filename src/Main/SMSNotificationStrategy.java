/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author luiza
 */

// Estratégia Concreta 2 (Strategy Pattern)
public class SMSNotificationStrategy implements NotificationStrategy {

    @Override
    public void send(Message message, String recipient) {
        System.out.println("Enviando SMS para: "+ recipient +" com a mensagem: "+message.getContent()+"\n");
        
    }

}
