package strategy.CameraApp.sharemethod;

import strategy.CameraApp.sharemethod.ShareBehavior;

public class ShareBySocialMedia implements ShareBehavior {

    @Override
    public void share() {
        System.out.println("Sharing by Social Media");
    }
}
