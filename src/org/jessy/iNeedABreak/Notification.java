/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jessy.iNeedABreak;

/**
 *
 * @author jessy
 */
import java.awt.*;
import java.awt.TrayIcon.MessageType;

public class Notification {

    public static void main(String[] args) throws AWTException, java.net.MalformedURLException {
        if (SystemTray.isSupported()) {
            Notification td = new Notification();
            td.displayTray();
        } else {
            System.err.println("System tray not supported!");
        }
    }

    public void displayTray() throws AWTException, java.net.MalformedURLException {
        SystemTray tray = SystemTray.getSystemTray();

        Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));
        
        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
       
     
        trayIcon.setImageAutoSize(true);
        
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);
        trayIcon.displayMessage("Breaktime is over", "back to work!", MessageType.WARNING);
    }
}
