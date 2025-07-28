package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* renamed from: z59  reason: default package */
public class z59 extends Handler {
    public final /* synthetic */ int a;

    public /* synthetic */ z59() {
        this.a = 1;
    }

    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                y59 y59 = (y59) message.obj;
                int i = message.what;
                if (i == 1) {
                    ww wwVar = y59.a;
                    Object obj = y59.b[0];
                    if (wwVar.o.get()) {
                        CountDownLatch countDownLatch = wwVar.Y;
                        try {
                            l2g l2g = wwVar.Z;
                            if (l2g.i == wwVar) {
                                SystemClock.uptimeMillis();
                                l2g.i = null;
                                l2g.b();
                            }
                        } finally {
                            countDownLatch.countDown();
                        }
                    } else {
                        try {
                            l2g l2g2 = wwVar.Z;
                            if (l2g2.h != wwVar) {
                                if (l2g2.i == wwVar) {
                                    SystemClock.uptimeMillis();
                                    l2g2.i = null;
                                    l2g2.b();
                                }
                            } else if (!l2g2.d) {
                                SystemClock.uptimeMillis();
                                l2g2.h = null;
                                mj7 mj7 = l2g2.b;
                                if (mj7 != null) {
                                    if (Looper.myLooper() == Looper.getMainLooper()) {
                                        mj7.k(obj);
                                    } else {
                                        mj7.i(obj);
                                    }
                                }
                            }
                        } finally {
                            wwVar.Y.countDown();
                        }
                    }
                    wwVar.c = 3;
                    return;
                } else if (i == 2) {
                    y59.a.getClass();
                    return;
                } else {
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z59(Looper looper, int i, boolean z) {
        super(looper);
        this.a = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z59(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.a = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z59(Looper looper, int i) {
        super(looper);
        this.a = i;
        switch (i) {
            case 5:
                super(looper);
                Looper.getMainLooper();
                return;
            default:
                Looper.getMainLooper();
                return;
        }
    }
}
