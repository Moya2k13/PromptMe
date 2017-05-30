package es.whoisalex.promptme.Clases;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;


/**
 * Created by Alex on 30/05/2017.
 */

@SuppressWarnings("deprecation")
public class Camara {

    private Context context;
    public Camara(){}

    public  Camara (Context context){
        this.context=context;
    }

    /** Comprobamos que el dispositivo tiene una camara */
    public boolean checkCameraHardware() {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            // El dispositivo tiene camara
            return true;
        } else {
            // El dispositivo no tiene camara
            return false;
        }
    }

    /** A safe way to get an instance of the Camera object. */
    public Camera getCameraInstance(){
        Camera c = null;

        try {
            c = Camera.open(); // attempt to get a Camera instance
        }
        catch (Exception e){
            // Camera is not available (in use or does not exist)
        }
        return c; // returns null if camera is unavailable
    }

}
