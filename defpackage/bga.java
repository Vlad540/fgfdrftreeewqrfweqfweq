package defpackage;

/* renamed from: bga  reason: default package */
public final class bga {
    public final mc0 a;
    public final String b;
    public final le1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final hze g;
    public final ize h;
    public final boolean i;
    public final CharSequence j;

    public bga(mc0 mc0, String str, le1 le1, boolean z, boolean z2, boolean z3, hze hze, ize ize, boolean z4, CharSequence charSequence) {
        this.a = mc0;
        this.b = str;
        this.c = le1;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = hze;
        this.h = ize;
        this.i = z4;
        this.j = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bga)) {
            return false;
        }
        bga bga = (bga) obj;
        return hhd.f(this.a, bga.a) && hhd.f(this.b, bga.b) && hhd.f(this.c, bga.c) && this.d == bga.d && this.e == bga.e && this.f == bga.f && hhd.f(this.g, bga.g) && this.h == bga.h && this.i == bga.i && hhd.f(this.j, bga.j);
    }

    public final int hashCode() {
        int i2 = 0;
        mc0 mc0 = this.a;
        int hashCode = (mc0 == null ? 0 : mc0.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        le1 le1 = this.c;
        int f2 = th2.f(th2.f(th2.f((hashCode2 + (le1 == null ? 0 : le1.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        hze hze = this.g;
        int f3 = th2.f((this.h.hashCode() + ((f2 + (hze == null ? 0 : hze.hashCode())) * 31)) * 31, 31, this.i);
        CharSequence charSequence = this.j;
        if (charSequence != null) {
            i2 = charSequence.hashCode();
        }
        return f3 + i2;
    }

    public final String toString() {
        return "OpponentPipState(avatar=" + this.a + ", name=" + this.b + ", id=" + this.c + ", isTalking=" + this.d + ", isMicrophoneEnabled=" + this.e + ", isConnecting=" + this.f + ", videoState=" + this.g + ", action=" + this.h + ", isMe=" + this.i + ", userNameWithState=" + this.j + ")";
    }
}
