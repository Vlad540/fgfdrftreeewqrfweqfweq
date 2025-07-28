package defpackage;

import android.os.Bundle;
import android.view.View;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.arch.Widget;

/* renamed from: a78  reason: default package */
public final /* synthetic */ class a78 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaKeyboardWidget b;

    public /* synthetic */ a78(MediaKeyboardWidget mediaKeyboardWidget, int i) {
        this.a = i;
        this.b = mediaKeyboardWidget;
    }

    public final void onClick(View view) {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MediaKeyboardWidget.G0;
                b87 b87 = b87.c;
                widget.getClass();
                k77 k77 = MediaKeyboardWidget.G0[0];
                long longValue = ((Number) widget.a.a(widget)).longValue();
                d34 P1 = b87.P1();
                P1.b(":stickers/showcase?chat_id=" + longValue, (Bundle) null);
                return;
            default:
                k77[] k77Arr2 = MediaKeyboardWidget.G0;
                View view2 = widget.getView();
                if (view2 != null) {
                    lp.K(view2, ie6.c);
                }
                taf.o(((u68) widget.c.getValue()).X, n68.a);
                return;
        }
    }
}
