package defpackage;

import org.webrtc.AndroidVideoDecoder;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

/* renamed from: qw0  reason: default package */
public final /* synthetic */ class qw0 implements AndroidVideoDecoder.ErrorCallback, SignalingProvider {
    public final /* synthetic */ gx0 a;

    public /* synthetic */ qw0(gx0 gx0) {
        this.a = gx0;
    }

    public void error(Exception exc, String str) {
        gx0 gx0 = this.a;
        gx0.getClass();
        gx0.Z0.logException("OKRTCCall", str, new IllegalStateException(str, exc));
    }

    public mfd getSignaling() {
        return this.a.Z;
    }
}
