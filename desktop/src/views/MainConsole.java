package views;

import java.util.ArrayList;

import models.Properties;


public class MainConsole {
    public void printPropeties(ArrayList<Properties> pros)
    {
        for(Properties pro : pros){
            System.out.printf(
            "|%15s |%15s |%15s | %8.0f |\n",
            pro.getCity(),
            pro.getAddress(),
            pro.getSize(),
            pro.getAddress()
            );
        }
    }
}
