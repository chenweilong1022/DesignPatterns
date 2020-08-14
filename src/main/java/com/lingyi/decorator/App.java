package com.lingyi.decorator;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 14:31
 */
public class App {


    public static void main(String[] args) {
        Drink drink = new LongBlack();
        System.out.printf("点了一杯%s咖啡,费用%s\n",drink.getDesc(),drink.cost());

        drink = new Milk(drink);

        System.out.printf("加了调料%s,总费用费用%s\n",drink.getDesc(),drink.cost());

        drink = new SoyMilk(drink);
        System.out.printf("加了调料%s,总费用费用%s\n",drink.getDesc(),drink.cost());




        Drink italianCoffee = new ItalianCoffee();
        System.out.printf("点了一杯%s咖啡,费用%s\n",italianCoffee.getDesc(),italianCoffee.cost());
        italianCoffee = new Milk(italianCoffee);
        italianCoffee = new Milk(italianCoffee);
        System.out.printf("加了调料%s2杯,总费用费用%s\n",italianCoffee.getDesc(),italianCoffee.cost());


    }




}
