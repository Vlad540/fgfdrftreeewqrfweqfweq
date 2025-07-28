package defpackage;

import org.webrtc.VpxEncoderWrapper;

/* renamed from: sy5  reason: default package */
public final /* synthetic */ class sy5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty5 b;

    public /* synthetic */ sy5(ty5 ty5, int i) {
        this.a = i;
        this.b = ty5;
    }

    public final void run() {
        int i = this.a;
        ty5 ty5 = this.b;
        switch (i) {
            case 0:
                ty5.B0 = true;
                VpxEncoderWrapper vpxEncoderWrapper = new VpxEncoderWrapper();
                vpxEncoderWrapper.setConsumerCallback(ty5);
                ty5.Y = vpxEncoderWrapper;
                return;
            case 1:
                ty5.a();
                return;
            default:
                ty5.a();
                ty5.Z = null;
                ty5.w0 = null;
                return;
        }
    }
}
