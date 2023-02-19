/*
* File: App.java
* Author: Baráth Dávid
* Copyright: 2023, Baráth Dávid
* Group: Szoft 2 N
* Date: 2023-02-19
* Github: https://github.com/david587/
* Licenc: GNU GPL
*/
import controllers.MainController;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingatlanok megjelenitése");
        new MainController();
    }
}
