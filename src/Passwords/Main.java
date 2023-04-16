package Passwords;

import org.apache.commons.codec.digest.DigestUtils;

public class Main {
    public static void main(String[] args) {

        String password = "Filip123tM&@9g7vq$e4gGZ54rf8@Qru";

        String hash = DigestUtils.md5Hex(password);

        System.out.println(hash);

    }
}
