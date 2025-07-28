package defpackage;

/* renamed from: sj2  reason: default package */
public final class sj2 {
    public final i22 a;
    public final xm8 b;
    public final xm8 c;
    public final dcf d;
    public final sw8 e;
    public final jo2 f;

    public sj2(i22 i22, xm8 xm8, xm8 xm82, dcf dcf, sw8 sw8, jo2 jo2) {
        this.a = i22;
        this.b = xm8;
        this.c = xm82;
        this.d = dcf;
        this.e = sw8;
        this.f = jo2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj2)) {
            return false;
        }
        sj2 sj2 = (sj2) obj;
        return hhd.f(this.a, sj2.a) && hhd.f(this.b, sj2.b) && hhd.f(this.c, sj2.c) && this.d == sj2.d && hhd.f(this.e, sj2.e) && hhd.f(this.f, sj2.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        return this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChatPreviewStubModel(chat=" + this.a + ", incomingMessage=" + this.b + ", outgoingMessage=" + this.c + ", messageViewStatus=" + this.d + ", messageTextLayoutRepository=" + this.e + ", chatTheme=" + this.f + ")";
    }
}
