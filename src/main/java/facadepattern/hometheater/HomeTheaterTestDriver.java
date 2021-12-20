package facadepattern.hometheater;

public class HomeTheaterTestDriver{
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM",amplifier);
        StreamingPlayer player = new StreamingPlayer("Streaming Player",amplifier);
        Projector projector= new Projector("Project",player);
        TheaterLights lights = new TheaterLights("Theater ceiling Lights");
        Screen screen = new Screen("Theater screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");
        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(
                        amplifier,
                        tuner, player, projector,lights,screen, popper);
        homeTheater.watchMovie("Raider of the Lost Ark");
        homeTheater.endMovie();
    }
}
