package strategy.CameraApp.sharemethod;

import strategy.CameraApp.sharemethod.ShareBehavior;

public class ShareByText implements ShareBehavior {
    @Override
    public void share() {
        System.out.println("sharing photo by text");
    }
}
