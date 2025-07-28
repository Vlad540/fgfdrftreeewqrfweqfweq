package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q11  reason: default package */
public final class q11 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ x11 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q11(x11 x11, Continuation continuation) {
        super(2, continuation);
        this.Y = x11;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((q11) n((i22) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        q11 q11 = new q11(this.Y, continuation);
        q11.X = obj;
        return q11;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        i22 i22 = (i22) this.X;
        grd grd = this.Y.j;
        Long l = new Long(i22.a);
        i22.h0();
        CharSequence charSequence = i22.y0;
        String f = i22.f(fj0.o, ej0.a);
        Long l2 = new Long(i22.e());
        i22.i0();
        grd.m((Object) null, new k11(l, charSequence, f, l2, i22.B0, 32));
        return jue.a;
    }
}
