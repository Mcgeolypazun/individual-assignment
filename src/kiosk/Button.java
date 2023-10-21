package kiosk;

import kiosk.printpage.AbstractView;

public abstract class Button {
    public abstract void Move(int buttonInt);

    public Button(int buttonInt){
        Move(buttonInt);
    }
}
