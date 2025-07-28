package defpackage;

import android.media.AudioRouting;

/* renamed from: v44  reason: default package */
public final /* synthetic */ class v44 implements AudioRouting.OnRoutingChangedListener {
    public final /* synthetic */ w44 a;

    public /* synthetic */ v44(w44 w44) {
        this.a = w44;
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        this.a.b(audioRouting);
    }
}
