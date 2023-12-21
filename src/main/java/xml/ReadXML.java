package xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import entities.User;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXML {
    public static List<User> setUsers() {

        File file = new File("users.xml");
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);
            document.getDocumentElement().normalize();
            List<User> userList = getUserData(document);
            return userList;
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static List<User> getUserData(Document document) {

        NodeList list = document.getElementsByTagName("User");
        int length = list.getLength();
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            Node node = list.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                User emp = getUsers(element);
                userList.add(emp);
            }
        }

        return userList;
    }

    private static User getUsers(Element element) {


        String name = getUserDetails(element, "name");
        int money = Integer.parseInt(getUserDetails(element, "money"));
        int lvl = Integer.parseInt(getUserDetails(element, "lvl"));

        User user = new User();
        user.setName(name);
        user.setMoney(money);
        user.setLvl(lvl);

        return user;
    }

    private static String getUserDetails(Element element, String property) {
        String value = element.getElementsByTagName(property).item(0).getTextContent();
        return value;
    }

}
