package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: b08  reason: default package */
public final class b08 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ i08 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b08(i08 i08, Continuation continuation) {
        super(2, continuation);
        this.Y = i08;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b08) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b08(this.Y, continuation);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [j7c, java.lang.Object] */
    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            i08 i08 = this.Y;
            grd grd = i08.w0;
            bw bwVar = new bw(8, i08);
            this.X = 1;
            grd.c(new h42(new Object(), 1, bwVar), this);
            return pu3;
        } else if (i == 1) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
