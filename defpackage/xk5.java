package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xk5  reason: default package */
public final class xk5 extends l5e implements i26 {
    public l7c X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ l7c w0;
    public final /* synthetic */ rj5 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xk5(l7c l7c, rj5 rj5, Continuation continuation) {
        super(2, continuation);
        this.w0 = l7c;
        this.x0 = rj5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xk5) n(new m12(((m12) obj).a), (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xk5 xk5 = new xk5(this.w0, this.x0, continuation);
        xk5.Z = obj;
        return xk5;
    }

    public final Object o(Object obj) {
        l7c l7c;
        l7c l7c2;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            Object obj2 = ((m12) this.Z).a;
            boolean z = obj2 instanceof l12;
            l7c = this.w0;
            if (!z) {
                l7c.a = obj2;
            }
            if (z) {
                Throwable a = m12.a(obj2);
                if (a == null) {
                    Object obj3 = l7c.a;
                    if (obj3 != null) {
                        if (obj3 == wr9.a) {
                            obj3 = null;
                        }
                        this.Z = obj2;
                        this.X = l7c;
                        this.Y = 1;
                        if (this.x0.a(obj3, this) == pu3) {
                            return pu3;
                        }
                        l7c2 = l7c;
                    }
                    l7c.a = wr9.c;
                } else {
                    throw a;
                }
            }
            return jue.a;
        } else if (i == 1) {
            l7c2 = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l7c = l7c2;
        l7c.a = wr9.c;
        return jue.a;
    }
}
