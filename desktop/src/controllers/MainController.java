package controllers;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.Properties;
import models.Restapi;
import views.MainConsole;

public class MainController {
    MainConsole mainConsole;
    public MainController() {
        this.mainConsole = new MainConsole();
        this.showPropetie();
    }

    private void showPropetie()
    {
        Restapi restapi = new Restapi();
        String res = restapi.getProperties();
        ArrayList<Properties> propetieList = convertStringToArray(res);
        this.mainConsole.printPropeties(propetieList);
    }

    private ArrayList<Properties> convertStringToArray(String text)
    {
        ArrayList<Properties> propetieList = null;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Properties[] propetieArray = gson.fromJson(text, Properties[].class);
        propetieList = new ArrayList<>(Arrays.asList(propetieArray));
        return propetieList;
    }
    
}
