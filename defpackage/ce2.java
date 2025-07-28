package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ce2  reason: default package */
public final class ce2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ee2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ce2(ee2 ee2, Continuation continuation) {
        super(2, continuation);
        this.Y = ee2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((i22) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ce2 ce2 = new ce2(this.Y, continuation);
        ce2.X = obj;
        return ce2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        i22 i22 = (i22) this.X;
        grd grd = this.Y.b;
        String f = i22.f(fj0.c, ej0.a);
        i22.i0();
        grd.m((Object) null, new de2(new eea(i22.e(), i22.B0, f), i22.p()));
        return jue.a;
    }
}
