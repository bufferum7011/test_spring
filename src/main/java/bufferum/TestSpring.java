package bufferum;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    // get properties
    // private static Properties properties = new Properties();
    // public static String get_prop(String code) { return properties.getProperty(code); }

    public static void main(String[] args) {

        // get properties
        // try { properties.load(new FileInputStream("resources//application.properties")); }
        // catch(IOException e) { System.out.println("[properties - ERROR]"); }

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Dependency Injection - DI - Внедрение зависимости
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        // Вот что делает спринг за кулисам с сеттером
        // MusicPlayer musicPlayer2 = new MusicPlayer();
        // musicPlayer2.setMusic(music);


        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}