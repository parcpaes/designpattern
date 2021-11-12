package observer.eventsubscription.editor;

import observer.eventsubscription.publisher.EventManager;

import java.io.File;

public class Editor {
    private EventManager events;
    private File file;

    public Editor(){
        this.events = new EventManager("open","save");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        events.notify("open",file);
    }

    public void saveFile() throws Exception{
        System.out.println(file.getAbsolutePath());
        if(this.file!=null)  events.notify("save",file);
        throw new Exception("Please open a file first");
    }

    public EventManager getEvents() {
        return events;
    }
}
