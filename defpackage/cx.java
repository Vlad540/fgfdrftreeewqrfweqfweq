package defpackage;

import android.os.HandlerThread;

/* renamed from: cx  reason: default package */
public final /* synthetic */ class cx implements p3e {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ cx(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(dx.c(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 1:
                return new HandlerThread(ex.n(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 2:
                return new HandlerThread(dx.c(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
            default:
                return new HandlerThread(ex.n(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
