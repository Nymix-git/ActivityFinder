package ActivityFinder.activity;

import ActivityFinder.activity.client.ActivityFinderClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class ActivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivityApplication.class, args);
	}

	@Bean
	ActivityFinderClient activityFinderClient() {
		WebClient client = WebClient.builder()
				.baseUrl("http://www.boredapi.com/api/activity")
				.build();

		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builder(WebClientAdapter.forClient(client)).build();
		return factory.createClient(ActivityFinderClient.class);
	}

}
