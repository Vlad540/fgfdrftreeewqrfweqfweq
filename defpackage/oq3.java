package defpackage;

/* renamed from: oq3  reason: default package */
public final class oq3 {
    public final mge a;
    public final Integer b;
    public final vce c;
    public final vce d;
    public final s16 e;

    public oq3(mge mge, Integer num, vce vce, vce vce2, s16 s16) {
        this.a = mge;
        this.b = num;
        this.c = vce;
        this.d = vce2;
        this.e = s16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq3)) {
            return false;
        }
        oq3 oq3 = (oq3) obj;
        return hhd.f(this.a, oq3.a) && hhd.f(this.b, oq3.b) && this.c == oq3.c && this.d == oq3.d && hhd.f(this.e, oq3.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = this.c.hashCode();
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ContextMenuAction(title=" + this.a + ", icon=" + this.b + ", iconColor=" + this.c + ", titleColor=" + this.d + ", clickAction=" + this.e + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq3(hge hge, Integer num, s16 s16, int i) {
        this(hge, (i & 2) != 0 ? null : num, vce.y0, vce.H0, s16);
    }
}
