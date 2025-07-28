package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Collection;
import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: yv5  reason: default package */
public final class yv5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ flb Y;
    public final /* synthetic */ ForwardPickerScreen Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yv5(flb flb, ForwardPickerScreen forwardPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = flb;
        this.Z = forwardPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((yv5) n((iw5) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yv5 yv5 = new yv5(this.Y, this.Z, continuation);
        yv5.X = obj;
        return yv5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        iw5 iw5 = (iw5) this.X;
        int i = 8;
        flb flb = this.Y;
        if (iw5 == null) {
            flb.setVisibility(8);
        } else {
            k77[] k77Arr = ForwardPickerScreen.M0;
            ForwardPickerScreen forwardPickerScreen = this.Z;
            if ((!((Collection) forwardPickerScreen.u0().Z.a.getValue()).isEmpty()) && forwardPickerScreen.A0()) {
                i = 0;
            }
            flb.setVisibility(i);
            CharSequence a = iw5.a.a(flb.getContext());
            if (a != null) {
                flb.setTitle(a);
                mge mge = iw5.c;
                flb.setBody(mge != null ? mge.a(flb.getContext()) : null);
                flb.a(iw5.d, iw5.f);
                flb.setCounter(iw5.e);
                if (forwardPickerScreen.z0()) {
                    flb.setStartIconDrawable((Drawable) null);
                    flb.setStartIconClickListener((View.OnClickListener) null);
                } else {
                    if (flb.getVisibility() == 0) {
                        ((pv5) forwardPickerScreen.u0().c).f();
                    }
                    flb.setStartIconDrawable(((pv5) forwardPickerScreen.u0().c).g());
                    flb.setStartIconClickListener(new xv5(forwardPickerScreen, 0, flb));
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return jue.a;
    }
}
