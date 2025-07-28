package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bsc  reason: default package */
public final class bsc implements csc {
    public final String[] a;
    public final t52 b;
    public final gsc c;

    public bsc(String[] strArr, t52 t52, gsc gsc) {
        this.a = strArr;
        this.b = t52;
        this.c = gsc;
    }

    public final List a(String str) {
        gsc gsc = this.c;
        t52 t52 = this.b;
        t52.getClass();
        i22 i22 = (i22) t52.e0((String) null, new e52(t52, 1));
        hw4 hw4 = hw4.a;
        if (i22 == null) {
            return hw4;
        }
        try {
            if (gsc.f(i22, str)) {
                return Collections.singletonList(gsc.a(i22, str));
            }
            for (String str2 : this.a) {
                if (gsc.h(str2, str)) {
                    return Collections.singletonList(gsc.a(i22, str2));
                }
            }
            return hw4;
        } catch (Throwable th) {
            udd.S(bsc.class.getName(), "fail to search saved messages chat", th);
            return hw4;
        }
    }
}
