package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o52  reason: default package */
public final /* synthetic */ class o52 implements of3 {
    public final /* synthetic */ AtomicBoolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ t52 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int o;

    public /* synthetic */ o52(t52 t52, long j, long j2, int i, AtomicBoolean atomicBoolean, boolean z) {
        this.a = t52;
        this.b = j;
        this.c = j2;
        this.o = i;
        this.X = atomicBoolean;
        this.Y = z;
    }

    public final void accept(Object obj) {
        y52 y52 = (y52) obj;
        t52 t52 = this.a;
        t52.getClass();
        Map d = y52.d();
        long j = this.b;
        Long l = (Long) d.get(Long.valueOf(j));
        if (l != null) {
            long longValue = l.longValue();
            long j2 = this.c;
            boolean z = false;
            boolean z2 = longValue != j2;
            if (z2) {
                d.put(Long.valueOf(j), Long.valueOf(j2));
            }
            int i = this.o;
            if (i >= 0) {
                y52.m = i;
            }
            if (this.Y && z2 && j == t52.J()) {
                z = true;
            }
            this.X.set(z);
        }
    }
}
