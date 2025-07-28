package defpackage;

import org.webrtc.JniCommon;

/* renamed from: oe8  reason: default package */
public final /* synthetic */ class oe8 implements Runnable {
    public final /* synthetic */ long a;

    public /* synthetic */ oe8(long j) {
        this.a = j;
    }

    public final void run() {
        JniCommon.nativeReleaseRef(this.a);
    }
}
