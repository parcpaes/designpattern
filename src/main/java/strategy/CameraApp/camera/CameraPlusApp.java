package strategy.CameraApp.camera;

import strategy.CameraApp.sharemethod.ShareByEmail;

public class CameraPlusApp extends PhoneCameraApp {
    public CameraPlusApp() {
        shareBehavior = new ShareByEmail();
    }

    @Override
    public void edit() {
        System.out.println("editing ");
    }
}
