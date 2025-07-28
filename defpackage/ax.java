package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ax  reason: default package */
public class ax extends xje {
    public static final long h;
    public static final long i;
    public static ax j;
    public boolean e;
    public ax f;
    public long g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [ax, java.lang.Object] */
    public final void i() {
        ax axVar;
        if (!this.e) {
            long j2 = this.c;
            boolean z = this.a;
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 != 0 || z) {
                this.e = true;
                synchronized (ax.class) {
                    try {
                        if (j == null) {
                            j = new Object();
                            xw xwVar = new xw("Okio Watchdog");
                            xwVar.setDaemon(true);
                            xwVar.start();
                        }
                        long nanoTime = System.nanoTime();
                        if (i2 != 0 && z) {
                            this.g = Math.min(j2, c() - nanoTime) + nanoTime;
                        } else if (i2 != 0) {
                            this.g = j2 + nanoTime;
                        } else if (z) {
                            this.g = c();
                        } else {
                            throw new AssertionError();
                        }
                        long j3 = this.g - nanoTime;
                        ax axVar2 = j;
                        while (true) {
                            axVar = axVar2.f;
                            if (axVar == null) {
                                break;
                            } else if (j3 < axVar.g - nanoTime) {
                                break;
                            } else {
                                axVar2 = axVar;
                            }
                        }
                        this.f = axVar;
                        axVar2.f = this;
                        if (axVar2 == j) {
                            ax.class.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean j() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        synchronized (ax.class) {
            ax axVar = j;
            while (axVar != null) {
                ax axVar2 = axVar.f;
                if (axVar2 == this) {
                    axVar.f = this.f;
                    this.f = null;
                    return false;
                }
                axVar = axVar2;
            }
            return true;
        }
    }

    public IOException k(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void l() {
    }
}
