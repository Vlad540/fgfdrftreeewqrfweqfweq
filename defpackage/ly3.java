package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ly3  reason: default package */
public final class ly3 implements r88, hyc, gy2 {
    public static final Pattern M0 = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern N0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final lu7 A0;
    public final xya B0;
    public final IdentityHashMap C0 = new IdentityHashMap();
    public final af8 D0;
    public final eo4 E0;
    public p88 F0;
    public iy2[] G0 = new iy2[0];
    public y05[] H0 = new y05[0];
    public wwc I0;
    public dy3 J0;
    public int K0;
    public List L0;
    public final lk9 X;
    public final b0d Y;
    public final long Z;
    public final int a;
    public final nfc b;
    public final bqe c;
    public final mo4 o;
    public final kj7 w0;
    public final l34 x0;
    public final voe y0;
    public final jy3[] z0;

    public ly3(int i, dy3 dy3, b0d b0d, int i2, nfc nfc, bqe bqe, mo4 mo4, eo4 eo4, lk9 lk9, af8 af8, long j, kj7 kj7, l34 l34, lu7 lu7, c9 c9Var, bza bza) {
        int i3;
        List list;
        int i4;
        int i5;
        vu5[] vu5Arr;
        vu5[] g;
        ze4 a2;
        dy3 dy32 = dy3;
        int i6 = i2;
        mo4 mo42 = mo4;
        l34 l342 = l34;
        this.a = i;
        this.J0 = dy32;
        this.Y = b0d;
        this.K0 = i6;
        this.b = nfc;
        this.c = bqe;
        this.o = mo42;
        this.E0 = eo4;
        this.X = lk9;
        this.D0 = af8;
        this.Z = j;
        this.w0 = kj7;
        this.x0 = l342;
        this.A0 = lu7;
        this.B0 = new xya(dy32, c9Var, l342);
        int i7 = 0;
        iy2[] iy2Arr = this.G0;
        lu7.getClass();
        this.I0 = new wwc(9, iy2Arr);
        vma b2 = dy32.b(i6);
        List list2 = b2.d;
        this.L0 = list2;
        List list3 = b2.c;
        int size = list3.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i8 = 0; i8 < size; i8++) {
            sparseIntArray.put(((x8) list3.get(i8)).a, i8);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i8));
            arrayList.add(arrayList2);
            sparseArray.put(i8, arrayList2);
        }
        int i9 = 0;
        while (i9 < size) {
            x8 x8Var = (x8) list3.get(i9);
            ze4 a3 = a("http://dashif.org/guidelines/trickmode", x8Var.e);
            List list4 = x8Var.f;
            a3 = a3 == null ? a("http://dashif.org/guidelines/trickmode", list4) : a3;
            int i10 = (a3 == null || (i10 = sparseIntArray.get(Integer.parseInt(a3.b), -1)) == -1) ? i9 : i10;
            if (i10 == i9 && (a2 = a("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i11 = mze.a;
                String[] split = a2.b.split(",", -1);
                int length = split.length;
                for (int i12 = i7; i12 < length; i12++) {
                    int i13 = sparseIntArray.get(Integer.parseInt(split[i12]), -1);
                    if (i13 != -1) {
                        i10 = Math.min(i10, i13);
                    }
                }
            }
            if (i10 != i9) {
                List list5 = (List) sparseArray.get(i9);
                List list6 = (List) sparseArray.get(i10);
                list6.addAll(list5);
                sparseArray.put(i9, list6);
                arrayList.remove(list5);
            }
            i9++;
            i7 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i14 = 0; i14 < size2; i14++) {
            int[] H = xie.H((Collection) arrayList.get(i14));
            iArr[i14] = H;
            Arrays.sort(H);
        }
        boolean[] zArr = new boolean[size2];
        vu5[][] vu5Arr2 = new vu5[size2][];
        int i15 = 0;
        int i16 = 0;
        while (i15 < size2) {
            int[] iArr2 = iArr[i15];
            int length2 = iArr2.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length2) {
                    break;
                }
                List list7 = ((x8) list3.get(iArr2[i17])).c;
                for (int i18 = 0; i18 < list7.size(); i18++) {
                    if (!((jac) list7.get(i18)).o.isEmpty()) {
                        zArr[i15] = true;
                        i16++;
                        break;
                    }
                }
                i17++;
            }
            int[] iArr3 = iArr[i15];
            int length3 = iArr3.length;
            int i19 = 0;
            while (i19 < length3) {
                int i20 = iArr3[i19];
                x8 x8Var2 = (x8) list3.get(i20);
                List list8 = ((x8) list3.get(i20)).d;
                int[] iArr4 = iArr3;
                int i21 = 0;
                while (i21 < list8.size()) {
                    ze4 ze4 = (ze4) list8.get(i21);
                    int i22 = length3;
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(ze4.a)) {
                        tu5 tu5 = new tu5();
                        tu5.k = "application/cea-608";
                        int i23 = x8Var2.a;
                        StringBuilder sb = new StringBuilder(18);
                        sb.append(i23);
                        sb.append(":cea608");
                        tu5.a = sb.toString();
                        g = g(ze4, M0, new vu5(tu5));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(ze4.a)) {
                        tu5 tu52 = new tu5();
                        tu52.k = "application/cea-708";
                        int i24 = x8Var2.a;
                        StringBuilder sb2 = new StringBuilder(18);
                        sb2.append(i24);
                        sb2.append(":cea708");
                        tu52.a = sb2.toString();
                        g = g(ze4, N0, new vu5(tu52));
                    } else {
                        i21++;
                        list8 = list9;
                        length3 = i22;
                    }
                    vu5Arr = g;
                    i5 = 1;
                }
                int i25 = length3;
                i19++;
                iArr3 = iArr4;
            }
            i5 = 1;
            vu5Arr = new vu5[0];
            vu5Arr2[i15] = vu5Arr;
            if (vu5Arr.length != 0) {
                i16 += i5;
            }
            i15 += i5;
        }
        int size3 = list2.size() + i16 + size2;
        toe[] toeArr = new toe[size3];
        jy3[] jy3Arr = new jy3[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr5 = iArr[i27];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr5.length;
            int i28 = size2;
            int i29 = 0;
            while (i29 < length4) {
                arrayList3.addAll(((x8) list3.get(iArr5[i29])).c);
                i29++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            vu5[] vu5Arr3 = new vu5[size4];
            int i30 = 0;
            while (i30 < size4) {
                int i31 = size4;
                vu5 vu5 = ((jac) arrayList3.get(i30)).a;
                ArrayList arrayList4 = arrayList3;
                int b3 = mo42.b(vu5);
                tu5 a4 = vu5.a();
                a4.D = b3;
                vu5Arr3[i30] = a4.a();
                i30++;
                size4 = i31;
                arrayList3 = arrayList4;
            }
            x8 x8Var3 = (x8) list3.get(iArr5[0]);
            int i32 = x8Var3.a;
            String num = i32 != -1 ? Integer.toString(i32) : m4b.h(17, i27, "unset:");
            int i33 = i26 + 1;
            if (zArr[i27]) {
                i3 = i33;
                i33 = i26 + 2;
            } else {
                i3 = -1;
            }
            if (vu5Arr2[i27].length != 0) {
                i4 = i33;
                i33++;
                list = list3;
            } else {
                list = list3;
                i4 = -1;
            }
            toeArr[i26] = new toe(num, vu5Arr3);
            jy3Arr[i26] = new jy3(x8Var3.b, 0, iArr5, i26, i3, i4, -1);
            int i34 = i3;
            int i35 = -1;
            if (i34 != -1) {
                String concat = String.valueOf(num).concat(":emsg");
                tu5 tu53 = new tu5();
                tu53.a = concat;
                tu53.k = "application/x-emsg";
                toeArr[i34] = new toe(concat, new vu5(tu53));
                jy3Arr[i34] = new jy3(5, 1, iArr5, i26, -1, -1, -1);
                i35 = -1;
            }
            if (i4 != i35) {
                toeArr[i4] = new toe(String.valueOf(num).concat(":cc"), vu5Arr2[i27]);
                jy3Arr[i4] = new jy3(3, 1, iArr5, i26, -1, -1, -1);
            }
            i27++;
            size2 = i28;
            iArr = iArr6;
            i26 = i33;
            list3 = list;
        }
        int i36 = 0;
        while (i36 < list2.size()) {
            b15 b15 = (b15) list2.get(i36);
            tu5 tu54 = new tu5();
            tu54.a = b15.a();
            tu54.k = "application/x-emsg";
            vu5 vu52 = new vu5(tu54);
            String a5 = b15.a();
            StringBuilder sb3 = new StringBuilder(me4.e(12, a5));
            sb3.append(a5);
            sb3.append(":");
            sb3.append(i36);
            toeArr[i26] = new toe(sb3.toString(), vu52);
            jy3Arr[i26] = new jy3(5, 2, new int[0], -1, -1, -1, i36);
            i36++;
            i26++;
        }
        Pair create = Pair.create(new voe(toeArr), jy3Arr);
        this.y0 = (voe) create.first;
        this.z0 = (jy3[]) create.second;
    }

    public static ze4 a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            ze4 ze4 = (ze4) list.get(i);
            if (str.equals(ze4.a)) {
                return ze4;
            }
        }
        return null;
    }

    public static vu5[] g(ze4 ze4, Pattern pattern, vu5 vu5) {
        String str = ze4.b;
        if (str == null) {
            return new vu5[]{vu5};
        }
        int i = mze.a;
        String[] split = str.split(";", -1);
        vu5[] vu5Arr = new vu5[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            Matcher matcher = pattern.matcher(split[i2]);
            if (!matcher.matches()) {
                return new vu5[]{vu5};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            tu5 a2 = vu5.a();
            String str2 = vu5.a;
            StringBuilder sb = new StringBuilder(me4.e(12, str2));
            sb.append(str2);
            sb.append(":");
            sb.append(parseInt);
            a2.a = sb.toString();
            a2.C = parseInt;
            a2.c = matcher.group(2);
            vu5Arr[i2] = new vu5(a2);
        }
        return vu5Arr;
    }

    public final long D(long j, wtc wtc) {
        long j2 = j;
        for (iy2 iy2 : this.G0) {
            if (iy2.a == 2) {
                for (a64 a64 : iy2.X.h) {
                    vy3 vy3 = (vy3) a64.g;
                    if (vy3 != null) {
                        long j3 = a64.b;
                        long v = vy3.v(j2, j3);
                        long j4 = a64.c;
                        long j5 = v + j4;
                        long g = a64.g(j5);
                        vy3 vy32 = (vy3) a64.g;
                        long D = vy32.D(j3);
                        return wtc.a(j, g, (g >= j2 || (D != -1 && j5 >= ((vy32.C() + j4) + D) - 1)) ? g : a64.g(j5 + 1));
                    }
                }
                return j2;
            }
        }
        return j2;
    }

    public final boolean F(long j) {
        return this.I0.F(j);
    }

    public final void L(p88 p88, long j) {
        this.F0 = p88;
        p88.d(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: xjc[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long M(defpackage.f55[] r38, boolean[] r39, defpackage.xjc[] r40, boolean[] r41, long r42) {
        /*
            r37 = this;
            r14 = r37
            r0 = r38
            r15 = r40
            r12 = r42
            int r1 = r0.length
            int[] r11 = new int[r1]
            r16 = 0
            r1 = r16
        L_0x000f:
            int r2 = r0.length
            r10 = -1
            if (r1 >= r2) goto L_0x0029
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0024
            voe r3 = r14.y0
            toe r2 = r2.a()
            int r2 = r3.b(r2)
            r11[r1] = r2
            goto L_0x0026
        L_0x0024:
            r11[r1] = r10
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0029:
            r1 = r16
        L_0x002b:
            int r2 = r0.length
            r17 = 0
            if (r1 >= r2) goto L_0x005e
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0038
            boolean r2 = r39[r1]
            if (r2 != 0) goto L_0x005b
        L_0x0038:
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.iy2
            if (r3 == 0) goto L_0x0044
            iy2 r2 = (defpackage.iy2) r2
            r2.w(r14)
            goto L_0x0059
        L_0x0044:
            boolean r3 = r2 instanceof defpackage.ey2
            if (r3 == 0) goto L_0x0059
            ey2 r2 = (defpackage.ey2) r2
            iy2 r3 = r2.X
            boolean[] r4 = r3.o
            int r2 = r2.c
            boolean r4 = r4[r2]
            swb.h(r4)
            boolean[] r3 = r3.o
            r3[r2] = r16
        L_0x0059:
            r15[r1] = r17
        L_0x005b:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x005e:
            r1 = r16
        L_0x0060:
            int r2 = r0.length
            r8 = 1
            if (r1 >= r2) goto L_0x00a9
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.lw4
            if (r3 != 0) goto L_0x006e
            boolean r2 = r2 instanceof defpackage.ey2
            if (r2 == 0) goto L_0x00a6
        L_0x006e:
            int r2 = r14.e(r1, r11)
            if (r2 != r10) goto L_0x0079
            r2 = r15[r1]
            boolean r2 = r2 instanceof defpackage.lw4
            goto L_0x008b
        L_0x0079:
            r3 = r15[r1]
            boolean r4 = r3 instanceof defpackage.ey2
            if (r4 == 0) goto L_0x0088
            ey2 r3 = (defpackage.ey2) r3
            iy2 r3 = r3.a
            r2 = r15[r2]
            if (r3 != r2) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r8 = r16
        L_0x008a:
            r2 = r8
        L_0x008b:
            if (r2 != 0) goto L_0x00a6
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.ey2
            if (r3 == 0) goto L_0x00a4
            ey2 r2 = (defpackage.ey2) r2
            iy2 r3 = r2.X
            boolean[] r4 = r3.o
            int r2 = r2.c
            boolean r4 = r4[r2]
            swb.h(r4)
            boolean[] r3 = r3.o
            r3[r2] = r16
        L_0x00a4:
            r15[r1] = r17
        L_0x00a6:
            int r1 = r1 + 1
            goto L_0x0060
        L_0x00a9:
            r9 = r16
        L_0x00ab:
            int r1 = r0.length
            if (r9 >= r1) goto L_0x01fb
            r1 = r0[r9]
            if (r1 != 0) goto L_0x00b9
            r18 = r9
            r36 = r11
            r0 = r15
            goto L_0x01ee
        L_0x00b9:
            r2 = r15[r9]
            if (r2 != 0) goto L_0x01df
            r41[r9] = r8
            r2 = r11[r9]
            jy3[] r3 = r14.z0
            r2 = r3[r2]
            int r3 = r2.c
            if (r3 != 0) goto L_0x01b9
            int r3 = r2.f
            if (r3 == r10) goto L_0x00d0
            r29 = r8
            goto L_0x00d2
        L_0x00d0:
            r29 = r16
        L_0x00d2:
            if (r29 == 0) goto L_0x00dc
            voe r4 = r14.y0
            toe r3 = r4.a(r3)
            r4 = r8
            goto L_0x00e0
        L_0x00dc:
            r4 = r16
            r3 = r17
        L_0x00e0:
            int r5 = r2.g
            if (r5 == r10) goto L_0x00e6
            r6 = r8
            goto L_0x00e8
        L_0x00e6:
            r6 = r16
        L_0x00e8:
            if (r6 == 0) goto L_0x00f4
            voe r7 = r14.y0
            toe r5 = r7.a(r5)
            int r7 = r5.a
            int r4 = r4 + r7
            goto L_0x00f6
        L_0x00f4:
            r5 = r17
        L_0x00f6:
            vu5[] r7 = new defpackage.vu5[r4]
            int[] r4 = new int[r4]
            if (r29 == 0) goto L_0x0107
            vu5[] r3 = r3.c
            r3 = r3[r16]
            r7[r16] = r3
            r3 = 5
            r4[r16] = r3
            r3 = r8
            goto L_0x0109
        L_0x0107:
            r3 = r16
        L_0x0109:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            if (r6 == 0) goto L_0x0129
            r6 = r16
        L_0x0112:
            int r8 = r5.a
            if (r6 >= r8) goto L_0x0128
            vu5[] r8 = r5.c
            r8 = r8[r6]
            r7[r3] = r8
            r18 = 3
            r4[r3] = r18
            r10.add(r8)
            r8 = 1
            int r3 = r3 + r8
            int r6 = r6 + 1
            goto L_0x0112
        L_0x0128:
            r8 = 1
        L_0x0129:
            dy3 r3 = r14.J0
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x013e
            if (r29 == 0) goto L_0x013e
            xya r3 = r14.B0
            vya r5 = new vya
            java.lang.Object r6 = r3.Z
            l34 r6 = (defpackage.l34) r6
            r5.<init>(r3, r6)
            r6 = r5
            goto L_0x0140
        L_0x013e:
            r6 = r17
        L_0x0140:
            nfc r3 = r14.b
            kj7 r5 = r14.w0
            dy3 r8 = r14.J0
            r32 = r9
            b0d r9 = r14.Y
            r33 = r11
            int r11 = r14.K0
            int[] r12 = r2.a
            int r13 = r2.b
            r35 = r6
            r34 = r7
            long r6 = r14.Z
            bqe r0 = r14.c
            java.lang.Object r3 = r3.b
            mz3 r3 = (defpackage.mz3) r3
            oz3 r3 = r3.a()
            if (r0 == 0) goto L_0x0167
            r3.O(r0)
        L_0x0167:
            d64 r0 = new d64
            r18 = r0
            r19 = r5
            r20 = r8
            r21 = r9
            r22 = r11
            r23 = r12
            r24 = r1
            r25 = r13
            r26 = r3
            r27 = r6
            r30 = r10
            r31 = r35
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31)
            iy2 r13 = new iy2
            int r2 = r2.b
            l34 r7 = r14.x0
            mo4 r10 = r14.o
            eo4 r11 = r14.E0
            lk9 r12 = r14.X
            af8 r8 = r14.D0
            r1 = r13
            r3 = r4
            r4 = r34
            r5 = r0
            r0 = r35
            r6 = r37
            r19 = r8
            r18 = r32
            r8 = r42
            r36 = r33
            r15 = r13
            r13 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            monitor-enter(r37)
            java.util.IdentityHashMap r1 = r14.C0     // Catch:{ all -> 0x01b6 }
            r1.put(r15, r0)     // Catch:{ all -> 0x01b6 }
            monitor-exit(r37)     // Catch:{ all -> 0x01b6 }
            r0 = r40
            r1 = r15
            r0[r18] = r1
            goto L_0x01ee
        L_0x01b6:
            r0 = move-exception
            monitor-exit(r37)     // Catch:{ all -> 0x01b6 }
            throw r0
        L_0x01b9:
            r18 = r9
            r36 = r11
            r0 = r15
            r4 = 2
            if (r3 != r4) goto L_0x01ee
            java.util.List r3 = r14.L0
            int r2 = r2.d
            java.lang.Object r2 = r3.get(r2)
            b15 r2 = (defpackage.b15) r2
            toe r1 = r1.a()
            vu5[] r1 = r1.c
            r1 = r1[r16]
            y05 r3 = new y05
            dy3 r4 = r14.J0
            boolean r4 = r4.d
            r3.<init>(r2, r1, r4)
            r0[r18] = r3
            goto L_0x01ee
        L_0x01df:
            r18 = r9
            r36 = r11
            r0 = r15
            boolean r3 = r2 instanceof defpackage.iy2
            if (r3 == 0) goto L_0x01ee
            iy2 r2 = (defpackage.iy2) r2
            d64 r2 = r2.X
            r2.i = r1
        L_0x01ee:
            int r9 = r18 + 1
            r12 = r42
            r15 = r0
            r11 = r36
            r8 = 1
            r10 = -1
            r0 = r38
            goto L_0x00ab
        L_0x01fb:
            r36 = r11
            r0 = r15
            r1 = r38
            r2 = r16
        L_0x0202:
            int r3 = r1.length
            if (r2 >= r3) goto L_0x0273
            r3 = r0[r2]
            if (r3 != 0) goto L_0x0268
            r3 = r1[r2]
            if (r3 == 0) goto L_0x0268
            r3 = r36
            r4 = r3[r2]
            jy3[] r5 = r14.z0
            r4 = r5[r4]
            int r5 = r4.c
            r6 = 1
            if (r5 != r6) goto L_0x0264
            int r5 = r14.e(r2, r3)
            r7 = -1
            if (r5 != r7) goto L_0x022b
            lw4 r4 = new lw4
            r4.<init>()
            r0[r2] = r4
            r10 = r42
            goto L_0x026e
        L_0x022b:
            r5 = r0[r5]
            iy2 r5 = (defpackage.iy2) r5
            int r4 = r4.b
            r8 = r16
        L_0x0233:
            vjc[] r9 = r5.C0
            int r10 = r9.length
            if (r8 >= r10) goto L_0x025e
            int[] r10 = r5.b
            r10 = r10[r8]
            if (r10 != r4) goto L_0x0259
            boolean[] r4 = r5.o
            boolean r10 = r4[r8]
            r10 = r10 ^ r6
            swb.h(r10)
            r4[r8] = r6
            r4 = r9[r8]
            r10 = r42
            r4.A(r10, r6)
            ey2 r4 = new ey2
            r9 = r9[r8]
            r4.<init>(r5, r5, r9, r8)
            r0[r2] = r4
            goto L_0x026e
        L_0x0259:
            r10 = r42
            int r8 = r8 + 1
            goto L_0x0233
        L_0x025e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0264:
            r10 = r42
        L_0x0266:
            r7 = -1
            goto L_0x026e
        L_0x0268:
            r10 = r42
            r3 = r36
            r6 = 1
            goto L_0x0266
        L_0x026e:
            int r2 = r2 + 1
            r36 = r3
            goto L_0x0202
        L_0x0273:
            r10 = r42
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
            r4 = r16
        L_0x0282:
            if (r4 >= r3) goto L_0x029c
            r5 = r0[r4]
            boolean r6 = r5 instanceof defpackage.iy2
            if (r6 == 0) goto L_0x0290
            iy2 r5 = (defpackage.iy2) r5
            r1.add(r5)
            goto L_0x0299
        L_0x0290:
            boolean r6 = r5 instanceof defpackage.y05
            if (r6 == 0) goto L_0x0299
            y05 r5 = (defpackage.y05) r5
            r2.add(r5)
        L_0x0299:
            int r4 = r4 + 1
            goto L_0x0282
        L_0x029c:
            int r0 = r1.size()
            iy2[] r0 = new defpackage.iy2[r0]
            r14.G0 = r0
            r1.toArray(r0)
            int r0 = r2.size()
            y05[] r0 = new defpackage.y05[r0]
            r14.H0 = r0
            r2.toArray(r0)
            lu7 r0 = r14.A0
            iy2[] r1 = r14.G0
            r0.getClass()
            wwc r0 = new wwc
            r2 = 9
            r0.<init>(r2, r1)
            r14.I0 = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly3.M(f55[], boolean[], xjc[], boolean[], long):long");
    }

    public final boolean b() {
        return this.I0.b();
    }

    public final void c(jyc jyc) {
        iy2 iy2 = (iy2) jyc;
        this.F0.c(this);
    }

    public final int e(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        jy3[] jy3Arr = this.z0;
        int i3 = jy3Arr[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && jy3Arr[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    public final long f() {
        return this.I0.f();
    }

    public final void i() {
        this.w0.c();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final long k(long r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            iy2[] r3 = r0.G0
            int r4 = r3.length
            r6 = 0
        L_0x0008:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r6 >= r4) goto L_0x00fa
            r10 = r3[r6]
            r10.I0 = r1
            boolean r11 = r10.n()
            if (r11 == 0) goto L_0x0021
            r10.H0 = r1
            r16 = r6
        L_0x001e:
            r6 = 0
            goto L_0x00f5
        L_0x0021:
            r11 = 0
        L_0x0022:
            java.util.ArrayList r12 = r10.z0
            int r12 = r12.size()
            r13 = 0
            if (r11 >= r12) goto L_0x004a
            java.util.ArrayList r12 = r10.z0
            java.lang.Object r12 = r12.get(r11)
            th0 r12 = (defpackage.th0) r12
            long r14 = r12.Z
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            r16 = r6
            if (r14 != 0) goto L_0x0042
            long r5 = r12.z0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0042
            goto L_0x004d
        L_0x0042:
            if (r14 <= 0) goto L_0x0045
            goto L_0x004c
        L_0x0045:
            int r11 = r11 + 1
            r6 = r16
            goto L_0x0022
        L_0x004a:
            r16 = r6
        L_0x004c:
            r12 = r13
        L_0x004d:
            if (r12 == 0) goto L_0x0081
            vjc r5 = r10.B0
            r6 = 0
            int r7 = r12.d(r6)
            monitor-enter(r5)
            monitor-enter(r5)     // Catch:{ all -> 0x0077 }
            r5.s = r6     // Catch:{ all -> 0x007c }
            pjc r6 = r5.a     // Catch:{ all -> 0x007c }
            java.lang.Object r8 = r6.f     // Catch:{ all -> 0x007c }
            tx r8 = (defpackage.tx) r8     // Catch:{ all -> 0x007c }
            r6.g = r8     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            int r6 = r5.q     // Catch:{ all -> 0x0077 }
            if (r7 < r6) goto L_0x0079
            int r8 = r5.p     // Catch:{ all -> 0x0077 }
            int r8 = r8 + r6
            if (r7 <= r8) goto L_0x006d
            goto L_0x0079
        L_0x006d:
            r11 = -9223372036854775808
            r5.t = r11     // Catch:{ all -> 0x0077 }
            int r7 = r7 - r6
            r5.s = r7     // Catch:{ all -> 0x0077 }
            monitor-exit(r5)
            r5 = r9
            goto L_0x0092
        L_0x0077:
            r0 = move-exception
            goto L_0x007f
        L_0x0079:
            monitor-exit(r5)
            r5 = 0
            goto L_0x0092
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x007f:
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            throw r0
        L_0x0081:
            vjc r5 = r10.B0
            long r6 = r10.f()
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x008d
            r6 = r9
            goto L_0x008e
        L_0x008d:
            r6 = 0
        L_0x008e:
            boolean r5 = r5.A(r1, r6)
        L_0x0092:
            if (r5 == 0) goto L_0x00af
            vjc r5 = r10.B0
            int r5 = r5.o()
            r6 = 0
            int r5 = r10.v(r5, r6)
            r10.J0 = r5
            vjc[] r5 = r10.C0
            int r6 = r5.length
            r7 = 0
        L_0x00a5:
            if (r7 >= r6) goto L_0x001e
            r8 = r5[r7]
            r8.A(r1, r9)
            int r7 = r7 + 1
            goto L_0x00a5
        L_0x00af:
            r10.H0 = r1
            r5 = 0
            r10.L0 = r5
            java.util.ArrayList r6 = r10.z0
            r6.clear()
            r10.J0 = r5
            jj7 r5 = r10.x0
            boolean r5 = r5.C()
            if (r5 == 0) goto L_0x00dd
            vjc r5 = r10.B0
            r5.i()
            vjc[] r5 = r10.C0
            int r6 = r5.length
            r7 = 0
        L_0x00cc:
            if (r7 >= r6) goto L_0x00d6
            r8 = r5[r7]
            r8.i()
            int r7 = r7 + 1
            goto L_0x00cc
        L_0x00d6:
            jj7 r5 = r10.x0
            r5.o()
            goto L_0x001e
        L_0x00dd:
            jj7 r5 = r10.x0
            r5.c = r13
            vjc r5 = r10.B0
            r6 = 0
            r5.z(r6)
            vjc[] r5 = r10.C0
            int r7 = r5.length
            r8 = r6
        L_0x00eb:
            if (r8 >= r7) goto L_0x00f5
            r9 = r5[r8]
            r9.z(r6)
            int r8 = r8 + 1
            goto L_0x00eb
        L_0x00f5:
            int r5 = r16 + 1
            r6 = r5
            goto L_0x0008
        L_0x00fa:
            r6 = 0
            y05[] r0 = r0.H0
            int r3 = r0.length
            r5 = r6
        L_0x00ff:
            if (r5 >= r3) goto L_0x011c
            r4 = r0[r5]
            long[] r6 = r4.c
            int r6 = defpackage.mze.b(r6, r1, r9)
            r4.Z = r6
            boolean r10 = r4.o
            if (r10 == 0) goto L_0x0116
            long[] r10 = r4.c
            int r10 = r10.length
            if (r6 != r10) goto L_0x0116
            r10 = r1
            goto L_0x0117
        L_0x0116:
            r10 = r7
        L_0x0117:
            r4.w0 = r10
            int r5 = r5 + 1
            goto L_0x00ff
        L_0x011c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly3.k(long):long");
    }

    public final long o() {
        return -9223372036854775807L;
    }

    public final voe p() {
        return this.y0;
    }

    public final long r() {
        return this.I0.r();
    }

    public final void s(long j, boolean z) {
        long j2;
        for (iy2 iy2 : this.G0) {
            if (!iy2.n()) {
                vjc vjc = iy2.B0;
                int i = vjc.q;
                vjc.h(j, z, true);
                vjc vjc2 = iy2.B0;
                int i2 = vjc2.q;
                if (i2 > i) {
                    synchronized (vjc2) {
                        j2 = vjc2.p == 0 ? Long.MIN_VALUE : vjc2.n[vjc2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        vjc[] vjcArr = iy2.C0;
                        if (i3 >= vjcArr.length) {
                            break;
                        }
                        vjcArr[i3].h(j2, z, iy2.o[i3]);
                        i3++;
                    }
                }
                int min = Math.min(iy2.v(i2, 0), iy2.J0);
                if (min > 0) {
                    mze.I(iy2.z0, 0, min);
                    iy2.J0 -= min;
                }
            }
        }
    }

    public final void u(long j) {
        this.I0.u(j);
    }
}
