package defpackage;

import android.net.Uri;

/* renamed from: h56  reason: default package */
public final class h56 extends i56 {
    public final boolean b;
    public final yk7 c;
    public final hbc d;
    public final kpa e;
    public final f3f f;
    public final Uri g;
    public int h;
    public final boolean i;
    public final long j;
    public final int k;
    public final Uri l;
    public final long m;

    public h56(boolean z, yk7 yk7, hbc hbc, kpa kpa, f3f f3f, Uri uri, int i2, boolean z2, long j2, int i3, Uri uri2) {
        super(10);
        this.b = z;
        this.c = yk7;
        this.d = hbc;
        this.e = kpa;
        this.f = f3f;
        this.g = uri;
        this.h = i2;
        this.i = z2;
        this.j = j2;
        this.k = i3;
        this.l = uri2;
        Long l2 = yk7.Z;
        this.m = l2 != null ? l2.longValue() : 0;
    }

    public static h56 b(h56 h56, kpa kpa, f3f f3f, Uri uri, int i2, boolean z, int i3, Uri uri2, int i4) {
        h56 h562 = h56;
        int i5 = i4;
        boolean z2 = h562.b;
        yk7 yk7 = h562.c;
        hbc hbc = h562.d;
        kpa kpa2 = (i5 & 8) != 0 ? h562.e : kpa;
        f3f f3f2 = (i5 & 16) != 0 ? h562.f : f3f;
        Uri uri3 = (i5 & 32) != 0 ? h562.g : uri;
        int i6 = (i5 & 64) != 0 ? h562.h : i2;
        boolean z3 = (i5 & 128) != 0 ? h562.i : z;
        long j2 = h562.j;
        int i7 = (i5 & 512) != 0 ? h562.k : i3;
        Uri uri4 = (i5 & 1024) != 0 ? h562.l : uri2;
        h56.getClass();
        return new h56(z2, yk7, hbc, kpa2, f3f2, uri3, i6, z3, j2, i7, uri4);
    }

    public final Long a() {
        return Long.valueOf(this.j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.h56) r8;
        r1 = r8.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.h56
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            h56 r8 = (defpackage.h56) r8
            boolean r1 = r8.b
            boolean r3 = r7.b
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            yk7 r1 = r7.c
            yk7 r3 = r8.c
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            hbc r1 = r7.d
            hbc r3 = r8.d
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            kpa r1 = r7.e
            kpa r3 = r8.e
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            f3f r1 = r7.f
            f3f r3 = r8.f
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x003f
            return r2
        L_0x003f:
            android.net.Uri r1 = r7.g
            android.net.Uri r3 = r8.g
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x004a
            return r2
        L_0x004a:
            int r1 = r7.h
            int r3 = r8.h
            if (r1 == r3) goto L_0x0051
            return r2
        L_0x0051:
            boolean r1 = r7.i
            boolean r3 = r8.i
            if (r1 == r3) goto L_0x0058
            return r2
        L_0x0058:
            long r3 = r7.j
            long r5 = r8.j
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0061
            return r2
        L_0x0061:
            int r1 = r7.k
            int r3 = r8.k
            if (r1 == r3) goto L_0x0068
            return r2
        L_0x0068:
            android.net.Uri r7 = r7.l
            android.net.Uri r8 = r8.l
            boolean r7 = hhd.f(r7, r8)
            if (r7 != 0) goto L_0x0073
            return r2
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h56.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31)) * 31;
        int i2 = 0;
        kpa kpa = this.e;
        int hashCode2 = (hashCode + (kpa == null ? 0 : kpa.hashCode())) * 31;
        f3f f3f = this.f;
        int hashCode3 = (hashCode2 + (f3f == null ? 0 : f3f.hashCode())) * 31;
        Uri uri = this.g;
        if (uri != null) {
            i2 = uri.hashCode();
        }
        return this.l.hashCode() + c3d.d(this.k, sxe.m(th2.f(c3d.d(this.h, (hashCode3 + i2) * 31, 31), 31, this.i), 31, this.j), 31);
    }

    public final String toString() {
        int i2 = this.h;
        return "Media(multiSelect=" + this.b + ", origin=" + this.c + ", resizeOptions=" + this.d + ", photoEditorOptions=" + this.e + ", videoConvertOptions=" + this.f + ", overlay=" + this.g + ", selectionNumber=" + i2 + ", enabled=" + this.i + ", id=" + this.j + ", rotation=" + this.k + ", thumbnailUri=" + this.l + ")";
    }
}
