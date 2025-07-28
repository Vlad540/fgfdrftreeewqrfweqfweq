package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: vh6  reason: default package */
public final class vh6 extends avc {
    public vh6(l68 l68, gv0 gv0, Executor executor) {
        super(l68, new zi6(), gv0, executor);
    }

    public static void i(ni6 ni6, ii6 ii6, HashSet hashSet, ArrayList arrayList) {
        long j = ni6.h + ii6.X;
        String str = ni6.a;
        String str2 = ii6.Z;
        if (str2 != null) {
            Uri J = pa2.J(str, str2);
            if (hashSet.add(J)) {
                arrayList.add(new yuc(j, avc.d(J)));
            }
        }
        arrayList.add(new yuc(j, new yz3(pa2.J(str, ii6.a), ii6.x0, ii6.y0)));
    }

    public final ArrayList e(iv0 iv0, qg5 qg5, boolean z) {
        xi6 xi6 = (xi6) qg5;
        ArrayList arrayList = new ArrayList();
        if (xi6 instanceof vi6) {
            List list = ((vi6) xi6).d;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(avc.d((Uri) list.get(i)));
            }
        } else {
            arrayList.add(avc.d(Uri.parse(xi6.a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            yz3 yz3 = (yz3) it.next();
            arrayList2.add(new yuc(0, yz3));
            try {
                ni6 ni6 = (ni6) ((qg5) c(new wuc(this, iv0, yz3), z));
                ws6 ws6 = ni6.r;
                ii6 ii6 = null;
                for (int i2 = 0; i2 < ws6.size(); i2++) {
                    ii6 ii62 = (ii6) ws6.get(i2);
                    ii6 ii63 = ii62.b;
                    if (!(ii63 == null || ii63 == ii6)) {
                        i(ni6, ii63, hashSet, arrayList2);
                        ii6 = ii63;
                    }
                    i(ni6, ii62, hashSet, arrayList2);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        return arrayList2;
    }
}
