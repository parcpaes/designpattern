package strategy.CameraApp;

import strategy.CameraApp.camera.BasicCameraApp;
import strategy.CameraApp.camera.PhoneCameraApp;

public class MainCameraApp {
    public static void main(String[] args) {
        PhoneCameraApp basicCameraApp = new BasicCameraApp();
        basicCameraApp.share();
    }
}
