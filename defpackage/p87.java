package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: p87  reason: default package */
public final class p87 implements g1e {
    public List a;

    public /* synthetic */ p87(List list) {
        this.a = list;
    }

    public r33 a(int i, String str) {
        ArrayList arrayList = new ArrayList();
        for (tze a2 : this.a) {
            hge a3 = a2.a(i, str);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            return new r33(arrayList);
        }
        return null;
    }

    public int h(long j) {
        return j < 0 ? 0 : -1;
    }

    public long k(int i) {
        swb.e(i == 0);
        return 0;
    }

    public List q(long j) {
        return j >= 0 ? this.a : Collections.emptyList();
    }

    public int u() {
        return 1;
    }
}
