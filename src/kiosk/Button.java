package kiosk;

import kiosk.printpage.AbstractView;

public abstract class Button {
    public abstract void Move(int buttonInt) throws InterruptedException;

    public Button(int buttonInt) throws InterruptedException {
        Move(buttonInt);
    }
}
