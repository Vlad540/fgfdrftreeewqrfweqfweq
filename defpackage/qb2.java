package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: qb2  reason: default package */
public final class qb2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zb2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qb2(zb2 zb2, Continuation continuation) {
        super(2, continuation);
        this.Y = zb2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qb2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qb2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            zb2 zb2 = this.Y;
            ob2 ob2 = (ob2) zb2.D0.getAndUpdate(new pb2(0));
            if (ob2 == null) {
                return jue;
            }
            ak4 ak4 = ob2.d;
            ak4.getClass();
            if ((ak4 == ak4.b || ak4 == ak4.c) && !ob2.e) {
                File s = ((bf5) zb2.w0.getValue()).s(ob2.b);
                this.X = 1;
                if (((j5e) zb2.Y.getValue()).a.c(s, ob2.c, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
