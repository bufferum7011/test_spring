package bufferum;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public interface Music {
    public String getSong();
    @PostConstruct public void doMyInit();
    @PreDestroy public void doMyDestroy();
}