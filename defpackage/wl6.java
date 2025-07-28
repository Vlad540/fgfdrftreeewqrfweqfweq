package defpackage;

import one.me.sdk.transfer.exceptions.HttpErrorException;

/* renamed from: wl6  reason: default package */
public final /* synthetic */ class wl6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yl6 b;

    public /* synthetic */ wl6(yl6 yl6, int i) {
        this.a = i;
        this.b = yl6;
    }

    public final void run() {
        yl6 yl6 = this.b;
        switch (this.a) {
            case 0:
                if (!yl6.Y.get()) {
                    udd.s("zl6", "onFileDownloadInterrupted", (Throwable) null);
                    yl6.X.onError(new HttpErrorException("url expired", (am6) null));
                    yl6.c(false);
                    return;
                }
                return;
            case 1:
                if (!yl6.Y.get()) {
                    udd.s("zl6", "onFileDownloadFailed", (Throwable) null);
                    yl6.X.onError(new HttpErrorException("onFileDownloadFailed", (am6) null));
                    yl6.c(false);
                    return;
                }
                return;
            default:
                if (!yl6.Y.get()) {
                    udd.s("zl6", "onFileDownloadInterrupted", (Throwable) null);
                    yl6.X.onError(new HttpErrorException("onFileDownloadInterrupted", (am6) null));
                    yl6.c(false);
                    return;
                }
                return;
        }
    }
}
