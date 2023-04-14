package dasturlash.uz;

public class Student {
    private String nickName;

    public void initMethod() {
        System.out.println("After bean initialization.");
    }

    public void destroyMethod() {
        System.out.println("Before bean destroying.");
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
