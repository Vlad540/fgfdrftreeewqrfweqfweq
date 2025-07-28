package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: i4c  reason: default package */
public final class i4c extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i4c(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        i4c i4c = new i4c(continuation, this.Y);
        i4c.X = obj;
        return i4c;
    }

    public final Object o(Object obj) {
        String str;
        wx3.H(obj);
        ah7 ah7 = (ah7) this.X;
        k77[] k77Arr = RecordControlsWidget.m1;
        RecordControlsWidget recordControlsWidget = this.Y;
        recordControlsWidget.getClass();
        boolean z = ah7.b;
        Long l = (Long) recordControlsWidget.L0().D0.a.getValue();
        if (z) {
            recordControlsWidget.F0().setImageDrawable((Drawable) recordControlsWidget.P0.getValue());
        } else {
            recordControlsWidget.F0().setImageDrawable((Drawable) recordControlsWidget.O0.getValue());
        }
        Float f = ah7.a;
        if (f == null) {
            q60 N0 = recordControlsWidget.N0();
            if (!N0.H0) {
                N0.x0 = (long) (0.0f * ((float) N0.G0));
                N0.z0 = false;
                N0.postInvalidate();
            }
        } else {
            q60 N02 = recordControlsWidget.N0();
            float floatValue = f.floatValue();
            if (!N02.H0) {
                N02.x0 = (long) (floatValue * ((float) N02.G0));
                N02.z0 = true;
                N02.postInvalidate();
            }
        }
        if (!recordControlsWidget.N0().H0) {
            if (f == null || l == null) {
                str = null;
            } else {
                str = d8.b((long) (f.floatValue() * ((float) l.longValue())));
            }
            if (f == null && l != null) {
                str = d8.b(l.longValue());
            }
            recordControlsWidget.A0().setText(str);
        }
        return jue.a;
    }
}
