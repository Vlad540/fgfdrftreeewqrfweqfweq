package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: ev2  reason: default package */
public final /* synthetic */ class ev2 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kv2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ev2(kv2 kv2, long j, int i) {
        this.a = i;
        this.b = kv2;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        Long l = (Long) obj;
        switch (this.a) {
            case 0:
                kv2 kv2 = this.b;
                ConcurrentHashMap concurrentHashMap = ((t52) ((t97) kv2.c).getValue()).f;
                long j = this.c;
                grd a2 = hrd.a((i22) concurrentHashMap.get(Long.valueOf(j)));
                i22 i22 = (i22) a2.getValue();
                if (i22 == null) {
                    xs7.E((ou3) ((r7e) kv2.X).getValue(), (hu3) null, (ru3) null, new hv2(a2, (Continuation) null, kv2, j), 3);
                } else {
                    ((mc9) ((ConcurrentHashMap) kv2.Z).computeIfAbsent(Long.valueOf(i22.b.a), new jv2(new ty0(3, i22)))).setValue(i22);
                }
                return a2;
            default:
                kv2 kv22 = this.b;
                ConcurrentHashMap concurrentHashMap2 = ((t52) ((t97) kv22.c).getValue()).g;
                long j2 = this.c;
                grd a3 = hrd.a((i22) concurrentHashMap2.get(Long.valueOf(j2)));
                i22 i222 = (i22) a3.getValue();
                if (i222 == null) {
                    xs7.E((ou3) ((r7e) kv22.X).getValue(), (hu3) null, (ru3) null, new iv2(a3, (Continuation) null, kv22, j2), 3);
                } else {
                    ((mc9) ((ConcurrentHashMap) kv22.Y).computeIfAbsent(Long.valueOf(i222.a), new jv2(new ty0(3, i222)))).setValue(i222);
                }
                return a3;
        }
    }
}
