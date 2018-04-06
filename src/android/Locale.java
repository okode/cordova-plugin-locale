package com.okode.cordova.locale;

import android.content.Context;
import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class Locale extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("getCountryCode".equals(action)) {
            executeGetCountryCode(callbackContext);
            return true;
        } else {
            Log.d("Cordova Locale Plugin", "Action not implemeted: " + action + ", Args: " + args);
            return false;
        }
    }

    private void executeGetCountryCode(CallbackContext callbackContext) {
        Context context = this.cordova.getActivity().getApplicationContext();
        String countryCode = context.getResources().getConfiguration().locale.getCountry();
        callbackContext.success(countryCode);
    }

}