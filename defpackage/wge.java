package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wge  reason: default package */
public final class wge extends l5e implements i26 {
    public /* synthetic */ float X;
    public final /* synthetic */ yge Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wge(yge yge, Continuation continuation) {
        super(2, continuation);
        this.Y = yge;
    }

    public final Object invoke(Object obj, Object obj2) {
        Float valueOf = Float.valueOf(((Number) obj).floatValue());
        jue jue = jue.a;
        n(valueOf, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wge wge = new wge(this.Y, continuation);
        wge.X = ((Number) obj).floatValue();
        return wge;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        float f = this.X;
        yge yge = this.Y;
        yge.b.setTextSize(0, yge.o + f);
        return jue.a;
    }
}
