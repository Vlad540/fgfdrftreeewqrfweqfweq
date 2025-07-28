package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xs2  reason: default package */
public final class xs2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ bt2 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xs2(bt2 bt2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = bt2;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xs2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xs2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        bt2 bt2 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            di3 di3 = ((ap3) bt2.A0.getValue()).a;
            di3.getClass();
            long j = this.Z;
            tic.a(new l52(di3, j, 1), di3.m, (j6) null, new ak0(27), (qmc) null);
            aw2 s = bt2.s();
            this.X = 1;
            obj = s.u(j, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i22 i22 = (i22) obj;
        if (i22 != null) {
            taf.o(bt2.L0, zu2.c.a2(i22.a));
        }
        return jue.a;
    }
}
