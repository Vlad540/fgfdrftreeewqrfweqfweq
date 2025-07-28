package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: d4c  reason: default package */
public final class d4c extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ FrameLayout Y;
    public final /* synthetic */ RecordControlsWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4c(RecordControlsWidget recordControlsWidget, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FrameLayout frameLayout = (FrameLayout) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                d4c d4c = new d4c(this.Z, continuation, 0);
                d4c.Y = frameLayout;
                jue jue = jue.a;
                d4c.o(jue);
                return jue;
            default:
                d4c d4c2 = new d4c(this.Z, continuation, 1);
                d4c2.Y = frameLayout;
                jue jue2 = jue.a;
                d4c2.o(jue2);
                return jue2;
        }
    }

    public final Object o(Object obj) {
        jue jue = jue.a;
        s59 s59 = km4.y0;
        RecordControlsWidget recordControlsWidget = this.Z;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                FrameLayout frameLayout = this.Y;
                k77[] k77Arr = RecordControlsWidget.m1;
                s59.r(frameLayout);
                ((GradientDrawable) recordControlsWidget.U0.getValue()).setColor(-16745729);
                return jue;
            default:
                wx3.H(obj);
                FrameLayout frameLayout2 = this.Y;
                k77[] k77Arr2 = RecordControlsWidget.m1;
                s59.r(frameLayout2);
                ((GradientDrawable) recordControlsWidget.T0.getValue()).setColor(r1g.G(-16745729, 0.2f));
                return jue;
        }
    }
}
