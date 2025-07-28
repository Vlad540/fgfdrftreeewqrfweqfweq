package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: ls0  reason: default package */
public final class ls0 implements e60 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final ryc d;
    public final Object e;
    public ks0 f;
    public final e60 g;
    public final int h;
    public final int i;
    public final int j;
    public final AtomicBoolean k;
    public int l;

    public ls0(g60 g60, m80 m80) {
        m30 m30;
        boolean z = false;
        if (m30.c != null) {
            m30 = m30.c;
        } else {
            synchronized (m30.class) {
                try {
                    if (m30.c == null) {
                        m30.c = new m30(0);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            m30 = m30.c;
        }
        this.d = new ryc(m30);
        this.e = new Object();
        this.f = null;
        this.k = new AtomicBoolean(false);
        this.g = g60;
        int a2 = m80.a();
        this.h = a2;
        int i2 = m80.b;
        this.i = i2;
        e07.j("mBytesPerFrame must be greater than 0.", ((long) a2) > 0);
        e07.j("mSampleRate must be greater than 0.", ((long) i2) > 0 ? true : z);
        this.j = 500;
        this.l = a2 * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
    }

    public final void a(nfc nfc, ryc ryc) {
        e07.p("AudioStream can not be started when setCallback.", !this.a.get());
        b();
        this.d.execute(new g5(this, nfc, ryc, 4));
    }

    public final void b() {
        e07.p("AudioStream has been released.", !this.b.get());
    }

    public final void c() {
        if (this.k.get()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.l);
            ks0 ks0 = new ks0(allocateDirect, this.g.read(allocateDirect), this.h, this.i);
            int i2 = this.j;
            synchronized (this.e) {
                try {
                    this.c.offer(ks0);
                    while (this.c.size() > i2) {
                        this.c.poll();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (this.k.get()) {
                this.d.execute(new js0(this, 2));
            }
        }
    }

    public final p80 read(ByteBuffer byteBuffer) {
        boolean z;
        b();
        e07.p("AudioStream has not been started.", this.a.get());
        this.d.execute(new n30(byteBuffer.remaining(), 2, this));
        p80 p80 = new p80(0, 0);
        do {
            synchronized (this.e) {
                try {
                    ks0 ks0 = this.f;
                    this.f = null;
                    if (ks0 == null) {
                        ks0 = (ks0) this.c.poll();
                    }
                    if (ks0 != null) {
                        p80 = ks0.a(byteBuffer);
                        if (ks0.c.remaining() > 0) {
                            this.f = ks0;
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            z = p80.a <= 0 && this.a.get() && !this.b.get();
            if (z) {
                try {
                    Thread.sleep(1);
                    continue;
                } catch (InterruptedException unused) {
                }
            }
        } while (z);
        return p80;
    }

    public final void release() {
        if (!this.b.getAndSet(true)) {
            this.d.execute(new js0(this, 3));
        }
    }

    public final void start() {
        b();
        AtomicBoolean atomicBoolean = this.a;
        if (!atomicBoolean.getAndSet(true)) {
            FutureTask futureTask = new FutureTask(new js0(this, 1), (Object) null);
            this.d.execute(futureTask);
            try {
                futureTask.get();
            } catch (InterruptedException | ExecutionException e2) {
                atomicBoolean.set(false);
                throw new Exception(e2);
            }
        }
    }

    public final void stop() {
        b();
        if (this.a.getAndSet(false)) {
            this.d.execute(new js0(this, 0));
        }
    }
}
