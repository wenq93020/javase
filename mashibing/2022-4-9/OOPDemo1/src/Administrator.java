import java.util.Scanner;

public class Administrator {

    String loginName = "admin";
    String password = "123456";

    public void introduce(){
        System.out.println(loginName);
        System.out.println(password);
    }

    public static void main(String[] args) {
        Administrator admin = new Administrator();
        admin.introduce();
        System.out.println("修改密码");
        Scanner sc = new Scanner(System.in);

        String name;
        String pass;

        while(true){

            System.out.println("请输入旧用户名");
            name = sc.next();
            System.out.println("请输入旧密码");
            pass = sc.next();

            if(admin.loginName.equals(name) && admin.password.equals(pass)){

                System.out.println("请输入新密码");
                pass = sc.next();
                admin.password = pass;
                System.out.println("修改成功 " + admin.loginName + "的新密码为: " + admin.password);
                break;

            }

            System.out.println("密码或用户名输入错误 请重新试过");

        }

    }

}
