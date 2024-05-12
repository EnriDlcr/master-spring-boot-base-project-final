package com.LiteThinking.masterspringbootbaseprojectfinal.controller;

import com.LiteThinking.masterspringbootbaseprojectfinal.domain.User;
import com.LiteThinking.masterspringbootbaseprojectfinal.service.UserService;
import com.LiteThinking.masterspringbootbaseprojectfinal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
//Aqui definimos los metodos para hacer el crud (Create, read,update ,delete)
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //crear un registro ()
    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        // Guardar el usuario en la base de datos utilizando userRepository.save(user)
        userRepository.save(user);

        // Retornar una respuesta indicando que el usuario ha sido creado exitosamente
        return "Usuario creado exitosamente";
    }
    //leer un usuario por su id
    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userRepository.findById(userId)
                .orElse(null);
    }

    //actualizar un usuario por id
    @PutMapping("/users/{userId}")
    public String updateUser(@PathVariable Long userId, @RequestBody User updatedUserDetails) {
        // Verificar si el usuario existe en la base de datos
        userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        // Actualizar los detalles del usuario
        updatedUserDetails.setId(userId); // Asegúrate de establecer el ID del usuario actualizado
        userRepository.save(updatedUserDetails);

        return "Usuario actualizado exitosamente";
    }

    // Borrar el  usuario
    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable Long userId) {
        // Verificar si el usuario existe en la base de datos
        userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        // Eliminar el usuario de la base de datos
        userRepository.deleteById(userId);

        return "Usuario eliminado exitosamente";
    }
}
