package defpackage;

import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;

/* renamed from: j41  reason: default package */
public final class j41 implements qk1 {
    public final /* synthetic */ d5b a;

    public j41(d5b d5b) {
        this.a = d5b;
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        if (!connectedInfo.isFirstConnection()) {
            ((a5b) this.a).n(p31.c);
        }
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        ((a5b) this.a).n(q31.c);
    }
}
