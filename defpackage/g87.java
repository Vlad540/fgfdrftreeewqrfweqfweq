package defpackage;

import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* renamed from: g87  reason: default package */
public final class g87 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ KeyboardStickersWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g87(KeyboardStickersWidget keyboardStickersWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = keyboardStickersWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((vxd) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g87 g87 = new g87(this.Y, continuation);
        g87.X = obj;
        return g87;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        vxd vxd = (vxd) this.X;
        KeyboardStickersWidget keyboardStickersWidget = this.Y;
        keyboardStickersWidget.Y.E(vxd.a);
        keyboardStickersWidget.Z.E(vxd.b);
        return jue.a;
    }
}
