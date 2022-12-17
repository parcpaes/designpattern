package strategy.CameraApp.camera;

import strategy.CameraApp.sharemethod.ShareBySocialMedia;

public class BasicCameraApp extends PhoneCameraApp {
    public BasicCameraApp() {
        this.shareBehavior = new ShareBySocialMedia();
    }

    @Override
    public void edit() {
        System.out.println("editing");
    }
}
