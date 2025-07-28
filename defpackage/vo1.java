package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vo1  reason: default package */
public final class vo1 extends l5e implements i26 {
    public ep1 X;
    public int Y;
    public final /* synthetic */ ep1 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vo1(ep1 ep1, Continuation continuation) {
        super(2, continuation);
        this.Z = ep1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vo1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vo1(this.Z, continuation);
    }

    public final Object o(Object obj) {
        ep1 ep1;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        boolean z = true;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = ep1.K;
            ep1 ep12 = this.Z;
            zi1 zi1 = new zi1(((oka) ep12.t()).A0, 2);
            this.X = ep12;
            this.Y = 1;
            Object F = ez3.F(zi1, this);
            if (F == pu3) {
                return pu3;
            }
            ep1 ep13 = ep12;
            obj = F;
            ep1 = ep13;
        } else if (i == 1) {
            ep1 = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (obj == null) {
            z = false;
        }
        ep1.F = z;
        return jue.a;
    }
}
