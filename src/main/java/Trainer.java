import java.util.List;
import java.util.Map;

public class Trainer {

    private Map<String, Integer> healthPointsByPokemon;

    public Trainer(Map<String, Integer> healthPointsByPokemon) {
        this.healthPointsByPokemon = healthPointsByPokemon;
    }

    // TODO Fonction qui prend un pokemon et des degats et les appliquent au pokemon en jeu
    public Integer receiveHit(int damage){
        String currentPokemon = (String) healthPointsByPokemon.keySet().toArray()[0];
        int remainingHP = healthPointsByPokemon.get( currentPokemon ) - damage;
        healthPointsByPokemon.put( currentPokemon, remainingHP );
        return remainingHP;
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
