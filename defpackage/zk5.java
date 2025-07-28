package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zk5  reason: default package */
public final class zk5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zk5(pj5 pj5, Continuation continuation) {
        super(2, continuation);
        this.Z = pj5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zk5) n((d5b) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zk5 zk5 = new zk5(this.Z, continuation);
        zk5.Y = obj;
        return zk5;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            wj5 wj5 = new wj5((d5b) this.Y, 2);
            this.X = 1;
            if (this.Z.c(wj5, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
