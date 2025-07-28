package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: hm1  reason: default package */
public final class hm1 extends l5e implements i26 {
    public final /* synthetic */ Set X;
    public final /* synthetic */ km1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hm1(bs bsVar, km1 km1, Continuation continuation) {
        super(2, continuation);
        this.X = bsVar;
        this.Y = km1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hm1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hm1((bs) this.X, this.Y, continuation);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [kgd, yr, java.lang.Object] */
    public final Object o(Object obj) {
        wx3.H(obj);
        Set set = this.X;
        boolean isEmpty = set.isEmpty();
        iw4 iw4 = iw4.a;
        if (isEmpty) {
            return iw4;
        }
        di3 di3 = ((ap3) this.Y.b.getValue()).a;
        di3.b();
        ? kgd = new kgd(0);
        di3.a.forEach(new n52((bs) set, 2, kgd));
        if (kgd.isEmpty()) {
            return iw4;
        }
        kgd kgd2 = new kgd(kgd.c);
        Iterator it = ((tr) kgd.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            long longValue = ((Number) entry.getKey()).longValue();
            tf3 tf3 = (tf3) entry.getValue();
            Long l = new Long(longValue);
            String d = tf3.d();
            if (d == null) {
                d = BuildConfig.FLAVOR;
            }
            long n = tf3.n();
            kgd2.put(l, new cze(n, d, tf3.m(), tf3.w(), tf3.p(fj0.o)));
        }
        return kgd2;
    }
}
