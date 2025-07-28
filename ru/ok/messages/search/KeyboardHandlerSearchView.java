package ru.ok.messages.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

public class KeyboardHandlerSearchView extends tsc {
    private y77 listener;

    public KeyboardHandlerSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, ru.ok.messages.search.KeyboardHandlerSearchView] */
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) ? KeyboardHandlerSearchView.super.dispatchKeyEventPreIme(keyEvent) : KeyboardHandlerSearchView.super.dispatchKeyEventPreIme(keyEvent);
    }

    public void setListener(y77 y77) {
    }

    public KeyboardHandlerSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public KeyboardHandlerSearchView(Context context) {
        super(context, (AttributeSet) null);
    }
}
