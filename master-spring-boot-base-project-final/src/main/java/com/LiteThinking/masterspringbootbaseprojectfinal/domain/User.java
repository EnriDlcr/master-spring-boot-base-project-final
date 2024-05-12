package com.LiteThinking.masterspringbootbaseprojectfinal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        //Creo las variables para manejar los datos del cuentahabiente
        private Long id;
        private String fullName;
        private String idType;
        private String idNumber;
        private String username;
        private String password;
        // Getters y setters
        // Setter para fullName
        public void setFullName(String fullName) {
                this.fullName = fullName;
        }

        // Getter para fullName
        public String getFullName() {
                return fullName;
        }

        // Setter para idType
        public void setIdType(String idType) {
                this.idType = idType;
        }

        // Getter para idType
        public String getIdType() {
                return idType;
        }

        // Setter para idNumber
        public void setIdNumber(String idNumber) {
                this.idNumber = idNumber;
        }

        // Getter para idNumber
        public String getIdNumber() {
                return idNumber;
        }

        // Setter para username
        public void setUsername(String username) {
                this.username = username;
        }

        // Getter para username
        public String getUsername() {
                return username;
        }

        // Setter para password
        public void setPassword(String password) {
                this.password = password;
        }

        // Getter para password
        public String getPassword() {
                return password;
        }

        public void setAccountNumber(String s) {
        }

        public void setId(Long userId) {
        }
}

