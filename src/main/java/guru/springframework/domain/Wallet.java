package guru.springframework.domain;

import java.security.*;
import java.util.ArrayList;
import java.util.Base64;

public class Wallet {

    private String id;
    private String passwordHash;
    private String secret;
    private ArrayList<KeyPair> keyPairs = new ArrayList<>();

    //
    private KeyPairGenerator keyGen;
    private KeyPair pair;
    private PrivateKey privateKey;
    private PublicKey publicKey;


    public Wallet() {

    }

    public String generateAddress() throws NoSuchAlgorithmException {
        if(this.secret == null) {
            this.generateSecret();
        }
        this.keyGen = KeyPairGenerator.getInstance("RSA");
        this.keyGen.initialize(512);

        KeyPair pair = this.keyGen.generateKeyPair();
        keyPairs.add(pair);
        return Base64.getEncoder().encodeToString(pair.getPublic().getEncoded());
    }

    private void generateSecret() {

    }

    public String getAddressByPublicKey(String publicKey) {
        return "";
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Wallet w = new Wallet();
        System.out.println(w.generateAddress());
    }
}
