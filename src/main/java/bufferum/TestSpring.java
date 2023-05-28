package bufferum;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Dependency Injection - DI - Внедрение зависимости
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.playMusic();

        System.out.println(firstMusicPlayer == secondMusicPlayer);
    
        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());

        secondMusicPlayer.setVolume(100);
        System.out.println(secondMusicPlayer.getName());
        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}