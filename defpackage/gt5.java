package defpackage;

import java.io.Serializable;

/* renamed from: gt5  reason: default package */
public final class gt5 extends gr8 {
    public final /* synthetic */ int a;
    public Serializable b;

    /* JADX WARNING: type inference failed for: r2v1, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [ht5[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r2v9, types: [long[], java.io.Serializable] */
    public gt5(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = iu7.k;
                this.cachedSize = -1;
                return;
            case 2:
                if (ht5.i == null) {
                    synchronized (tz6.b) {
                        try {
                            if (ht5.i == null) {
                                ht5.i = new ht5[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.b = ht5.i;
                this.cachedSize = -1;
                return;
            case 3:
                this.b = "";
                this.cachedSize = -1;
                return;
            default:
                this.b = iu7.l;
                this.cachedSize = -1;
                return;
        }
    }

    public final int computeSerializedSize() {
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.b;
                int i = 0;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int i2 = 0;
                while (true) {
                    long[] jArr2 = (long[]) this.b;
                    if (i >= jArr2.length) {
                        return i2 + jArr2.length;
                    }
                    i2 += o13.k(jArr2[i]);
                    i++;
                }
                break;
            case 1:
                int[] iArr = (int[]) this.b;
                int i3 = 0;
                if (iArr == null || iArr.length <= 0) {
                    return 0;
                }
                int i4 = 0;
                while (true) {
                    int[] iArr2 = (int[]) this.b;
                    if (i3 >= iArr2.length) {
                        return i4 + iArr2.length;
                    }
                    i4 += o13.g(iArr2[i3]);
                    i3++;
                }
                break;
            case 2:
                ht5[] ht5Arr = (ht5[]) this.b;
                int i5 = 0;
                if (ht5Arr == null || ht5Arr.length <= 0) {
                    return 0;
                }
                int i6 = 0;
                while (true) {
                    gr8[] gr8Arr = (ht5[]) this.b;
                    if (i5 >= gr8Arr.length) {
                        return i6;
                    }
                    gr8 gr8 = gr8Arr[i5];
                    if (gr8 != null) {
                        i6 = o13.i(1, gr8) + i6;
                    }
                    i5++;
                }
                break;
            default:
                if (!((String) this.b).equals("")) {
                    return o13.l(1, (String) this.b);
                }
                return 0;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [long[], java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r5v0, types: [long[], java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r4v7, types: [int[], java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r5v1, types: [int[], java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r4v14, types: [ht5[], java.lang.Object, java.io.Serializable] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r7.s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 == 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r0 == 10) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r7.u(r0) != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r0 = iu7.z(r7, 10);
        r1 = (defpackage.ht5[]) r6.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r1 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r3 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r0 = r0 + r3;
        r4 = new defpackage.ht5[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r3 == 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        java.lang.System.arraycopy(r1, 0, r4, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        if (r3 >= (r0 - 1)) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        r1 = new defpackage.ht5();
        r4[r3] = r1;
        r7.j(r1);
        r7.s();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        r0 = new defpackage.ht5();
        r4[r3] = r0;
        r7.j(r0);
        r6.b = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        r0 = r7.s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r0 == 0) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r7.s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r0 == 8) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        if (r0 == 10) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        if (r7.u(r0) != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0 = r7.e(r7.p());
        r1 = r7.c();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        if (r7.b() <= 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        r7.p();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r0 == 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        r7.t(r1);
        r1 = (int[]) r6.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        if (r1 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a0, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        r4 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a3, code lost:
        r3 = r3 + r4;
        r5 = new int[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a6, code lost:
        if (r4 == 0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a8, code lost:
        java.lang.System.arraycopy(r1, 0, r5, 0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ab, code lost:
        if (r4 >= r3) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ad, code lost:
        r5[r4] = r7.p();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        r6.b = r5;
        r7.d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bc, code lost:
        r0 = iu7.z(r7, 8);
        r1 = (int[]) r6.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c4, code lost:
        if (r1 != null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c6, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c8, code lost:
        r3 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c9, code lost:
        r0 = r0 + r3;
        r4 = new int[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cc, code lost:
        if (r3 == 0) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ce, code lost:
        java.lang.System.arraycopy(r1, 0, r4, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d3, code lost:
        if (r3 >= (r0 - 1)) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d5, code lost:
        r4[r3] = r7.p();
        r7.s();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0 == 10) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e1, code lost:
        r4[r3] = r7.p();
        r6.b = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00eb, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ec, code lost:
        r0 = r7.s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f0, code lost:
        if (r0 == 0) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f5, code lost:
        if (r0 == 8) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f9, code lost:
        if (r0 == 10) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ff, code lost:
        if (r7.u(r0) != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0103, code lost:
        r0 = r7.e(r7.p());
        r1 = r7.c();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0114, code lost:
        if (r7.b() <= 0) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0116, code lost:
        r7.q();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x011c, code lost:
        r7.t(r1);
        r1 = (long[]) r6.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0123, code lost:
        if (r1 != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0125, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0127, code lost:
        r4 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0128, code lost:
        r3 = r3 + r4;
        r5 = new long[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x012b, code lost:
        if (r4 == 0) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r7.u(r0) != false) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x012d, code lost:
        java.lang.System.arraycopy(r1, 0, r5, 0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0130, code lost:
        if (r4 >= r3) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0132, code lost:
        r5[r4] = r7.q();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013b, code lost:
        r6.b = r5;
        r7.d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0141, code lost:
        r0 = iu7.z(r7, 8);
        r1 = (long[]) r6.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0149, code lost:
        if (r1 != null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x014b, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x014d, code lost:
        r3 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x014e, code lost:
        r0 = r0 + r3;
        r4 = new long[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0151, code lost:
        if (r3 == 0) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r6.b = r7.r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0153, code lost:
        java.lang.System.arraycopy(r1, 0, r4, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0158, code lost:
        if (r3 >= (r0 - 1)) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015a, code lost:
        r4[r3] = r7.q();
        r7.s();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0166, code lost:
        r4[r3] = r7.q();
        r6.b = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0170, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final gr8 mergeFrom(n13 r7) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x00ec;
                case 1: goto L_0x0067;
                case 2: goto L_0x001e;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = r7.s()
            if (r0 == 0) goto L_0x001d
            r1 = 10
            if (r0 == r1) goto L_0x0016
            boolean r0 = r7.u(r0)
            if (r0 != 0) goto L_0x0005
            goto L_0x001d
        L_0x0016:
            java.lang.String r0 = r7.r()
            r6.b = r0
            goto L_0x0005
        L_0x001d:
            return r6
        L_0x001e:
            int r0 = r7.s()
            if (r0 == 0) goto L_0x0066
            r1 = 10
            if (r0 == r1) goto L_0x002f
            boolean r0 = r7.u(r0)
            if (r0 != 0) goto L_0x001e
            goto L_0x0066
        L_0x002f:
            int r0 = iu7.z(r7, r1)
            java.io.Serializable r1 = r6.b
            ht5[] r1 = (defpackage.ht5[]) r1
            r2 = 0
            if (r1 != 0) goto L_0x003c
            r3 = r2
            goto L_0x003d
        L_0x003c:
            int r3 = r1.length
        L_0x003d:
            int r0 = r0 + r3
            ht5[] r4 = new defpackage.ht5[r0]
            if (r3 == 0) goto L_0x0045
            java.lang.System.arraycopy(r1, r2, r4, r2, r3)
        L_0x0045:
            int r1 = r0 + -1
            if (r3 >= r1) goto L_0x0059
            ht5 r1 = new ht5
            r1.<init>()
            r4[r3] = r1
            r7.j(r1)
            r7.s()
            int r3 = r3 + 1
            goto L_0x0045
        L_0x0059:
            ht5 r0 = new ht5
            r0.<init>()
            r4[r3] = r0
            r7.j(r0)
            r6.b = r4
            goto L_0x001e
        L_0x0066:
            return r6
        L_0x0067:
            int r0 = r7.s()
            if (r0 == 0) goto L_0x00eb
            r1 = 8
            r2 = 0
            if (r0 == r1) goto L_0x00bc
            r1 = 10
            if (r0 == r1) goto L_0x007e
            boolean r0 = r7.u(r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x00eb
        L_0x007e:
            int r0 = r7.p()
            int r0 = r7.e(r0)
            int r1 = r7.c()
            r3 = r2
        L_0x008b:
            int r4 = r7.b()
            if (r4 <= 0) goto L_0x0097
            r7.p()
            int r3 = r3 + 1
            goto L_0x008b
        L_0x0097:
            r7.t(r1)
            java.io.Serializable r1 = r6.b
            int[] r1 = (int[]) r1
            if (r1 != 0) goto L_0x00a2
            r4 = r2
            goto L_0x00a3
        L_0x00a2:
            int r4 = r1.length
        L_0x00a3:
            int r3 = r3 + r4
            int[] r5 = new int[r3]
            if (r4 == 0) goto L_0x00ab
            java.lang.System.arraycopy(r1, r2, r5, r2, r4)
        L_0x00ab:
            if (r4 >= r3) goto L_0x00b6
            int r1 = r7.p()
            r5[r4] = r1
            int r4 = r4 + 1
            goto L_0x00ab
        L_0x00b6:
            r6.b = r5
            r7.d(r0)
            goto L_0x0067
        L_0x00bc:
            int r0 = iu7.z(r7, r1)
            java.io.Serializable r1 = r6.b
            int[] r1 = (int[]) r1
            if (r1 != 0) goto L_0x00c8
            r3 = r2
            goto L_0x00c9
        L_0x00c8:
            int r3 = r1.length
        L_0x00c9:
            int r0 = r0 + r3
            int[] r4 = new int[r0]
            if (r3 == 0) goto L_0x00d1
            java.lang.System.arraycopy(r1, r2, r4, r2, r3)
        L_0x00d1:
            int r1 = r0 + -1
            if (r3 >= r1) goto L_0x00e1
            int r1 = r7.p()
            r4[r3] = r1
            r7.s()
            int r3 = r3 + 1
            goto L_0x00d1
        L_0x00e1:
            int r0 = r7.p()
            r4[r3] = r0
            r6.b = r4
            goto L_0x0067
        L_0x00eb:
            return r6
        L_0x00ec:
            int r0 = r7.s()
            if (r0 == 0) goto L_0x0170
            r1 = 8
            r2 = 0
            if (r0 == r1) goto L_0x0141
            r1 = 10
            if (r0 == r1) goto L_0x0103
            boolean r0 = r7.u(r0)
            if (r0 != 0) goto L_0x00ec
            goto L_0x0170
        L_0x0103:
            int r0 = r7.p()
            int r0 = r7.e(r0)
            int r1 = r7.c()
            r3 = r2
        L_0x0110:
            int r4 = r7.b()
            if (r4 <= 0) goto L_0x011c
            r7.q()
            int r3 = r3 + 1
            goto L_0x0110
        L_0x011c:
            r7.t(r1)
            java.io.Serializable r1 = r6.b
            long[] r1 = (long[]) r1
            if (r1 != 0) goto L_0x0127
            r4 = r2
            goto L_0x0128
        L_0x0127:
            int r4 = r1.length
        L_0x0128:
            int r3 = r3 + r4
            long[] r5 = new long[r3]
            if (r4 == 0) goto L_0x0130
            java.lang.System.arraycopy(r1, r2, r5, r2, r4)
        L_0x0130:
            if (r4 >= r3) goto L_0x013b
            long r1 = r7.q()
            r5[r4] = r1
            int r4 = r4 + 1
            goto L_0x0130
        L_0x013b:
            r6.b = r5
            r7.d(r0)
            goto L_0x00ec
        L_0x0141:
            int r0 = iu7.z(r7, r1)
            java.io.Serializable r1 = r6.b
            long[] r1 = (long[]) r1
            if (r1 != 0) goto L_0x014d
            r3 = r2
            goto L_0x014e
        L_0x014d:
            int r3 = r1.length
        L_0x014e:
            int r0 = r0 + r3
            long[] r4 = new long[r0]
            if (r3 == 0) goto L_0x0156
            java.lang.System.arraycopy(r1, r2, r4, r2, r3)
        L_0x0156:
            int r1 = r0 + -1
            if (r3 >= r1) goto L_0x0166
            long r1 = r7.q()
            r4[r3] = r1
            r7.s()
            int r3 = r3 + 1
            goto L_0x0156
        L_0x0166:
            long r0 = r7.q()
            r4[r3] = r0
            r6.b = r4
            goto L_0x00ec
        L_0x0170:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt5.mergeFrom(n13):gr8");
    }

    public final void writeTo(o13 o13) {
        switch (this.a) {
            case 0:
                long[] jArr = (long[]) this.b;
                if (jArr != null && jArr.length > 0) {
                    int i = 0;
                    while (true) {
                        long[] jArr2 = (long[]) this.b;
                        if (i < jArr2.length) {
                            o13.x(1, jArr2[i]);
                            i++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 1:
                int[] iArr = (int[]) this.b;
                if (iArr != null && iArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr2 = (int[]) this.b;
                        if (i2 < iArr2.length) {
                            o13.w(1, iArr2[i2]);
                            i2++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 2:
                ht5[] ht5Arr = (ht5[]) this.b;
                if (ht5Arr != null && ht5Arr.length > 0) {
                    int i3 = 0;
                    while (true) {
                        gr8[] gr8Arr = (ht5[]) this.b;
                        if (i3 < gr8Arr.length) {
                            gr8 gr8 = gr8Arr[i3];
                            if (gr8 != null) {
                                o13.y(1, gr8);
                            }
                            i3++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            default:
                if (!((String) this.b).equals("")) {
                    o13.E(1, (String) this.b);
                    return;
                }
                return;
        }
    }
}
