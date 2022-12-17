package strategy.CameraApp.sharemethod;

import strategy.CameraApp.sharemethod.ShareBehavior;

public class ShareByEmail implements ShareBehavior {
    @Override
    public void share() {
        System.out.println("sharing by Email");
    }
}
