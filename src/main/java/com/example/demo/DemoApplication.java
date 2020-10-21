package com.example.demo;

import com.example.demo.solid.dependency_inversion.*;
import com.example.demo.solid.liskov_substitution.*;
import com.example.demo.solid.open_closed.Addition;
import com.example.demo.solid.open_closed.Calculator;
import com.example.demo.solid.open_closed.Multiply;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);




        //Open closed
        System.out.println("Open closed ********************");
        Addition a = new Addition(1, 2);
        Calculator c = new Calculator();
        c.applyCalculation(a);

        Multiply m = new Multiply(2, 5);
        c.applyCalculation(m);

        //Liskov Substitution
        System.out.println("Lislov Subsititution ***********");
        Square s = new Square();
        s.setHeight(5);
        Area area = new Area();
        System.out.println(area.calculateArea(s));//25

        Rectangle r=new Rectangle();
        r.setHeight(10);
        r.setWeight(2);
        System.out.println(area.calculateArea(r));//20

        //Dependency inversion
        System.out.println("Dependency inversion ************");
        IController door = new Door();
        IControll doorControl = new ControllManegement(door);
        doorControl.apply();//Door closed
        doorControl.apply();//Door opened

        IController window = new Window();
        IControll windowControll = new ControllManegement(window);
        windowControll.apply();//Window opened
        windowControll.apply();//Window closed



    }

}
