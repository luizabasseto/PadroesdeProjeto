/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author luiza
 */
public class PromotionalMessage extends Message {

    public PromotionalMessage(String content) {
        super(content);
    }

    @Override
    public String format() {
        return "[Promoção] -> " + content.toUpperCase();

    }

}
