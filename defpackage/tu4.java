package defpackage;

/* renamed from: tu4  reason: default package */
public final class tu4 {
    public int a = 1;
    public final n39 b;
    public n39 c;
    public n39 d;
    public int e;
    public int f;
    public final boolean g;
    public final int[] h;

    public tu4(n39 n39, boolean z, int[] iArr) {
        this.b = n39;
        this.c = n39;
        this.g = z;
        this.h = iArr;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r0 = r4.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r4 = this;
            n39 r0 = r4.c
            hte r0 = r0.b
            g39 r0 = r0.c()
            r1 = 6
            int r1 = r0.a(r1)
            r2 = 1
            if (r1 == 0) goto L_0x001e
            java.lang.Object r3 = r0.o
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r0 = r0.a
            int r1 = r1 + r0
            byte r0 = r3.get(r1)
            if (r0 == 0) goto L_0x001e
            return r2
        L_0x001e:
            int r0 = r4.e
            r1 = 65039(0xfe0f, float:9.1139E-41)
            if (r0 != r1) goto L_0x0026
            return r2
        L_0x0026:
            boolean r0 = r4.g
            r1 = 0
            if (r0 == 0) goto L_0x003f
            int[] r0 = r4.h
            if (r0 != 0) goto L_0x0030
            return r2
        L_0x0030:
            n39 r4 = r4.c
            hte r4 = r4.b
            int r4 = r4.a(r1)
            int r4 = java.util.Arrays.binarySearch(r0, r4)
            if (r4 >= 0) goto L_0x003f
            return r2
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu4.b():boolean");
    }
}
