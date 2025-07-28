package defpackage;

/* renamed from: ca2  reason: default package */
public final class ca2 extends qc2 {
    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View, nc2] */
    public final void F(rh8 rh8, u16 u16, i26 i26) {
        ph8 ph8 = (ph8) rh8;
        ? r0 = (nc2) this.a;
        A(ph8);
        a24.a0(r0, new aa2(u16, ph8, 2));
        r0.setOnLongClickListener(new ba2(i26, ph8, this, 1));
    }

    /* renamed from: G */
    public final void A(ph8 ph8) {
        nc2 nc2 = (nc2) this.a;
        nc2.setId((int) ph8.a);
        nc2.setTitle(ph8.X);
        CharSequence charSequence = ph8.Z;
        if (charSequence != null) {
            nc2.setLink(charSequence);
        }
        nc2.setSubtitle(ph8.Y);
        nc2.setLinkPhoto(ph8.o);
    }
}
