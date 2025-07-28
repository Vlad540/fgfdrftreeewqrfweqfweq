package defpackage;

/* renamed from: it8  reason: default package */
public final class it8 extends lt8 {
    public final boolean a;
    public final int b;

    public it8(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.it8) r5;
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
            boolean r1 = r5 instanceof defpackage.it8
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            it8 r5 = (defpackage.it8) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return hr1.t(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpandEmoji(expand=");
        sb.append(this.a);
        sb.append(", collapseType=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "BY_MEDIA_KEYBOARD" : "BY_EMOJI_STATE" : "BY_FOCUS" : "BY_DEFAULT");
        sb.append(")");
        return sb.toString();
    }
}
