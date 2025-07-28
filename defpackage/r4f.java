package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* renamed from: r4f  reason: default package */
public final class r4f implements DisplayManager.DisplayListener, q4f {
    public final /* synthetic */ int a = 1;
    public final DisplayManager b;
    public Object c;

    public r4f(u4f u4f, DisplayManager displayManager) {
        this.c = u4f;
        this.b = displayManager;
    }

    private final void a(int i) {
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }

    public void b(xle xle) {
        this.c = xle;
        Handler m = mze.m((Handler.Callback) null);
        DisplayManager displayManager = this.b;
        displayManager.registerDisplayListener(this, m);
        xle.c(displayManager.getDisplay(0));
    }

    public void c() {
        this.b.unregisterDisplayListener(this);
        this.c = null;
    }

    public final void onDisplayAdded(int i) {
        int i2 = this.a;
    }

    public final void onDisplayChanged(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    u4f.a((u4f) this.c, this.b.getDisplay(0));
                    return;
                }
                return;
            default:
                xle xle = (xle) this.c;
                if (xle != null && i == 0) {
                    xle.c(this.b.getDisplay(0));
                    return;
                }
                return;
        }
    }

    public final void onDisplayRemoved(int i) {
        int i2 = this.a;
    }

    public r4f(DisplayManager displayManager) {
        this.b = displayManager;
    }
}
