package defpackage;

import android.graphics.Point;
import android.view.View;
import one.me.pinbars.PinBarsWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: gva  reason: default package */
public final class gva implements View.OnLayoutChangeListener {
    public final /* synthetic */ y49 a;
    public final /* synthetic */ PinBarsWidget b;
    public final /* synthetic */ mge c;

    public gva(y49 y49, PinBarsWidget pinBarsWidget, hge hge) {
        this.a = y49;
        this.b = pinBarsWidget;
        this.c = hge;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        jme jme;
        View view2 = view;
        view.removeOnLayoutChangeListener(this);
        int[] iArr = new int[2];
        View tooltipAnchor = this.a.getTooltipAnchor();
        tooltipAnchor.getLocationOnScreen(iArr);
        PinBarsWidget pinBarsWidget = this.b;
        Point point = new Point(me4.p((float) 18, dh4.c().getDisplayMetrics().density, (jjd.o(pinBarsWidget.getContext()) - iArr[0]) - (tooltipAnchor.getWidth() / 2)), tooltipAnchor.getHeight() + iArr[1]);
        jme jme2 = pinBarsWidget.a;
        if (!(jme2 == null || !jme2.isShowing() || (jme = pinBarsWidget.a) == null)) {
            jme.dismiss();
        }
        jme jme3 = new jme(pinBarsWidget.getContext(), tooltipAnchor, yr3.z0, (s16) null, 1, 3, 8);
        jme3.d(this.c);
        jme3.e(point, 8388661, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        jme3.setOnDismissListener(new am8(1, pinBarsWidget));
        pinBarsWidget.a = jme3;
    }
}
