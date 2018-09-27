package ui;

import exceptions.BrokeException;
import exceptions.MessyError;
import model.Animal;
import model.Keeper;
import model.Manager;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            animals.add(new Animal());
        }
        Keeper keeper = new Keeper(animals);
        Manager manager = new Manager(animals, keeper);
        try {
            manager.manage();
        } catch (BrokeException e) {
            System.out.println("Reduce costs!");
        } catch (MessyError messyError) {
            System.out.println("Keeper you're fired!");
        }
        finally {
            System.out.println("...profits");
        }
        System.out.println("And everything goes on as normal");
    }


}