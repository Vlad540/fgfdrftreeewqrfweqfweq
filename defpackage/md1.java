package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: md1  reason: default package */
public final class md1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ td1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public md1(td1 td1, Continuation continuation) {
        super(2, continuation);
        this.Y = td1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((md1) n((sg9) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        md1 md1 = new md1(this.Y, continuation);
        md1.X = obj;
        return md1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        taf.o(this.Y.G0, (sg9) this.X);
        return jue.a;
    }
}
