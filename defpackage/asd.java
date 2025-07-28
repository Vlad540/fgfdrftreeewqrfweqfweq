package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: asd  reason: default package */
public final class asd implements Callable {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dsd c;

    public asd(dsd dsd, List list, int i) {
        this.c = dsd;
        this.a = list;
        this.b = i;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        StringBuilder l = hr1.l("UPDATE events SET status = ? WHERE id in (");
        List<Long> list = this.a;
        a06.e(l, list.size());
        l.append(")");
        String sb = l.toString();
        dsd dsd = this.c;
        yz5 d = dsd.a.d(sb);
        d.j(1, (long) wn6.d(this.b));
        int i = 2;
        for (Long l2 : list) {
            if (l2 == null) {
                d.W(i);
            } else {
                d.j(i, l2.longValue());
            }
            i++;
        }
        aec aec = dsd.a;
        aec.c();
        try {
            d.n();
            aec.r();
            aec.l();
            return jue.a;
        } catch (Throwable th) {
            aec.l();
            throw th;
        }
    }
}
