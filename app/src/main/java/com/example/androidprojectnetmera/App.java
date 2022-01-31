package com.example.androidprojectnetmera;
import android.app.Application;

import com.netmera.Netmera;
import com.netmera.NetmeraConfiguration;
import com.netmera.NetmeraUser;
import com.netmera.events.NetmeraEventLogin;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        NetmeraConfiguration.Builder configBuilder = new NetmeraConfiguration.Builder();

        configBuilder.apiKey("gFtyH_nz5WAGpcPap_Tg_kPPlYoxZ_umYnkPkp1cjyLZuRhtqeHVkCd-nmIFfxl8")

                .firebaseSenderId("1048476422604")
                .logging(true)
                .nmInAppMessageActionCallbacks(new NGInAppMessageActionCallbacks())
                .nmPushActionCallbacks(new NGPushActionCallbacks());





        Netmera.init(configBuilder.build(this));
        NetmeraUser User = new NetmeraUser();
        User.setUserId("faruk");
         User.setEmail("faruk.ertas@netmera.com");
         User.setName("faruk");
         User.setSurname("Ertas");
        User.setCountry("TR");

        // Send data to Netmera
        Netmera.updateUser(User);
        //   User.setEmail(null);
        //   Netmera.updateUser(User);
        NetmeraEventLogin event = new NetmeraEventLogin("faruk ertas");
        // Send event
        Netmera.sendEvent(event);

        Netmera.enablePopupPresentation();
        Netmera.requestPermissionsForLocation();
    }
}
