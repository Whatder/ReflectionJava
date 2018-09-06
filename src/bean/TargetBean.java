package bean;

import java.util.List;

public class TargetBean {
    private int id;
    public String name;
    protected List<InnerBean> innerList;

    public TargetBean(int id, String name, List<InnerBean> innerList) {
        this.id = id;
        this.name = name;
        this.innerList = innerList;
    }

    private TargetBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void publicMethod() {
        System.out.println("this is public_method");
    }

    private void privateMethod() {
        System.out.println("this is private_method");
    }

    public void say(String what) {
        System.out.println(name + " say: " + what);
    }

    static class InnerBean {
        int inner_id;
        String inner_name;

        public InnerBean(int inner_id, String inner_name) {
            this.inner_id = inner_id;
            this.inner_name = inner_name;
        }
    }

    @Override
    public String toString() {
        return "bean.TargetBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", innerList=" + innerList +
                '}';
    }
}
