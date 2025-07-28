package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tk9  reason: default package */
public final class tk9 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ vk9 Y;
    public final /* synthetic */ zb9 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tk9(vk9 vk9, zb9 zb9, Continuation continuation) {
        super(2, continuation);
        this.Y = vk9;
        this.Z = zb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tk9(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (this.Y.c(this.Z, this) == pu3) {
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
