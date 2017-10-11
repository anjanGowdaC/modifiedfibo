package com.rytangle.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("start")) {

            String name = data.getString(0);
            String message = "started, " + name;
            callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }
}
