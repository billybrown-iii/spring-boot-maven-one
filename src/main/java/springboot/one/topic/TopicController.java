package springboot.one.topic;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topix")
    public List<Topic> getTopix() {
        // if you return something that looks like JSON, Spring will automatically JSONify it.
        // System.out.println(topicService.getTopic(2));
        return topicService.getAllTopics();
    }

    @RequestMapping("/topix/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @PostMapping("/topix")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }
    // @RequestMapping("/test")
    // public Topic getTopic() {
    //     return topicService.getTopic(5);
    // }
}
