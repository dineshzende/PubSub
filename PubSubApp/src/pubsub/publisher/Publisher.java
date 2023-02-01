package pubsub.publisher;
import pubsub.Message;
import pubsub.service.PubSubService;
public interface Publisher {
	// Publishes new message to PubSubService
	void publish(Message message, PubSubService pubsubService);

}
