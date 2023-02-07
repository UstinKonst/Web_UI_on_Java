package WebUI_less6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class less6Test extends AbstractTest {

    //    Поиск категории "спорт"
    @Test
    void test1() {
        less6test1 less6test1 = new less6test1(getDriver());
        less6test1.SearchSport();
        Assertions.assertEquals("Спортивные блоги и аналитика — Живой Журнал — ЖЖ",driver.getTitle(),"Не та страница");
    }

    //    Добавление в корзину 3-ёх пакетов "юзерпиков"
    @Test
    void test2() {
        less6test2 less6test2 = new less6test2(getDriver());
        less6test2.addToBasketUserpics();
        Assertions.assertEquals("357 RUB",less6test2.check.getText(),"не та страница");
    }

    //    Создание первой записи(Поста) "Привет мир"
    @Test
    void test3() {
        less6test3 less6test3 = new less6test3(getDriver());
        less6test3.addToBasketUserpics();
        Assertions.assertEquals("Привет",less6test3.hi.getText(),"не та страница");
    }

    //    Добавить в избранное статью про пенсильванию
    @Test
    void test4() {
        less6test4 less6test4 = new less6test4(getDriver());
        less6test4.addToFavorites();
        Assertions.assertEquals("ed_glezin: Парк Форт-Хантер в городе Гаррисберг, штат Пенсильвания",less6test4.header.getText(),"не та страница");
    }

    //    Поставить лайк в стаье про сталинград
    @Test
    void test5() {
        less6test5 less6test5 = new less6test5(getDriver());
        less6test5.like();
        Assertions.assertEquals("80-летию Сталинградской битвы посвящается. Книги.",less6test5.record.getText(),"не та страница");
    }
}
