package com.epam.christmasgift.creation;

import com.epam.christmasgift.entity.*;
import com.epam.christmasgift.exception.ChristmasGiftException;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CreatorGift {
    public static final Logger LOGGER = Logger.getLogger("CreatorGift.class");

    public static Gift createGift(double averageWeightGift) {
        List<Confection> confectionList = new ArrayList<Confection>();
        Gift gift = new Gift(confectionList);
        double currentWeightGift = 0;
        try {
            while (currentWeightGift < averageWeightGift) {
                Candies candies = new Candies();
                Chocolate chocolate = new Chocolate();
                Wafers wafers = new Wafers();
                int sortConfection = (int) (Math.random() * 6);
                switch (sortConfection) {
                    case 0:
                        candies.setName("Коровка");
                        candies.setWeight(10.0);
                        candies.setQuantitySugar(7.5);
                        candies.setType(CandiesType.CARAMEL);
                        currentWeightGift += candies.getWeight();
                        confectionList.add(candies);
                        break;
                    case 1:
                        candies.setName("Беловежская пуща");
                        candies.setWeight(15.0);
                        candies.setQuantitySugar(9.2);
                        candies.setType(CandiesType.CHOCOLATE);
                        currentWeightGift += candies.getWeight();
                        confectionList.add(candies);
                        break;
                    case 2:
                        chocolate.setName("Аленка");
                        chocolate.setWeight(90);
                        chocolate.setQuantitySugar(40);
                        chocolate.setColor("black");
                        currentWeightGift += chocolate.getWeight();
                        confectionList.add(chocolate);
                        break;
                    case 3:
                        chocolate.setName("Белая медведица");
                        chocolate.setWeight(100);
                        chocolate.setQuantitySugar(47.9);
                        chocolate.setColor("white");
                        currentWeightGift += chocolate.getWeight();
                        confectionList.add(chocolate);
                        break;
                    case 4:
                        wafers.setName("Лимонные");
                        wafers.setWeight(50);
                        wafers.setQuantitySugar(22);
                        wafers.setStuffed(true);
                        currentWeightGift += wafers.getWeight();
                        confectionList.add(wafers);
                        break;
                    case 5:
                        wafers.setName("Черепашки");
                        wafers.setWeight(70);
                        wafers.setQuantitySugar(31.2);
                        wafers.setStuffed(false);
                        currentWeightGift += wafers.getWeight();
                        confectionList.add(wafers);
                        break;
                    default:
                        LOGGER.error("Не верно выбрана сладость");
                        throw new ChristmasGiftException("Не верно выбрана сладость");
                }
            }
        } catch (ChristmasGiftException e) {
            LOGGER.error(e);
        }
        return gift;
    }
}
