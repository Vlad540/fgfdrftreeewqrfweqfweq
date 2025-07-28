package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ry  reason: default package */
public final class ry {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final qy b;
    public final nj4 c;

    public ry(nj4 nj4, nj4 nj42, nj4 nj43, nj4 nj44, nj4 nj45, nj4 nj46, nj4 nj47, nj4 nj48) {
        this.b = new qy(nj42, nj43, nj44, nj45, nj46, nj48, nj47);
        this.c = nj4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, p10] */
    public final j8e a(o10 o10) {
        Object obj;
        Object ic5;
        ? obj2 = new Object();
        obj2.a(o10);
        jj7 c2 = obj2.c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < c2.v(); i++) {
            o10 u = c2.u(i);
            String str = u.q;
            oy oyVar = (oy) this.a.get(str);
            if (oyVar == null || oyVar.b) {
                qy qyVar = this.b;
                qyVar.getClass();
                j10 j10 = u.a;
                int i2 = j10 == null ? -1 : py.$EnumSwitchMapping$0[j10.ordinal()];
                nj4 nj4 = qyVar.b;
                if (i2 != 1) {
                    k77[] k77Arr = qy.h;
                    if (i2 != 2) {
                        if (i2 == 3) {
                            k77 k77 = k77Arr[0];
                            k77 k772 = k77Arr[2];
                            k77 k773 = k77Arr[3];
                            ic5 = new ic5(u, (pk) qyVar.c.get(), (jc5) qyVar.e.get(), (tt0) qyVar.f.get());
                        } else if (i2 == 4) {
                            k77 k774 = k77Arr[2];
                            k77 k775 = k77Arr[3];
                            ic5 = new z10(u, (jc5) qyVar.e.get(), (tt0) qyVar.f.get());
                        } else if (i2 != 5) {
                            obj = null;
                        } else {
                            r7e r7e = new r7e(new nl1(29, qyVar.a));
                            r7e r7e2 = new r7e(new nl1(29, nj4));
                            k77 k776 = k77Arr[4];
                            ic5 = new ssd(u, r7e, r7e2, (bf5) qyVar.g.get());
                        }
                        obj = ic5;
                    } else {
                        k77 k777 = k77Arr[0];
                        k77 k778 = k77Arr[1];
                        k77 k779 = k77Arr[2];
                        k77 k7710 = k77Arr[3];
                        obj = new r1f(u, (pk) qyVar.c.get(), (f03) qyVar.d.get(), (jc5) qyVar.e.get(), (tt0) qyVar.f.get());
                    }
                } else {
                    obj = new hpa(u, new r7e(new nl1(29, nj4)));
                }
                if (obj != null) {
                    this.a.put(str, obj);
                    arrayList2.add(obj);
                    arrayList.add(str);
                }
            } else {
                arrayList2.add(oyVar);
                arrayList.add(str);
            }
        }
        return new j8e(this.c, arrayList2, arrayList);
    }
}
