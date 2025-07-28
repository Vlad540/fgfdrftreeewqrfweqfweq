package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: j87  reason: default package */
public final class j87 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ KeyboardStickersWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j87(KeyboardStickersWidget keyboardStickersWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = keyboardStickersWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((uxd) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j87 j87 = new j87(this.Y, continuation);
        j87.X = obj;
        return j87;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        uxd uxd = (uxd) this.X;
        k77[] k77Arr = KeyboardStickersWidget.x0;
        KeyboardStickersWidget keyboardStickersWidget = this.Y;
        EndlessRecyclerView2 l0 = keyboardStickersWidget.l0();
        int i = uxd.b;
        if (i >= 0) {
            l0.E0();
            GridLayoutManager p = gp0.p(l0);
            if (p != null) {
                p.n1(i, 0);
            }
        }
        RecyclerView m0 = keyboardStickersWidget.m0();
        int i2 = uxd.c;
        if (i2 >= 0) {
            m0.E0();
            m0.x0(i2);
        }
        return jue.a;
    }
}
