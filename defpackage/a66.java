package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: a66  reason: default package */
public final class a66 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ m66 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a66(m66 m66, Continuation continuation) {
        super(2, continuation);
        this.Z = m66;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((wia) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a66 a66 = new a66(this.Z, continuation);
        a66.Y = obj;
        return a66;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        m66 m66 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            wia wia = (wia) this.Y;
            int intValue = ((Number) wia.a).intValue();
            i56 i56 = (i56) wia.b;
            if (hhd.f(i56, g56.b)) {
                boolean b = ((qna) m66.w0.getValue()).b(qna.l);
                us0 us0 = m66.H0;
                if (b) {
                    r46 r46 = r46.a;
                    this.X = 1;
                    if (us0.o(r46, this) == pu3) {
                        return pu3;
                    }
                } else {
                    s46 s46 = s46.a;
                    this.X = 2;
                    if (us0.o(s46, this) == pu3) {
                        return pu3;
                    }
                }
            } else if (i56 instanceof h56) {
                l05 l05 = m66.Y.c;
                if (m66.b.a) {
                    intValue--;
                }
                taf.o(l05, new a56(intValue, ((o46) m66.G0.a.getValue()).a.b(), ((h56) i56).c));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return jue.a;
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        taf.o(m66.Y.c, y46.a);
        return jue.a;
    }
}
