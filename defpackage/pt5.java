package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pt5  reason: default package */
public final class pt5 extends l5e implements i26 {
    public ot5 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ qt5 w0;
    public final /* synthetic */ k7c x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pt5(qt5 qt5, k7c k7c, Continuation continuation) {
        super(2, continuation);
        this.w0 = qt5;
        this.x0 = k7c;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pt5) n((d5b) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pt5 pt5 = new pt5(this.w0, this.x0, continuation);
        pt5.Z = obj;
        return pt5;
    }

    public final Object o(Object obj) {
        d5b d5b;
        ot5 ot5;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        qt5 qt5 = this.w0;
        if (i == 0) {
            wx3.H(obj);
            d5b d5b2 = (d5b) this.Z;
            ot5 = new ot5(this.x0, d5b2);
            qt5.Y.i.add(ot5);
            Boolean valueOf = Boolean.valueOf(qt5.Y.c());
            this.Z = d5b2;
            this.X = ot5;
            this.Y = 1;
            if (((a5b) d5b2).a.o(valueOf, this) == pu3) {
                return pu3;
            }
            d5b = d5b2;
        } else if (i == 1) {
            ot5 = this.X;
            d5b = (d5b) this.Z;
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zu4 zu4 = new zu4(qt5, 9, ot5);
        this.Z = null;
        this.X = null;
        this.Y = 2;
        if (at7.d(d5b, zu4, this) == pu3) {
            return pu3;
        }
        return jue.a;
    }
}
