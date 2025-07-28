package defpackage;

import java.io.Closeable;

/* renamed from: nr0  reason: default package */
public final class nr0 implements Closeable {
    public byte[] X;
    public int Y = -1;
    public int Z = -1;
    public wr0 a;
    public boolean b;
    public kuc c;
    public long o = -1;

    public final void a(long j) {
        long j2 = j;
        wr0 wr0 = this.a;
        if (wr0 == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        } else if (this.b) {
            long j3 = wr0.b;
            int i = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
            if (i <= 0) {
                if (j2 >= 0) {
                    long j4 = j3 - j2;
                    while (true) {
                        if (j4 <= 0) {
                            break;
                        }
                        kuc kuc = wr0.a.g;
                        int i2 = kuc.c;
                        long j5 = (long) (i2 - kuc.b);
                        if (j5 > j4) {
                            kuc.c = i2 - ((int) j4);
                            break;
                        }
                        wr0.a = kuc.a();
                        bvc.a(kuc);
                        j4 -= j5;
                    }
                    this.c = null;
                    this.o = j2;
                    this.X = null;
                    this.Y = -1;
                    this.Z = -1;
                } else {
                    throw new IllegalArgumentException(us8.i(j2, "newSize < 0: ").toString());
                }
            } else if (i > 0) {
                long j6 = j2 - j3;
                int i3 = 1;
                boolean z = true;
                for (long j7 = 0; j6 > j7; j7 = 0) {
                    kuc r0 = wr0.r0(i3);
                    int min = (int) Math.min(j6, (long) (8192 - r0.c));
                    int i4 = r0.c + min;
                    r0.c = i4;
                    j6 -= (long) min;
                    if (z) {
                        this.c = r0;
                        this.o = j3;
                        this.X = r0.a;
                        this.Y = i4 - min;
                        this.Z = i4;
                        z = false;
                    }
                    i3 = 1;
                }
            }
            wr0.b = j2;
        } else {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
    }

    public final void close() {
        if (this.a != null) {
            this.a = null;
            this.c = null;
            this.o = -1;
            this.X = null;
            this.Y = -1;
            this.Z = -1;
            return;
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r5 = r3.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(long r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            wr0 r3 = r0.a
            if (r3 == 0) goto L_0x00ce
            r4 = -1
            long r5 = (long) r4
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00af
            long r5 = r3.b
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x00af
            r8 = -1
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x00a3
            if (r7 != 0) goto L_0x001e
            goto L_0x00a3
        L_0x001e:
            kuc r4 = r3.a
            kuc r7 = r0.c
            r8 = 0
            if (r7 == 0) goto L_0x003c
            long r10 = r0.o
            int r12 = r0.Y
            int r13 = r7.b
            int r12 = r12 - r13
            long r12 = (long) r12
            long r10 = r10 - r12
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 <= 0) goto L_0x003a
            r5 = r10
            r16 = r7
            r7 = r4
            r4 = r16
            goto L_0x003d
        L_0x003a:
            r8 = r10
            goto L_0x003d
        L_0x003c:
            r7 = r4
        L_0x003d:
            long r10 = r5 - r1
            long r12 = r1 - r8
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0054
        L_0x0045:
            int r4 = r7.c
            int r5 = r7.b
            int r4 = r4 - r5
            long r4 = (long) r4
            long r4 = r4 + r8
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0064
            kuc r7 = r7.f
            r8 = r4
            goto L_0x0045
        L_0x0054:
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x0062
            kuc r4 = r4.g
            int r7 = r4.c
            int r8 = r4.b
            int r7 = r7 - r8
            long r7 = (long) r7
            long r5 = r5 - r7
            goto L_0x0054
        L_0x0062:
            r7 = r4
            r8 = r5
        L_0x0064:
            boolean r4 = r0.b
            if (r4 == 0) goto L_0x008e
            boolean r4 = r7.d
            if (r4 == 0) goto L_0x008e
            kuc r4 = new kuc
            byte[] r5 = r7.a
            int r6 = r5.length
            byte[] r11 = java.util.Arrays.copyOf(r5, r6)
            int r12 = r7.b
            int r13 = r7.c
            r14 = 0
            r15 = 1
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            kuc r5 = r3.a
            if (r5 != r7) goto L_0x0085
            r3.a = r4
        L_0x0085:
            r7.b(r4)
            kuc r3 = r4.g
            r3.a()
            r7 = r4
        L_0x008e:
            r0.c = r7
            r0.o = r1
            byte[] r3 = r7.a
            r0.X = r3
            int r3 = r7.b
            long r1 = r1 - r8
            int r1 = (int) r1
            int r3 = r3 + r1
            r0.Y = r3
            int r1 = r7.c
            r0.Z = r1
            int r1 = r1 - r3
            return r1
        L_0x00a3:
            r3 = 0
            r0.c = r3
            r0.o = r1
            r0.X = r3
            r0.Y = r4
            r0.Z = r4
            return r4
        L_0x00af:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            long r2 = r3.b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            r2 = 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "offset=%s > size=%s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x00ce:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "not attached to a buffer"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr0.d(long):int");
    }
}
