package defpackage;

/* renamed from: xye  reason: default package */
public final class xye implements pg7 {
    public final long X;
    public final ep5 a;
    public final wye b;
    public final mge c;
    public final int o;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r1.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xye(ep5 r1, defpackage.wye r2, mge r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            int r3 = r2.ordinal()
            r0.o = r3
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = r1.a
            if (r1 == 0) goto L_0x001a
            int r1 = r1.hashCode()
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            int r2 = r2.hashCode()
            int r2 = r2 * 33
            int r2 = r2 + r1
            long r1 = (long) r2
            r0.X = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xye.<init>(ep5, wye, mge):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xye)) {
            return false;
        }
        xye xye = (xye) obj;
        return hhd.f(this.a, xye.a) && this.b == xye.b && hhd.f(this.c, xye.c);
    }

    public final boolean g(pg7 pg7) {
        if (!(pg7 instanceof xye)) {
            return false;
        }
        String str = null;
        ep5 ep5 = this.a;
        String str2 = ep5 != null ? ep5.a : null;
        ep5 ep52 = ((xye) pg7).a;
        if (ep52 != null) {
            str = ep52.a;
        }
        return hhd.f(str2, str);
    }

    public final long getItemId() {
        return this.X;
    }

    public final int hashCode() {
        ep5 ep5 = this.a;
        int hashCode = ep5 == null ? 0 : ep5.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final int l() {
        return this.o;
    }

    public final String toString() {
        return "UserFolderListItem(folder=" + this.a + ", type=" + this.b + ", processedTitle=" + this.c + ")";
    }
}
