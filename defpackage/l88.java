package defpackage;

/* renamed from: l88  reason: default package */
public final class l88 {
    public final k88 a;
    public final k88 b;
    public final k88 c;
    public final k88 d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ l88() {
        /*
            r1 = this;
            k88 r0 = defpackage.k88.a
            r1.<init>(r0, r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l88.<init>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.l88) r5;
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
            boolean r1 = r5 instanceof defpackage.l88
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            l88 r5 = (defpackage.l88) r5
            k88 r1 = r5.a
            k88 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            k88 r1 = r4.b
            k88 r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            k88 r1 = r4.c
            k88 r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            k88 r4 = r4.d
            k88 r5 = r5.d
            if (r4 == r5) goto L_0x0028
            return r2
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l88.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MediaOptions(audioState=" + this.a + ", videoState=" + this.b + ", screenshareState=" + this.c + ", movieSharingState=" + this.d + ")";
    }

    public l88(k88 k88, k88 k882, k88 k883, k88 k884) {
        this.a = k88;
        this.b = k882;
        this.c = k883;
        this.d = k884;
    }
}
