import java.util.List;
import java.util.Map;

public class Trainer {
    private String currentPokemon;

    private List<String> pokemons;

    private Map<String, Integer> healthPointsByPokemon;

    public Trainer(String currentPokemon, List<String> pokemons, Map<String, Integer> healthPointsByPokemon) {
        this.currentPokemon = currentPokemon;
        this.pokemons = pokemons;
        this.healthPointsByPokemon = healthPointsByPokemon;
    }

    // TODO Fonction qui prend un pokemon et des degats et les appliquent au pokemon en jeu
    public Integer receiveHit(int damage){
        return null;
    }

    public boolean isAlive() {
        return false;
    }

    public String getStatus() {
        return healthPointsByPokemon.values().stream()
                .anyMatch(this::isAlive) ? "ALIVE" : "KO";
    }

    private boolean isAlive(int hp) {
        return hp > 0;
    }

}
