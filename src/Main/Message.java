/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author luiza
 */
abstract class Message {
    protected String content;

    public Message(String content) {
        this.content = content;
    }

    public abstract String format(); // Método para formatar a mensagem específica

    public String getContent() {
        return content;
    }
}
