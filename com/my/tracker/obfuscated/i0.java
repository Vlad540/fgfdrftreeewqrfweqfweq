package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.my.tracker.obfuscated.t;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public final class i0 {
    final AtomicBoolean a = new AtomicBoolean();
    final z0 b;
    final Application c;
    final t d;
    final a e;
    final i f;
    final p g;

    public final class a implements t.a {
        public a() {
        }

        public void a(String str) {
            i0.this.f.b(str);
        }

        public void a() {
            i0.this.e.e();
        }
    }

    public i0(z0 z0Var, Application application) {
        this.b = z0Var;
        this.c = application;
        y0.c("MyTracker created, version: 4.0.0-beta1");
        t a2 = t.a(z0Var, (t.a) new a(), (Context) application);
        this.d = a2;
        this.e = a.a(a2, z0Var, application);
        this.f = i.a(z0Var, (Context) application);
        this.g = p.a(a2);
    }

    public static i0 a(String str, z0 z0Var, Application application) {
        z0Var.b(str);
        return new i0(z0Var, application);
    }

    public void b() {
        if (!this.a.compareAndSet(false, true)) {
            y0.a("MyTracker: tracker has already been initialized");
            return;
        }
        y0.c("MyTracker is initialized with id: " + this.b.g());
        h.a(this.b.d());
        h0.c(this.c);
        z0 z0Var = this.b;
        t tVar = this.d;
        Objects.requireNonNull(tVar);
        cyf cyf = new cyf(tVar, 0);
        t tVar2 = this.d;
        Objects.requireNonNull(tVar2);
        z0Var.a((n) cyf, (n) new cyf(tVar2, 1));
        this.d.d();
        g0.a(this.b, this.d, (Context) this.c);
        a0.a(this.d, this.f, (Context) this.c);
        f0.a(this.d, this.f, this.c);
        this.e.a();
    }

    public boolean c() {
        boolean z = this.a.get();
        boolean z2 = !z;
        if (!z) {
            y0.b("MyTracker error: tracker hasn't been initialized");
        }
        return z2;
    }

    public void a() {
        if (!c()) {
            this.d.a();
        }
    }

    public void a(Activity activity) {
        if (!c()) {
            this.e.d(activity);
        }
    }

    public void a(String str, String str2, Map map) {
        if (!c()) {
            this.d.a(str, str2, map);
        }
    }

    public String a(Intent intent) {
        return this.g.a(intent);
    }

    public void b(String str, String str2, Map map) {
        if (!c()) {
            this.d.b(str, str2, map);
        }
    }
}
