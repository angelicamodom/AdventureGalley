package com.company.Executables;

import com.company.Interactions.Executable;
import com.company.Interactions.Item;

/**
 * Created by andy on 3/30/18.
 */
public class Reverse implements Executable {
    @Override
    public String execute(Item i) {
        String name = i.getName();
        String result = "";
        for(int j=name.length()-1; j>=0; j--) {
            result += name.charAt(j);
        }
        return result;
    }
}
