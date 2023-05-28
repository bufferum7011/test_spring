package bufferum;

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "...КЛАССИЧЕСКАЯ МУЗЫКА...";
    }

    @Override
    public void doMyInit() {
        System.out.println("=================== Init - " + getClass().getName());
    }

    @Override
    public void doMyDestroy() {
        System.out.println("=================== Destroy - " + getClass().getName());
    }


    // Фабричный метод начало
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    // Фабричный метод начало
}