package org.example;


import org.example.abstractFactory.Application;
import org.example.abstractFactory.MacFactory;
import org.example.abstractFactory.WindowsFactory;
import org.example.builder.Car;
import org.example.observable.Phone;
import org.example.observable.Tablet;
import org.example.observable.WeatherStation;
import org.example.proxy.Audio;
import org.example.proxy.Image;
import org.example.proxy.ProxyMedia;
import org.example.singleton.Storage;
import org.example.strategy.CardPaymentStrategy;
import org.example.strategy.Order;
import org.example.strategy.PaypalStrategy;
import org.example.visitor.Monitor;
import org.example.visitor.UpdateVisitor;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;

public class Main {
        public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Builder
        Car car = new Car.Builder()
                .brand("tesla")
                .model("3")
                .build();
        System.out.println(car);
        car = new Car.Builder().brand("ferrari")
                .build();
        System.out.println(car);


        //Abstract Factory
        Application macApp = new Application(new MacFactory());
        Application windowsApp = new Application(new WindowsFactory());

        //Singleton
        List<Car> liste = Storage.getInstance().getCarList();

        //Observable
        WeatherStation weatherStation = new WeatherStation();
        Phone phone = new Phone();
        Tablet tablet = new Tablet();
        weatherStation.registerObserver(phone);
        weatherStation.registerObserver(tablet);

        weatherStation.randomTemperature();

        weatherStation.randomTemperature();
        weatherStation.removeObserver(tablet);
        weatherStation.randomTemperature();

        //Strategy
//        Order order = new Order();
//        order.setTotalAmount(1000);
//
//        String choice;
//        do {
//            System.out.println("1-- Card");
//            System.out.println("2-- Paypal");
//            choice = scanner.nextLine();
//            switch (choice) {
//                case "1":
//                    order.pay(new CardPaymentStrategy());
//                    break;
//                case "2":
//                    order.pay(new PaypalStrategy());
//                    break;
//            }
//        } while (!choice.equals("0"));

        //Proxy
        ProxyMedia media = new ProxyMedia(new Image());

        System.out.println(media.getContent());

        ProxyMedia mediaAudio = new ProxyMedia(new Audio());
        System.out.println(mediaAudio.getContent());

        //Visitor
        Monitor monitor = new Monitor();
        monitor.accept(new UpdateVisitor());

    }
}
