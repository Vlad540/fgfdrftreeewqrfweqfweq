package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ac4  reason: default package */
public final class ac4 extends du7 {
    public static final kga f = kga.a(new yz(18));
    public static final kga g = kga.a(new yz(20));
    public final zl3 d;
    public final AtomicReference e;

    public ac4(Context context, zl3 zl3) {
        int i = mb4.d1;
        mb4 mb4 = new mb4(new ob4(context));
        this.d = zl3;
        this.e = new AtomicReference(mb4);
    }

    public static int a(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    public static int c(vu5 vu5, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(vu5.c)) {
            return 4;
        }
        String f2 = f(str);
        String f3 = f(vu5.c);
        if (f3 == null || f2 == null) {
            return (!z || f3 != null) ? 0 : 1;
        }
        if (f3.startsWith(f2) || f2.startsWith(f3)) {
            return 3;
        }
        int i = mze.a;
        return f3.split("-", 2)[0].equals(f2.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean d(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static void e(SparseArray sparseArray, gpe gpe, int i) {
        if (gpe != null) {
            int g2 = b49.g(gpe.a.c[0].A0);
            Pair pair = (Pair) sparseArray.get(g2);
            if (pair == null || ((gpe) pair.first).b.isEmpty()) {
                sparseArray.put(g2, Pair.create(gpe, Integer.valueOf(i)));
            }
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair g(int i, bu7 bu7, int[][][] iArr, tb4 tb4, Comparator comparator) {
        Object obj;
        boolean z;
        bu7 bu72 = bu7;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < bu72.a) {
            if (i == bu72.b[i2]) {
                voe voe = bu72.c[i2];
                int i3 = 0;
                while (i3 < voe.a) {
                    toe a = voe.a(i3);
                    e8c i4 = tb4.i(i2, a, iArr[i2][i3]);
                    int i5 = a.a;
                    boolean[] zArr = new boolean[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        vb4 vb4 = (vb4) i4.get(i6);
                        int a2 = vb4.a();
                        if (!zArr[i6] && a2 != 0) {
                            if (a2 == 1) {
                                obj = ws6.n(vb4);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(vb4);
                                int i7 = i6 + 1;
                                while (i7 < i5) {
                                    vb4 vb42 = (vb4) i4.get(i7);
                                    if (vb42.a() != 2 || !vb4.b(vb42)) {
                                        z = true;
                                    } else {
                                        arrayList2.add(vb42);
                                        z = true;
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    boolean z2 = z;
                                    bu7 bu73 = bu7;
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i6++;
                        bu7 bu74 = bu7;
                    }
                    i3++;
                    bu7 bu75 = bu7;
                }
            }
            tb4 tb42 = tb4;
            i2++;
            bu72 = bu7;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((vb4) list.get(i8)).c;
        }
        vb4 vb43 = (vb4) list.get(0);
        return Pair.create(new d55(0, vb43.b, iArr2), Integer.valueOf(vb43.a));
    }

    public final ob4 b() {
        mb4 mb4 = (mb4) this.e.get();
        mb4.getClass();
        return new ob4(mb4);
    }

    public final void h(ob4 ob4) {
        y45 y45;
        mb4 mb4 = new mb4(ob4);
        if (!((mb4) this.e.getAndSet(mb4)).equals(mb4) && (y45 = this.a) != null) {
            y45.w0.c(10);
        }
    }
}
