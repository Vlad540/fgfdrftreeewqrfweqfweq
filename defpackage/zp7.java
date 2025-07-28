package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: zp7  reason: default package */
public final class zp7 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kq7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zp7(kq7 kq7, Continuation continuation) {
        super(2, continuation);
        this.Y = kq7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zp7) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zp7(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            kq7 kq7 = this.Y;
            v11 v11 = new v11(new ArrayList(), new nl5((pj5) kq7.o.getValue(), 2), new vp7(3, (Continuation) null, 0));
            xp7 xp7 = new xp7(kq7, 0);
            this.X = 1;
            Object c = v11.c(new sc5(xp7, 17), this);
            if (c != pu3) {
                c = jue;
            }
            if (c == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
