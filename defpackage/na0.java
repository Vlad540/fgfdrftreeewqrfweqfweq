package defpackage;

import android.content.Context;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: na0  reason: default package */
public final class na0 implements AutoCloseable {
    public final boolean A0;
    public final long B0;
    public final AtomicReference X;
    public final AtomicBoolean Y;
    public final k96 Z;
    public final u5g a;
    public final AtomicBoolean b;
    public final AtomicReference c;
    public final AtomicReference o;
    public final re5 w0;
    public final Executor x0;
    public final rf3 y0;
    public final boolean z0;

    public na0(re5 re5, Executor executor, rf3 rf3, boolean z, boolean z2, long j) {
        this.a = Build.VERSION.SDK_INT >= 30 ? new u5g(9, (Object) new x03()) : new u5g(9, (Object) new hk9(8));
        this.b = new AtomicBoolean(false);
        this.c = new AtomicReference((Object) null);
        this.o = new AtomicReference((Object) null);
        this.X = new AtomicReference(new xe9(21));
        this.Y = new AtomicBoolean(false);
        this.Z = new k96(Boolean.FALSE);
        if (re5 != null) {
            this.w0 = re5;
            this.x0 = executor;
            this.y0 = rf3;
            this.z0 = z;
            this.A0 = z2;
            this.B0 = j;
            return;
        }
        throw new NullPointerException("Null getOutputOptions");
    }

    public final void a(Uri uri) {
        if (this.b.get()) {
            d((rf3) this.X.getAndSet((Object) null), uri);
        }
    }

    public final void close() {
        a(Uri.EMPTY);
    }

    public final void d(rf3 rf3, Uri uri) {
        if (rf3 != null) {
            ((y03) this.a.b).close();
            rf3.accept(uri);
            return;
        }
        throw new AssertionError("Recording " + this + " has already been finalized");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof na0)) {
            return false;
        }
        na0 na0 = (na0) obj;
        if (this.w0.equals(na0.w0)) {
            Executor executor = na0.x0;
            Executor executor2 = this.x0;
            if (executor2 != null ? executor2.equals(executor) : executor == null) {
                rf3 rf3 = na0.y0;
                rf3 rf32 = this.y0;
                if (rf32 != null ? rf32.equals(rf3) : rf3 == null) {
                    if (this.z0 == na0.z0 && this.A0 == na0.A0 && this.B0 == na0.B0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void finalize() {
        try {
            ((y03) this.a.b).a();
            rf3 rf3 = (rf3) this.X.getAndSet((Object) null);
            if (rf3 != null) {
                d(rf3, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(Context context) {
        if (!this.b.getAndSet(true)) {
            ((y03) this.a.b).c("finalizeRecording");
            this.c.set(new t5c(this.w0));
            if (this.z0) {
                int i = Build.VERSION.SDK_INT;
                AtomicReference atomicReference = this.o;
                if (i >= 31) {
                    atomicReference.set(new u5c(this, context));
                } else {
                    atomicReference.set(new v5c(this));
                }
            }
        } else {
            throw new AssertionError("Recording " + this + " has already been initialized");
        }
    }

    public final int hashCode() {
        int hashCode = (this.w0.b.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        Executor executor = this.x0;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        rf3 rf3 = this.y0;
        if (rf3 != null) {
            i = rf3.hashCode();
        }
        int i2 = 1237;
        int i3 = (((hashCode2 ^ i) * 1000003) ^ (this.z0 ? 1231 : 1237)) * 1000003;
        if (this.A0) {
            i2 = 1231;
        }
        long j = this.B0;
        return ((int) ((j >>> 32) ^ j)) ^ ((i3 ^ i2) * 1000003);
    }

    public final MediaMuxer m(int i, jv1 jv1) {
        if (this.b.get()) {
            t5c t5c = (t5c) this.c.getAndSet((Object) null);
            if (t5c != null) {
                try {
                    return t5c.a(i, jv1);
                } catch (RuntimeException e) {
                    throw new IOException("Failed to create MediaMuxer by " + e, e);
                }
            } else {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
        } else {
            throw new AssertionError("Recording " + this + " has not been initialized");
        }
    }

    public final void n(f8f f8f) {
        int i;
        re5 re5 = f8f.a;
        re5 re52 = this.w0;
        if (Objects.equals(re5, re52)) {
            "Sending VideoRecordEvent ".concat(f8f.getClass().getSimpleName());
            boolean z = f8f instanceof a8f;
            if (z && (i = ((a8f) f8f).c) != 0) {
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown(");
                        sb.append(i);
                        sb.append(")");
                        break;
                }
            }
            boolean z2 = f8f instanceof d8f;
            k96 k96 = this.Z;
            if (z2 || (f8f instanceof c8f)) {
                k96.v(Boolean.TRUE);
            } else if ((f8f instanceof b8f) || z) {
                k96.v(Boolean.FALSE);
            }
            Executor executor = this.x0;
            if (executor != null && this.y0 != null) {
                try {
                    executor.execute(new hg9(this, 29, f8f));
                } catch (RejectedExecutionException unused) {
                }
            }
        } else {
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + re5 + ", Expected: " + re52 + "]");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.w0);
        sb.append(", getCallbackExecutor=");
        sb.append(this.x0);
        sb.append(", getEventListener=");
        sb.append(this.y0);
        sb.append(", hasAudioEnabled=");
        sb.append(this.z0);
        sb.append(", isPersistent=");
        sb.append(this.A0);
        sb.append(", getRecordingId=");
        return wn6.k(sb, this.B0, "}");
    }
}
