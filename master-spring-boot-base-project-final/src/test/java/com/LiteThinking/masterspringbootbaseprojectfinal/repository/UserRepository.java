package com.LiteThinking.masterspringbootbaseprojectfinal.repository;
import com.LiteThinking.masterspringbootbaseprojectfinal.domain.User;
import static org.assertj.core.api.Assertions.assertThat;

//se da un ejemplo de prueba unitaria en este caso para  el repositorio
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepository {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveAndFindUser() {
        // Crear un nuevo usuario
        User user = new User();
        user.setUsername("admin");
        user.setPassword("1234");

        // Guardar el usuario en la base de datos
        userRepository.save(user);

        // Buscar el usuario por nombre de usuario
        User retrievedUser = userRepository.findByUsername("1");

        // Verificar que el usuario recuperado no sea nulo
        assertThat(retrievedUser).isNotNull();

        // Verificar que el nombre de usuario del usuario recuperado sea igual al nombre de usuario del usuario guardado
        assertThat(retrievedUser.getUsername()).isEqualTo(user.getUsername());
    }
}

