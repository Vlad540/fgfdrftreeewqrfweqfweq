package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: qb4  reason: default package */
public final class qb4 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ bc4 a;

    public qb4(bc4 bc4) {
        this.a = bc4;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        bc4 bc4 = this.a;
        kga kga = bc4.j;
        bc4.g();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        bc4 bc4 = this.a;
        kga kga = bc4.j;
        bc4.g();
    }
}
