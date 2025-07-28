package defpackage;

import android.os.Handler;
import android.os.Message;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: eyf  reason: default package */
public final class eyf implements Runnable {
    public final /* synthetic */ dia X;
    public final String a;
    public final Runnable b;
    public volatile boolean c = false;
    public int o = 0;

    public eyf(dia dia, String str, Runnable runnable) {
        this.X = dia;
        this.a = str;
        this.b = runnable;
    }

    public final void run() {
        Handler handler = this.X.b;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.obj = this;
            this.X.b.sendMessageDelayed(obtainMessage, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        }
        this.b.run();
        this.c = true;
    }
}
