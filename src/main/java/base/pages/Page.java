package base.pages;


public class Page {

/*
 This is a Page container.
 It's purpose to simplify PAGE initialization
 you don't have to use PageMain pageMain = new PageMain() in a every class where it uses
 */

    private final PageMain pageMain = new PageMain(this);
    private final PageChapterOne pageChapterOne = new PageChapterOne(this);

    //Main
    protected PageMain getPageMain() {
        return pageMain;
    }

    //PageChapterOne
    protected PageChapterOne getPageChapterOne() {
        return pageChapterOne;
    }
}
