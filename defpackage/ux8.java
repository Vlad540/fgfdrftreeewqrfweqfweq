package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: ux8  reason: default package */
public final class ux8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;
    public final /* synthetic */ j63 Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ux8(zz8 zz8, j63 j63, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
        this.Z = j63;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ux8(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        zz8 zz8 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            do8 do8 = (do8) zz8.R0.getValue();
            this.X = 1;
            do8.getClass();
            Object a = do8.a(this.Z, Collections.singletonList(new Long(this.w0)), this);
            if (a != pu3) {
                a = jue;
            }
            if (a == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zr7 c = zz8.Y.c();
        tx8 tx8 = new tx8(zz8, (Continuation) null);
        this.X = 2;
        return xs7.U(c, tx8, this) == pu3 ? pu3 : jue;
    }
}
