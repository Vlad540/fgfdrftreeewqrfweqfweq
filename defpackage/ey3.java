package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: ey3  reason: default package */
public final class ey3 implements qg5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final k64 i;
    public final x58 j;
    public final Uri k;
    public final hgb l;
    public final List m;

    public ey3(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, hgb hgb, k64 k64, x58 x58, Uri uri, ArrayList arrayList) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = z;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.l = hgb;
        this.i = k64;
        this.k = uri;
        this.j = x58;
        this.m = arrayList;
    }

    public final Object a(List list) {
        long j2;
        long j3;
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new izd(-1, -1, -1));
        ArrayList arrayList3 = new ArrayList();
        long j4 = 0;
        int i2 = 0;
        while (true) {
            j2 = -9223372036854775807L;
            if (i2 >= this.m.size()) {
                break;
            }
            if (((izd) linkedList.peek()).a != i2) {
                long c2 = c(i2);
                if (c2 != -9223372036854775807L) {
                    j4 += c2;
                }
                j3 = j4;
                arrayList = arrayList3;
            } else {
                wma b2 = b(i2);
                List list2 = b2.c;
                izd izd = (izd) linkedList.poll();
                int i3 = izd.a;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i4 = izd.b;
                    y8 y8Var = (y8) list2.get(i4);
                    List list3 = y8Var.c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((kac) list3.get(izd.c));
                        izd = (izd) linkedList.poll();
                        if (!(izd.a == i3 && izd.b == i4)) {
                            int i5 = y8Var.b;
                            List list4 = y8Var.d;
                            arrayList2 = arrayList3;
                            j3 = j4;
                            arrayList4.add(new y8(y8Var.a, i5, arrayList5, list4, y8Var.e, y8Var.f));
                        }
                        arrayList5.add((kac) list3.get(izd.c));
                        izd = (izd) linkedList.poll();
                        break;
                    } while (izd.b == i4);
                    int i52 = y8Var.b;
                    List list42 = y8Var.d;
                    arrayList2 = arrayList3;
                    j3 = j4;
                    arrayList4.add(new y8(y8Var.a, i52, arrayList5, list42, y8Var.e, y8Var.f));
                    if (izd.a != i3) {
                        break;
                    }
                    arrayList3 = arrayList2;
                    j4 = j3;
                }
                linkedList.addFirst(izd);
                arrayList = arrayList2;
                arrayList.add(new wma(b2.a, b2.b - j3, arrayList4, b2.d));
            }
            i2++;
            arrayList3 = arrayList;
            j4 = j3;
        }
        long j5 = j4;
        ArrayList arrayList6 = arrayList3;
        long j6 = this.b;
        if (j6 != -9223372036854775807L) {
            j2 = j6 - j5;
        }
        ey3 ey3 = r4;
        ey3 ey32 = new ey3(this.a, j2, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList6);
        return ey3;
    }

    public final wma b(int i2) {
        return (wma) this.m.get(i2);
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
            j3 = ((wma) list.get(i2)).b;
        } else {
            j2 = ((wma) list.get(i2 + 1)).b;
            j3 = ((wma) list.get(i2)).b;
        }
        return j2 - j3;
    }

    public final long d(int i2) {
        return oze.S(c(i2));
    }
}
