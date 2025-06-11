/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author luiza
 */

// Estratégia Concreta 1 (Strategy Pattern)
class EmailNotificationStrategy implements NotificationStrategy {
    

    @Override
    public void send(Message message, String recipient) {
        System.out.println("Enviando email para: "+ recipient +" com a mensagem: "+message.getContent()+"\n");
        
    }
    
}