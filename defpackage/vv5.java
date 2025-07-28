package defpackage;

import android.view.View;
import java.util.Collections;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: vv5  reason: default package */
public final /* synthetic */ class vv5 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ForwardPickerScreen b;

    public /* synthetic */ vv5(ForwardPickerScreen forwardPickerScreen, int i) {
        this.a = i;
        this.b = forwardPickerScreen;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                k77[] k77Arr = ForwardPickerScreen.M0;
                widget.B0(booleanValue);
                return jue;
            case 1:
                View view = (View) obj;
                k77[] k77Arr2 = ForwardPickerScreen.M0;
                ex9 onBackPressedDispatcher = widget.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return jue;
            default:
                k77[] k77Arr3 = ForwardPickerScreen.M0;
                pfa.a(1).j((View) obj).e(widget.A0() ? Collections.singletonList(new pq3(c2a.e, new hge(e2a.b), Integer.valueOf(phc.r1), (Integer) null, 20)) : Collections.singletonList(new pq3(c2a.f, new hge(e2a.c), Integer.valueOf(phc.q1), (Integer) null, 20))).b().build().q(widget);
                return jue;
        }
    }
}
