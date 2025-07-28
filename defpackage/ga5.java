package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ga5  reason: default package */
public final class ga5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ ha5 c;

    public /* synthetic */ ga5(ha5 ha5, List list, int i) {
        this.a = i;
        this.c = ha5;
        this.b = list;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                ha5 ha5 = this.c;
                aec aec = ha5.a;
                aec.c();
                try {
                    ha5.b.B(this.b);
                    aec.r();
                    aec.l();
                    return null;
                } catch (Throwable th) {
                    aec.l();
                    throw th;
                }
            default:
                StringBuilder l = hr1.l("DELETE FROM favorite_stickers WHERE id IN (");
                int i = 1;
                List<Long> list = this.b;
                a06.e(l, list == null ? 1 : list.size());
                l.append(")");
                String sb = l.toString();
                ha5 ha52 = this.c;
                yz5 d = ha52.a.d(sb);
                if (list == null) {
                    d.W(1);
                } else {
                    for (Long l2 : list) {
                        if (l2 == null) {
                            d.W(i);
                        } else {
                            d.j(i, l2.longValue());
                        }
                        i++;
                    }
                }
                aec aec2 = ha52.a;
                aec2.c();
                try {
                    d.n();
                    aec2.r();
                    aec2.l();
                    return null;
                } catch (Throwable th2) {
                    aec2.l();
                    throw th2;
                }
        }
    }
}
