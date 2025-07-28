package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class MessageComposeEditText extends ut4 {
    public static final /* synthetic */ int A0 = 0;

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.TextView, ut4, ru.ok.messages.messages.widgets.MessageComposeEditText] */
    public MessageComposeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ylb.editTextStyle);
        ((jae) context.getApplicationContext()).getClass();
        uu4 uu4 = (uu4) nqc.a.getAccessor().c(uu4.class);
        if (!uu4.e) {
            addTextChangedListener(new jv4(0, uu4));
        }
        vl.b().b();
        setReplaceTextSmiles(vl.o.a().c.g.getBoolean("app.messages.replace.emoji", false));
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = MessageComposeEditText.super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        editorInfo.contentMimeTypes = new String[]{"image/jpeg", "image/png", "image/gif"};
        return new gx6(onCreateInputConnection, new hy5(27, this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.messages.messages.widgets.MessageComposeEditText, android.view.View] */
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return (i == 4 && keyEvent.getAction() == 0) ? MessageComposeEditText.super.onKeyPreIme(i, keyEvent) : MessageComposeEditText.super.onKeyPreIme(i, keyEvent);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.messages.widgets.MessageComposeEditText, android.view.View] */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        MessageComposeEditText.super.onScrollChanged(i, i2, i3, i4);
        getParent().requestDisallowInterceptTouchEvent(true);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.TextView, ru.ok.messages.messages.widgets.MessageComposeEditText] */
    public final void onSelectionChanged(int i, int i2) {
        MessageComposeEditText.super.onSelectionChanged(i, i2);
    }

    public void setListener(eo8 eo8) {
    }

    public void setMIUITextSelectListener(fo8 fo8) {
    }

    public void setTextSelectListener(go8 go8) {
    }
}
