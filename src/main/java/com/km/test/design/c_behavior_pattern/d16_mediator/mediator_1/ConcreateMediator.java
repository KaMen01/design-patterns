package com.km.test.design.c_behavior_pattern.d16_mediator.mediator_1;

/**
 * @author: coming
 * @date: 2020/7/14 10:12
 */
public class ConcreateMediator extends Mediator{
    private Button button;
    private Display display;
    private Font font;

    public ConcreateMediator() {
        this.button = new Button(this);
        this.display = new Display(this);
        this.font = new Font(this);
    }

    @Override
    void operaton(Colleague event) {
        if(event instanceof Font){
            setFontEvent(event);
        }
    }

    private void setFontEvent(Colleague event) {
        System.out.println(((Font) event).getFontName());
        button.applyButton();
        display.reDisplay();
    }
}
