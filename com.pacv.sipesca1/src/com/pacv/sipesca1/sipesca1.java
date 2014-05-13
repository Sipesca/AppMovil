package com.pacv.sipesca1;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;

import org.apache.cordova.*;

public class sipesca1 extends DroidGap {
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
	public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //super.loadUrl("file:///android_asset/www/index.html");

       //Añadimos un splash de carga
       super.setIntegerProperty("splashscreen", R.drawable.splash);
       
       //Aumentamos el tiempo de "descarga" para que no de error en las peticiones de datos bastantes grandes
       super.setIntegerProperty("loadUrlTimeoutValue", 60000);
         
        try{
        	//super.loadUrl("http://sipesca.ugr.es:8080/panel?movil=true",5000);
        	super.loadUrl("file:///android_asset/www/index_android.html",60000);
        	
        }catch (Exception ex){
        	super.loadUrl("file:///android_asset/www/index.html",10000);
        }
       

        
        }
        
}
