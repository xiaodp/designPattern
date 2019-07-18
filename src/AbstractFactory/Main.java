package AbstractFactory;

import AbstractFactory.factory.Factory;
import AbstractFactory.factory.Link;
import AbstractFactory.factory.Page;
import AbstractFactory.factory.Tray;
import AbstractFactory.listfactory.ListFactory;

public class Main {


    public static void main(String[] args) {
        Factory factory = Factory.getFactory("AbstractFactory.listfactory.ListFactory");

        Link people = factory.createLink("Poeple","http://www.people.com.cn");
        Link gmw = factory.createLink("gmw ","http://www.gmw.cn");
        Link us_yahoo = factory.createLink("Yahoo!","http://yahoo.com");
        Link baidu = factory.createLink("baidu","http://www.baidu.com");

        Tray trayNews = factory.createTray("Daily news");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray traySearch = factory.createTray("Search");
        traySearch.add(us_yahoo);
        traySearch.add(baidu);

        Page page = factory.createPage("LinkPage","ZP");
        page.add(trayNews);
        page.add(traySearch);
        page.output();

    }
}
