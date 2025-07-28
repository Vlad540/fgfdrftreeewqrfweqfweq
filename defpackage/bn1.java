package defpackage;

import java.util.List;

/* renamed from: bn1  reason: default package */
public final class bn1 {
    public final raf a;
    public final List b;
    public final bue c;
    public final a97 d;
    public final boolean e;
    public final mc0 f;

    public bn1(raf raf, List list, bue bue, a97 a97, boolean z, mc0 mc0) {
        this.a = raf;
        this.b = list;
        this.c = bue;
        this.d = a97;
        this.e = z;
        this.f = mc0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.bn1) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.bn1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            bn1 r5 = (defpackage.bn1) r5
            raf r1 = r5.a
            raf r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.util.List r1 = r4.b
            java.util.List r3 = r5.b
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            bue r1 = r4.c
            bue r3 = r5.c
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            a97 r1 = r4.d
            a97 r3 = r5.d
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L_0x003b
            return r2
        L_0x003b:
            mc0 r4 = r4.f
            mc0 r5 = r5.f
            boolean r4 = defpackage.hhd.f(r4, r5)
            if (r4 != 0) goto L_0x0046
            return r2
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int f2 = c3d.f(this.b, this.a.hashCode() * 31, 31);
        int i = 0;
        bue bue = this.c;
        int hashCode = (f2 + (bue == null ? 0 : bue.hashCode())) * 31;
        a97 a97 = this.d;
        int f3 = th2.f((hashCode + (a97 == null ? 0 : a97.hashCode())) * 31, 31, this.e);
        mc0 mc0 = this.f;
        if (mc0 != null) {
            i = mc0.hashCode();
        }
        return f3 + i;
    }

    public final String toString() {
        return "CallViewState(activeMode=" + this.a + ", modes=" + this.b + ", unavailableCallState=" + this.c + ", labelSpeakerState=" + this.d + ", isGroupCall=" + this.e + ", mainSpeakerAvatar=" + this.f + ")";
    }
}
