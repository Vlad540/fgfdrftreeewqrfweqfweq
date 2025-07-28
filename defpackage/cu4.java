package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* renamed from: cu4  reason: default package */
public final class cu4 extends InputConnectionWrapper {
    public final TextView a;
    public final y76 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cu4(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        y76 y76 = new y76(10);
        int i = 0;
        this.a = textView;
        this.b = y76;
        if (pt4.p != null) {
            pt4 a2 = pt4.a();
            if (a2.b() == 1 && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                lt4 lt4 = a2.e;
                lt4.getClass();
                Bundle bundle = editorInfo.extras;
                h39 h39 = ((o39) lt4.c).a;
                int a3 = h39.a(4);
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a3 != 0 ? ((ByteBuffer) h39.o).getInt(a3 + h39.a) : i);
                editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", ((pt4) lt4.a).h);
            }
        }
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return y76.n(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return y76.n(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
