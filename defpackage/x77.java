package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* renamed from: x77  reason: default package */
public final class x77 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ KeyboardEmojiWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x77(KeyboardEmojiWidget keyboardEmojiWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = keyboardEmojiWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((x77) n((sv4) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        x77 x77 = new x77(this.Y, continuation);
        x77.X = obj;
        return x77;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        sv4 sv4 = (sv4) this.X;
        k77[] k77Arr = KeyboardEmojiWidget.w0;
        KeyboardEmojiWidget keyboardEmojiWidget = this.Y;
        RecyclerView l0 = keyboardEmojiWidget.l0();
        int i = sv4.b;
        if (i >= 0) {
            l0.E0();
            GridLayoutManager p = gp0.p(l0);
            if (p != null) {
                p.n1(i, 0);
            }
        }
        RecyclerView m0 = keyboardEmojiWidget.m0();
        int i2 = sv4.c;
        if (i2 >= 0) {
            m0.E0();
            m0.x0(i2);
        }
        if (sv4.b >= 0) {
            keyboardEmojiWidget.l0().Y();
        }
        return jue.a;
    }
}
