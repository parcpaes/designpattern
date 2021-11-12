package observer.eventsubscription.listeners;

import java.io.File;

public class LogOpenListener implements EventListener{
    private File log;

    public LogOpenListener(String filename){
        this.log = new File(filename);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.printf("Save to log %s : Someone has performed %s operation with the following file %s\n",
                log,eventType,file.getName());
    }

}
