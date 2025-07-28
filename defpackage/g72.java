package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: g72  reason: default package */
public final class g72 extends l5e implements i26 {
    public AtomicLong X;
    public int Y;
    public final /* synthetic */ n72 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g72(n72 n72, Continuation continuation) {
        super(2, continuation);
        this.Z = n72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new g72(this.Z, continuation);
    }

    public final Object o(Object obj) {
        AtomicLong atomicLong;
        Number number;
        Number number2 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        n72 n72 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            i22 p = n72.p();
            if (p == null) {
                return jue;
            }
            atomicLong = n72.l;
            x8c x8c = (x8c) n72.x.getValue();
            this.X = atomicLong;
            this.Y = 1;
            z52 z52 = z52.b;
            t52 l = ((aw2) ((bv2) x8c.a.getValue())).l();
            long j = p.a;
            l.c(j, z52);
            i22 f = ((aw2) ((bv2) x8c.a.getValue())).f(j, new u1c(2));
            if (f == null) {
                number = new Long(0);
            } else {
                ((tt0) x8c.c.getValue()).c(new mw2(hr1.o(j), false, false, (md4) null, (a4b) null, 124));
                number = new Long(((gy9) ((pk) x8c.b.getValue())).m(j, f.b.a, (String) null, "", (d10) null));
            }
            if (number == number2) {
                return number2;
            }
        } else if (i == 1) {
            AtomicLong atomicLong2 = this.X;
            wx3.H(obj);
            atomicLong = atomicLong2;
            number = obj;
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atomicLong.set(number.longValue());
        hcd hcd = n72.d;
        e9b e9b = new e9b(new hge(i8a.W), new Integer(phc.m));
        this.X = null;
        this.Y = 2;
        return hcd.a(e9b, this) == number2 ? number2 : jue;
    }
}
