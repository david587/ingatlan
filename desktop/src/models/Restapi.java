/*
* File: Restapi.java
* Author: Baráth Dávid
* Copyright: 2023, Baráth Dávid
* Group: Szoft 2 N
* Date: 2023-02-19
* Github: https://github.com/david587/
* Licenc: GNU GPL
*/
package models;

public class Restapi {

    public Restapi() {
    }
    
    public String getProperties()
    {
        HttpClient http = new HttpClient();
        String host = "http://localhost:3000/";
        String endpoint = "properties";
        String urlStr = host + endpoint;
        String res = http.get(urlStr);
        return res;
    }
}
