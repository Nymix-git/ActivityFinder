package ActivityFinder.activity.commands;

import ActivityFinder.activity.client.ActivityFinderClient;
import ActivityFinder.activity.model.ActivityResponse;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class ActivityCommands {

    private final ActivityFinderClient activityFinderClient;

    public ActivityCommands(ActivityFinderClient activityFinderClient) {
        this.activityFinderClient = activityFinderClient;
    }

    @ShellMethod(key = "activity", value = "Suggests a activity. By default this would be a random activity, use options to filter the activities.")
    public String getActivity(@ShellOption(defaultValue = "random") String arg) {

        ActivityResponse activityResponse; // = activityFinderClient.random();

        switch (arg) {
            case "random":
                activityResponse = activityFinderClient.random();
                break;
            case "education":
                activityResponse = activityFinderClient.education();
                break;
            case "recreational":
                activityResponse = activityFinderClient.recreational();
                break;
            case "social":
                activityResponse = activityFinderClient.social();
                break;
            case "diy":
                activityResponse = activityFinderClient.diy();
                break;
            case "charity":
                activityResponse = activityFinderClient.charity();
                break;
            case "cooking":
                activityResponse = activityFinderClient.cooking();
                break;
            case "relaxation":
                activityResponse = activityFinderClient.relaxation();
                break;
            case "music":
                activityResponse = activityFinderClient.music();
                break;
            case "busywork":
                activityResponse = activityFinderClient.busywork();
                break;
            default:
                return "Not a valid type!";
        }

        return activityResponse.activity();
    }
}
