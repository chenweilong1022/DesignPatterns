package com.lingyi.state;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-06 22:15
 */
public class App {


    public static void main(String[] args) {

        LotteryActivity activity = new LotteryActivity(2);

        for (int i = 0; i < 30; i++) {
            System.out.printf("第%s次抽奖\n",i + 1);
            activity.deductMoney();
            activity.raffle();
            System.out.println("================");
        }



    }


}
