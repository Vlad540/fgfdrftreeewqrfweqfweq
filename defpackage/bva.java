package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: bva  reason: default package */
public final class bva extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bva(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((yva) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bva bva = new bva(this.Z, continuation, this.Y);
        bva.X = obj;
        return bva;
    }

    public final Object o(Object obj) {
        int i = 0;
        wx3.H(obj);
        yva yva = (yva) this.X;
        ViewGroup viewGroup = (ViewGroup) this.Z;
        int i2 = PinBarsWidget.x0;
        PinBarsWidget pinBarsWidget = this.Y;
        pinBarsWidget.getClass();
        if (!(yva instanceof xva)) {
            viewGroup.removeView(viewGroup.findViewById(z7a.f));
            pinBarsWidget.Y = null;
        } else {
            if (pinBarsWidget.Y == null) {
                c8a c8a = new c8a(pinBarsWidget.getContext());
                c8a.setId(z7a.f);
                c8a.setCloseBtnClickListener(new uua(pinBarsWidget, 0));
                c8a.setOnClickListener(new uua(pinBarsWidget, 1));
                urd.B(new z9(3, (Continuation) null, 29), c8a);
                pinBarsWidget.Y = c8a;
                int childCount = viewGroup.getChildCount();
                if (childCount < 0) {
                    i = childCount;
                }
                viewGroup.addView(c8a, i);
            }
            c8a c8a2 = pinBarsWidget.Y;
            if (c8a2 != null) {
                xva xva = (xva) yva;
                CharSequence a = xva.b.a(pinBarsWidget.getContext());
                if (a == null) {
                    a = "";
                }
                c8a2.setSubtitle(a);
                c8a2.setCloseButtonVisibility(xva.c);
            }
        }
        return jue.a;
    }
}
