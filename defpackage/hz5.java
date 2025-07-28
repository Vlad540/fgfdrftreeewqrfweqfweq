package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.EncodedImage;

/* renamed from: hz5  reason: default package */
public final class hz5 implements nhc {
    public volatile boolean a;
    public volatile az3 b;
    public final ConcurrentLinkedQueue c;
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e;
    public final lje f;
    public volatile rwf g;
    public volatile boolean h;

    public hz5() {
        new AtomicLong();
        this.e = new AtomicInteger();
        this.c = new ConcurrentLinkedQueue();
        this.f = new lje();
    }

    public static void b(rwf rwf) {
        if (rwf != null) {
            synchronized (rwf.a) {
                rwf.a.notify();
            }
        }
    }

    public final void a(az3 az3, byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.get();
        byte b2 = wrap.get();
        wrap.getShort();
        if (b2 == 1) {
            this.h = true;
        }
    }

    public final synchronized void c(boolean z) {
        try {
            if (this.a) {
                this.a = false;
                rwf rwf = this.g;
                if (rwf != null) {
                    rwf.o = true;
                    if (z) {
                        synchronized (rwf.b) {
                            rwf.c = null;
                        }
                    }
                }
                b(rwf);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    EncodedImage encodedImage = (EncodedImage) it.next();
                    this.d.addAndGet(-encodedImage.buffer.remaining());
                    encodedImage.release();
                    it.remove();
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void d(az3 az3) {
        try {
            if (this.b != null) {
                this.b.e.remove(this);
                this.b.c(this);
            }
            c(true);
            this.b = az3;
            if (this.b != null) {
                this.b.e.add(this);
                this.b.a(this);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void e() {
        c(true);
        this.a = true;
        rwf rwf = new rwf(this, this.b);
        this.g = rwf;
        rwf.start();
    }
}
