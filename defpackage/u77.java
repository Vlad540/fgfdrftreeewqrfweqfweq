package defpackage;

import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* renamed from: u77  reason: default package */
public final class u77 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ KeyboardEmojiWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u77(KeyboardEmojiWidget keyboardEmojiWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = keyboardEmojiWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((u77) n((rv4) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        u77 u77 = new u77(this.Y, continuation);
        u77.X = obj;
        return u77;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [fv4, ig7] */
    /* JADX WARNING: type inference failed for: r2v2, types: [mr5, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        rv4 rv4 = (rv4) this.X;
        KeyboardEmojiWidget keyboardEmojiWidget = this.Y;
        keyboardEmojiWidget.Y.E(rv4.a);
        keyboardEmojiWidget.X.E(rv4.b);
        return jue.a;
    }
}
