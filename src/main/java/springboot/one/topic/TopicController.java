package springboot.one.topic;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @RequestMapping("/topix")
    public List<Topic> getTopix() {
        return Arrays.asList(
            new Topic(1, "Math", "Elemental & theoretical wizardry"),
            new Topic(2, "HTML", "Conjuration"),
            new Topic(3, "JavaScript", "Telekinesis & telepathy")
        );
    }
}
