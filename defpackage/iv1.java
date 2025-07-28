package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: iv1  reason: default package */
public final class iv1 implements gde {
    public static final z80 X = new z80(Executor.class, (Object) null, "camerax.core.appConfig.cameraExecutor");
    public static final z80 Y = new z80(Handler.class, (Object) null, "camerax.core.appConfig.schedulerHandler");
    public static final z80 Z = new z80(Integer.TYPE, (Object) null, "camerax.core.appConfig.minimumLoggingLevel");
    public static final z80 b = new z80(hs1.class, (Object) null, "camerax.core.appConfig.cameraFactoryProvider");
    public static final z80 c = new z80(is1.class, (Object) null, "camerax.core.appConfig.deviceSurfaceManagerProvider");
    public static final z80 o = new z80(hs1.class, (Object) null, "camerax.core.appConfig.useCaseConfigFactoryProvider");
    public static final z80 w0 = new z80(wu1.class, (Object) null, "camerax.core.appConfig.availableCamerasLimiter");
    public static final z80 x0 = new z80(Long.TYPE, (Object) null, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming");
    public static final z80 y0 = new z80(ucc.class, (Object) null, "camerax.core.appConfig.cameraProviderInitRetryPolicy");
    public static final z80 z0 = new z80(alb.class, (Object) null, "camerax.core.appConfig.quirksSettings");
    public final hga a;

    public iv1(hga hga) {
        this.a = hga;
    }

    public final wu1 a() {
        Object obj;
        z80 z80 = w0;
        hga hga = this.a;
        hga.getClass();
        try {
            obj = hga.h(z80);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (wu1) obj;
    }

    public final hs1 c() {
        Object obj;
        z80 z80 = b;
        hga hga = this.a;
        hga.getClass();
        try {
            obj = hga.h(z80);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (hs1) obj;
    }

    public final long e() {
        z80 z80 = x0;
        long j = -1L;
        hga hga = this.a;
        hga.getClass();
        try {
            j = hga.h(z80);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) j).longValue();
    }

    public final is1 g() {
        Object obj;
        z80 z80 = c;
        hga hga = this.a;
        hga.getClass();
        try {
            obj = hga.h(z80);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (is1) obj;
    }

    public final ia3 getConfig() {
        return this.a;
    }

    public final hs1 j() {
        Object obj;
        z80 z80 = o;
        hga hga = this.a;
        hga.getClass();
        try {
            obj = hga.h(z80);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (hs1) obj;
    }
}
