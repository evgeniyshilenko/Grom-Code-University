package com.gromcode.lesson9.homeWork;

public class Demo {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository(new User[ 1 ]);
        System.out.println(userRepository.getUserName());
        System.out.println(userRepository.getUserIds());
        System.out.println(userRepository.getUserNameById(5));
        System.out.println(userRepository.getUserByName("Vova"));
        System.out.println(userRepository.getUserById(20235));
        System.out.println(userRepository.getUserBySessionId("One"));
   }
    }
