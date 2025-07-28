package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: br2  reason: default package */
public final class br2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kr2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public br2(kr2 kr2, Continuation continuation) {
        super(2, continuation);
        this.Y = kr2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((br2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new br2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Long l;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            kr2 kr2 = this.Y;
            udd.p(kr2.D0, "loadNext", new Object[0]);
            hq2 hq2 = (hq2) kr2.B0.getValue();
            boolean isEmpty = hq2.a.isEmpty();
            boolean z = hq2.b;
            if (!isEmpty || !z) {
                List list = hq2.a;
                if ((!list.isEmpty()) && z) {
                    rg5 rg5 = new rg5(myc.L(new es(2, list), new hd1(22)));
                    if (!rg5.hasNext()) {
                        l = null;
                    } else {
                        l = Long.valueOf(((pi2) rg5.next()).z0);
                        while (rg5.hasNext()) {
                            Long valueOf = Long.valueOf(((pi2) rg5.next()).z0);
                            if (l.compareTo(valueOf) > 0) {
                                l = valueOf;
                            }
                        }
                    }
                    kr2.f(l != null ? l.longValue() : Long.MAX_VALUE);
                }
            } else {
                this.X = 1;
                if (kr2.d(this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
