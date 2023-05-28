package bufferum;

public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "...РОК МУЗЫКА...";
    }

    @Override
    public void doMyInit() {
        System.out.println("=================== Init - " + getClass().getName());
    }

    @Override
    public void doMyDestroy() {
        System.out.println("=================== Destroy - " + getClass().getName());
    }
}