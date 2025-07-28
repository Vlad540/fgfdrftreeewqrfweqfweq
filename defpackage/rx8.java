package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: rx8  reason: default package */
public final class rx8 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zz8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rx8(zz8 zz8, Continuation continuation) {
        super(2, continuation);
        this.Z = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((i19) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rx8 rx8 = new rx8(this.Z, continuation);
        rx8.Y = obj;
        return rx8;
    }

    public final Object o(Object obj) {
        Object obj2;
        Object obj3;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            i19 i19 = (i19) this.Y;
            boolean z = i19 instanceof g19;
            zz8 zz8 = this.Z;
            if (z) {
                g19 g19 = (g19) i19;
                this.X = 1;
                if (!zz8.C1.remove(g19.b, jue) || (obj3 = xs7.U(zz8.Y.c(), new ay8(zz8, g19, (Continuation) null), this)) != pu3) {
                    obj3 = jue;
                }
                if (obj3 == pu3) {
                    return pu3;
                }
            } else if (i19 instanceof h19) {
                h19 h19 = (h19) i19;
                this.X = 2;
                if (!zz8.C1.remove(h19.b, jue) || (obj2 = xs7.U(zz8.Y.c(), new by8(zz8, h19, (Continuation) null), this)) != pu3) {
                    obj2 = jue;
                }
                if (obj2 == pu3) {
                    return pu3;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1 || i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
