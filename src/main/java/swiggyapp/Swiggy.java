package swiggyapp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Swiggy {
    private List<Restaurant> restaurants;

    public Swiggy() {
        this.restaurants = new ArrayList<>();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public Supplier<Optional<Restaurant>> getRestaurantSupplier(String restaurantName) {
        return () -> restaurants.stream()
                .filter(restaurant -> restaurant.getName().equalsIgnoreCase(restaurantName))
                .findFirst();
    }
}
