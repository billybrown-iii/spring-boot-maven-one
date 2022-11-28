package springboot.one.topic;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.stream.Stream;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private ArrayList<Topic> topics = new ArrayList<>(
        Arrays.asList(
            new Topic("1", "Math", "Elemental & theoretical wizardry"),
            new Topic("2", "HTML", "Conjuration"),
            new Topic("3", "JavaScript", "Telekinesis")
        )
    );

    public ArrayList<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        // Stream<Topic> stream = topics.stream();
        // Topic result = stream.filter(ele -> ele.getId() == id).findFirst().get();
        // return result;
        return topics.stream().filter(item -> item.getId() == id).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
