package trendmicro.service.impl;

import trendmicro.entity.*;
import trendmicro.service.AnimalService;

public class AnimalServiceImpl implements AnimalService {

     /**
    * 实例鹦鹉对象
    */
   public void generateParrot() {
       Parrot parrot = new Parrot("金刚",3,"鸟类","飞");
       parrot.selfIntroduction();
       parrot.food();
   }

   /**
    * 实例海豚对象
    */
   public void generateDolphin(){
       Dolphin dolphin = new Dolphin("晶晶",3,"水生哺乳动物","游泳");
       dolphin .selfIntroduction();
       dolphin .food();

   }

   /**
    * 实例变色龙对象
    */
   public void generateChameleon(){
       Chameleon chameleon = new Chameleon("龙龙",2,"爬行类动物","爬");
       chameleon.selfIntroduction();
       chameleon .food();

   }
}
