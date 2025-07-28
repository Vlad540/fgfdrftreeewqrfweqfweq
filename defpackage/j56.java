package defpackage;

/* renamed from: j56  reason: default package */
public final class j56 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final hbc f;
    public final boolean g = false;
    public final hbc h;

    public j56(int i, int i2, int i3, int i4, int i5, hbc hbc) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = hbc;
        this.h = i5 <= 0 ? null : new hbc(0.0f, i5, i5, 12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.j56) r5;
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
            boolean r1 = r5 instanceof defpackage.j56
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            j56 r5 = (defpackage.j56) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            int r1 = r4.d
            int r3 = r5.d
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            int r1 = r4.e
            int r3 = r5.e
            if (r1 == r3) goto L_0x002f
            return r2
        L_0x002f:
            hbc r1 = r4.f
            hbc r3 = r5.f
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x003a
            return r2
        L_0x003a:
            boolean r4 = r4.g
            boolean r5 = r5.g
            if (r4 == r5) goto L_0x0041
            return r2
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j56.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d2 = c3d.d(this.e, c3d.d(this.d, c3d.d(this.c, c3d.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + d2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryUiOptions(cellSize=");
        sb.append(this.a);
        sb.append(", threshold=");
        sb.append(this.b);
        sb.append(", spanCount=");
        sb.append(this.c);
        sb.append(", spanSpacing=");
        sb.append(this.d);
        sb.append(", thumbnailSize=");
        sb.append(this.e);
        sb.append(", albumsCoverResizeOptions=");
        sb.append(this.f);
        sb.append(", isItemAnimatorEnabled=");
        return hr1.j(sb, this.g, ")");
    }
}
