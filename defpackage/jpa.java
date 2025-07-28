package defpackage;

/* renamed from: jpa  reason: default package */
public final class jpa {
    public final ppa a;
    public final ls4 b;
    public final ipa c;
    public final bd4 d;
    public npa e;

    public jpa(ppa ppa, ls4 ls4, ipa ipa, bd4 bd4, js4 js4, boolean z, boolean z2, boolean z3) {
        ppa ppa2 = ppa;
        ls4 ls42 = ls4;
        bd4 bd42 = bd4;
        this.a = ppa2;
        this.b = ls42;
        ls42.b = this;
        this.c = ipa;
        ppa2.a.add(this);
        this.d = bd42;
        npa npa = new npa(false, false, false, z, z2, false, z3);
        this.e = npa;
        ppa.a(npa);
        bd42.a(ls4, js4, true);
        if (z && z2) {
            ls42.a.setDrawStickerEnabled(true);
            bd42.a(ls4, ls4.a(), false);
        }
    }
}
