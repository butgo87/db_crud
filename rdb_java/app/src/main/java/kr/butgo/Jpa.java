/*
 * This source file was generated by the Gradle 'init' task
 */
package kr.butgo.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager();

    }
}

// public class App {
//     public String getGreeting() {
//         return "Hello World!";
//     }
//     public static void main(String[] args) {
//         System.out.println(new App().getGreeting());
//     }
// }
