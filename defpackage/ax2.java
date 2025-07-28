package defpackage;

/* renamed from: ax2  reason: default package */
public final class ax2 {
    public final sgc a;

    public ax2(sgc sgc) {
        this.a = sgc;
    }

    public final rr3 a() {
        vgc vgc = (vgc) o23.X(this.a.e());
        if (vgc != null) {
            return vgc.a;
        }
        return null;
    }

    public final String b() {
        vgc vgc = (vgc) o23.X(this.a.e());
        if (vgc != null) {
            return vgc.b;
        }
        return null;
    }

    public final void c(String str, s16 s16) {
        if (!hhd.f(b(), str)) {
            vgc vgc = new vgc((rr3) s16.invoke(), (String) null, (wr3) null, (wr3) null, false, -1);
            vgc.d(str);
            this.a.R(vgc);
        }
    }
}
