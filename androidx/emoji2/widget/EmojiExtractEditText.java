package androidx.emoji2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class EmojiExtractEditText extends ExtractEditText {
    public vt4 a;
    public final boolean b;

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.b) {
            this.b = true;
            int i = 0;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jwb.EmojiEditText, 16842862, 0);
                int integer = obtainStyledAttributes.getInteger(jwb.EmojiEditText_maxEmojiCount, Integer.MAX_VALUE);
                obtainStyledAttributes.recycle();
                i = integer;
            }
            setMaxEmojiCount(i);
            setKeyListener(super.getKeyListener());
        }
    }

    private vt4 getEmojiEditTextHelper() {
        if (this.a == null) {
            this.a = new vt4(this, true);
        }
        return this.a;
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().c;
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().b;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().a(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiReplaceStrategy(int i) {
        vt4 emojiEditTextHelper = getEmojiEditTextHelper();
        emojiEditTextHelper.c = i;
        ((kv4) emojiEditTextHelper.a.b).X = i;
    }

    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            getEmojiEditTextHelper().a.getClass();
            if (!(keyListener instanceof gu4) && !(keyListener instanceof NumberKeyListener)) {
                keyListener = new gu4(keyListener);
            }
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(int i) {
        vt4 emojiEditTextHelper = getEmojiEditTextHelper();
        emojiEditTextHelper.getClass();
        if (i >= 0) {
            emojiEditTextHelper.b = i;
            ((kv4) emojiEditTextHelper.a.b).o = i;
            return;
        }
        throw new IllegalArgumentException("maxEmojiCount should be greater than 0");
    }
}
