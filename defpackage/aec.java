package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: aec  reason: default package */
public abstract class aec {
    public volatile sz5 a;
    public Executor b;
    public qm c;
    public d4e d;
    public final q07 e = e();
    public boolean f;
    public List g;
    public final LinkedHashMap h = new LinkedHashMap();
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    public final ThreadLocal j = new ThreadLocal();
    public final Map k = Collections.synchronizedMap(new LinkedHashMap());
    public final LinkedHashMap l = new LinkedHashMap();

    public static Object s(Class cls, d4e d4e) {
        if (cls.isInstance(d4e)) {
            return d4e;
        }
        if (d4e instanceof ud4) {
            return s(cls, ((ud4) d4e).getDelegate());
        }
        return null;
    }

    public void a() {
        if (!this.f) {
            if (!(!(Looper.getMainLooper().getThread() == Thread.currentThread()))) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
            }
        }
    }

    public final void b() {
        if (!k() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final void c() {
        a();
        a();
        sz5 writableDatabase = h().getWritableDatabase();
        this.e.f(writableDatabase);
        if (writableDatabase.n0()) {
            writableDatabase.n();
        } else {
            writableDatabase.m();
        }
    }

    public final yz5 d(String str) {
        a();
        b();
        return h().getWritableDatabase().o(str);
    }

    public abstract q07 e();

    public abstract d4e f(b04 b04);

    public List g() {
        return hw4.a;
    }

    public final d4e h() {
        d4e d4e = this.d;
        if (d4e == null) {
            return null;
        }
        return d4e;
    }

    public Set i() {
        return qw4.a;
    }

    public Map j() {
        return iw4.a;
    }

    public final boolean k() {
        return h().getWritableDatabase().m0();
    }

    public final void l() {
        h().getWritableDatabase().S();
        if (!k()) {
            q07 q07 = this.e;
            if (q07.f.compareAndSet(false, true)) {
                Executor executor = q07.a.b;
                if (executor == null) {
                    executor = null;
                }
                executor.execute(q07.n);
            }
        }
    }

    public final void m(sz5 sz5) {
        q07 q07 = this.e;
        synchronized (q07.m) {
            if (!q07.g) {
                sz5.U("PRAGMA temp_store = MEMORY;");
                sz5.U("PRAGMA recursive_triggers='ON';");
                sz5.U("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                q07.f(sz5);
                q07.h = sz5.o("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                q07.g = true;
            }
        }
    }

    public final boolean n() {
        sz5 sz5 = this.a;
        return sz5 != null && sz5.isOpen();
    }

    public final Cursor o(f4e f4e, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? h().getWritableDatabase().p0(f4e, cancellationSignal) : h().getWritableDatabase().o0(f4e);
    }

    public final Object p(Callable callable) {
        c();
        try {
            Object call = callable.call();
            r();
            return call;
        } finally {
            l();
        }
    }

    public final void q(Runnable runnable) {
        c();
        try {
            runnable.run();
            r();
        } finally {
            l();
        }
    }

    public final void r() {
        h().getWritableDatabase().r0();
    }
}
