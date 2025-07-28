package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.ExceptionHandler$HandledException;

/* renamed from: b1d  reason: default package */
public final class b1d extends c0d {
    public final boolean b;
    public final boolean c;
    public final String o = b1d.class.getName();

    public b1d(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [j7c, java.lang.Object] */
    public final void x() {
        d0d d0d = this.a;
        if (d0d == null) {
            d0d = null;
        }
        if (!((EnumSet) ((in7) d0d.w.getValue()).w0.getValue()).contains(fn7.b)) {
            d0d d0d2 = this.a;
            if (d0d2 == null) {
                d0d2 = null;
            }
            if (!((ad3) d0d2.E.getValue()).e()) {
                udd.q(this.o, "Not logged in session, skip task");
                return;
            }
        }
        if (this.c) {
            String str = this.o;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, str, "Starting flushing all strategy", (Throwable) null);
            }
            ? obj = new Object();
            xs7.N(new z0d(this, obj, (Continuation) null));
            if (obj.a > 1000) {
                ((r4a) j()).c(new ExceptionHandler$HandledException(rf0.f(obj.a, "Got ", " analytic events!"), (Throwable) null, 2, "ONEME-11049"), false);
                return;
            }
            return;
        }
        List list = (List) xs7.M(bw4.a, new a1d(this, (Continuation) null));
        String str2 = this.o;
        fn6 fn62 = udd.e;
        if (fn62 != null && fn62.c()) {
            fn62.d(tn7.X, str2, "Starting critical ids=" + list, (Throwable) null);
        }
        if (!list.isEmpty()) {
            pk a = a();
            boolean z = this.b;
            gy9 gy9 = (gy9) a;
            gy9.getClass();
            if (!list.isEmpty()) {
                ArrayList x0 = o23.x0(list, 100, 100);
                int size = x0.size();
                long[] jArr = new long[size];
                int i = 0;
                while (i < size) {
                    an7 an7 = r7;
                    int i2 = i;
                    long[] jArr2 = jArr;
                    an7 an72 = new an7(((j2b) gy9.z()).a.n(), (List) x0.get(i), true, z);
                    jArr2[i2] = gy9.v(gy9, an72);
                    i = i2 + 1;
                    jArr = jArr2;
                    size = size;
                }
            }
        }
        if (list.size() > 10) {
            ((r4a) j()).c(new ExceptionHandler$HandledException(rf0.f(list.size(), "Got ", " critical analytic events!"), (Throwable) null, 2, "ONEME-11049"), false);
        }
    }
}
