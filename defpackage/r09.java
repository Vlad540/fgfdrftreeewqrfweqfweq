package defpackage;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: r09  reason: default package */
public final class r09 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r09(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r09 r09 = new r09(continuation, this.Y);
        r09.X = obj;
        return r09;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    public final Object o(Object obj) {
        wx3.H(obj);
        yq4 yq4 = (yq4) this.X;
        MessagesListWidget messagesListWidget = this.Y;
        wue wue = messagesListWidget.J0;
        if (wue != null) {
            wue.Z = yq4;
            FrameLayout frameLayout = wue.Y;
            TextView textView = null;
            KeyEvent.Callback childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
            if (childAt instanceof TextView) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                jp2.f.b(textView, wue.Z);
            }
        }
        d04 d04 = messagesListWidget.K0;
        if (d04 != null) {
            d04.b = yq4;
        }
        ryd ryd = messagesListWidget.L0;
        if (ryd != null) {
            ryd.j();
        }
        messagesListWidget.q0().Y();
        messagesListWidget.q0().invalidate();
        return jue.a;
    }
}
