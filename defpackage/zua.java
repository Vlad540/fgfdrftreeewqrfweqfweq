package defpackage;

import android.graphics.Point;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: zua  reason: default package */
public final class zua extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zua(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zua zua = new zua(continuation, this.Y);
        zua.X = obj;
        return zua;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.view.View, y49] */
    public final Object o(Object obj) {
        jme jme;
        wx3.H(obj);
        j40 j40 = (j40) this.X;
        boolean f = hhd.f(j40, h40.a);
        PinBarsWidget pinBarsWidget = this.Y;
        if (f) {
            int i = PinBarsWidget.x0;
            jme jme2 = pinBarsWidget.a;
            if (jme2 != null) {
                jme2.dismiss();
            }
            pinBarsWidget.a = null;
        } else if (j40 instanceof i40) {
            mge mge = ((i40) j40).a;
            ? r1 = pinBarsWidget.X;
            if (r1 != 0) {
                if (!r1.isLaidOut() || r1.isLayoutRequested()) {
                    r1.addOnLayoutChangeListener(new gva(r1, pinBarsWidget, (hge) mge));
                } else {
                    int[] iArr = new int[2];
                    View tooltipAnchor = r1.getTooltipAnchor();
                    tooltipAnchor.getLocationOnScreen(iArr);
                    Point point = new Point(me4.p((float) 18, dh4.c().getDisplayMetrics().density, (jjd.o(pinBarsWidget.getContext()) - iArr[0]) - (tooltipAnchor.getWidth() / 2)), tooltipAnchor.getHeight() + iArr[1]);
                    jme jme3 = pinBarsWidget.a;
                    if (!(jme3 == null || !jme3.isShowing() || (jme = pinBarsWidget.a) == null)) {
                        jme.dismiss();
                    }
                    jme jme4 = new jme(pinBarsWidget.getContext(), tooltipAnchor, (s16) yr3.z0, (s16) null, 1, 3, 8);
                    jme4.d(mge);
                    jme4.e(point, 8388661, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                    jme4.setOnDismissListener(new am8(1, pinBarsWidget));
                    pinBarsWidget.a = jme4;
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
