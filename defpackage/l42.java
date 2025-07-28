package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l42  reason: default package */
public final class l42 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ o42 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l42(o42 o42, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = o42;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l42(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            o42 o42 = this.Y;
            i22 o = o42.o();
            int i2 = (o == null || !o.G()) ? 1 : 2;
            this.X = 1;
            obj = ((rw2) o42.n.getValue()).a(this.Z, i2, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
