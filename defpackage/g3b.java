package defpackage;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: g3b  reason: default package */
public final class g3b implements DisplayManager.DisplayListener {
    public final /* synthetic */ k3b a;

    public g3b(k3b k3b) {
        this.a = k3b;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        k3b k3b = this.a;
        Display display = k3b.getDisplay();
        if (display != null && display.getDisplayId() == i) {
            k3b.b();
        }
    }

    public final void onDisplayRemoved(int i) {
    }
}
