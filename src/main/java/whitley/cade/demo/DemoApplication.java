package whitley.cade.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

@RestController
class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/")
    public String homePage() {
        return "<html><body><h1>Rock Paper Scissors</h1>" +
               "<p>Wins: " + gameService.getWins() + "</p>" +
               "<button onclick=\"window.location.href='/play?move=rock'\">Rock</button>" +
               "<button onclick=\"window.location.href='/play?move=paper'\">Paper</button>" +
               "<button onclick=\"window.location.href='/play?move=scissors'\">Scissors</button>" +
               "</body></html>";
    }

    @GetMapping("/play")
    public String play(@RequestParam String move) {
        return gameService.playGame(move);
    }
}

@Service
class GameService {
    private final Random random = new Random();
    private final AtomicInteger wins = new AtomicInteger(0);
    private final String[] choices = {"rock", "paper", "scissors"};

    public String playGame(String playerMove) {
        String serverMove = choices[random.nextInt(3)];
        String result;
        
        if (playerMove.equals(serverMove)) {
            result = "It's a tie!";
        } else if ((playerMove.equals("rock") && serverMove.equals("scissors")) ||
                   (playerMove.equals("paper") && serverMove.equals("rock")) ||
                   (playerMove.equals("scissors") && serverMove.equals("paper"))) {
            wins.incrementAndGet();
            result = "You win!";
        } else {
            result = "You lose!";
        }
        
        return "<html><body><h1>Rock Paper Scissors</h1>" +
               "<p>Your move: " + playerMove + "</p>" +
               "<p>Server move: " + serverMove + "</p>" +
               "<p>Result: " + result + "</p>" +
               "<p>Wins: " + wins.get() + "</p>" +
               "<button onclick=\"window.location.href='/'\">Play Again</button>" +
               "</body></html>";
    }

    public int getWins() {
        return wins.get();
    }
}