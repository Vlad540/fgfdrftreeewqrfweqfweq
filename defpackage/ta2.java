package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ta2  reason: default package */
public final class ta2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ua2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ta2(ua2 ua2, Continuation continuation) {
        super(2, continuation);
        this.Y = ua2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((x40) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ta2 ta2 = new ta2(this.Y, continuation);
        ta2.X = obj;
        return ta2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ua2.w(this.Y, (x40) this.X);
        return jue.a;
    }
}
