package defpackage;

import android.media.VolumeProvider;
import one.me.calls.impl.service.CallServiceImpl;

/* renamed from: fj1  reason: default package */
public final class fj1 extends VolumeProvider {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fj1(oza oza, int i, int i2, int i3) {
        super(i, i2, i3);
        this.b = oza;
    }

    public final void onAdjustVolume(int i) {
        switch (this.a) {
            case 0:
                udd.p("CallServiceTag", "on adjust volume changed: " + i, new Object[0]);
                ((a61) ((CallServiceImpl) this.b).Y.getValue()).a();
                return;
            default:
                oza oza = (oza) this.b;
                oza.getClass();
                oze.W(oza.f, new nza(oza, i, 1, 1));
                return;
        }
    }

    public void onSetVolumeTo(int i) {
        switch (this.a) {
            case 1:
                oza oza = (oza) this.b;
                oza.getClass();
                oze.W(oza.f, new nza(oza, i, 1, 0));
                return;
            default:
                super.onSetVolumeTo(i);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fj1(CallServiceImpl callServiceImpl) {
        super(1, 0, 0);
        this.b = callServiceImpl;
    }
}
