package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o12  reason: default package */
public final class o12 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ kxc Z;
    public final /* synthetic */ Object w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o12(kxc kxc, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Z = kxc;
        this.w0 = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o12) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o12 o12 = new o12(this.Z, this.w0, continuation);
        o12.Y = obj;
        return o12;
    }

    public final Object o(Object obj) {
        Object obj2;
        pu3 pu3 = pu3.a;
        int i = this.X;
        Object obj3 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            kxc kxc = this.Z;
            Object obj4 = this.w0;
            this.X = 1;
            if (kxc.o(obj4, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                obj2 = new kcc(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = obj3;
        if (!(!(obj2 instanceof kcc))) {
            obj3 = new k12(mcc.a(obj2));
        }
        return new m12(obj3);
    }
}
