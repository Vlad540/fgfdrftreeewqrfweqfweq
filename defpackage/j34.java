package defpackage;

import android.os.Bundle;

/* renamed from: j34  reason: default package */
public final class j34 {
    public final String a;
    public final c34 b;
    public final Bundle c;
    public final int d;
    public final h34 e;
    public final i34 f;

    public j34(String str, c34 c34, Bundle bundle, int i, h34 h34, i34 i34) {
        this.a = str;
        this.b = c34;
        this.c = bundle;
        this.d = i;
        this.e = h34;
        this.f = i34;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j34)) {
            return false;
        }
        j34 j34 = (j34) obj;
        return hhd.f(this.a, j34.a) && hhd.f(this.b, j34.b) && hhd.f(this.c, j34.c) && this.d == j34.d && hhd.f(this.e, j34.e) && hhd.f(this.f, j34.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int h = us8.h(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        return this.f.hashCode() + ((this.e.hashCode() + h) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeepLinkScreen(name=");
        sb.append(this.a);
        sb.append(", route=");
        sb.append(this.b);
        sb.append(", deepLinkBundle=");
        sb.append("DeepLinkBundle(bundle=" + this.c + ")");
        sb.append(", mode=");
        int i = this.d;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "ACTIVITY" : "FRAGMENT" : "DEFAULT");
        sb.append(", animations=");
        sb.append(this.e);
        sb.append(", screenFactory=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ j34(java.lang.String r8, defpackage.c34 r9, android.os.Bundle r10, int r11, defpackage.h34 r12, defpackage.i34 r13, int r14) {
        /*
            r7 = this;
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0005
            r11 = 1
        L_0x0005:
            r4 = r11
            r11 = r14 & 16
            if (r11 == 0) goto L_0x000f
            h34 r12 = new h34
            r12.<init>()
        L_0x000f:
            r5 = r12
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j34.<init>(java.lang.String, c34, android.os.Bundle, int, h34, i34, int):void");
    }
}
