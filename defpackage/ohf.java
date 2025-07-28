package defpackage;

import java.util.List;

/* renamed from: ohf  reason: default package */
public final class ohf {
    public static final nhf Companion = new Object();
    public static final l77[] h = {null, null, new rr(d0e.a), null, null, null, null};
    public final String a;
    public final boolean b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public /* synthetic */ ohf(int i, String str, boolean z, List list, boolean z2, boolean z3, boolean z4, String str2) {
        if (127 == (i & 127)) {
            this.a = str;
            this.b = z;
            this.c = list;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            this.g = str2;
            return;
        }
        bm3.I(i, 127, mhf.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohf)) {
            return false;
        }
        ohf ohf = (ohf) obj;
        return hhd.f(this.a, ohf.a) && this.b == ohf.b && hhd.f(this.c, ohf.c) && this.d == ohf.d && this.e == ohf.e && this.f == ohf.f && hhd.f(this.g, ohf.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + th2.f(th2.f(th2.f(c3d.f(this.c, th2.f(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryInfoResponse(requestId=");
        sb.append(this.a);
        sb.append(", available=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", accessRequested=");
        sb.append(this.d);
        sb.append(", accessGranted=");
        sb.append(this.e);
        sb.append(", tokenSaved=");
        sb.append(this.f);
        sb.append(", deviceId=");
        return wn6.l(sb, this.g, ")");
    }

    public ohf(String str, List list, boolean z, boolean z2, boolean z3, String str2) {
        this.a = str;
        this.b = true;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str2;
    }
}
