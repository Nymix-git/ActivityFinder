package ActivityFinder.activity.client;

import ActivityFinder.activity.model.ActivityResponse;
import org.springframework.web.service.annotation.GetExchange;

public interface ActivityFinderClient {

    // Methods to fetch the data from the bored API
    @GetExchange("/")
    ActivityResponse random();

    @GetExchange("?type=education")
    ActivityResponse education();

    @GetExchange("?type=recreational")
    ActivityResponse recreational();

    @GetExchange("?type=social")
    ActivityResponse social();

    @GetExchange("?type=diy")
    ActivityResponse diy();

    @GetExchange("?type=charity")
    ActivityResponse charity();

    @GetExchange("?type=cooking")
    ActivityResponse cooking();

    @GetExchange("?type=relaxation")
    ActivityResponse relaxation();

    @GetExchange("?type=music")
    ActivityResponse music();

    @GetExchange("?type=busywork")
    ActivityResponse busywork();
}
