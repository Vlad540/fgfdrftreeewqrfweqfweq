package defpackage;

import java.nio.ByteBuffer;
import org.webrtc.JniCommon;

/* renamed from: c37  reason: default package */
public final /* synthetic */ class c37 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ByteBuffer b;

    public /* synthetic */ c37(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
    }

    public final void run() {
        int i = this.a;
        ByteBuffer byteBuffer = this.b;
        switch (i) {
            case 0:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                return;
            default:
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                return;
        }
    }
}
