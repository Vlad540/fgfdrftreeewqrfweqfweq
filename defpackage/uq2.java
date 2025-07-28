package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: uq2  reason: default package */
public final class uq2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ kr2 Z;
    public final /* synthetic */ i7c w0;
    public final /* synthetic */ kj3 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uq2(Object obj, Continuation continuation, kr2 kr2, i7c i7c, kj3 kj3) {
        super(2, continuation);
        this.Y = obj;
        this.Z = kr2;
        this.w0 = i7c;
        this.x0 = kj3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uq2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uq2(this.Y, continuation, this.Z, this.w0, this.x0);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            kr2 kr2 = this.Z;
            i22 i22 = (i22) ((bv2) kr2.x0.getValue()).m(((pi2) this.Y).a).a.getValue();
            if (i22 == null) {
                return null;
            }
            ArrayList i2 = i22.i();
            if (i2.isEmpty()) {
                return jue;
            }
            Iterator it = i2.iterator();
            while (it.hasNext()) {
                if (this.x0.a.d(((tf3) it.next()).n())) {
                    this.X = 1;
                    t52 l = ((bv2) kr2.x0.getValue()).l();
                    ConcurrentHashMap concurrentHashMap = l.f;
                    long j = i22.a;
                    i22 i222 = (i22) concurrentHashMap.get(Long.valueOf(j));
                    if (i222 == null) {
                        i222 = l.B(j);
                    }
                    if (i222 != null) {
                        if (l.z(j) == null) {
                            ((g15) l.o.get()).c(new IllegalArgumentException(us8.i(j, "chat is null for #")), true);
                        } else {
                            p72 p72 = (p72) l.x.get();
                            long s = ((g2b) p72.c.getValue()).a.s();
                            xm8 xm8 = i222.o;
                            xm8 xm82 = i222.X;
                            i22 a = p72.a(i222.a, s, i222.b, i222.c, xm8, xm82);
                            a.l0((di3) l.r.get());
                            l.f0((String) null, new a52(l, j, a, true));
                        }
                    }
                    if (jue == pu3) {
                        return pu3;
                    }
                }
            }
            return jue;
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.w0.a = true;
        return jue;
    }
}
