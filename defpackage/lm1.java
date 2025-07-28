package defpackage;

/* renamed from: lm1  reason: default package */
public final class lm1 {
    public static final lm1 h = new lm1(true, raf.a, 96);
    public final le1 a;
    public final le1 b;
    public final le1 c;
    public final boolean d;
    public final raf e;
    public final boolean f;
    public final vye g;

    public lm1(le1 le1, le1 le12, le1 le13, boolean z, raf raf, boolean z2, vye vye) {
        this.a = le1;
        this.b = le12;
        this.c = le13;
        this.d = z;
        this.e = raf;
        this.f = z2;
        this.g = vye;
    }

    public static lm1 a(lm1 lm1, le1 le1, le1 le12, le1 le13, raf raf, boolean z, vye vye, int i) {
        if ((i & 1) != 0) {
            le1 = lm1.a;
        }
        le1 le14 = le1;
        if ((i & 2) != 0) {
            le12 = lm1.b;
        }
        le1 le15 = le12;
        if ((i & 4) != 0) {
            le13 = lm1.c;
        }
        le1 le16 = le13;
        boolean z2 = (i & 8) != 0 ? lm1.d : false;
        if ((i & 16) != 0) {
            raf = lm1.e;
        }
        raf raf2 = raf;
        if ((i & 32) != 0) {
            z = lm1.f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            vye = lm1.g;
        }
        lm1.getClass();
        return new lm1(le14, le15, le16, z2, raf2, z3, vye);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm1)) {
            return false;
        }
        lm1 lm1 = (lm1) obj;
        return hhd.f(this.a, lm1.a) && hhd.f(this.b, lm1.b) && hhd.f(this.c, lm1.c) && this.d == lm1.d && this.e == lm1.e && this.f == lm1.f && this.g == lm1.g;
    }

    public final int hashCode() {
        int i = 0;
        le1 le1 = this.a;
        int hashCode = (le1 == null ? 0 : le1.hashCode()) * 31;
        le1 le12 = this.b;
        int hashCode2 = (hashCode + (le12 == null ? 0 : le12.hashCode())) * 31;
        le1 le13 = this.c;
        if (le13 != null) {
            i = le13.hashCode();
        }
        return this.g.hashCode() + th2.f((this.e.hashCode() + th2.f((hashCode2 + i) * 31, 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        return "CallUserState(pinnedOpponentId=" + this.a + ", pipOpponentIdState=" + this.b + ", selectedOpponentId=" + this.c + ", canShowInviteBanner=" + this.d + ", modeView=" + this.e + ", raiseHandOnce=" + this.f + ", vpnNotification=" + this.g + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm1(boolean z, raf raf, int i) {
        this((le1) null, (le1) null, (le1) null, (i & 8) != 0 ? true : z, (i & 16) != 0 ? raf.a : raf, false, vye.o);
    }
}
