package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: py8  reason: default package */
public final class py8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public py8(zz8 zz8, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new py8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        zz8 zz8 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            long j = zz8.b.a;
            this.X = 1;
            obj = ((e29) zz8.M0.getValue()).b(j, this.Z, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((Boolean) obj).booleanValue()) {
            zr7 c = zz8.Y.c();
            oy8 oy8 = new oy8(zz8, (Continuation) null);
            this.X = 2;
            if (xs7.U(c, oy8, this) == pu3) {
                return pu3;
            }
        }
        return jue.a;
    }
}
