package defpackage;

/* renamed from: jpc  reason: default package */
public final class jpc {
    public static final jpc e = new jpc(0, false, false, (ipc) null);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final ipc d;

    public jpc(int i, boolean z, boolean z2, ipc ipc) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = ipc;
    }

    public static jpc a(jpc jpc, int i, boolean z, boolean z2, ipc ipc, int i2) {
        if ((i2 & 1) != 0) {
            i = jpc.a;
        }
        if ((i2 & 2) != 0) {
            z = jpc.b;
        }
        if ((i2 & 4) != 0) {
            z2 = jpc.c;
        }
        if ((i2 & 8) != 0) {
            ipc = jpc.d;
        }
        jpc.getClass();
        return new jpc(i, z, z2, ipc);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.jpc) r5;
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
            boolean r1 = r5 instanceof defpackage.jpc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            jpc r5 = (defpackage.jpc) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            ipc r4 = r4.d
            ipc r5 = r5.d
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x002c
            return r2
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int f = th2.f(th2.f(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        ipc ipc = this.d;
        return f + (ipc == null ? 0 : ipc.hashCode());
    }

    public final String toString() {
        return "ScrollState(unreadMessages=" + this.a + ", isUnreadButtonVisible=" + this.b + ", isMentionButtonVisible=" + this.c + ", lastReaction=" + this.d + ")";
    }
}
