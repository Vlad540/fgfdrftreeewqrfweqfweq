package defpackage;

import java.util.Iterator;

/* renamed from: ke4  reason: default package */
public final class ke4 implements dyc {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final i26 d;

    public ke4(CharSequence charSequence, int i, int i2, i26 i26) {
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = i26;
    }

    public final Iterator iterator() {
        return new je4(this);
    }
}
