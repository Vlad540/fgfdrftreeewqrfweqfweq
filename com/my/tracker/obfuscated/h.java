package com.my.tracker.obfuscated;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public abstract class h {
    private static volatile Executor a;
    public static final Handler b = new Handler(Looper.getMainLooper());
    private static final a c = new a();

    public static void a(Executor executor) {
        if (a != null) {
            y0.b("Async - unexpected init error");
            return;
        }
        if (executor == null) {
            executor = Executors.newSingleThreadExecutor();
        }
        a = executor;
    }

    public static void b(Runnable runnable) {
        Runnable a2 = c.a(runnable);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            a2.run();
        } else {
            b.post(a2);
        }
    }

    public static Executor a() {
        return a;
    }

    public static void a(Runnable runnable) {
        Runnable a2 = c.a(runnable);
        Executor executor = a;
        if (executor == null) {
            y0.b("Async - background executor is not found");
        } else {
            executor.execute(a2);
        }
    }

    public static final class a {
        private final ArrayDeque a = new ArrayDeque();

        /* renamed from: com.my.tracker.obfuscated.h$a$a  reason: collision with other inner class name */
        public static final class C0001a implements Runnable {
            final a a;
            volatile Runnable b;

            public C0001a(a aVar) {
                this.a = aVar;
            }

            public void run() {
                try {
                    Runnable runnable = this.b;
                    if (runnable != null) {
                        runnable.run();
                    }
                    a aVar = this.a;
                    if (aVar != null) {
                        aVar.a(this);
                    }
                } catch (Throwable th) {
                    a aVar2 = this.a;
                    if (aVar2 != null) {
                        aVar2.a(this);
                    }
                    throw th;
                }
            }
        }

        public a() {
            for (int i = 0; i < 64; i++) {
                this.a.add(new C0001a(this));
            }
        }

        public Runnable a(Runnable runnable) {
            C0001a aVar;
            synchronized (this) {
                aVar = (C0001a) this.a.pollFirst();
            }
            if (aVar == null) {
                aVar = new C0001a((a) null);
            }
            aVar.b = runnable;
            return aVar;
        }

        public void a(C0001a aVar) {
            synchronized (this) {
                aVar.b = null;
                this.a.add(aVar);
            }
        }
    }
}
