package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: q78  reason: default package */
public final class q78 extends l5e implements i26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ xm8 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ r78 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q78(Object obj, Continuation continuation, xm8 xm8, boolean z, r78 r78) {
        super(2, continuation);
        this.X = obj;
        this.Y = xm8;
        this.Z = z;
        this.w0 = r78;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new q78(this.X, continuation, this.Y, this.Z, this.w0);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        o10 o10 = (o10) this.X;
        long hashCode = (long) o10.q.hashCode();
        ej0 ej0 = ej0.b;
        fj0 fj0 = fj0.b;
        xm8 xm8 = this.Y;
        String str = o10.q;
        n10 n10 = o10.d;
        if (n10 != null) {
            return new qh8(hashCode, xm8.a.b, n10.a, mg5.r(vx3.t(n10.d, fj0, ej0)), 2, new Long(n10.c), str, this.Z, (Uri) null, false);
        }
        r78 r78 = this.w0;
        g10 g10 = o10.n;
        a10 a10 = o10.b;
        if (a10 != null && a10.X) {
            return new qh8(hashCode, xm8.a.b, a10.w0, mg5.r(vx3.t(a10.z0, fj0, ej0)), 3, (Long) null, str, this.Z, (Uri) null, !r78.c.b(true) && !g10.c());
        } else if (a10 != null) {
            return new qh8(hashCode, xm8.a.b, a10.w0, mg5.r(vx3.t(a10.a, fj0, ej0)), 1, (Long) null, str, this.Z, ((r10) r78.e.getValue()).c(o10, false), !r78.c.d() && !g10.c());
        } else {
            String name = r78.getClass().getName();
            long j = xm8.a.b;
            throw new IllegalStateException((name + ": Unknown type in PhotoVideoAttach with messageId = " + j).toString());
        }
    }
}
