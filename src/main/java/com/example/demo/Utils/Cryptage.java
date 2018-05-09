package com.example.demo.Utils;

import org.mindrot.jbcrypt.BCrypt;

public class Cryptage {


    public static void decryptage(String mdp) {

        // Il est possible d'augmenter la complexité (et donc le temps
        // de traitement) en passant le "workfactor" en paramètre
        // ici : 12 La valeur par défaut est 10
        String hashed = BCrypt.hashpw(mdp, BCrypt.gensalt(15));
        System.out.println("Le mot de passe crypté es t: "+ hashed);

        // Vérification d'un mot de passe à partir du hash
        if (BCrypt.checkpw("cocacola", hashed)){
            System.out.println("It matches");
        }
        else {
            System.out.println("It doesn't matches");
        }

    }

    public static void main(String[] args){
        decryptage("loepeofjrakfofzp");

        decryptage("cocacola");

    }

}
