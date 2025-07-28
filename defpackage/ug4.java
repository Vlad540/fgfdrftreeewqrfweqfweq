package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* renamed from: ug4  reason: default package */
public final class ug4 {
    public final int a;
    public boolean b;
    public int c;
    public final Object d;
    public final Serializable e;
    public Object f;
    public final Object g;

    /* JADX WARNING: type inference failed for: r12v0, types: [int[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ug4(defpackage.hhd r10, java.util.ArrayList r11, int[] r12, int[] r13) {
        /*
            r9 = this;
            r9.<init>()
            r9.d = r11
            r9.e = r12
            r9.f = r13
            r0 = 0
            java.util.Arrays.fill(r12, r0)
            java.util.Arrays.fill(r13, r0)
            r9.g = r10
            int r12 = r10.C()
            r9.a = r12
            int r10 = r10.B()
            r9.c = r10
            r13 = 1
            r9.b = r13
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x0029
            r1 = 0
            goto L_0x002f
        L_0x0029:
            java.lang.Object r1 = r11.get(r0)
            tg4 r1 = (defpackage.tg4) r1
        L_0x002f:
            if (r1 == 0) goto L_0x0039
            int r2 = r1.a
            if (r2 != 0) goto L_0x0039
            int r1 = r1.b
            if (r1 == 0) goto L_0x0041
        L_0x0039:
            tg4 r1 = new tg4
            r1.<init>(r0, r0, r0)
            r11.add(r0, r1)
        L_0x0041:
            tg4 r1 = new tg4
            r1.<init>(r12, r10, r0)
            r11.add(r1)
            java.util.Iterator r10 = r11.iterator()
        L_0x004d:
            boolean r12 = r10.hasNext()
            java.lang.Object r1 = r9.f
            int[] r1 = (int[]) r1
            java.io.Serializable r2 = r9.e
            int[] r2 = (int[]) r2
            java.lang.Object r3 = r9.g
            hhd r3 = (defpackage.hhd) r3
            if (r12 == 0) goto L_0x0086
            java.lang.Object r12 = r10.next()
            tg4 r12 = (defpackage.tg4) r12
            r4 = r0
        L_0x0066:
            int r5 = r12.c
            if (r4 >= r5) goto L_0x004d
            int r5 = r12.a
            int r5 = r5 + r4
            int r6 = r12.b
            int r6 = r6 + r4
            boolean r7 = r3.e(r5, r6)
            if (r7 == 0) goto L_0x0078
            r7 = r13
            goto L_0x0079
        L_0x0078:
            r7 = 2
        L_0x0079:
            int r8 = r6 << 4
            r8 = r8 | r7
            r2[r5] = r8
            int r5 = r5 << 4
            r5 = r5 | r7
            r1[r6] = r5
            int r4 = r4 + 1
            goto L_0x0066
        L_0x0086:
            boolean r9 = r9.b
            if (r9 == 0) goto L_0x00e4
            java.util.Iterator r9 = r11.iterator()
            r10 = r0
        L_0x008f:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00e4
            java.lang.Object r12 = r9.next()
            tg4 r12 = (defpackage.tg4) r12
        L_0x009b:
            int r13 = r12.a
            if (r10 >= r13) goto L_0x00e0
            r13 = r2[r10]
            if (r13 != 0) goto L_0x00dd
            int r13 = r11.size()
            r4 = r0
            r5 = r4
        L_0x00a9:
            if (r4 >= r13) goto L_0x00dd
            java.lang.Object r6 = r11.get(r4)
            tg4 r6 = (defpackage.tg4) r6
        L_0x00b1:
            int r7 = r6.b
            if (r5 >= r7) goto L_0x00d7
            r7 = r1[r5]
            if (r7 != 0) goto L_0x00d4
            boolean r7 = r3.g(r10, r5)
            if (r7 == 0) goto L_0x00d4
            boolean r13 = r3.e(r10, r5)
            if (r13 == 0) goto L_0x00c8
            r13 = 8
            goto L_0x00c9
        L_0x00c8:
            r13 = 4
        L_0x00c9:
            int r4 = r5 << 4
            r4 = r4 | r13
            r2[r10] = r4
            int r4 = r10 << 4
            r13 = r13 | r4
            r1[r5] = r13
            goto L_0x00dd
        L_0x00d4:
            int r5 = r5 + 1
            goto L_0x00b1
        L_0x00d7:
            int r5 = r6.c
            int r5 = r5 + r7
            int r4 = r4 + 1
            goto L_0x00a9
        L_0x00dd:
            int r10 = r10 + 1
            goto L_0x009b
        L_0x00e0:
            int r10 = r12.c
            int r10 = r10 + r13
            goto L_0x008f
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug4.<init>(hhd, java.util.ArrayList, int[], int[]):void");
    }

    public static vg4 b(ArrayDeque arrayDeque, int i, boolean z) {
        vg4 vg4;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                vg4 = null;
                break;
            }
            vg4 = (vg4) it.next();
            if (vg4.a == i && vg4.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            vg4 vg42 = (vg4) it.next();
            if (z) {
                vg42.b--;
            } else {
                vg42.b++;
            }
        }
        return vg4;
    }

    public void a(yg7 yg7) {
        int[] iArr;
        hhd hhd;
        int i;
        int i2;
        int i3;
        List list;
        ug4 ug4 = this;
        yg7 yg72 = yg7;
        ck0 ck0 = yg72 instanceof ck0 ? (ck0) yg72 : new ck0(yg72);
        ArrayDeque arrayDeque = new ArrayDeque();
        List list2 = (List) ug4.d;
        int size = list2.size() - 1;
        int i4 = ug4.a;
        int i5 = ug4.c;
        int i6 = i4;
        while (size >= 0) {
            tg4 tg4 = (tg4) list2.get(size);
            int i7 = tg4.a;
            int i8 = tg4.c;
            int i9 = i7 + i8;
            int i10 = tg4.b;
            int i11 = i10 + i8;
            while (true) {
                iArr = (int[]) ug4.e;
                hhd = (hhd) ug4.g;
                i = 0;
                if (i6 <= i9) {
                    break;
                }
                i6--;
                int i12 = iArr[i6];
                if ((i12 & 12) != 0) {
                    list = list2;
                    int i13 = i12 >> 4;
                    vg4 b2 = b(arrayDeque, i13, false);
                    if (b2 != null) {
                        i3 = i5;
                        int i14 = (i4 - b2.b) - 1;
                        ck0.a(i6, i14);
                        if ((i12 & 4) != 0) {
                            ck0.f(i14, 1, hhd.z(i6, i13));
                        }
                    } else {
                        i3 = i5;
                        arrayDeque.add(new vg4(i6, (i4 - i6) - 1, true));
                    }
                } else {
                    list = list2;
                    i3 = i5;
                    ck0.e(i6, 1);
                    i4--;
                }
                list2 = list;
                i5 = i3;
            }
            List list3 = list2;
            int i15 = i5;
            while (i5 > i11) {
                i5--;
                int i16 = ((int[]) ug4.f)[i5];
                if ((i16 & 12) != 0) {
                    int i17 = i16 >> 4;
                    vg4 b3 = b(arrayDeque, i17, true);
                    if (b3 == null) {
                        arrayDeque.add(new vg4(i5, i4 - i6, false));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        ck0.a((i4 - b3.b) - 1, i6);
                        if ((i16 & 4) != 0) {
                            ck0.f(i6, 1, hhd.z(i17, i5));
                        }
                    }
                } else {
                    i2 = i;
                    ck0.d(i6, 1);
                    i4++;
                }
                ug4 = this;
                i = i2;
            }
            int i18 = i;
            i6 = tg4.a;
            int i19 = i6;
            int i20 = i10;
            while (i < i8) {
                if ((iArr[i19] & 15) == 2) {
                    ck0.f(i19, 1, hhd.z(i19, i20));
                }
                i19++;
                i20++;
                i++;
            }
            size--;
            ug4 = this;
            i5 = i10;
            list2 = list3;
        }
        ck0.b();
    }

    public ug4(y5c y5c, y4e y4e, kje kje, int i) {
        this.g = y5c;
        this.b = false;
        this.c = 0;
        this.f = null;
        this.d = y4e;
        this.e = kje;
        this.a = i;
    }
}
