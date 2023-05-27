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
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.playMusic();

        // Вот что делает спринг за кулисам с сеттером
        // MusicPlayer musicPlayer2 = new MusicPlayer();
        // musicPlayer2.setMusic(music);


        System.out.println(firstMusicPlayer == secondMusicPlayer);

    
        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());

        secondMusicPlayer.setVolume(100);
        System.out.println(secondMusicPlayer.getName());
        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}