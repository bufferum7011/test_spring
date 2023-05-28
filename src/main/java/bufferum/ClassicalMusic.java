package bufferum;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "...КЛАССИЧЕСКАЯ МУЗЫКА...";
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
    public ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    // Фабричный метод начало
}