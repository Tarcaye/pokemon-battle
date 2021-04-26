import org.junit.jupiter.api.Test;

import static java.util.Collections.singletonList;
import static java.util.Collections.singletonMap;
import static org.assertj.core.api.Assertions.assertThat;

class TrainerTest {

    @Test
    void a_trainer_with_all_pokemons_ko_is_ko() {
        Trainer trainer = new Trainer("Pikachu", singletonList("Pikachu"), singletonMap("Pikachu", 0));

        assertThat(trainer.getStatus()).isEqualTo("KO");
    }

    @Test
    void a_trainer_with_a_single_pokemon_alive_is_alive() {
        Trainer trainer = new Trainer("Pikachu", singletonList("Pikachu"), singletonMap("Pikachu", 120));

        assertThat(trainer.getStatus()).isEqualTo("ALIVE");
    }

}
