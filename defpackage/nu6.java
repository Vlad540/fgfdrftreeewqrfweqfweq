package defpackage;

import android.os.SystemClock;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: nu6  reason: default package */
public final class nu6 extends l5e implements i26 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ bv6 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nu6(bv6 bv6, Continuation continuation) {
        super(2, continuation);
        this.w0 = bv6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nu6 nu6 = new nu6(this.w0, continuation);
        nu6.Z = obj;
        return nu6;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        long j;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        bv6 bv6 = this.w0;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Z;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String str = bv6.I0;
            int i2 = bv6.B0.get();
            udd.q(str, "prefetch " + i2 + ": start load real albums");
            mu6 mu6 = new mu6(bv6, (Continuation) null);
            this.Z = ou32;
            this.X = elapsedRealtime;
            this.Y = 1;
            Object f = n1g.f(mu6, this);
            if (f == pu3) {
                return pu3;
            }
            j = elapsedRealtime;
            ou3 ou33 = ou32;
            obj = f;
            ou3 = ou33;
        } else if (i == 1) {
            j = this.X;
            ou3 = (ou3) this.Z;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        boolean A = n1g.A(ou3);
        jue jue = jue.a;
        if (!A) {
            return jue;
        }
        bv6.z0.m((Object) null, new i05(list));
        String str2 = bv6.I0;
        int i3 = bv6.B0.get();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - j;
        udd.q(str2, "prefetch " + i3 + ": finish load real albums, time = " + elapsedRealtime2 + "ms");
        return jue;
    }
}
