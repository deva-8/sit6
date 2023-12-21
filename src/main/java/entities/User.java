package entities;


import java.util.List;

public class User
{
    private String name;

    private int money;

    private int lvl;

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getLvl() {
        return lvl;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }


    public User()
    {

    }

    public User(String name, int money, int lvl)
    {
        this.name=name;
        this.money = money;
        this.lvl = lvl;
    }
    public static int getCountOfUsers(List<User> userList)
    {
        int count=0;
        for (User l: userList )
        {
            count++;
        }
        return count;
    }


}
