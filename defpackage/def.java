package defpackage;

import android.os.Process;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: def  reason: default package */
public final class def implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eef b;

    public /* synthetic */ def(eef eef, int i) {
        this.a = i;
        this.b = eef;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                int threadPriority = Process.getThreadPriority(Process.myTid());
                try {
                    Process.setThreadPriority(10);
                    synchronized (this.b.b) {
                        eef eef = this.b;
                        k1c k1c = eef.c;
                        if (k1c != null) {
                            d4b d4b = eef.q;
                            lac lac = k1c.r;
                            d4b.getClass();
                            String lac2 = lac.toString();
                            if (((ywb) d4b.c).shouldHideSensitiveInformation()) {
                                lac2 = am7.k(lac2);
                            }
                            ((xwb) d4b.b).log("OKWSSignaling", "May be ERROR, socket is already with " + lac2);
                        }
                        eef eef2 = this.b;
                        d4b d4b2 = eef2.q;
                        String str = eef2.h;
                        if (((ywb) d4b2.c).shouldHideSensitiveInformation()) {
                            str = am7.k(str);
                        }
                        ((xwb) d4b2.b).log("OKWSSignaling", "Connect to " + str);
                        s86 s86 = new s86();
                        s86.q(this.b.h);
                        lac j = s86.j();
                        eef eef3 = this.b;
                        eef3.c = eef3.o.c(j, new ple(this));
                    }
                    Process.setThreadPriority(threadPriority);
                    return;
                } catch (Throwable th) {
                    Process.setThreadPriority(threadPriority);
                    throw th;
                }
            default:
                synchronized (this.b.b) {
                    try {
                        this.b.q.n("transport.DISCONNECT");
                        k1c k1c2 = this.b.c;
                        if (k1c2 != null) {
                            k1c2.b(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, "dispose");
                            this.b.c = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
