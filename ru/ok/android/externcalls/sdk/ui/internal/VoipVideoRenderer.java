package ru.ok.android.externcalls.sdk.ui.internal;

import android.view.Surface;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.webrtc.RendererCommon;
import ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u001bR\u0014\u0010.\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\r008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/internal/VoipVideoRenderer;", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface;", "", "name", "<init>", "(Ljava/lang/String;)V", "Ltc1;", "renderer", "Lorg/webrtc/RendererCommon$GlDrawer;", "drawer", "Ljue;", "init", "(Ltc1;Lorg/webrtc/RendererCommon$GlDrawer;)V", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;", "listener", "addFrameSizeListener", "(Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;)V", "removeFrameSizeListener", "", "mirror", "setMirror", "(Z)V", "", "fps", "setFpsReduction", "(F)V", "disableFpsReduction", "()V", "pauseVideo", "clearImage", "Lorg/webrtc/VideoFrame;", "frame", "onFrame", "(Lorg/webrtc/VideoFrame;)V", "layoutAspectRatio", "setLayoutAspectRatio", "Landroid/view/Surface;", "surface", "createEglSurface", "(Landroid/view/Surface;)V", "Lkotlin/Function0;", "onDone", "releaseEglSurface", "(Ls16;)V", "release", "Lum1;", "callVideoDrawer", "Lum1;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ltm1;", "drawerListener", "Ltm1;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class VoipVideoRenderer implements VideoRendererInterface {
    private final um1 callVideoDrawer;
    private final tm1 drawerListener = new pdf(this);
    private final CopyOnWriteArrayList<VideoRendererInterface.FrameSizeListener> listeners = new CopyOnWriteArrayList<>();

    public VoipVideoRenderer(String str) {
        this.callVideoDrawer = new um1(str);
    }

    /* access modifiers changed from: private */
    public static final void drawerListener$lambda$1(VoipVideoRenderer voipVideoRenderer, int i, int i2) {
        for (VideoRendererInterface.FrameSizeListener onFrame : voipVideoRenderer.listeners) {
            onFrame.onFrame(i, i2);
        }
    }

    public void addFrameSizeListener(VideoRendererInterface.FrameSizeListener frameSizeListener) {
        this.listeners.add(frameSizeListener);
    }

    public void clearImage() {
        um1 um1 = this.callVideoDrawer;
        synchronized (um1.h) {
            tc1 tc1 = um1.g;
            if (tc1 != null) {
                tc1.e.d(new c0(10, um1));
            }
        }
    }

    public void createEglSurface(Surface surface) {
        um1 um1 = this.callVideoDrawer;
        synchronized (um1.h) {
            try {
                tc1 tc1 = um1.g;
                if (tc1 != null) {
                    tc1.a.log(um1.j, "External request for surface creation");
                    tc1.e.d(new av3(um1, 3, surface));
                } else {
                    um1.i = surface;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(tc1 tc1, RendererCommon.GlDrawer glDrawer) {
        um1 um1 = this.callVideoDrawer;
        synchronized (um1.h) {
            try {
                if (um1.g == null) {
                    um1.g = tc1;
                    tc1.getClass();
                    tc1.e.d(new sxf((sc1) um1, (Object) glDrawer, tc1));
                    Surface surface = um1.i;
                    if (surface != null) {
                        tc1.a.log(um1.j, "Got postponed surface request, process and reset reference");
                        tc1.e.d(new av3(um1, 3, surface));
                    }
                    um1.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        um1 um12 = this.callVideoDrawer;
        um12.c.add(this.drawerListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r4 = (org.webrtc.VideoFrame) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r4.release();
        r3.l.d.incrementAndGet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrame(org.webrtc.VideoFrame r4) {
        /*
            r3 = this;
            um1 r3 = r3.callVideoDrawer
            vm1 r0 = r3.l
            java.util.concurrent.atomic.AtomicInteger r0 = r0.c
            r0.incrementAndGet()
            java.lang.Object r0 = r3.h
            monitor-enter(r0)
            tc1 r1 = r3.g     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x0012
            monitor-exit(r0)
            goto L_0x0036
        L_0x0012:
            java.util.concurrent.atomic.AtomicReference r2 = r3.d     // Catch:{ all -> 0x0037 }
            r4.retain()     // Catch:{ all -> 0x0037 }
            java.lang.Object r4 = r2.getAndSet(r4)     // Catch:{ all -> 0x0037 }
            if (r4 != 0) goto L_0x0027
            zxf r2 = new zxf     // Catch:{ all -> 0x0037 }
            r2.<init>((defpackage.sc1) r3, (defpackage.tc1) r1)     // Catch:{ all -> 0x0037 }
            rc1 r1 = r1.e     // Catch:{ all -> 0x0037 }
            r1.c(r2)     // Catch:{ all -> 0x0037 }
        L_0x0027:
            monitor-exit(r0)
            org.webrtc.VideoFrame r4 = (org.webrtc.VideoFrame) r4
            if (r4 == 0) goto L_0x0036
            r4.release()
            vm1 r3 = r3.l
            java.util.concurrent.atomic.AtomicInteger r3 = r3.d
            r3.incrementAndGet()
        L_0x0036:
            return
        L_0x0037:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ui.internal.VoipVideoRenderer.onFrame(org.webrtc.VideoFrame):void");
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void release() {
        um1 um1 = this.callVideoDrawer;
        um1.c.remove(this.drawerListener);
        um1 um12 = this.callVideoDrawer;
        synchronized (um12.h) {
            tc1 tc1 = um12.g;
            if (tc1 != null) {
                tc1.e.d(new zxf(tc1, (sc1) um12));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void releaseEglSurface(s16 r6) {
        /*
            r5 = this;
            um1 r5 = r5.callVideoDrawer
            java.lang.Object r0 = r5.h
            monitor-enter(r0)
            r1 = 0
            r5.i = r1     // Catch:{ all -> 0x0027 }
            tc1 r1 = r5.g     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0029
            xwb r2 = r1.a     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = r5.j     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = "External request for surface release"
            r2.log(r3, r4)     // Catch:{ all -> 0x0027 }
            sxf r2 = new sxf     // Catch:{ all -> 0x0027 }
            r2.<init>((defpackage.tc1) r1, (defpackage.sc1) r5, (s16) r6)     // Catch:{ all -> 0x0027 }
            rc1 r5 = r1.e     // Catch:{ all -> 0x0027 }
            boolean r5 = r5.d(r2)     // Catch:{ all -> 0x0027 }
            if (r5 != 0) goto L_0x0025
            r6.invoke()     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r0)
            goto L_0x002d
        L_0x0027:
            r5 = move-exception
            goto L_0x002e
        L_0x0029:
            monitor-exit(r0)
            r6.invoke()
        L_0x002d:
            return
        L_0x002e:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ui.internal.VoipVideoRenderer.releaseEglSurface(s16):void");
    }

    public void removeFrameSizeListener(VideoRendererInterface.FrameSizeListener frameSizeListener) {
        this.listeners.remove(frameSizeListener);
    }

    public void setFpsReduction(float f) {
        p7 p7Var = this.callVideoDrawer.e;
        synchronized (p7Var) {
            try {
                long j = p7Var.c;
                if (f <= 0.0f) {
                    p7Var.c = Long.MAX_VALUE;
                } else {
                    p7Var.c = (long) (((float) TimeUnit.SECONDS.toNanos(1)) / f);
                }
                if (p7Var.c != j) {
                    p7Var.b = System.nanoTime();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void setLayoutAspectRatio(float f) {
        ((AtomicReference) this.callVideoDrawer.f.b).set(Float.valueOf(f));
    }

    public void setMirror(boolean z) {
        ((AtomicBoolean) this.callVideoDrawer.f.c).set(z);
    }
}
