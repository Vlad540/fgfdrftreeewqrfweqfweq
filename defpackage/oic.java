package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: oic  reason: default package */
public final class oic extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ nv9 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oic(nv9 nv9, Continuation continuation) {
        super(2, continuation);
        this.Z = nv9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oic) n((d5b) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oic oic = new oic(this.Z, continuation);
        oic.Y = obj;
        return oic;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            d5b d5b = (d5b) this.Y;
            AtomicReference atomicReference = new AtomicReference();
            this.Z.a(new f2b(d5b, atomicReference, false, 4));
            ft3 ft3 = new ft3(atomicReference, 3);
            this.X = 1;
            if (at7.d(d5b, ft3, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
