package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: bsd  reason: default package */
public final class bsd implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ dsd c;

    public /* synthetic */ bsd(dsd dsd, List list, int i) {
        this.a = i;
        this.c = dsd;
        this.b = list;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                StringBuilder l = hr1.l("DELETE FROM events WHERE id in (");
                List<Long> list = this.b;
                a06.e(l, list.size());
                l.append(")");
                String sb = l.toString();
                dsd dsd = this.c;
                yz5 d = dsd.a.d(sb);
                int i = 1;
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
            default:
                dsd dsd2 = this.c;
                aec aec2 = dsd2.a;
                aec2.c();
                try {
                    dsd2.b.B(this.b);
                    aec2.r();
                    aec2.l();
                    return jue.a;
                } catch (Throwable th2) {
                    aec2.l();
                    throw th2;
                }
        }
    }
}
