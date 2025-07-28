package defpackage;

import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.CompletionHandler;

/* renamed from: ju  reason: default package */
public final class ju implements CompletionHandler {
    public static final ju b = new ju(0);
    public static final ju c = new ju(1);
    public final /* synthetic */ int a;

    public /* synthetic */ ju(int i) {
        this.a = i;
    }

    public final void completed(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((yv1) obj2).resumeWith(obj);
                return;
            default:
                Void voidR = (Void) obj;
                ((yv1) obj2).resumeWith(jue.a);
                return;
        }
    }

    public final void failed(Throwable th, Object obj) {
        switch (this.a) {
            case 0:
                yv1 yv1 = (yv1) obj;
                if (!(th instanceof AsynchronousCloseException) || !yv1.isCancelled()) {
                    yv1.resumeWith(new kcc(th));
                    return;
                }
                return;
            default:
                yv1 yv12 = (yv1) obj;
                if (!(th instanceof AsynchronousCloseException) || !yv12.isCancelled()) {
                    yv12.resumeWith(new kcc(th));
                    return;
                }
                return;
        }
    }
}
