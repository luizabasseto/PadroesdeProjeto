/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author luiza
 */

// Simple Factory (não é um padrão GoF oficial, mas facilita criação centralizada de objetos)
public class MessageFactory {
    public static Message createMessage(String type, String content) {
        if ("SIMPLE".equalsIgnoreCase(type)) {
            return new SimpleMessage(content);
        } else if ("URGENT".equalsIgnoreCase(type)) {
            return new UrgentMessage(content);
        }else if ("PROMOTIONAL".equalsIgnoreCase(type)) {
            return new PromotionalMessage(content);
        }
        throw new IllegalArgumentException("Tipo de mensagem desconhecido: " + type);
    }
}