package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.LruCache;
import android.util.Range;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xx4  reason: default package */
public final class xx4 implements hx4 {
    public static final Range E = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public boolean A = false;
    public boolean B = false;
    public Future C;
    public int D;
    public final String a;
    public final Object b = new Object();
    public final boolean c;
    public final MediaFormat d;
    public final MediaCodec e;
    public final ex4 f;
    public final u2 g;
    public final ryc h;
    public final ch7 i;
    public final sn1 j;
    public final ArrayDeque k = new ArrayDeque();
    public final ArrayDeque l = new ArrayDeque();
    public final HashSet m = new HashSet();
    public final HashSet n = new HashSet();
    public final ArrayDeque o = new ArrayDeque();
    public final kje p;
    public final xhd q = new Object();
    public ix4 r = ix4.r;
    public Executor s = pa2.j();
    public Range t = E;
    public long u = 0;
    public boolean v = false;
    public Long w = null;
    public ScheduledFuture x = null;
    public vx4 y = null;
    public boolean z = false;

    /* JADX WARNING: type inference failed for: r0v6, types: [xhd, java.lang.Object] */
    public xx4(Executor executor, kx4 kx4) {
        executor.getClass();
        kx4.getClass();
        LruCache lruCache = m13.a;
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(kx4.a());
            this.e = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            this.h = new ryc(executor);
            MediaFormat b2 = kx4.b();
            this.d = b2;
            kje c2 = kx4.c();
            this.p = c2;
            if (kx4 instanceof l80) {
                this.a = "AudioEncoder";
                this.c = false;
                this.f = new tx4(this);
                u2 u2Var = new u2(codecInfo, kx4.a());
                Objects.requireNonNull(((MediaCodecInfo.CodecCapabilities) u2Var.b).getAudioCapabilities());
                this.g = u2Var;
            } else if (kx4 instanceof ib0) {
                this.a = "VideoEncoder";
                this.c = true;
                this.f = new wx4(this);
                r3f r3f = new r3f(codecInfo, kx4.a());
                if (b2.containsKey("bitrate")) {
                    int integer = b2.getInteger("bitrate");
                    int intValue = r3f.c.getBitrateRange().clamp(Integer.valueOf(integer)).intValue();
                    if (integer != intValue) {
                        b2.setInteger("bitrate", intValue);
                    }
                }
                this.g = r3f;
            } else {
                throw new Exception("Unknown encoder config type");
            }
            Objects.toString(c2);
            Objects.toString(b2);
            try {
                h();
                AtomicReference atomicReference = new AtomicReference();
                this.i = ct0.A(hwf.f(new yr0(atomicReference, 4)));
                sn1 sn1 = (sn1) atomicReference.get();
                sn1.getClass();
                this.j = sn1;
                i(1);
            } catch (MediaCodec.CodecException e2) {
                throw new Exception(e2);
            }
        } catch (IOException | IllegalArgumentException e3) {
            throw new Exception(e3);
        }
    }

    public final ch7 a() {
        switch (hr1.t(this.D)) {
            case 0:
                return new as6(1, new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                vn1 f2 = hwf.f(new yr0(atomicReference, 3));
                sn1 sn1 = (sn1) atomicReference.get();
                sn1.getClass();
                this.l.offer(sn1);
                sn1.a(new ii4(this, 9, sn1), this.h);
                c();
                return f2;
            case 7:
                return new as6(1, new IllegalStateException("Encoder is in error state."));
            case 8:
                return new as6(1, new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: ".concat(me4.r(this.D)));
        }
    }

    public final void b(int i2, String str, Throwable th) {
        switch (hr1.t(this.D)) {
            case 0:
                d(i2, str, th);
                h();
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i(8);
                l(new nx4((Object) this, i2, (Object) str, (Object) th, 0));
                return;
            default:
                return;
        }
    }

    public final void c() {
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (!arrayDeque.isEmpty()) {
                ArrayDeque arrayDeque2 = this.k;
                if (!arrayDeque2.isEmpty()) {
                    sn1 sn1 = (sn1) arrayDeque.poll();
                    Objects.requireNonNull(sn1);
                    Integer num = (Integer) arrayDeque2.poll();
                    Objects.requireNonNull(num);
                    try {
                        bx6 bx6 = new bx6(this.e, num.intValue());
                        if (sn1.b(bx6)) {
                            this.m.add(bx6);
                            ct0.A(bx6.d).c(new ii4(this, 7, bx6), this.h);
                        } else {
                            bx6.a();
                        }
                    } catch (MediaCodec.CodecException e2) {
                        b(1, e2.getMessage(), e2);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void d(int i2, String str, Throwable th) {
        ix4 ix4;
        Executor executor;
        synchronized (this.b) {
            ix4 = this.r;
            executor = this.s;
        }
        try {
            executor.execute(new g5(ix4, i2, str, th));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void e() {
        this.q.getClass();
        this.h.execute(new mx4(this, xhd.m(), 0));
    }

    public final void f() {
        Surface surface;
        HashSet hashSet;
        if (this.z) {
            this.e.stop();
            this.z = false;
        }
        this.e.release();
        ex4 ex4 = this.f;
        if (ex4 instanceof wx4) {
            wx4 wx4 = (wx4) ex4;
            synchronized (wx4.a) {
                surface = wx4.b;
                wx4.b = null;
                hashSet = new HashSet(wx4.c);
                wx4.c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        i(9);
        this.j.b((Object) null);
    }

    public final void g() {
        this.e.setParameters(wn6.g(0, "request-sync"));
    }

    public final void h() {
        cwe cwe;
        Executor executor;
        this.t = E;
        this.u = 0;
        this.o.clear();
        this.k.clear();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((sn1) it.next()).c();
        }
        this.l.clear();
        this.e.reset();
        this.z = false;
        this.A = false;
        this.B = false;
        this.v = false;
        ScheduledFuture scheduledFuture = this.x;
        Surface surface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.x = null;
        }
        Future future = this.C;
        if (future != null) {
            future.cancel(false);
            this.C = null;
        }
        vx4 vx4 = this.y;
        if (vx4 != null) {
            vx4.j = true;
        }
        vx4 vx42 = new vx4(this);
        this.y = vx42;
        this.e.setCallback(vx42);
        this.e.configure(this.d, (Surface) null, (MediaCrypto) null, 1);
        ex4 ex4 = this.f;
        if (ex4 instanceof wx4) {
            wx4 wx4 = (wx4) ex4;
            wx4.getClass();
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) xf4.a.j(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (wx4.a) {
                if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                    try {
                        if (wx4.b == null) {
                            surface = MediaCodec.createPersistentInputSurface();
                            wx4.b = surface;
                        }
                        wx4.Y.e.setInputSurface(wx4.b);
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                } else {
                    Surface surface2 = wx4.b;
                    if (surface2 != null) {
                        wx4.c.add(surface2);
                    }
                    surface = wx4.Y.e.createInputSurface();
                    wx4.b = surface;
                }
                cwe = wx4.o;
                executor = wx4.X;
            }
            if (surface != null && cwe != null && executor != null) {
                try {
                    ((ryc) executor).execute(new ii4(cwe, 17, surface));
                } catch (RejectedExecutionException unused) {
                    String str = wx4.Y.a;
                }
            }
        }
    }

    public final void i(int i2) {
        if (this.D != i2) {
            this.D = i2;
        }
    }

    public final void j() {
        ex4 ex4 = this.f;
        if (ex4 instanceof tx4) {
            ((tx4) ex4).a(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                arrayList.add(ct0.A(((bx6) it.next()).d));
            }
            ct0.K(arrayList).c(new lx4(this, 0), this.h);
        } else if (ex4 instanceof wx4) {
            try {
                if (xf4.a.j(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    vx4 vx4 = this.y;
                    ryc ryc = this.h;
                    Future future = this.C;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.C = pa2.A().schedule((Runnable) new ii4(ryc, 8, vx4), 1000, TimeUnit.MILLISECONDS);
                }
                this.e.signalEndOfInputStream();
                this.B = true;
            } catch (MediaCodec.CodecException e2) {
                b(1, e2.getMessage(), e2);
            }
        }
    }

    public final void k() {
        this.q.getClass();
        this.h.execute(new mx4(this, xhd.m(), 1));
    }

    public final void l(Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(ct0.A(((yw4) it.next()).X));
        }
        HashSet hashSet2 = this.m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(ct0.A(((bx6) it2.next()).d));
        }
        if (!arrayList.isEmpty()) {
            hashSet.size();
            hashSet2.size();
        }
        ct0.K(arrayList).c(new g5(this, arrayList, runnable, 29), this.h);
    }
}
