package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qk0  reason: default package */
public final class qk0 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ vk0 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qk0(Object obj, Continuation continuation, vk0 vk0) {
        super(2, continuation);
        this.Y = obj;
        this.Z = vk0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qk0(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            long longValue = ((Number) this.Y).longValue();
            this.X = 1;
            obj = ((ap3) this.Z.e.getValue()).b(longValue, this);
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
