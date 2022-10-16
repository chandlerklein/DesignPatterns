package com.chandler.patterns.fluentinterface;

import java.util.function.Consumer;

import static com.chandler.patterns.fluentinterface.Mailer.send;

class Mailer {
    private Mailer() {
        /* no-op */
    }

    public Mailer fromAddress(String fromAddress) {
        System.out.println("From Address");
        return this;
    }

    public Mailer toAddress(String toAddress) {
        System.out.println("To Address");
        return this;
    }

    public Mailer subject(String subject) {
        System.out.println("Mail subject");
        return this;
    }

    public Mailer body(String body) {
        System.out.println("Mail body");
        return this;
    }

    public static void send(Consumer<Mailer> block) {
        Mailer mailer = new Mailer();
        block.accept(mailer);
        System.out.println("Sending");
    }
}

public class Sample {

    public static void main(String[] args) {
        send(mailer ->
                     mailer.fromAddress("123@gmail.com")
                           .toAddress("other@gmail.com")
                           .subject("Test mail")
                           .body("This is a test message"));
    }
}
