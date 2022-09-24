package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String localhost = "127.0.0.1";
        Client client = new Client(localhost, 80);
        client.send();
    }
}
