package model;

import entities.User;
import xml.ReadXML;

import java.util.ArrayList;
import java.util.List;

public class Model
{
    private static Model instance = new Model();

    private List<User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
        model = ReadXML.setUsers();
        //model = DataFromBd.setProductFromBd();
    }

    public List<User> getModel() {
        return model;
    }
}
