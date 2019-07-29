package base.pages;

import base.LogHelper;

public class Page extends LogHelper {


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
