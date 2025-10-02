package org.example.observerPattern;

public class ObserverMain {
    public static void main(String args[]){

        Publisher channel = new Publisher();
        Observer s1 = new Subscriber("Naman");
        Observer s2 = new Subscriber("Hritik");
        Observer s3 = new Subscriber("Nihit");

        channel.add(s1);
        channel.add(s2);
        channel.add(s3);

        channel.uploadVideo("Design pattern crash course part 2");
    }
}
