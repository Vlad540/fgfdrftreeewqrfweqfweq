package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hgd  reason: default package */
public final class hgd implements e60 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final int c;
    public final int d;
    public byte[] e;
    public long f;
    public nfc g;
    public Executor h;

    public hgd(m80 m80) {
        this.c = m80.a();
        this.d = m80.b;
    }

    public final void a(nfc nfc, ryc ryc) {
        e07.p("AudioStream can not be started when setCallback.", !this.a.get());
        b();
        this.g = nfc;
        this.h = ryc;
    }

    public final void b() {
        e07.p("AudioStream has been released.", !this.b.get());
    }

    public final p80 read(ByteBuffer byteBuffer) {
        b();
        e07.p("AudioStream has not been started.", this.a.get());
        int i = this.c;
        long D = r1g.D(i, (long) byteBuffer.remaining());
        long j = (long) i;
        boolean z = true;
        e07.j("bytesPerFrame must be greater than 0.", j > 0);
        int i2 = (int) (j * D);
        if (i2 <= 0) {
            return new p80(0, this.f);
        }
        long j2 = this.f + r1g.j(this.d, D);
        long nanoTime = j2 - System.nanoTime();
        if (nanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            } catch (InterruptedException unused) {
            }
        }
        if (i2 > byteBuffer.remaining()) {
            z = false;
        }
        e07.p((String) null, z);
        byte[] bArr = this.e;
        if (bArr == null || bArr.length < i2) {
            this.e = new byte[i2];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.e, 0, i2).limit(position + i2).position(position);
        p80 p80 = new p80(i2, this.f);
        this.f = j2;
        return p80;
    }

    public final void release() {
        this.b.getAndSet(true);
    }

    public final void start() {
        b();
        if (!this.a.getAndSet(true)) {
            this.f = System.nanoTime();
            nfc nfc = this.g;
            Executor executor = this.h;
            if (nfc != null && executor != null) {
                executor.execute(new pzb(15, nfc));
            }
        }
    }

    public final void stop() {
        b();
        this.a.set(false);
    }
}
