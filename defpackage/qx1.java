package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: qx1  reason: default package */
public final class qx1 extends ey1 {
    public static final int[] N0 = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] O0 = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] P0 = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] Q0 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] R0 = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] S0 = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] T0 = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] U0 = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final ArrayList A0 = new ArrayList();
    public ox1 B0 = new ox1(0, 4);
    public List C0;
    public List D0;
    public int E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public byte I0;
    public byte J0;
    public int K0 = 0;
    public boolean L0;
    public long M0;
    public final yze Z = new yze(3, false);
    public final int w0;
    public final int x0;
    public final int y0;
    public final long z0 = 16000000;

    public qx1(String str, int i) {
        this.w0 = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.y0 = 0;
            this.x0 = 0;
        } else if (i == 2) {
            this.y0 = 1;
            this.x0 = 0;
        } else if (i == 3) {
            this.y0 = 0;
            this.x0 = 1;
        } else if (i != 4) {
            this.y0 = 0;
            this.x0 = 0;
        } else {
            this.y0 = 1;
            this.x0 = 1;
        }
        j(0);
        i();
        this.L0 = true;
        this.M0 = -9223372036854775807L;
    }

    public final p87 b() {
        List list = this.C0;
        this.D0 = list;
        list.getClass();
        return new p87(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.ay1 r15) {
        /*
            r14 = this;
            java.nio.ByteBuffer r15 = r15.o
            r15.getClass()
            byte[] r0 = r15.array()
            int r15 = r15.limit()
            yze r1 = r14.Z
            r1.F(r15, r0)
            r15 = 0
            r0 = r15
        L_0x0014:
            int r2 = r1.c()
            r3 = 3
            r4 = 1
            int r5 = r14.w0
            if (r2 < r5) goto L_0x026d
            r2 = 2
            if (r5 != r2) goto L_0x0023
            r5 = -4
            goto L_0x0028
        L_0x0023:
            int r5 = r1.v()
            byte r5 = (byte) r5
        L_0x0028:
            int r6 = r1.v()
            int r7 = r1.v()
            r8 = r5 & 2
            if (r8 == 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            r8 = r5 & 1
            int r9 = r14.x0
            if (r8 == r9) goto L_0x003c
            goto L_0x0014
        L_0x003c:
            r8 = r6 & 127(0x7f, float:1.78E-43)
            byte r8 = (byte) r8
            r9 = r7 & 127(0x7f, float:1.78E-43)
            byte r9 = (byte) r9
            if (r8 != 0) goto L_0x0047
            if (r9 != 0) goto L_0x0047
            goto L_0x0014
        L_0x0047:
            boolean r10 = r14.G0
            r5 = r5 & 4
            r11 = 4
            if (r5 != r11) goto L_0x005a
            boolean[] r5 = U0
            boolean r6 = r5[r6]
            if (r6 == 0) goto L_0x005a
            boolean r5 = r5[r7]
            if (r5 == 0) goto L_0x005a
            r5 = r4
            goto L_0x005b
        L_0x005a:
            r5 = r15
        L_0x005b:
            r14.G0 = r5
            r6 = 16
            if (r5 == 0) goto L_0x007b
            r7 = r8 & 240(0xf0, float:3.36E-43)
            if (r7 != r6) goto L_0x007b
            boolean r7 = r14.H0
            if (r7 == 0) goto L_0x0074
            byte r7 = r14.I0
            if (r7 != r8) goto L_0x0074
            byte r7 = r14.J0
            if (r7 != r9) goto L_0x0074
            r14.H0 = r15
            goto L_0x0014
        L_0x0074:
            r14.H0 = r4
            r14.I0 = r8
            r14.J0 = r9
            goto L_0x007d
        L_0x007b:
            r14.H0 = r15
        L_0x007d:
            if (r5 != 0) goto L_0x0086
            if (r10 == 0) goto L_0x0014
            r14.i()
        L_0x0084:
            r0 = r4
            goto L_0x0014
        L_0x0086:
            r5 = 32
            r7 = 20
            if (r4 > r8) goto L_0x0093
            r10 = 15
            if (r8 > r10) goto L_0x0093
            r14.L0 = r15
            goto L_0x00a9
        L_0x0093:
            r10 = r8 & 247(0xf7, float:3.46E-43)
            if (r10 != r7) goto L_0x00a9
            if (r9 == r5) goto L_0x00a7
            r10 = 47
            if (r9 == r10) goto L_0x00a7
            switch(r9) {
                case 37: goto L_0x00a7;
                case 38: goto L_0x00a7;
                case 39: goto L_0x00a7;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            switch(r9) {
                case 41: goto L_0x00a7;
                case 42: goto L_0x00a4;
                case 43: goto L_0x00a4;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            goto L_0x00a9
        L_0x00a4:
            r14.L0 = r15
            goto L_0x00a9
        L_0x00a7:
            r14.L0 = r4
        L_0x00a9:
            boolean r10 = r14.L0
            if (r10 != 0) goto L_0x00af
            goto L_0x0014
        L_0x00af:
            r10 = r8 & 224(0xe0, float:3.14E-43)
            if (r10 != 0) goto L_0x00b8
            int r12 = r8 >> 3
            r12 = r12 & r4
            r14.K0 = r12
        L_0x00b8:
            int r12 = r14.K0
            int r13 = r14.y0
            if (r12 != r13) goto L_0x0014
            if (r10 != 0) goto L_0x024f
            r0 = r8 & 247(0xf7, float:3.46E-43)
            r10 = 17
            if (r0 != r10) goto L_0x00d9
            r12 = r9 & 240(0xf0, float:3.36E-43)
            r13 = 48
            if (r12 != r13) goto L_0x00d9
            ox1 r0 = r14.B0
            r2 = r9 & 15
            int[] r3 = R0
            r2 = r3[r2]
            char r2 = (char) r2
            r0.a(r2)
            goto L_0x0084
        L_0x00d9:
            r12 = r8 & 246(0xf6, float:3.45E-43)
            r13 = 18
            if (r12 != r13) goto L_0x0101
            r13 = r9 & 224(0xe0, float:3.14E-43)
            if (r13 != r5) goto L_0x0101
            ox1 r0 = r14.B0
            r0.b()
            ox1 r0 = r14.B0
            r2 = r8 & 1
            if (r2 != 0) goto L_0x00f6
            r2 = r9 & 31
            int[] r3 = S0
            r2 = r3[r2]
        L_0x00f4:
            char r2 = (char) r2
            goto L_0x00fd
        L_0x00f6:
            r2 = r9 & 31
            int[] r3 = T0
            r2 = r3[r2]
            goto L_0x00f4
        L_0x00fd:
            r0.a(r2)
            goto L_0x0084
        L_0x0101:
            if (r0 != r10) goto L_0x012b
            r10 = r9 & 240(0xf0, float:3.36E-43)
            if (r10 != r5) goto L_0x012b
            ox1 r0 = r14.B0
            r0.a(r5)
            r0 = r9 & 1
            if (r0 != r4) goto L_0x0112
            r0 = r4
            goto L_0x0113
        L_0x0112:
            r0 = r15
        L_0x0113:
            int r2 = r9 >> 1
            r2 = r2 & 7
            ox1 r3 = r14.B0
            java.util.ArrayList r5 = r3.a
            mx1 r6 = new mx1
            java.lang.StringBuilder r3 = r3.c
            int r3 = r3.length()
            r6.<init>(r2, r3, r0)
            r5.add(r6)
            goto L_0x0084
        L_0x012b:
            r10 = r8 & 240(0xf0, float:3.36E-43)
            if (r10 != r6) goto L_0x019b
            r10 = r9 & 192(0xc0, float:2.69E-43)
            r13 = 64
            if (r10 != r13) goto L_0x019b
            int[] r0 = N0
            r2 = r8 & 7
            r0 = r0[r2]
            r2 = r9 & 32
            if (r2 == 0) goto L_0x0141
            int r0 = r0 + 1
        L_0x0141:
            ox1 r2 = r14.B0
            int r3 = r2.d
            if (r0 == r3) goto L_0x0165
            int r3 = r14.E0
            if (r3 == r4) goto L_0x0161
            boolean r2 = r2.e()
            if (r2 != 0) goto L_0x0161
            ox1 r2 = new ox1
            int r3 = r14.E0
            int r5 = r14.F0
            r2.<init>(r3, r5)
            r14.B0 = r2
            java.util.ArrayList r3 = r14.A0
            r3.add(r2)
        L_0x0161:
            ox1 r2 = r14.B0
            r2.d = r0
        L_0x0165:
            r0 = r9 & 16
            if (r0 != r6) goto L_0x016b
            r0 = r4
            goto L_0x016c
        L_0x016b:
            r0 = r15
        L_0x016c:
            r2 = r9 & 1
            if (r2 != r4) goto L_0x0172
            r2 = r4
            goto L_0x0173
        L_0x0172:
            r2 = r15
        L_0x0173:
            int r3 = r9 >> 1
            r3 = r3 & 7
            ox1 r5 = r14.B0
            if (r0 == 0) goto L_0x017e
            r6 = 8
            goto L_0x017f
        L_0x017e:
            r6 = r3
        L_0x017f:
            java.util.ArrayList r7 = r5.a
            mx1 r8 = new mx1
            java.lang.StringBuilder r5 = r5.c
            int r5 = r5.length()
            r8.<init>(r6, r5, r2)
            r7.add(r8)
            if (r0 == 0) goto L_0x0084
            ox1 r0 = r14.B0
            int[] r2 = O0
            r2 = r2[r3]
            r0.e = r2
            goto L_0x0084
        L_0x019b:
            r6 = 23
            r8 = 33
            if (r0 != r6) goto L_0x01af
            if (r9 < r8) goto L_0x01af
            r0 = 35
            if (r9 > r0) goto L_0x01af
            ox1 r0 = r14.B0
            int r9 = r9 + -32
            r0.f = r9
            goto L_0x0084
        L_0x01af:
            if (r12 != r7) goto L_0x0084
            r0 = r9 & 240(0xf0, float:3.36E-43)
            if (r0 != r5) goto L_0x0084
            if (r9 == r5) goto L_0x024a
            r0 = 41
            if (r9 == r0) goto L_0x0245
            switch(r9) {
                case 37: goto L_0x023a;
                case 38: goto L_0x022f;
                case 39: goto L_0x0224;
                default: goto L_0x01be;
            }
        L_0x01be:
            int r0 = r14.E0
            if (r0 != 0) goto L_0x01c4
            goto L_0x0084
        L_0x01c4:
            if (r9 == r8) goto L_0x021d
            switch(r9) {
                case 44: goto L_0x020c;
                case 45: goto L_0x01db;
                case 46: goto L_0x01d6;
                case 47: goto L_0x01cb;
                default: goto L_0x01c9;
            }
        L_0x01c9:
            goto L_0x0084
        L_0x01cb:
            java.util.ArrayList r0 = r14.h()
            r14.C0 = r0
            r14.i()
            goto L_0x0084
        L_0x01d6:
            r14.i()
            goto L_0x0084
        L_0x01db:
            if (r0 != r4) goto L_0x0084
            ox1 r0 = r14.B0
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x0084
            ox1 r0 = r14.B0
            java.util.ArrayList r2 = r0.b
            android.text.SpannableString r3 = r0.d()
            r2.add(r3)
            java.lang.StringBuilder r3 = r0.c
            r3.setLength(r15)
            java.util.ArrayList r3 = r0.a
            r3.clear()
            int r3 = r0.h
            int r0 = r0.d
            int r0 = java.lang.Math.min(r3, r0)
        L_0x0202:
            int r3 = r2.size()
            if (r3 < r0) goto L_0x0084
            r2.remove(r15)
            goto L_0x0202
        L_0x020c:
            java.util.List r0 = java.util.Collections.emptyList()
            r14.C0 = r0
            int r0 = r14.E0
            if (r0 == r4) goto L_0x0218
            if (r0 != r3) goto L_0x0084
        L_0x0218:
            r14.i()
            goto L_0x0084
        L_0x021d:
            ox1 r0 = r14.B0
            r0.b()
            goto L_0x0084
        L_0x0224:
            r14.j(r4)
            r14.F0 = r11
            ox1 r0 = r14.B0
            r0.h = r11
            goto L_0x0084
        L_0x022f:
            r14.j(r4)
            r14.F0 = r3
            ox1 r0 = r14.B0
            r0.h = r3
            goto L_0x0084
        L_0x023a:
            r14.j(r4)
            r14.F0 = r2
            ox1 r0 = r14.B0
            r0.h = r2
            goto L_0x0084
        L_0x0245:
            r14.j(r3)
            goto L_0x0084
        L_0x024a:
            r14.j(r2)
            goto L_0x0084
        L_0x024f:
            ox1 r0 = r14.B0
            r2 = r8 & 127(0x7f, float:1.78E-43)
            int r2 = r2 - r5
            int[] r3 = Q0
            r2 = r3[r2]
            char r2 = (char) r2
            r0.a(r2)
            r0 = r9 & 224(0xe0, float:3.14E-43)
            if (r0 == 0) goto L_0x0084
            ox1 r0 = r14.B0
            r2 = r9 & 127(0x7f, float:1.78E-43)
            int r2 = r2 - r5
            r2 = r3[r2]
            char r2 = (char) r2
            r0.a(r2)
            goto L_0x0084
        L_0x026d:
            if (r0 == 0) goto L_0x027f
            int r15 = r14.E0
            if (r15 == r4) goto L_0x0275
            if (r15 != r3) goto L_0x027f
        L_0x0275:
            java.util.ArrayList r15 = r14.h()
            r14.C0 = r15
            long r0 = r14.X
            r14.M0 = r0
        L_0x027f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx1.d(ay1):void");
    }

    /* renamed from: f */
    public final p1e c() {
        p1e p1e;
        p1e f = super.c();
        if (f != null) {
            return f;
        }
        long j = this.z0;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.M0;
        if (j2 == -9223372036854775807L || this.X - j2 < j || (p1e = (p1e) this.b.pollFirst()) == null) {
            return null;
        }
        this.C0 = Collections.emptyList();
        this.M0 = -9223372036854775807L;
        p1e p1e2 = p1e;
        p1e2.w(this.X, b(), Long.MAX_VALUE);
        return p1e;
    }

    public final void flush() {
        super.flush();
        this.C0 = null;
        this.D0 = null;
        j(0);
        this.F0 = 4;
        this.B0.h = 4;
        i();
        this.G0 = false;
        this.H0 = false;
        this.I0 = 0;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = true;
        this.M0 = -9223372036854775807L;
    }

    public final boolean g() {
        return this.C0 != this.D0;
    }

    public final ArrayList h() {
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            tw3 c = ((ox1) arrayList.get(i2)).c(Integer.MIN_VALUE);
            arrayList2.add(c);
            if (c != null) {
                i = Math.min(i, c.x0);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            tw3 tw3 = (tw3) arrayList2.get(i3);
            if (tw3 != null) {
                if (tw3.x0 != i) {
                    tw3 = ((ox1) arrayList.get(i3)).c(i);
                    tw3.getClass();
                }
                arrayList3.add(tw3);
            }
        }
        return arrayList3;
    }

    public final void i() {
        ox1 ox1 = this.B0;
        ox1.g = this.E0;
        ox1.a.clear();
        ox1.b.clear();
        ox1.c.setLength(0);
        ox1.d = 15;
        ox1.e = 0;
        ox1.f = 0;
        ArrayList arrayList = this.A0;
        arrayList.clear();
        arrayList.add(this.B0);
    }

    public final void j(int i) {
        int i2 = this.E0;
        if (i2 != i) {
            this.E0 = i;
            if (i == 3) {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.A0;
                    if (i3 < arrayList.size()) {
                        ((ox1) arrayList.get(i3)).g = i;
                        i3++;
                    } else {
                        return;
                    }
                }
            } else {
                i();
                if (i2 == 3 || i == 1 || i == 0) {
                    this.C0 = Collections.emptyList();
                }
            }
        }
    }

    public final void release() {
    }
}
