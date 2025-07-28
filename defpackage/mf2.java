package defpackage;

import android.view.View;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: mf2  reason: default package */
public final class mf2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mf2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((mf2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mf2 mf2 = new mf2(continuation, this.Y);
        mf2.X = obj;
        return mf2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        yf2 yf2 = (yf2) this.X;
        k77[] k77Arr = ChatMediaViewerScreen.O0;
        cw6 y0 = this.Y.y0();
        y0.y0.setText(yf2.a);
        y0.z0.setText(yf2.b);
        CharSequence charSequence = yf2.c;
        int length = charSequence.length();
        t97 t97 = y0.E0;
        t97 t972 = y0.D0;
        if (length > 0) {
            ek8.e((View) t972.getValue(), y0);
            ek8.e((View) t97.getValue(), y0);
            ((View) t972.getValue()).setVisibility(0);
            ((View) t97.getValue()).setVisibility(0);
            ((TextView) t972.getValue()).setText(charSequence);
        } else if (ek8.L(t972)) {
            ((View) t972.getValue()).setVisibility(8);
            ((View) t97.getValue()).setVisibility(8);
            ((TextView) t972.getValue()).setText((CharSequence) null);
        }
        t97 t973 = y0.A0;
        if (t973.a()) {
            ((mya) t973.getValue()).a(yf2.d);
        }
        return jue.a;
    }
}
