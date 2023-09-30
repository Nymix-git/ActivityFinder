package ActivityFinder.activity.model;

// Record to write the data received from the bored API
public record ActivityResponse(String activity, Double accessibility, String Type, Integer participants, Double price, String link, Long key) {
}
