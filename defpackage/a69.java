package defpackage;

import android.text.style.TypefaceSpan;

/* renamed from: a69  reason: default package */
public final class a69 extends TypefaceSpan implements uu7 {
    public final int a = 5;

    public a69() {
        super("monospace");
    }

    public final qt3 copy() {
        return new a69();
    }

    public final int getType() {
        return this.a;
    }
}
