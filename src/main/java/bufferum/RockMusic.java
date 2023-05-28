package bufferum;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton")
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "...РОК МУЗЫКА...";
    }

    @PostConstruct
    @Override
    public void doMyInit() {
        System.out.println("=================== Init - " + getClass().getName());
    }

    @PreDestroy
    @Override
    public void doMyDestroy() {
        System.out.println("=================== Destroy - " + getClass().getName());
    }


    // Фабричный метод начало
    RockMusic() {}

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }
    // Фабричный метод начало
}