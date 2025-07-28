package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: cva  reason: default package */
public final class cva extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cva(View view, Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((v49) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        cva cva = new cva(this.Z, continuation, this.Y);
        cva.X = obj;
        return cva;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View, y49] */
    public final Object o(Object obj) {
        x49 x49;
        wx3.H(obj);
        v49 v49 = (v49) this.X;
        ViewGroup viewGroup = (ViewGroup) this.Z;
        int i = PinBarsWidget.x0;
        PinBarsWidget pinBarsWidget = this.Y;
        pinBarsWidget.getClass();
        if (!(v49 instanceof u49)) {
            viewGroup.removeView(viewGroup.findViewById(z7a.g));
            pinBarsWidget.X = null;
        } else {
            if (pinBarsWidget.X == null) {
                ConstraintLayout y49 = new y49(pinBarsWidget.getContext(), (AttributeSet) null);
                y49.setId(z7a.g);
                y49.setOnCloseClickListener(new uua(pinBarsWidget, 2));
                y49.setOnPlaybackSpeedClick(new e98(18, pinBarsWidget));
                y49.setOnPlaybackClickListener(new uua(pinBarsWidget, 3));
                a24.a0(y49, new uua(pinBarsWidget, 4));
                y49.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                urd.B(new z9(3, (Continuation) null, 28), y49);
                pinBarsWidget.X = y49;
                int childCount = viewGroup.getChildCount();
                if (1 <= childCount) {
                    childCount = 1;
                }
                viewGroup.addView(y49, childCount);
            }
            ? r0 = pinBarsWidget.X;
            if (r0 != 0) {
                u49 u49 = (u49) v49;
                r0.setIsPlaying(u49.d);
                r0.setTitle(u49.a.a(r0.getContext()));
                r0.setSubtitle(u49.b.a(r0.getContext()));
                int ordinal = u49.c.ordinal();
                if (ordinal == 0) {
                    x49 = x49.a;
                } else if (ordinal == 1) {
                    x49 = x49.b;
                } else if (ordinal == 2) {
                    x49 = x49.c;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                r0.setPlaybackSpeed(x49);
                r0.setProgress(((Number) pinBarsWidget.l0().C0.a.getValue()).floatValue());
            }
        }
        return jue.a;
    }
}
