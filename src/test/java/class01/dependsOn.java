package class01;

import org.testng.annotations.Test;

public class dependsOn {
    @Test
    public void login(){
        System.out.println(6/0);
    }
    @Test(dependsOnMethods = {"login"})
    public void dashBordVerification(){
        System.out.println("i am dashboard verification");
    }
}
