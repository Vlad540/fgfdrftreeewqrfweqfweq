package defpackage;

import org.webrtc.EglThread;

/* renamed from: us4  reason: default package */
public final /* synthetic */ class us4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EglThread b;

    public /* synthetic */ us4(EglThread eglThread, int i) {
        this.a = i;
        this.b = eglThread;
    }

    public final void run() {
        int i = this.a;
        EglThread eglThread = this.b;
        switch (i) {
            case 0:
                eglThread.lambda$onRenderWindowOpen$2();
                return;
            default:
                eglThread.lambda$onRenderWindowClose$3();
                return;
        }
    }
}
