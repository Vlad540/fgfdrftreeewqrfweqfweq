package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: my3  reason: default package */
public final class my3 implements s88, iyc, hy2 {
    public static final Pattern M0 = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern N0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final s59 A0;
    public final xya B0;
    public final IdentityHashMap C0 = new IdentityHashMap();
    public final jn D0;
    public final fo4 E0;
    public q88 F0;
    public jy2[] G0 = new jy2[0];
    public z05[] H0 = new z05[0];
    public y83 I0;
    public ey3 J0;
    public int K0;
    public List L0;
    public final mk9 X;
    public final j8e Y;
    public final long Z;
    public final int a;
    public final jn b;
    public final cqe c;
    public final no4 o;
    public final lj7 w0;
    public final l34 x0;
    public final woe y0;
    public final ky3[] z0;

    public my3(int i, ey3 ey3, j8e j8e, int i2, jn jnVar, cqe cqe, no4 no4, fo4 fo4, mk9 mk9, jn jnVar2, long j, lj7 lj7, l34 l34, s59 s59, u5g u5g, cza cza) {
        int i3;
        int i4;
        int i5;
        xu5[] xu5Arr;
        xu5[] n;
        af4 a2;
        Integer num;
        ey3 ey32 = ey3;
        int i6 = i2;
        jn jnVar3 = jnVar;
        no4 no42 = no4;
        l34 l342 = l34;
        this.a = i;
        this.J0 = ey32;
        this.Y = j8e;
        this.K0 = i6;
        this.b = jnVar3;
        this.c = cqe;
        this.o = no42;
        this.E0 = fo4;
        this.X = mk9;
        this.D0 = jnVar2;
        this.Z = j;
        this.w0 = lj7;
        this.x0 = l342;
        this.A0 = s59;
        this.B0 = new xya(ey32, u5g, l342);
        int i7 = 0;
        s59.getClass();
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        this.I0 = new y83(e8c, e8c);
        wma b2 = ey32.b(i6);
        List list = b2.d;
        this.L0 = list;
        List list2 = b2.c;
        int size = list2.size();
        HashMap hashMap = new HashMap(ct0.d(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i8 = 0; i8 < size; i8++) {
            hashMap.put(Long.valueOf(((y8) list2.get(i8)).a), Integer.valueOf(i8));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i8));
            arrayList.add(arrayList2);
            sparseArray.put(i8, arrayList2);
        }
        int i9 = 0;
        while (i9 < size) {
            y8 y8Var = (y8) list2.get(i9);
            af4 a3 = a("http://dashif.org/guidelines/trickmode", y8Var.e);
            List list3 = y8Var.f;
            a3 = a3 == null ? a("http://dashif.org/guidelines/trickmode", list3) : a3;
            int intValue = (a3 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(a3.b)))) == null) ? i9 : num.intValue();
            if (intValue == i9 && (a2 = a("urn:mpeg:dash:adaptation-set-switching:2016", list3)) != null) {
                int i10 = oze.a;
                String[] split = a2.b.split(",", -1);
                int length = split.length;
                for (int i11 = i7; i11 < length; i11++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i11])));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i9) {
                List list4 = (List) sparseArray.get(i9);
                List list5 = (List) sparseArray.get(intValue);
                list5.addAll(list4);
                sparseArray.put(i9, list5);
                arrayList.remove(list4);
            }
            i9++;
            i7 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] H = xie.H((Collection) arrayList.get(i12));
            iArr[i12] = H;
            Arrays.sort(H);
        }
        boolean[] zArr = new boolean[size2];
        xu5[][] xu5Arr2 = new xu5[size2][];
        int i13 = 0;
        int i14 = 0;
        while (i13 < size2) {
            int[] iArr2 = iArr[i13];
            int length2 = iArr2.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    break;
                }
                List list6 = ((y8) list2.get(iArr2[i15])).c;
                int[] iArr3 = iArr2;
                for (int i16 = 0; i16 < list6.size(); i16++) {
                    if (!((kac) list6.get(i16)).o.isEmpty()) {
                        zArr[i13] = true;
                        i14++;
                        break;
                    }
                }
                i15++;
                iArr2 = iArr3;
            }
            int[] iArr4 = iArr[i13];
            int length3 = iArr4.length;
            int i17 = 0;
            while (i17 < length3) {
                int i18 = iArr4[i17];
                y8 y8Var2 = (y8) list2.get(i18);
                List list7 = ((y8) list2.get(i18)).d;
                int[] iArr5 = iArr4;
                int i19 = length3;
                int i20 = 0;
                while (i20 < list7.size()) {
                    af4 af4 = (af4) list7.get(i20);
                    List list8 = list7;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(af4.a)) {
                        uu5 uu5 = new uu5();
                        uu5.m = c49.l("application/cea-608");
                        uu5.a = wn6.k(new StringBuilder(), y8Var2.a, ":cea608");
                        n = n(af4, M0, new xu5(uu5));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(af4.a)) {
                        uu5 uu52 = new uu5();
                        uu52.m = c49.l("application/cea-708");
                        uu52.a = wn6.k(new StringBuilder(), y8Var2.a, ":cea708");
                        n = n(af4, N0, new xu5(uu52));
                    } else {
                        i20++;
                        list7 = list8;
                    }
                    xu5Arr = n;
                    i5 = 1;
                }
                i17++;
                iArr4 = iArr5;
                length3 = i19;
            }
            i5 = 1;
            xu5Arr = new xu5[0];
            xu5Arr2[i13] = xu5Arr;
            if (xu5Arr.length != 0) {
                i14 += i5;
            }
            i13 += i5;
            int i21 = i5;
        }
        int size3 = list.size() + i14 + size2;
        uoe[] uoeArr = new uoe[size3];
        ky3[] ky3Arr = new ky3[size3];
        int i22 = 0;
        int i23 = 0;
        while (i22 < size2) {
            int[] iArr6 = iArr[i22];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr6.length;
            int i24 = size2;
            int i25 = 0;
            while (i25 < length4) {
                arrayList3.addAll(((y8) list2.get(iArr6[i25])).c);
                i25++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            xu5[] xu5Arr3 = new xu5[size4];
            int i26 = 0;
            while (i26 < size4) {
                int i27 = size4;
                xu5 xu5 = ((kac) arrayList3.get(i26)).a;
                ArrayList arrayList4 = arrayList3;
                uu5 a4 = xu5.a();
                a4.J = no42.d(xu5);
                xu5Arr3[i26] = new xu5(a4);
                i26++;
                size4 = i27;
                arrayList3 = arrayList4;
            }
            y8 y8Var3 = (y8) list2.get(iArr6[0]);
            long j2 = y8Var3.a;
            String l = j2 != -1 ? Long.toString(j2) : wn6.h(i22, "unset:");
            int i28 = i23 + 1;
            if (zArr[i22]) {
                i3 = i28;
                i28 = i23 + 2;
            } else {
                i3 = -1;
            }
            if (xu5Arr2[i22].length != 0) {
                i4 = i28;
                i28++;
            } else {
                i4 = -1;
            }
            e(jnVar3, xu5Arr3);
            List list9 = list2;
            uoeArr[i23] = new uoe(l, xu5Arr3);
            po5 po52 = ws6.b;
            e8c e8c2 = e8c.X;
            ky3Arr[i23] = new ky3(y8Var3.b, 0, iArr6, i23, i3, i4, -1, e8c2);
            int i29 = i3;
            int i30 = -1;
            if (i29 != -1) {
                String g = hr1.g(l, ":emsg");
                uu5 uu53 = new uu5();
                uu53.a = g;
                uu53.m = c49.l("application/x-emsg");
                uoeArr[i29] = new uoe(g, new xu5(uu53));
                ky3Arr[i29] = new ky3(5, 1, iArr6, i23, -1, -1, -1, e8c2);
                i30 = -1;
            }
            if (i4 != i30) {
                String g2 = hr1.g(l, ":cc");
                ky3Arr[i4] = new ky3(3, 1, iArr6, i23, -1, -1, -1, ws6.k(xu5Arr2[i22]));
                e(jnVar3, xu5Arr2[i22]);
                uoeArr[i4] = new uoe(g2, xu5Arr2[i22]);
            }
            i22++;
            size2 = i24;
            no42 = no4;
            iArr = iArr7;
            i23 = i28;
            list2 = list9;
        }
        int i31 = 0;
        while (i31 < list.size()) {
            c15 c15 = (c15) list.get(i31);
            uu5 uu54 = new uu5();
            uu54.a = c15.a();
            uu54.m = c49.l("application/x-emsg");
            uoeArr[i23] = new uoe(c15.a() + ":" + i31, new xu5(uu54));
            po5 po53 = ws6.b;
            ky3Arr[i23] = new ky3(5, 2, new int[0], -1, -1, -1, i31, e8c.X);
            i31++;
            i23++;
        }
        Pair create = Pair.create(new woe(uoeArr), ky3Arr);
        this.y0 = (woe) create.first;
        this.z0 = (ky3[]) create.second;
    }

    public static af4 a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            af4 af4 = (af4) list.get(i);
            if (str.equals(af4.a)) {
                return af4;
            }
        }
        return null;
    }

    public static void e(jn jnVar, xu5[] xu5Arr) {
        for (int i = 0; i < xu5Arr.length; i++) {
            xu5 xu5 = xu5Arr[i];
            a84 a84 = (a84) jnVar.o;
            if (a84.c && a84.b.b(xu5)) {
                uu5 a2 = xu5.a();
                a2.m = c49.l("application/x-media3-cues");
                a2.G = a84.b.e(xu5);
                StringBuilder sb = new StringBuilder();
                sb.append(xu5.n);
                String str = xu5.j;
                sb.append(str != null ? " ".concat(str) : BuildConfig.FLAVOR);
                a2.i = sb.toString();
                a2.r = Long.MAX_VALUE;
                xu5 = a2.a();
            }
            xu5Arr[i] = xu5;
        }
    }

    public static xu5[] n(af4 af4, Pattern pattern, xu5 xu5) {
        String str = af4.b;
        if (str == null) {
            return new xu5[]{xu5};
        }
        int i = oze.a;
        String[] split = str.split(";", -1);
        xu5[] xu5Arr = new xu5[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            Matcher matcher = pattern.matcher(split[i2]);
            if (!matcher.matches()) {
                return new xu5[]{xu5};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            uu5 a2 = xu5.a();
            a2.a = xu5.a + ":" + parseInt;
            a2.F = parseInt;
            a2.d = matcher.group(2);
            xu5Arr[i2] = new xu5(a2);
        }
        return xu5Arr;
    }

    public final boolean b() {
        return this.I0.b();
    }

    public final int d(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        ky3[] ky3Arr = this.z0;
        int i3 = ky3Arr[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && ky3Arr[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    public final long f() {
        return this.I0.f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: yjc[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long g(defpackage.g55[] r37, boolean[] r38, defpackage.yjc[] r39, boolean[] r40, long r41) {
        /*
            r36 = this;
            r14 = r36
            r0 = r37
            r15 = r39
            r12 = r41
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
            woe r3 = r14.y0
            uoe r2 = r2.a()
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
            if (r1 >= r2) goto L_0x0052
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0038
            boolean r2 = r38[r1]
            if (r2 != 0) goto L_0x004f
        L_0x0038:
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.jy2
            if (r3 == 0) goto L_0x0044
            jy2 r2 = (defpackage.jy2) r2
            r2.A(r14)
            goto L_0x004d
        L_0x0044:
            boolean r3 = r2 instanceof defpackage.fy2
            if (r3 == 0) goto L_0x004d
            fy2 r2 = (defpackage.fy2) r2
            r2.b()
        L_0x004d:
            r15[r1] = r17
        L_0x004f:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0052:
            r1 = r16
        L_0x0054:
            int r2 = r0.length
            r8 = 1
            if (r1 >= r2) goto L_0x0091
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.mw4
            if (r3 != 0) goto L_0x0062
            boolean r2 = r2 instanceof defpackage.fy2
            if (r2 == 0) goto L_0x008e
        L_0x0062:
            int r2 = r14.d(r1, r11)
            if (r2 != r10) goto L_0x006d
            r2 = r15[r1]
            boolean r2 = r2 instanceof defpackage.mw4
            goto L_0x007f
        L_0x006d:
            r3 = r15[r1]
            boolean r4 = r3 instanceof defpackage.fy2
            if (r4 == 0) goto L_0x007c
            fy2 r3 = (defpackage.fy2) r3
            jy2 r3 = r3.a
            r2 = r15[r2]
            if (r3 != r2) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r8 = r16
        L_0x007e:
            r2 = r8
        L_0x007f:
            if (r2 != 0) goto L_0x008e
            r2 = r15[r1]
            boolean r3 = r2 instanceof defpackage.fy2
            if (r3 == 0) goto L_0x008c
            fy2 r2 = (defpackage.fy2) r2
            r2.b()
        L_0x008c:
            r15[r1] = r17
        L_0x008e:
            int r1 = r1 + 1
            goto L_0x0054
        L_0x0091:
            r9 = r16
        L_0x0093:
            int r1 = r0.length
            if (r9 >= r1) goto L_0x01cf
            r1 = r0[r9]
            if (r1 != 0) goto L_0x00a1
            r18 = r9
            r35 = r11
            r4 = r15
            goto L_0x01c2
        L_0x00a1:
            r2 = r15[r9]
            if (r2 != 0) goto L_0x01b0
            r40[r9] = r8
            r2 = r11[r9]
            ky3[] r3 = r14.z0
            r2 = r3[r2]
            int r3 = r2.c
            if (r3 != 0) goto L_0x018a
            int r3 = r2.f
            if (r3 == r10) goto L_0x00b8
            r28 = r8
            goto L_0x00ba
        L_0x00b8:
            r28 = r16
        L_0x00ba:
            if (r28 == 0) goto L_0x00c4
            woe r4 = r14.y0
            uoe r3 = r4.a(r3)
            r4 = r8
            goto L_0x00c8
        L_0x00c4:
            r4 = r16
            r3 = r17
        L_0x00c8:
            int r5 = r2.g
            if (r5 == r10) goto L_0x00d3
            ky3[] r6 = r14.z0
            r5 = r6[r5]
            ws6 r5 = r5.h
            goto L_0x00d7
        L_0x00d3:
            e8c r5 = defpackage.ws6.m()
        L_0x00d7:
            int r6 = r5.size()
            int r6 = r6 + r4
            xu5[] r4 = new defpackage.xu5[r6]
            int[] r6 = new int[r6]
            if (r28 == 0) goto L_0x00ed
            xu5 r3 = r3.c()
            r4[r16] = r3
            r3 = 5
            r6[r16] = r3
            r3 = r8
            goto L_0x00ef
        L_0x00ed:
            r3 = r16
        L_0x00ef:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r10 = r16
        L_0x00f6:
            int r8 = r5.size()
            if (r10 >= r8) goto L_0x0110
            java.lang.Object r8 = r5.get(r10)
            xu5 r8 = (defpackage.xu5) r8
            r4[r3] = r8
            r18 = 3
            r6[r3] = r18
            r7.add(r8)
            r8 = 1
            int r3 = r3 + r8
            int r10 = r10 + 1
            goto L_0x00f6
        L_0x0110:
            r8 = 1
            ey3 r3 = r14.J0
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x0121
            if (r28 == 0) goto L_0x0121
            xya r3 = r14.B0
            wya r3 = r3.a()
            r10 = r3
            goto L_0x0123
        L_0x0121:
            r10 = r17
        L_0x0123:
            jn r3 = r14.b
            lj7 r5 = r14.w0
            ey3 r8 = r14.J0
            r32 = r9
            j8e r9 = r14.Y
            r33 = r11
            int r11 = r14.K0
            int[] r12 = r2.a
            int r13 = r2.b
            r34 = r6
            r29 = r7
            long r6 = r14.Z
            cqe r0 = r14.c
            r18 = r3
            r19 = r5
            r20 = r8
            r21 = r9
            r22 = r11
            r23 = r12
            r24 = r1
            r25 = r13
            r26 = r6
            r30 = r10
            r31 = r0
            e64 r5 = r18.l(r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            jy2 r0 = new jy2
            int r2 = r2.b
            l34 r7 = r14.x0
            no4 r11 = r14.o
            fo4 r12 = r14.E0
            mk9 r13 = r14.X
            jn r8 = r14.D0
            r1 = r0
            r3 = r34
            r6 = r36
            r19 = r8
            r18 = r32
            r8 = r41
            r15 = r10
            r10 = r11
            r35 = r33
            r11 = r12
            r12 = r13
            r13 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            monitor-enter(r36)
            java.util.IdentityHashMap r1 = r14.C0     // Catch:{ all -> 0x0187 }
            r1.put(r0, r15)     // Catch:{ all -> 0x0187 }
            monitor-exit(r36)     // Catch:{ all -> 0x0187 }
            r4 = r39
            r4[r18] = r0
            goto L_0x01c2
        L_0x0187:
            r0 = move-exception
            monitor-exit(r36)     // Catch:{ all -> 0x0187 }
            throw r0
        L_0x018a:
            r18 = r9
            r35 = r11
            r4 = r15
            r0 = 2
            if (r3 != r0) goto L_0x01c2
            java.util.List r0 = r14.L0
            int r2 = r2.d
            java.lang.Object r0 = r0.get(r2)
            c15 r0 = (defpackage.c15) r0
            uoe r1 = r1.a()
            xu5 r1 = r1.c()
            z05 r2 = new z05
            ey3 r3 = r14.J0
            boolean r3 = r3.d
            r2.<init>(r0, r1, r3)
            r4[r18] = r2
            goto L_0x01c2
        L_0x01b0:
            r18 = r9
            r35 = r11
            r4 = r15
            boolean r0 = r2 instanceof defpackage.jy2
            if (r0 == 0) goto L_0x01c2
            jy2 r2 = (defpackage.jy2) r2
            e64 r0 = r2.q()
            r0.c(r1)
        L_0x01c2:
            int r9 = r18 + 1
            r0 = r37
            r12 = r41
            r15 = r4
            r11 = r35
            r8 = 1
            r10 = -1
            goto L_0x0093
        L_0x01cf:
            r35 = r11
            r4 = r15
            r0 = r37
            r1 = r16
        L_0x01d6:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x021d
            r2 = r4[r1]
            if (r2 != 0) goto L_0x0212
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0212
            r2 = r35
            r3 = r2[r1]
            ky3[] r5 = r14.z0
            r3 = r5[r3]
            int r5 = r3.c
            r6 = 1
            if (r5 != r6) goto L_0x020e
            int r5 = r14.d(r1, r2)
            r7 = -1
            if (r5 != r7) goto L_0x01ff
            mw4 r3 = new mw4
            r3.<init>()
            r4[r1] = r3
            r8 = r41
            goto L_0x0218
        L_0x01ff:
            r5 = r4[r5]
            jy2 r5 = (defpackage.jy2) r5
            int r3 = r3.b
            r8 = r41
            fy2 r3 = r5.B(r3, r8)
            r4[r1] = r3
            goto L_0x0218
        L_0x020e:
            r8 = r41
        L_0x0210:
            r7 = -1
            goto L_0x0218
        L_0x0212:
            r8 = r41
            r2 = r35
            r6 = 1
            goto L_0x0210
        L_0x0218:
            int r1 = r1 + 1
            r35 = r2
            goto L_0x01d6
        L_0x021d:
            r8 = r41
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r4.length
            r3 = r16
        L_0x022c:
            if (r3 >= r2) goto L_0x0246
            r5 = r4[r3]
            boolean r6 = r5 instanceof defpackage.jy2
            if (r6 == 0) goto L_0x023a
            jy2 r5 = (defpackage.jy2) r5
            r0.add(r5)
            goto L_0x0243
        L_0x023a:
            boolean r6 = r5 instanceof defpackage.z05
            if (r6 == 0) goto L_0x0243
            z05 r5 = (defpackage.z05) r5
            r1.add(r5)
        L_0x0243:
            int r3 = r3 + 1
            goto L_0x022c
        L_0x0246:
            int r2 = r0.size()
            jy2[] r2 = new defpackage.jy2[r2]
            r14.G0 = r2
            r0.toArray(r2)
            int r2 = r1.size()
            z05[] r2 = new defpackage.z05[r2]
            r14.H0 = r2
            r1.toArray(r2)
            s59 r1 = r14.A0
            no3 r2 = new no3
            r3 = 10
            r2.<init>(r3)
            java.util.AbstractList r2 = defpackage.jjd.S(r2, r0)
            r1.getClass()
            y83 r1 = new y83
            r1.<init>(r0, r2)
            r14.I0 = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my3.g(g55[], boolean[], yjc[], boolean[], long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r3 < (((r0.C() + r8) + r6) - 1)) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long h(long r18, defpackage.xtc r20) {
        /*
            r17 = this;
            r1 = r18
            r0 = r17
            jy2[] r0 = r0.G0
            int r3 = r0.length
            r4 = 0
            r5 = r4
        L_0x0009:
            if (r5 >= r3) goto L_0x0074
            r6 = r0[r5]
            int r7 = r6.a
            r8 = 2
            if (r7 != r8) goto L_0x0071
            e64 r0 = r6.X
            a64[] r0 = r0.i
            int r3 = r0.length
        L_0x0017:
            if (r4 >= r3) goto L_0x006f
            r5 = r0[r4]
            java.lang.Object r6 = r5.g
            wy3 r6 = (defpackage.wy3) r6
            if (r6 == 0) goto L_0x006c
            long r6 = r5.e()
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x002c
            goto L_0x006c
        L_0x002c:
            java.lang.Object r0 = r5.g
            wy3 r0 = (defpackage.wy3) r0
            defpackage.oyb.l(r0)
            long r3 = r5.b
            long r3 = r0.v(r1, r3)
            long r8 = r5.c
            long r3 = r3 + r8
            long r10 = r5.g(r3)
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x0061
            r12 = -1
            int r12 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            r13 = 1
            if (r12 == 0) goto L_0x005a
            defpackage.oyb.l(r0)
            long r15 = r0.C()
            long r15 = r15 + r8
            long r15 = r15 + r6
            long r15 = r15 - r13
            int r0 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0061
        L_0x005a:
            long r3 = r3 + r13
            long r3 = r5.g(r3)
            r5 = r3
            goto L_0x0062
        L_0x0061:
            r5 = r10
        L_0x0062:
            r0 = r20
            r1 = r18
            r3 = r10
            long r0 = r0.a(r1, r3, r5)
            goto L_0x0070
        L_0x006c:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x006f:
            r0 = r1
        L_0x0070:
            return r0
        L_0x0071:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my3.h(long, xtc):long");
    }

    public final void i() {
        this.w0.c();
    }

    public final void j(kyc kyc) {
        jy2 jy2 = (jy2) kyc;
        this.F0.j(this);
    }

    public final long k(long j) {
        int i;
        ArrayList arrayList;
        uh0 uh0;
        boolean z;
        long j2 = j;
        jy2[] jy2Arr = this.G0;
        int length = jy2Arr.length;
        int i2 = 0;
        while (i2 < length) {
            jy2 jy2 = jy2Arr[i2];
            jy2.I0 = j2;
            if (jy2.w()) {
                jy2.H0 = j2;
                i = i2;
            } else {
                int i3 = 0;
                while (true) {
                    arrayList = jy2.z0;
                    if (i3 >= arrayList.size()) {
                        i = i2;
                        break;
                    }
                    uh0 = (uh0) arrayList.get(i3);
                    int i4 = (uh0.Z > j2 ? 1 : (uh0.Z == j2 ? 0 : -1));
                    i = i2;
                    if (i4 == 0 && uh0.z0 == -9223372036854775807L) {
                        break;
                    } else if (i4 > 0) {
                        break;
                    } else {
                        i3++;
                        i2 = i;
                    }
                }
                uh0 = null;
                wjc wjc = jy2.B0;
                if (uh0 != null) {
                    z = wjc.z(uh0.d(0));
                } else {
                    z = wjc.A(j2, j2 < jy2.f());
                }
                wjc[] wjcArr = jy2.C0;
                if (z) {
                    jy2.J0 = jy2.z(wjc.n(), 0);
                    for (wjc A : wjcArr) {
                        A.A(j2, true);
                    }
                } else {
                    jy2.H0 = j2;
                    jy2.L0 = false;
                    arrayList.clear();
                    jy2.J0 = 0;
                    ul7 ul7 = jy2.x0;
                    if (ul7.A()) {
                        wjc.h();
                        for (wjc h : wjcArr) {
                            h.h();
                        }
                        ul7.s();
                    } else {
                        ul7.c = null;
                        wjc.y(false);
                        for (wjc y : wjcArr) {
                            y.y(false);
                        }
                        i2 = i + 1;
                    }
                }
            }
            i2 = i + 1;
        }
        for (z05 z05 : this.H0) {
            int b2 = oze.b(z05.c, j2, true);
            z05.Z = b2;
            z05.w0 = (!z05.o || b2 != z05.c.length) ? -9223372036854775807L : j2;
        }
        return j2;
    }

    public final void l(q88 q88, long j) {
        this.F0 = q88;
        q88.c(this);
    }

    public final boolean m(qj7 qj7) {
        return this.I0.m(qj7);
    }

    public final long o() {
        return -9223372036854775807L;
    }

    public final woe p() {
        return this.y0;
    }

    public final long r() {
        return this.I0.r();
    }

    public final void s(long j, boolean z) {
        long j2;
        for (jy2 jy2 : this.G0) {
            if (!jy2.w()) {
                wjc wjc = jy2.B0;
                int i = wjc.q;
                wjc.g(j, z, true);
                wjc wjc2 = jy2.B0;
                int i2 = wjc2.q;
                if (i2 > i) {
                    synchronized (wjc2) {
                        j2 = wjc2.p == 0 ? Long.MIN_VALUE : wjc2.n[wjc2.r];
                    }
                    int i3 = 0;
                    while (true) {
                        wjc[] wjcArr = jy2.C0;
                        if (i3 >= wjcArr.length) {
                            break;
                        }
                        wjcArr[i3].g(j2, z, jy2.o[i3]);
                        i3++;
                    }
                }
                int min = Math.min(jy2.z(i2, 0), jy2.J0);
                if (min > 0) {
                    oze.X(jy2.z0, 0, min);
                    jy2.J0 -= min;
                }
            }
        }
    }

    public final void u(long j) {
        this.I0.u(j);
    }
}
