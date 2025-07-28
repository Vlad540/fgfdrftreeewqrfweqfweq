package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: x95  reason: default package */
public final class x95 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ y95 c;

    public /* synthetic */ x95(y95 y95, List list, int i) {
        this.a = i;
        this.c = y95;
        this.b = list;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                y95 y95 = this.c;
                aec aec = y95.a;
                aec.c();
                try {
                    y95.b.B(this.b);
                    aec.r();
                    aec.l();
                    return null;
                } catch (Throwable th) {
                    aec.l();
                    throw th;
                }
            default:
                StringBuilder l = hr1.l("DELETE FROM favorite_sticker_sets WHERE id IN (");
                int i = 1;
                List<Long> list = this.b;
                a06.e(l, list == null ? 1 : list.size());
                l.append(")");
                String sb = l.toString();
                y95 y952 = this.c;
                yz5 d = y952.a.d(sb);
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
                aec aec2 = y952.a;
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
