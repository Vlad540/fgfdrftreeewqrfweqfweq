package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {
    final Map a = new WeakHashMap();
    final Handler b = h.b;
    final AtomicBoolean c = new AtomicBoolean();
    final t d;
    final z0 e;
    final Application f;
    final Runnable g;
    final Runnable h;
    final Runnable i;
    long j = 0;
    long k = 0;

    /* renamed from: com.my.tracker.obfuscated.a$a  reason: collision with other inner class name */
    public final class C0000a implements Application.ActivityLifecycleCallbacks {
        public C0000a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            a.this.a(activity);
        }

        public void onActivityStopped(Activity activity) {
            a.this.c(activity);
        }
    }

    private a(t tVar, z0 z0Var, Application application) {
        this.d = tVar;
        this.e = z0Var;
        this.f = application;
        this.g = new iwf(this, 0);
        this.h = new iwf(this, 1);
        this.i = new iwf(this, 2);
    }

    public void e() {
        if (this.c.get()) {
            h.b(this.h);
        }
    }

    public void f() {
        y0.a("ActivityHandler: timer tick for buffering period");
        this.d.a();
        e();
    }

    public static a a(t tVar, z0 z0Var, Application application) {
        return new a(tVar, z0Var, application);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.c.get()) {
            f();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(x0.a((long) this.e.e()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        p0.a((Context) this.f).c(x0.b(this.j));
    }

    public void a() {
        this.f.registerActivityLifecycleCallbacks(new C0000a());
    }

    public void c(Activity activity) {
        if (this.a.remove(activity) != null && this.a.isEmpty()) {
            this.c.set(false);
            this.b.removeCallbacks(this.g);
            this.j = System.currentTimeMillis();
            h.a(this.i);
        }
    }

    public void d(Activity activity) {
        h.b(new jwf(this, 0, activity));
    }

    /* renamed from: b */
    public void a(Activity activity) {
        if (this.a.put(activity, Boolean.TRUE) == null && this.a.size() <= 1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.j < x0.a((long) this.e.h()) || !this.e.o()) {
                long j2 = this.k - currentTimeMillis;
                if (j2 > 0) {
                    a(j2);
                } else {
                    f();
                }
            } else {
                this.d.g();
                a(x0.a((long) this.e.e()));
            }
        }
    }

    public void a(long j2) {
        this.b.removeCallbacks(this.g);
        this.c.set(true);
        this.b.postDelayed(this.g, j2);
        this.k = System.currentTimeMillis() + j2;
    }
}
