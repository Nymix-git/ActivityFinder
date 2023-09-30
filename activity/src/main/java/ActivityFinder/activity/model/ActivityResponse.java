package ActivityFinder.activity.model;

// Record to write the data received from the bored API
public record ActivityResponse(String activity,
                               String Type,
                               Integer participants,
                               Double price,
                               String link,
                               Long key,
                               Double accessibility) {

}
