import java.util.Map;

public class Trainer {

    private Map<String, Integer> healthPointsByPokemon;

    public Trainer(Map<String, Integer> healthPointsByPokemon) {
        this.healthPointsByPokemon = healthPointsByPokemon;
    }

    public Integer receiveHit(int damage) {
        // TODO
        throw new IllegalArgumentException("Not developed yet");
    }

    public boolean isAlive() {
        return false;
    }

    public String getStatus() {
        return healthPointsByPokemon.values().stream()
                .anyMatch(this::isAlive) ? "IN BATTLE" : "DEFEATED";
    }

    private boolean isAlive(int hp) {
        return hp > 0;
    }

}
