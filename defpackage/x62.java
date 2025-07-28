package defpackage;

/* renamed from: x62  reason: default package */
public final class x62 extends chd {
    /* renamed from: F */
    public final void A(y62 y62) {
        w62 w62 = (w62) this.a;
        w62.setTitle(y62.a);
        w62.setSubtitle(y62.b);
        mz9 mz9 = w62.a;
        mz9.setAvatarUrl(y62.c);
        CharSequence charSequence = y62.o;
        if (charSequence == null) {
            charSequence = "";
        }
        mz9.g(new ub0(charSequence, y62.X), true);
        w62.setDescriptions(y62.Y);
    }
}
