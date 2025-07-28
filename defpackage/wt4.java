package defpackage;

import android.text.Editable;

/* renamed from: wt4  reason: default package */
public final class wt4 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile wt4 b;
    public static Class c;

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new amd(cls, charSequence) : super.newEditable(charSequence);
    }
}
