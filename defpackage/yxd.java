package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yxd  reason: default package */
public final class yxd extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kyd Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yxd(kyd kyd, Continuation continuation) {
        super(2, continuation);
        this.Y = kyd;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yxd(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        kyd kyd = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ((v2c) kyd.Y.getValue()).a(this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        jue jue = jue.a;
        if (!booleanValue) {
            return jue;
        }
        taf.o(kyd.E0, new p6d(phc.x, new hge(sca.C)));
        return jue;
    }
}
