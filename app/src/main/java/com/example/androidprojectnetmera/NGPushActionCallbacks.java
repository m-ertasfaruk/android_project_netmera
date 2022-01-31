package com.example.androidprojectnetmera;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.netmera.NetmeraPushObject;
import com.netmera.callbacks.NMPushActionCallbacks;

public class NGPushActionCallbacks implements NMPushActionCallbacks {

    @Override
    public void onPushRegister(Context context, String gcmSenderId, String pushToken) {
        Log.v("sample", "onPushRegister");
        // Example : PushRegisterIdlingResource.registeredToPush();
        // Example : EventBus.getDefault().postSticky(new GCMRegistrationEvent(pushToken));
    }


    @Override
    public void onPushReceive(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
        Log.v("sample", "onPushReceive");
        //Example : EventBus.getDefault().post(new PushReceivedEvent(netmeraPushObject));
    }

    @Override
    public void onPushOpen(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
        Log.v("sample", "onPushOpen");
    }

    @Override
    public void onPushDismiss(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
        Log.v("sample", "onPushDismiss");
    }

    @Override
    public void onPushButtonClicked(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
        Log.v("sample", "onPushButtonClicked");
    }
}
