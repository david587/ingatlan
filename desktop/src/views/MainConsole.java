/*
* File: MainConsole.java
* Author: Baráth Dávid
* Copyright: 2023, Baráth Dávid
* Group: Szoft 2 N
* Date: 2023-02-19
* Github: https://github.com/david587/
* Licenc: GNU GPL
*/
package views;

import java.util.ArrayList;

import models.Properties;


public class MainConsole {
    public void printPropeties(ArrayList<Properties> pros)
    {
        for(Properties pro : pros){
            System.out.printf(
            "|%17s |%17s |%17s | %8.0f |\n",
            pro.getCity(),
            pro.getAddress(),
            pro.getSize(),
            pro.getPrice()
            );
        }
    }
}
