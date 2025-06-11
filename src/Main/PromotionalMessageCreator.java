/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author luiza
 */
public class PromotionalMessageCreator implements MessageCreator{
     @Override
    public Message createMessage(String content) {
        return new PromotionalMessage(content);
    }
    
}
