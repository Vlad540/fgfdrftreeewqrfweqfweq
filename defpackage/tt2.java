package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tt2  reason: default package */
public final class tt2 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ bk3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bk3 bk3 = (bk3) obj;
        jue jue = (jue) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                tt2 tt2 = new tt2(3, continuation, 0);
                tt2.Y = bk3;
                wx3.H(jue.a);
                return tt2.Y;
            default:
                tt2 tt22 = new tt2(3, continuation, 1);
                tt22.Y = bk3;
                return tt22.o(jue.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                return this.Y;
            default:
                wx3.H(obj);
                return this.Y.a;
        }
    }
}
