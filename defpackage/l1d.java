package defpackage;

import java.util.Collections;

/* renamed from: l1d  reason: default package */
public final class l1d extends c0d {
    public final long b;
    public final long c;

    public l1d(p7 p7Var) {
        this.b = p7Var.b;
        this.c = p7Var.c;
    }

    public final void x() {
        long j;
        String name = l1d.class.getName();
        long j2 = this.b;
        Long valueOf = Long.valueOf(j2);
        long j3 = this.c;
        udd.p(name, "process, chatId = %d, botId = %d, suspend = %b", new Object[]{valueOf, Long.valueOf(j3), Boolean.TRUE});
        if (d().B(j2) != null) {
            t52 d = d();
            d.getClass();
            d.h(j2, false, new cz0(true, 1));
            d().p(j2);
            gy9 gy9 = (gy9) a();
            long j4 = this.b;
            if (!gy9.o(j4)) {
                j = 0;
            } else {
                j = sce.d(gy9.A(), new d5e(((j2b) gy9.z()).a.n(), j4, true, this.c), false, 0, 12);
            }
            t().c(new mw2(Collections.singletonList(Long.valueOf(j2)), true, false, (md4) null, (a4b) null, 124));
            t().c(new lp3(j, Collections.singletonList(Long.valueOf(j3))));
            t().c(new e5e(j2));
        }
    }
}
