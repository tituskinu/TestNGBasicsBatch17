package class01;

import org.testng.annotations.Test;
//when i comes to priority testNG uses alphabetical order
public class priority {
    @Test(priority = 2, groups = "regression")
    public void Atest(){
        System.out.println("i am test A");
    }
    @Test(priority = 1)
    public void Btest(){
        System.out.println("i am test B");
    }
    @Test(priority = 3)
    public void Ctest(){
        System.out.println("i am test C");
    }
    @Test(priority = 10)
    public void Dtest(){
        System.out.println("i am test D");
    }
}
