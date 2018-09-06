package def;

import bean.TargetBean;
import util.ReflectionUtil;

public class Main {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        //获取声明字段
        ReflectionUtil.getAllField(TargetBean.class);
        //获取构造函数
        ReflectionUtil.getAllConstruct(TargetBean.class);
        //获取声明方法
        ReflectionUtil.getAllMethod(TargetBean.class);
        //反射创建对象
        try {
            Object hexx = ReflectionUtil.newInstance(TargetBean.class, 100, "HEXX");
            System.out.println(hexx.toString());

            //执行方法
            ReflectionUtil.invoke(hexx, "say", "this method called");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
