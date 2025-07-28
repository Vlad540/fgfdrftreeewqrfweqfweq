package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ez8  reason: default package */
public final class ez8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ez8(zz8 zz8, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ez8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        zz8 zz8 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = zz8.I1;
            b29 y = zz8.y();
            long j = zz8.b.a;
            this.X = 1;
            obj = y.a.j(j, this.Z, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vo8 vo8 = (vo8) obj;
        if (vo8 == null) {
            return jue;
        }
        this.X = 2;
        return zz8.r(zz8, vo8.b, this) == pu3 ? pu3 : jue;
    }
}
