package trendmicro.entity;

/***
 * 变色龙类
 * 储存变色龙相关的信息
 */
public class Chameleon extends Animal{

    private String skill;

    public Chameleon(String name, int age, String kind,String skill){
        super(name,age,kind);
        this.skill=skill;
    }

    /**
     * 重写自我介绍方法
     */
    @Override
    public void selfIntroduction(){
        // 引用父类的方法
        super.selfIntroduction();
        // 输出变色龙的品种
        System.out.println("我会" + this.skill + "。");
    }

    /**
     * 重写父类的food方法
     */
    @Override
    public void food() {
        System.out.println("我喜欢吃昆虫！");
    }

}
