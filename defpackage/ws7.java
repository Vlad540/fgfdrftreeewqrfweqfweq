package defpackage;

/* renamed from: ws7  reason: default package */
public final class ws7 {
    public final mc0 a;
    public final CharSequence b;
    public final le1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final hze h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final CharSequence l;
    public final String m;

    public ws7(mc0 mc0, CharSequence charSequence, le1 le1, boolean z, boolean z2, boolean z3, boolean z4, hze hze, boolean z5, boolean z6, int i2, CharSequence charSequence2, String str) {
        this.a = mc0;
        this.b = charSequence;
        this.c = le1;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = hze;
        this.i = z5;
        this.j = z6;
        this.k = i2;
        this.l = charSequence2;
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws7)) {
            return false;
        }
        ws7 ws7 = (ws7) obj;
        return hhd.f(this.a, ws7.a) && hhd.f(this.b, ws7.b) && hhd.f(this.c, ws7.c) && this.d == ws7.d && this.e == ws7.e && this.f == ws7.f && this.g == ws7.g && hhd.f(this.h, ws7.h) && this.i == ws7.i && this.j == ws7.j && this.k == ws7.k && hhd.f(this.l, ws7.l) && hhd.f(this.m, ws7.m);
    }

    public final int hashCode() {
        int i2 = 0;
        mc0 mc0 = this.a;
        int hashCode = (mc0 == null ? 0 : mc0.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        le1 le1 = this.c;
        int f2 = th2.f(th2.f(th2.f(th2.f((hashCode2 + (le1 == null ? 0 : le1.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        hze hze = this.h;
        int h2 = us8.h(this.k, th2.f(th2.f((f2 + (hze == null ? 0 : hze.hashCode())) * 31, 31, this.i), 31, this.j), 31);
        CharSequence charSequence2 = this.l;
        int hashCode3 = (h2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.m;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainSpeakerState(avatar=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", isTalking=");
        sb.append(this.d);
        sb.append(", isConnectedOnce=");
        sb.append(this.e);
        sb.append(", isUserConnectionOnce=");
        sb.append(this.f);
        sb.append(", isConnecting=");
        sb.append(this.g);
        sb.append(", videoState=");
        sb.append(this.h);
        sb.append(", isMe=");
        sb.append(this.i);
        sb.append(", isRaiseHand=");
        sb.append(this.j);
        sb.append(", talkingState=");
        sb.append(c3d.p(this.k));
        sb.append(", label=");
        sb.append(this.l);
        sb.append(", userNameAccessibility=");
        return wn6.l(sb, this.m, ")");
    }
}
