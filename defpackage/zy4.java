package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: zy4  reason: default package */
public abstract class zy4 extends Service {
    public int X = 0;
    public final ExecutorService a;
    public rsf b;
    public final Object c = new Object();
    public int o;

    public zy4() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zf9("Firebase-Messaging-Intent-Handle", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void a(Intent intent) {
        if (intent != null) {
            kef.b(intent);
        }
        synchronized (this.c) {
            try {
                int i = this.X - 1;
                this.X = i;
                if (i == 0) {
                    stopSelfResult(this.o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.b == null) {
                this.b = new rsf(new za6((Object) this));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.b;
    }

    public final void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.o = i2;
            this.X++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) b0d.t().X).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        vde vde = new vde();
        this.a.execute(new px4((Object) this, (Object) intent2, (Object) vde, 2));
        n6g n6g = vde.a;
        if (n6g.g()) {
            a(intent);
            return 2;
        }
        n6g.b(new gr(2), new e44(this, 9, intent));
        return 3;
    }
}
