package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zo1  reason: default package */
public final class zo1 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ep1 Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zo1(ep1 ep1, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = ep1;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zo1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zo1 zo1 = new zo1(this.Z, this.w0, continuation);
        zo1.Y = obj;
        return zo1;
    }

    public final Object o(Object obj) {
        Object obj2;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            ep1 ep1 = this.Z;
            long j = this.w0;
            int i2 = zp4.o;
            long P = mt0.P(10, eq4.SECONDS);
            this.X = 1;
            if (((r59) ep1.z.getValue()).s(j, P, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                obj2 = new kcc(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = jue;
        Throwable a = mcc.a(obj2);
        if (a != null) {
            udd.s("CallEngineTag", "fail to fetch missed user", a);
        }
        return jue;
    }
}
