package LoadDatabase;





import model.User;
import repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class LoadDatabase {

        @Bean
        CommandLineRunner initDatabase(UserRepository repository) {
            return args -> {
                repository.save(new User("Alice", "alice@example.com"));
                repository.save(new User("Bob", "bob@example.com"));
            };
        }
    }


