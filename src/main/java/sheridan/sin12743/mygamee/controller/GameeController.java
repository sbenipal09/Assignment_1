package sheridan.sin12743.mygamee.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import sheridan.sin12743.mygamee.model.Box;
import sheridan.sin12743.mygamee.model.GameLogic;
import sheridan.sin12743.mygamee.service.GameBox;


@Controller
public class GameeController {


    private GameBox gameBox;
    private final Logger log = LoggerFactory.getLogger(GameeController.class);

    private GameLogic gameLogic = new GameLogic(3);

    public GameeController(GameBox gameBox) {
        this.gameBox = gameBox;
        this.gameLogic = new GameLogic(3);
    }


    public GameeController() {
    }

    @GetMapping("/")
    public String play(Model model) {
        model.addAttribute("gameBox", gameBox);

            model.addAttribute("boxes", gameLogic.getBoxes());
            return "play";
        }


    @GetMapping("/result")
    public String showResult(@ModelAttribute("gameBox") GameBox gameBox, Model model) {
        int chosenBoxNumber = gameBox.getChosenBox();
        Box chosenBox = gameLogic.revealChosenBox(chosenBoxNumber);
        model.addAttribute("chosenBox", chosenBox);
        model.addAttribute("boxes", gameLogic.getBoxes());
        return "result";
    }
}