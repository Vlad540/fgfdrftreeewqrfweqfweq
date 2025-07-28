package defpackage;

/* renamed from: bg1  reason: default package */
public final class bg1 {
    public final za6 a;
    public final za6 b;
    public final za6 c;
    public final za6 d;
    public final za6 e;
    public final za6 f;

    public bg1(int i, int i2, int i3, int i4, int i5, int i6) {
        za6 za6 = new za6((Object) Integer.valueOf(i));
        za6 za62 = new za6((Object) Integer.valueOf(i2));
        za6 za63 = new za6((Object) Integer.valueOf(i3));
        za6 za64 = new za6((Object) Integer.valueOf(i4));
        za6 za65 = new za6((Object) Integer.valueOf(i5));
        za6 za66 = new za6((Object) Integer.valueOf(i6));
        this.a = za6;
        this.b = za62;
        this.c = za63;
        this.d = za64;
        this.e = za65;
        this.f = za66;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg1)) {
            return false;
        }
        bg1 bg1 = (bg1) obj;
        return hhd.f(this.a, bg1.a) && hhd.f(this.b, bg1.b) && hhd.f(this.c, bg1.c) && hhd.f(this.d, bg1.d) && hhd.f(this.e, bg1.e) && hhd.f(this.f, bg1.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        return this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SoundConfig(end=" + this.a + ", ringtone=" + this.b + ", beep=" + this.c + ", connecting=" + this.d + ", connected=" + this.e + ", busy=" + this.f + ")";
    }
}
