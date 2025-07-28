package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: dy3  reason: default package */
public final class dy3 implements pg5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final v4b i;
    public final x58 j;
    public final Uri k;
    public final ggb l;
    public final List m;

    public dy3(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, ggb ggb, v4b v4b, x58 x58, Uri uri, ArrayList arrayList) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = z;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.l = ggb;
        this.i = v4b;
        this.k = uri;
        this.j = x58;
        this.m = arrayList;
    }

    public final Object a(List list) {
        dy3 dy3 = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new hzd());
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i2 = 0;
        while (i2 < dy3.m.size()) {
            if (((hzd) linkedList.peek()).a != i2) {
                long c2 = dy3.c(i2);
                if (c2 != -9223372036854775807L) {
                    j2 += c2;
                }
            } else {
                vma b2 = dy3.b(i2);
                List list2 = b2.c;
                hzd hzd = (hzd) linkedList.poll();
                int i3 = hzd.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i4 = hzd.b;
                    x8 x8Var = (x8) list2.get(i4);
                    List list3 = x8Var.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((jac) list3.get(hzd.c));
                        hzd = (hzd) linkedList.poll();
                        if (!(hzd.a == i3 && hzd.b == i4)) {
                            List list4 = list2;
                            arrayList2.add(new x8(x8Var.a, x8Var.b, arrayList3, x8Var.d, x8Var.e, x8Var.f));
                        }
                        arrayList3.add((jac) list3.get(hzd.c));
                        hzd = (hzd) linkedList.poll();
                        break;
                    } while (hzd.b == i4);
                    List list42 = list2;
                    arrayList2.add(new x8(x8Var.a, x8Var.b, arrayList3, x8Var.d, x8Var.e, x8Var.f));
                    if (hzd.a != i3) {
                        break;
                    }
                    list2 = list42;
                }
                linkedList.addFirst(hzd);
                arrayList.add(new vma(b2.a, b2.b - j2, arrayList2, b2.d));
            }
            i2++;
            dy3 = this;
        }
        long j3 = dy3.b;
        return new dy3(dy3.a, j3 != -9223372036854775807L ? j3 - j2 : -9223372036854775807L, dy3.c, dy3.d, dy3.e, dy3.f, dy3.g, dy3.h, dy3.l, dy3.i, dy3.j, dy3.k, arrayList);
    }

    public final vma b(int i2) {
        return (vma) this.m.get(i2);
    }

    public final long c(int i2) {
        long j2;
        long j3;
        List list = this.m;
        if (i2 == list.size() - 1) {
            j2 = this.b;
            if (j2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j3 = ((vma) list.get(i2)).b;
        } else {
            j2 = ((vma) list.get(i2 + 1)).b;
            j3 = ((vma) list.get(i2)).b;
        }
        return j2 - j3;
    }

    public final long d(int i2) {
        return mze.D(c(i2));
    }
}
