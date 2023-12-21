import entities.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

//mvn test -Dtest=user
public class user
{
    @Test
    public void testCounter() {
        // Тестируемый класс
        String name1 = "test1";
        int lvl1=2;
        int money1 =3;
        String name2 = "test2";
        int lvl2=4;
        int money2 =6;

        User tester1 = new User(name1,lvl1,money1);
        User tester2 = new User(name2,lvl2,money2);
        List<User> userList= new ArrayList<>();
        userList.add(tester1);
        userList.add(tester2);

        // Проверяемый метод
        assertEquals(2, User.getCountOfUsers(userList));
    }
}
