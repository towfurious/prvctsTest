package base.pages;

import base.core.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageChapterOne{
    public PageChapterOne(Page page) {
    }

    public WebElement getHomePage() {
        return WebDriverFactory.getDriver().findElement(By.cssSelector("body > div.mainbody > p:nth-child(4) > a"));
    }
}
