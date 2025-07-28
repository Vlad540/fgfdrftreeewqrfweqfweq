package defpackage;

import ru.ok.android.externcalls.sdk.audio.ProximityTracker;

/* renamed from: nib  reason: default package */
public final class nib implements ProximityTracker {
    public final t97 a;

    public nib(t97 t97) {
        this.a = t97;
    }

    public final boolean getCanUseSpeaker() {
        t97 t97 = this.a;
        return ((mib) t97.getValue()).f != null && !((mib) t97.getValue()).e;
    }

    public final void startTrackingProximity() {
        ((mib) this.a.getValue()).a();
    }

    public final void stopTrackingProximity() {
        ((mib) this.a.getValue()).b();
    }
}
