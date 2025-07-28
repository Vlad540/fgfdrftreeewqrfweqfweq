package defpackage;

import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: c08  reason: default package */
public final class c08 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ nna Y;
    public /* synthetic */ nna Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c08(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        nna nna = (nna) obj;
        nna nna2 = (nna) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                c08 c08 = new c08(3, continuation, 0);
                c08.Y = nna;
                c08.Z = nna2;
                return c08.o(jue.a);
            case 1:
                c08 c082 = new c08(3, continuation, 1);
                c082.Y = nna;
                c082.Z = nna2;
                return c082.o(jue.a);
            default:
                c08 c083 = new c08(3, continuation, 2);
                c083.Y = nna;
                c083.Z = nna2;
                return c083.o(jue.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                nna nna = this.Y;
                nna nna2 = this.Z;
                int ordinal = nna.ordinal();
                p3b p3b = p3b.a;
                if (ordinal == 0) {
                    return p3b;
                }
                if (ordinal == 1) {
                    int ordinal2 = nna2.ordinal();
                    if (ordinal2 == 0) {
                        return p3b;
                    }
                    if (ordinal2 == 1) {
                        return p3b.b;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                wx3.H(obj);
                return Boolean.valueOf(Build.VERSION.SDK_INT >= 34 && this.Y == nna.b && this.Z == nna.a);
            default:
                wx3.H(obj);
                nna nna3 = this.Y;
                nna nna4 = this.Z;
                nna nna5 = nna.a;
                return Boolean.valueOf(nna3 == nna5 || nna4 == nna5);
        }
    }
}
