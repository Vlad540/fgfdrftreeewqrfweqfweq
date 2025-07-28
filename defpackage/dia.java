package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: dia  reason: default package */
public final class dia implements Handler.Callback {
    public static final ThreadLocal X = new ThreadLocal();
    public static final ExecutorService o;
    public final ExecutorService a = o;
    public final Handler b = null;
    public final axb c;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        o = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new lc(10));
    }

    public dia(axb axb) {
        this.c = axb;
    }

    public final boolean handleMessage(Message message) {
        eyf eyf = (eyf) message.obj;
        if (eyf.c) {
            return true;
        }
        eyf.o++;
        this.c.log(tqd.app_event, "rtc.long.executor.task." + eyf.o, eyf.a);
        if (eyf.o >= 4) {
            return true;
        }
        Handler handler = this.b;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.obj = eyf;
            this.b.sendMessageDelayed(obtainMessage, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
            return true;
        }
        throw new IllegalStateException("No task duration check thread");
    }
}
