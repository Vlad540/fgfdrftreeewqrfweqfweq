package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bg0  reason: default package */
public final class bg0 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fg0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bg0(fg0 fg0, Continuation continuation) {
        super(2, continuation);
        this.Y = fg0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bg0) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bg0(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        boolean z = true;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ((ap3) this.Y.b.getValue()).e();
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Number) obj).intValue() != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
