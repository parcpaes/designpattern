package observer.eventsubscription;

import observer.eventsubscription.editor.Editor;
import observer.eventsubscription.listeners.EmailNotificationListener;
import observer.eventsubscription.listeners.LogOpenListener;
import observer.eventsubscription.publisher.EventManager;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EventManager eventManager = editor.getEvents();
        eventManager.subscribe("open",new LogOpenListener("/file.txt"));
        eventManager.subscribe("save",new EmailNotificationListener("admin@example.com"));

        try{
            editor.openFile("test.txt");
            editor.saveFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
