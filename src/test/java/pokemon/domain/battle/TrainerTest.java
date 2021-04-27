package pokemon.domain.battle;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.singletonMap;
import static org.assertj.core.api.Assertions.assertThat;

class TrainerTest {

    @Test
    void a_trainer_with_all_pokemon_ko_is_defeated() {
        Trainer trainer = new Trainer( singletonMap("Pikachu", 0));

        assertThat(trainer.getStatus()).isEqualTo("DEFEATED");
    }


    @Test
    void a_trainer_with_a_single_pokemon_alive_is_still_in_battle() {
        Trainer trainer = new Trainer(singletonMap("Pikachu", 120));

        assertThat(trainer.getStatus()).isEqualTo("IN BATTLE");
    }

    @Disabled
    @Test
    void a_trainer_with_a_single_pokemon_receiving_too_many_damage_is_defeated() {
        Map<String, Integer> pokemons = new HashMap<>();
        pokemons.put( "Pikachu", 120 );
        Trainer trainer = new Trainer( pokemons);

        trainer.receiveHit(9001);

        assertThat(trainer.getStatus()).isEqualTo("DEFEATED");
    }

}
