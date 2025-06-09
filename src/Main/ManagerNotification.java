/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.ArrayList;
import java.util.List;
import javax.management.Notification;

/**
 *
 * @author luiza
 */
public class ManagerNotification {
    private List<Notification> chanels = new ArrayList<>();

    public void createChanel(Notification chanel) {
        chanels.add(chanel);
    }

    public void notificationEverybody(String content) {
        for (Notification chanel : chanels) {
            chanel.sendMessage(content);
        }
    }
}
