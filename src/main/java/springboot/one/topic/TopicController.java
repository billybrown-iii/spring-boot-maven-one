package springboot.one.topic;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topix")
    public List<Topic> getTopix() {
        // if you return something that looks like JSON, Spring will automatically JSONify it.
        return topicService.getAllTopics();
    }
}
