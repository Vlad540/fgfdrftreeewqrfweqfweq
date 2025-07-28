package defpackage;

/* renamed from: wp0  reason: default package */
public final class wp0 {
    public final hy7 a;
    public final hy7 b;
    public final hy7 c;
    public final l31 d;

    public wp0(hy7 hy7, hy7 hy72, hy7 hy73, l31 l31) {
        this.a = hy7;
        this.b = hy72;
        this.c = hy73;
        this.d = l31;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.wp0) r5;
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
            boolean r1 = r5 instanceof defpackage.wp0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            wp0 r5 = (defpackage.wp0) r5
            hy7 r1 = r5.a
            hy7 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            hy7 r1 = r4.b
            hy7 r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            hy7 r1 = r4.c
            hy7 r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            l31 r4 = r4.d
            l31 r5 = r5.d
            boolean r4 = defpackage.hhd.f(r4, r5)
            if (r4 != 0) goto L_0x002c
            return r2
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BottomPanelState(isMicrophoneEnabled=" + this.a + ", isVideoEnabled=" + this.b + ", isRaiseHandEnabled=" + this.c + ", dynamicType=" + this.d + ")";
    }
}
