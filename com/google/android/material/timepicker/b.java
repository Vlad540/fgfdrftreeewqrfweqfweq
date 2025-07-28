package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public b(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.N0.o) - clockFaceView.V0;
        if (height != clockFaceView.L0) {
            clockFaceView.L0 = height;
            clockFaceView.w();
            int i = clockFaceView.L0;
            ClockHandView clockHandView = clockFaceView.N0;
            clockHandView.D0 = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
