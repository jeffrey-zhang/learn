package com.trendmicro.service.impl;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.trendmicro.entity.Frog;
import com.trendmicro.entity.Monkey;
import com.trendmicro.entity.Owl;
import com.trendmicro.service.AnimalService;

/**
 * 动物实现类
 */
public class AnimalServiceImpl implements AnimalService {

    Scanner in = new Scanner(System.in);

    /**
     * 青蛙表演才艺
     * 
     * @return
     */
    private boolean frogPlay() {
        Frog frog = new Frog("小蛙", "前脚上有四个趾，后脚上有五个趾，还有蹼。");
        // 容错处理 三次
        for (int i = 3; i > 0; i--) {
            frog.eat();
            String outMsg = in.next();
            // 判断输入内容
            if ("hi".equalsIgnoreCase(outMsg)) {
                frog.introduce();
                // 青蛙进行表演
                frog.jump();
                frog.food();
                frog.call();
                return true;
            } else {
                if (i == 1) {
                    System.out.print("机会已用尽，");
                    break;
                }
                System.out.println("输入有误!还有" + (i - 1) + "机会。");
            }
        }
        return false;
    }

    /**
     * 猫头鹰
     * 
     * @return
     */
    private boolean owlPlay() {
        Owl owl = new Owl("小鹰", "夜行性肉食性动物,食物以鼠类为主。");
        // 容错处理 三次
        for (int i = 3; i > 0; i--) {
            owl.eat();
            String outMsg = in.next();
            if ("hi".equalsIgnoreCase(outMsg)) {
                owl.introduce();
                // 猴子进行表演
                owl.grab();
                owl.eye();
                owl.fly();
                return true;
            } else {
                if (i == 1) {
                    System.out.print("机会已用尽，");
                    break;
                }
                System.out.println("输入有误!还有" + (i - 1) + "机会。");
            }
        }
        return false;
    }

    /**
     * 猴子表演才艺
     * 
     * @return
     */
    private boolean monkeyPlay() {
        Monkey monkey = new Monkey("小悟", "哺乳动物，四肢有明确的分工。");
        // 容错处理 三次
        for (int i = 3; i > 0; i--) {
            monkey.eat();
            String outMsg = in.next();
            if ("hi".equalsIgnoreCase(outMsg)) {
                monkey.introduce();
                // 猴子进行表演
                monkey.tree();
                monkey.fish();
                monkey.down();
                return true;
            } else {
                if (i == 1) {
                    System.out.print("机会已用尽，");
                    break;
                }
                System.out.println("输入有误!还有" + (i - 1) + "机会。");
            }
        }
        return false;
    }

    @Override
    public void initAnimal() {
        Scanner in = new Scanner(System.in);
        boolean isContinue = true;
        String outMsg;
        try {
            do {
                int type = 0;
                // 容错三次
                for (int i = 3; i > 0; i--) {
                    System.out.println("欢迎来到迷你动物园，快来选择你喜欢的小动物吧.1：小猴子，2：青蛙，3：猫头鹰,0:退出");
                    type = in.nextInt();
                    if (type >= 0 && type < 4) {
                        break;
                    } else {
                        if (i == 1) {
                            type = 0;
                            System.out.print("机会已用尽，");
                            break;
                        }
                        System.out.println("输入有误!还有" + (i - 1) + "机会。");
                    }
                }
                switch (type) {
                    case 0:
                        isContinue = false;
                        break;
                    // 猴子
                    case 1:
                        if (monkeyPlay()) {
                            System.out.println("是否继续观赏其他动物?(true/false)");
                            isContinue = in.nextBoolean();
                        } else {
                            isContinue = false;
                        }
                        break;
                    // 青蛙
                    case 2:
                        if (frogPlay()) {
                            System.out.println("是否继续观赏其他动物?(true/false)");
                            isContinue = in.nextBoolean();
                        } else {
                            isContinue = false;
                        }
                        break;
                    // 猫头鹰
                    case 3:
                        if (owlPlay()) {
                            System.out.println("是否继续观赏其他动物?(true/false)");
                            isContinue = in.nextBoolean();
                        } else {
                            isContinue = false;
                        }

                        break;
                    default:
                        System.out.println("eee.");
                        break;
                }

            } while (isContinue);
            System.out.println("已退出系统，欢迎下次光临！");
        } catch (InputMismatchException e) {
            System.out.println("输入格式错误 --> 请按要求输入。");
            // 输入异常处理，继续执行知道输入正确为止。
            initAnimal();

        } catch (Exception e) {
            System.out.println("产生异常 -->");
            e.printStackTrace();
        } 
    }

}
