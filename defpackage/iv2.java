package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: iv2  reason: default package */
public final class iv2 extends l5e implements i26 {
    public mc9 X;
    public int Y;
    public final /* synthetic */ mc9 Z;
    public final /* synthetic */ kv2 w0;
    public final /* synthetic */ long x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iv2(grd grd, Continuation continuation, kv2 kv2, long j) {
        super(2, continuation);
        this.Z = grd;
        this.w0 = kv2;
        this.x0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new iv2(this.Z, continuation, this.w0, this.x0);
    }

    public final Object o(Object obj) {
        mc9 mc9;
        Comparable comparable = pu3.a;
        int i = this.Y;
        long j = this.x0;
        kv2 kv2 = this.w0;
        if (i == 0) {
            wx3.H(obj);
            mc9 mc92 = this.Z;
            this.X = mc92;
            this.Y = 1;
            Comparable d = kv2.d(kv2, j, this);
            if (d == comparable) {
                return comparable;
            }
            mc9 mc93 = mc92;
            obj = d;
            mc9 = mc93;
        } else if (i == 1) {
            mc9 = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i22 i22 = (i22) obj;
        i22 i222 = null;
        if (i22 == null) {
            ((gy9) ((pk) ((t97) kv2.b).getValue())).j(j);
            i22 = null;
        }
        if (i22 != null) {
            ((mc9) ((ConcurrentHashMap) kv2.Y).computeIfAbsent(new Long(i22.a), new jv2(new ty0(3, i22)))).setValue(i22);
            i222 = i22;
        }
        mc9.setValue(i222);
        return jue.a;
    }
}
