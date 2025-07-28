package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wm3  reason: default package */
public final class wm3 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ym3 Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wm3(ym3 ym3, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = ym3;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((tf3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wm3 wm3 = new wm3(this.Z, this.w0, continuation);
        wm3.Y = obj;
        return wm3;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        long j = this.w0;
        ym3 ym3 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            if (e07.A((tf3) this.Y)) {
                String name = ym3.getClass().getName();
                udd.q(name, "try to request info for #" + j);
                long j2 = this.w0;
                int i2 = zp4.o;
                long P = mt0.P(3, eq4.o);
                this.X = 1;
                if (((r59) ym3.r.getValue()).s(j2, P, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                String name2 = ym3.getClass().getName();
                udd.s(name2, "fail to fetch noncontact #" + j, th);
                return new tj5(3, ((ap3) ym3.g.getValue()).a(j));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((ap3) ym3.g.getValue()).c(j);
    }
}
