package strategy.CameraApp.camera;

import strategy.CameraApp.sharemethod.ShareBehavior;

public abstract class PhoneCameraApp {
    protected ShareBehavior shareBehavior;

    public PhoneCameraApp() {
    }

    public void take(){
        System.out.println("Take a photo");
    }
    public abstract void edit();
    public void save(){
        System.out.println("saving photo");
    }
    public void share(){
        shareBehavior.share();
    }
    public ShareBehavior getShareBehavior() {
        return shareBehavior;
    }

    public void setShareBehavior(ShareBehavior shareBehavior) {
        this.shareBehavior = shareBehavior;
    }
}
