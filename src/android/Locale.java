package com.okode.cordova.locale;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class Locale extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Log.d("Cordova Locale Plugin", "TODO: Not implemented. Action: " + action + ", Args: " + args);
    }

}