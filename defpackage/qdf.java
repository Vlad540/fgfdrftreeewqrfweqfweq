package defpackage;

import android.media.VolumeProvider;

/* renamed from: qdf  reason: default package */
public final class qdf extends VolumeProvider {
    public final /* synthetic */ oza a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qdf(oza oza, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = oza;
    }

    public final void onAdjustVolume(int i) {
        oza oza = this.a;
        oza.getClass();
        oze.W(oza.f, new nza(oza, i, 1, 1));
    }

    public final void onSetVolumeTo(int i) {
        oza oza = this.a;
        oza.getClass();
        oze.W(oza.f, new nza(oza, i, 1, 0));
    }
}
