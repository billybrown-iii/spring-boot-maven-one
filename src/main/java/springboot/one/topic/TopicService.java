package springboot.one.topic;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private ArrayList<Topic> topics = new ArrayList<>(
        Arrays.asList(
            new Topic(1, "Math", "Elemental & theoretical wizardry"),
            new Topic(2, "HTML", "Conjuration"),
            new Topic(3, "JavaScript", "Telekinesis")
        )
    );

    public ArrayList<Topic> getAllTopics() {
        return topics;
    }
}
