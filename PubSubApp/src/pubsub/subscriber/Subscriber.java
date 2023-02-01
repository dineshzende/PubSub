package pubsub.subscriber;

import java.util.ArrayList;
import java.util.List;
import pubsub.Message;
import pubsub.service.PubSubService;


public abstract class Subscriber {

	//store all messages received by the subscriber
		private List<Message> subscriberMessages = new ArrayList<Message>();
		
		public List<Message> getSubscriberMessages() {
			return subscriberMessages;
		}
		public void setSubscriberMessages(List<Message> subscriberMessages) {
			this.subscriberMessages = subscriberMessages;
		}
		
		//Add subscriber with PubSubService for a topic
		public abstract void addSubscriber(String topic, PubSubService pubSubService);
		
		//Unsubscribe subscriber with PubSubService for a topic
		public abstract void unSubscribe(String topic, PubSubService pubSubService);
		
		//Request specifically for messages related to topic from PubSubService
		public abstract void getMessagesForSubscriberOfTopic(String topic, PubSubService pubSubService);
		
		//Print all messages received by the subscriber 
		public void printMessages(){
			for(Message message : subscriberMessages){
				System.out.println("Message Topic -> "+ message.getTopic() + " : " + message.getPayload());
			}
		}
	}
