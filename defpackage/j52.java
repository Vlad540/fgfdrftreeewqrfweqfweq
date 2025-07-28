package defpackage;

import java.util.Map;

/* renamed from: j52  reason: default package */
public final /* synthetic */ class j52 implements qf3 {
    public final /* synthetic */ t52 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Integer d = null;
    public final /* synthetic */ boolean e = true;
    public final /* synthetic */ long f;

    public /* synthetic */ j52(t52 t52, long j, long j2, long j3) {
        this.a = t52;
        this.b = j;
        this.c = j2;
        this.f = j3;
    }

    public final void accept(Object obj) {
        y52 y52 = (y52) obj;
        t52 t52 = this.a;
        t52.getClass();
        Map d2 = y52.d();
        long j = this.b;
        Long l = (Long) d2.get(Long.valueOf(j));
        if (l != null) {
            long longValue = l.longValue();
            long j2 = this.c;
            boolean z = longValue != j2;
            if (z) {
                d2.put(Long.valueOf(j), Long.valueOf(j2));
            }
            Integer num = this.d;
            if (num != null) {
                y52.m = num.intValue();
            }
            if (this.e && z && j == t52.J()) {
                nj4 nj4 = t52.B;
                if (nj4.get() != null) {
                    ((kq9) nj4.get()).e(this.f, j2);
                }
            }
        }
    }
}
