package defpackage;

/* renamed from: djb  reason: default package */
public final class djb {
    public volatile boolean a = false;
    public final Object b = new Object();

    public final void a() {
        synchronized (this.b) {
            this.a = true;
            this.b.notify();
        }
    }

    public final void b(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = j + currentTimeMillis;
        if (j2 < currentTimeMillis) {
            synchronized (this.b) {
                while (!this.a) {
                    try {
                        this.b.wait();
                    } finally {
                    }
                }
                this.a = false;
            }
            return;
        }
        synchronized (this.b) {
            while (!this.a && currentTimeMillis < j2) {
                try {
                    this.b.wait(j2 - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                } finally {
                }
            }
            this.a = false;
        }
    }
}
