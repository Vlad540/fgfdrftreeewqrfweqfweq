package defpackage;

/* renamed from: ne0  reason: default package */
public final class ne0 {
    public final boolean a;
    public final boolean b;

    public ne0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static void a(boolean z, xwb xwb, String str, String str2) {
        if (z) {
            xwb.log("BadNetworkIndicatorConfig", me4.j("[", str, "]: ", str2));
        }
    }

    public final void b(xwb xwb, String str, String str2) {
        a(this.a, xwb, str, str2);
    }

    public final void c(xwb xwb, String str, String str2) {
        a(this.b, xwb, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ne0) r5;
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
            boolean r1 = r5 instanceof defpackage.ne0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ne0 r5 = (defpackage.ne0) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r4 = r4.b
            boolean r5 = r5.b
            if (r4 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DebugLoggingConfig(debugLogging=" + this.a + ", debugVerboseLogging=" + this.b + ")";
    }
}
