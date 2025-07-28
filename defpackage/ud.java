package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import androidx.work.WorkRequest;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.webrtc.IceCandidate;

/* renamed from: ud  reason: default package */
public final class ud implements nr6, h28, h36, zhd, i36, n8c {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object o;

    public ud() {
        this.a = 20;
        this.o = new Object();
    }

    public static boolean i(zq4 zq4, zq4 zq42) {
        e07.p("Fully specified range is not actually fully specified.", zq42.b());
        int i = zq4.a;
        int i2 = zq42.a;
        if (i == 2 && i2 == 1) {
            return false;
        }
        if (i != 2 && i != 0 && i != i2) {
            return false;
        }
        int i3 = zq4.b;
        return i3 == 0 || i3 == zq42.b;
    }

    public static boolean k(zq4 zq4, zq4 zq42, HashSet hashSet) {
        if (hashSet.contains(zq42)) {
            return i(zq4, zq42);
        }
        zq4.toString();
        zq42.toString();
        return false;
    }

    public static zq4 q(zq4 zq4, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (zq4.a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            zq4 zq42 = (zq4) it.next();
            e07.o(zq42, "Fully specified DynamicRange cannot be null.");
            e07.p("Fully specified DynamicRange must have fully defined encoding.", zq42.b());
            if (zq42.a != 1 && k(zq4, zq42, hashSet)) {
                return zq42;
            }
        }
        return null;
    }

    private final void r(Throwable th) {
    }

    public static void w(HashSet hashSet, zq4 zq4, mod mod) {
        e07.p("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set c2 = ((dr4) mod.b).c(zq4);
        if (!c2.isEmpty()) {
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet.retainAll(c2);
            if (hashSet.isEmpty()) {
                String join = TextUtils.join("\n  ", c2);
                String join2 = TextUtils.join("\n  ", hashSet2);
                throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + zq4 + "\nConstraints:\n  " + join + "\nExisting constraints:\n  " + join2);
            }
        }
    }

    public void a(Object obj) {
        int i;
        switch (this.a) {
            case 5:
                Bitmap bitmap = (Bitmap) obj;
                if (!this.b) {
                    un9 un9 = (un9) this.c;
                    un9.k(bitmap);
                    og0 og0 = new og0(un9.b());
                    ph0 ph0 = (ph0) this.o;
                    ue ueVar = (ue) ph0.c;
                    ((y44) ueVar.g).execute(new nx4((Object) ueVar, ph0.b, (Object) (kc8) ph0.o, (Object) og0, 2));
                    return;
                }
                return;
            case 12:
                cd8 cd8 = (cd8) this.o;
                cd8.getClass();
                am7.B(cd8.s, (jc8) obj);
                oze.I(cd8.s);
                if (this.b) {
                    cd8.p((ic8) this.c);
                    return;
                }
                return;
            case 13:
                cd8 cd82 = ((md8) this.o).f;
                Handler handler = cd82.l;
                boolean z = this.b;
                ic8 ic8 = (ic8) this.c;
                oze.W(handler, new zo5(cd82, ic8, new se5(3, this, (jc8) obj, ic8, z), 19));
                return;
            case 15:
                if (!this.b) {
                    ((zhd) this.c).a(obj);
                    return;
                }
                return;
            default:
                Void voidR = (Void) obj;
                h2f h2f = (h2f) this.o;
                if (((ch7) this.c) == h2f.t && (i = h2f.v) != 3) {
                    int i2 = this.b ? 1 : 2;
                    if (i2 != i) {
                        h2f.v = i2;
                        h2f.L().b(i2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            v2g r13 = (defpackage.v2g) r13
            vde r14 = (defpackage.vde) r14
            monitor-enter(r12)
            java.lang.Object r0 = r12.c     // Catch:{ all -> 0x00e1 }
            lt4 r0 = (defpackage.lt4) r0     // Catch:{ all -> 0x00e1 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x00e1 }
            ih7 r0 = (defpackage.ih7) r0     // Catch:{ all -> 0x00e1 }
            boolean r1 = r12.b     // Catch:{ all -> 0x00e1 }
            java.lang.Object r2 = r12.c     // Catch:{ all -> 0x00e1 }
            lt4 r2 = (defpackage.lt4) r2     // Catch:{ all -> 0x00e1 }
            r3 = 0
            r2.b = r3     // Catch:{ all -> 0x00e1 }
            r2.c = r3     // Catch:{ all -> 0x00e1 }
            monitor-exit(r12)     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x0021
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r14.b(r12)
            return
        L_0x0021:
            kgd r2 = r13.P0
            monitor-enter(r2)
            kgd r12 = r13.P0     // Catch:{ all -> 0x0037 }
            java.lang.Object r12 = r12.remove(r0)     // Catch:{ all -> 0x0037 }
            r8 = r12
            u2g r8 = (defpackage.u2g) r8     // Catch:{ all -> 0x0037 }
            if (r8 != 0) goto L_0x003a
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
            r14.b(r12)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            goto L_0x00de
        L_0x0037:
            r12 = move-exception
            goto L_0x00df
        L_0x003a:
            ud r12 = r8.d     // Catch:{ all -> 0x0037 }
            lt4 r12 = r12.x()     // Catch:{ all -> 0x0037 }
            r12.b = r3     // Catch:{ all -> 0x0037 }
            r12.c = r3     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x00d8
            ib5[] r12 = r13.h()     // Catch:{ all -> 0x0037 }
            if (r12 == 0) goto L_0x00b5
            r0 = 0
        L_0x004d:
            int r1 = r12.length     // Catch:{ all -> 0x0037 }
            if (r0 >= r1) goto L_0x0061
            r1 = r12[r0]     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = "location_updates_with_callback"
            java.lang.String r5 = r1.a     // Catch:{ all -> 0x0037 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x005e
            r3 = r1
            goto L_0x0061
        L_0x005e:
            int r0 = r0 + 1
            goto L_0x004d
        L_0x0061:
            if (r3 != 0) goto L_0x0064
            goto L_0x00b5
        L_0x0064:
            long r0 = r3.b()     // Catch:{ all -> 0x0037 }
            r3 = 1
            int r12 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r12 < 0) goto L_0x00b5
            android.os.IInterface r12 = r13.o()     // Catch:{ all -> 0x0037 }
            g6g r12 = (defpackage.g6g) r12     // Catch:{ all -> 0x0037 }
            java.lang.String r13 = "ILocationCallback@"
            int r0 = java.lang.System.identityHashCode(r8)     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0037 }
            int r1 = r1.length()     // Catch:{ all -> 0x0037 }
            int r1 = r1 + 18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r3.<init>(r1)     // Catch:{ all -> 0x0037 }
            r3.append(r13)     // Catch:{ all -> 0x0037 }
            r3.append(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x0037 }
            d3g r13 = new d3g     // Catch:{ all -> 0x0037 }
            r5 = 2
            r0 = 0
            r6 = 0
            r4 = r13
            r7 = r8
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0037 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            s2g r1 = new s2g     // Catch:{ all -> 0x0037 }
            r1.<init>(r0, r14)     // Catch:{ all -> 0x0037 }
            android.os.Parcel r14 = r12.G0()     // Catch:{ all -> 0x0037 }
            defpackage.t1g.b(r14, r13)     // Catch:{ all -> 0x0037 }
            r14.writeStrongBinder(r1)     // Catch:{ all -> 0x0037 }
            r13 = 89
            r12.H0(r14, r13)     // Catch:{ all -> 0x0037 }
            goto L_0x00dd
        L_0x00b5:
            android.os.IInterface r12 = r13.o()     // Catch:{ all -> 0x0037 }
            g6g r12 = (defpackage.g6g) r12     // Catch:{ all -> 0x0037 }
            t2g r10 = new t2g     // Catch:{ all -> 0x0037 }
            r10.<init>(r14)     // Catch:{ all -> 0x0037 }
            f3g r13 = new f3g     // Catch:{ all -> 0x0037 }
            r7 = 0
            r9 = 0
            r11 = 0
            r5 = 2
            r6 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0037 }
            android.os.Parcel r14 = r12.G0()     // Catch:{ all -> 0x0037 }
            defpackage.t1g.b(r14, r13)     // Catch:{ all -> 0x0037 }
            r13 = 59
            r12.H0(r14, r13)     // Catch:{ all -> 0x0037 }
            goto L_0x00dd
        L_0x00d8:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            r14.b(r12)     // Catch:{ all -> 0x0037 }
        L_0x00dd:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
        L_0x00de:
            return
        L_0x00df:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r12
        L_0x00e1:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00e1 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud.accept(java.lang.Object, java.lang.Object):void");
    }

    public lr6 c() {
        Image image;
        synchronized (this.o) {
            try {
                image = ((ImageReader) this.c).acquireLatestImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            sd sdVar = new sd(image);
            return sdVar;
        }
    }

    public void close() {
        synchronized (this.o) {
            ((ImageReader) this.c).close();
        }
    }

    public void d(xi4 xi4) {
        zhd zhd = (zhd) this.c;
        try {
            ((of3) this.o).accept(xi4);
            zhd.d(xi4);
        } catch (Throwable th) {
            ek8.a0(th);
            this.b = true;
            xi4.f();
            cw4.c(th, zhd);
        }
    }

    public void e(Throwable th) {
        switch (this.a) {
            case 5:
                if (!this.b) {
                    ez3.j0("Failed to load bitmap: " + th.getMessage());
                    return;
                }
                return;
            case 12:
                if (th instanceof UnsupportedOperationException) {
                    ez3.k0("UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    ez3.B("Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                cd8 cd8 = (cd8) this.o;
                oze.I(cd8.s);
                if (this.b) {
                    cd8.p((ic8) this.c);
                    return;
                }
                return;
            case 13:
                return;
            default:
                boolean z = th instanceof CancellationException;
                return;
        }
    }

    public int f() {
        int imageFormat;
        synchronized (this.o) {
            imageFormat = ((ImageReader) this.c).getImageFormat();
        }
        return imageFormat;
    }

    public void g(ke1 ke1, zla zla) {
        ((xwb) this.o).log("IceCandidatesHandler", "handle, participant=" + ke1 + ", client=" + zla);
        if (!this.b || !ke1.b() || zla == null || !zla.p1) {
            ((xwb) this.o).log("IceCandidatesHandler", "Cant apply ice candidates, isIceApplyPermitted=" + this.b + ", " + ke1 + ", client=" + zla);
            return;
        }
        ((xwb) this.o).log("IceCandidatesHandler", zla + " is iceable for " + ke1);
        Map map = (Map) ((HashMap) this.c).get(ke1);
        if (map != null) {
            if (Objects.equals(ke1.j, ke1.r)) {
                ((xwb) this.o).log("IceCandidatesHandler", "push all ice candidates to " + zla);
                for (Map.Entry entry : map.entrySet()) {
                    for (IceCandidate r : (List) ((wia) entry.getValue()).a) {
                        zla.r(r);
                    }
                    if (!((List) ((wia) entry.getValue()).b).isEmpty()) {
                        zla.H((IceCandidate[]) ((List) ((wia) entry.getValue()).b).toArray(new IceCandidate[((List) ((wia) entry.getValue()).b).size()]));
                    }
                }
            } else {
                wia wia = (wia) map.get(ke1.j);
                if (wia != null) {
                    for (IceCandidate r2 : (List) wia.a) {
                        zla.r(r2);
                    }
                    if (!((List) wia.b).isEmpty()) {
                        List list = (List) wia.b;
                        zla.H((IceCandidate[]) list.toArray(new IceCandidate[list.size()]));
                    }
                }
            }
            map.clear();
        }
    }

    public int getHeight() {
        int height;
        synchronized (this.o) {
            height = ((ImageReader) this.c).getHeight();
        }
        return height;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.o) {
            surface = ((ImageReader) this.c).getSurface();
        }
        return surface;
    }

    public int getWidth() {
        int width;
        synchronized (this.o) {
            width = ((ImageReader) this.c).getWidth();
        }
        return width;
    }

    public void h() {
        synchronized (this.o) {
            this.b = true;
            ((ImageReader) this.c).setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        }
    }

    public void j(mr6 mr6, Executor executor) {
        synchronized (this.o) {
            this.b = false;
            ((ImageReader) this.c).setOnImageAvailableListener(new td(this, executor, mr6), xs7.z());
        }
    }

    public int l() {
        int maxImages;
        synchronized (this.o) {
            maxImages = ((ImageReader) this.c).getMaxImages();
        }
        return maxImages;
    }

    public void m() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int dequeueOutputBuffer = ((MediaCodec) this.c).dequeueOutputBuffer(bufferInfo, WorkRequest.MIN_BACKOFF_MILLIS);
        if (this.b) {
            int dequeueInputBuffer = ((MediaCodec) this.c).dequeueInputBuffer(WorkRequest.MIN_BACKOFF_MILLIS);
            if (dequeueInputBuffer >= 0) {
                ((MediaCodec) this.c).queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                this.b = false;
            } else {
                this.b = true;
            }
        }
        if (dequeueOutputBuffer != -3 && dequeueOutputBuffer != -2 && dequeueOutputBuffer != -1) {
            if (dequeueOutputBuffer < 0) {
                udd.s("ud", "unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer, (Throwable) null);
                return;
            }
            boolean z = bufferInfo.size != 0;
            ((MediaCodec) this.c).releaseOutputBuffer(dequeueOutputBuffer, z);
            k3f k3f = (k3f) this.o;
            if (k3f != null) {
                if (z) {
                    long j = bufferInfo.presentationTimeUs;
                    long j2 = k3f.x;
                    if (j >= j2) {
                        if (j >= k3f.y) {
                            k3f.m = true;
                        } else {
                            bufferInfo.presentationTimeUs = j - j2;
                            nxc nxc = k3f.i;
                            EGLSurface eGLSurface = (EGLSurface) nxc.c;
                            if (EGL14.eglMakeCurrent((EGLDisplay) nxc.a, eGLSurface, eGLSurface, (EGLContext) nxc.b)) {
                                kha kha = k3f.g;
                                synchronized (kha.c) {
                                    while (!kha.o) {
                                        try {
                                            kha.c.wait(500);
                                        } catch (InterruptedException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                    kha.o = false;
                                }
                                kha.X.getClass();
                                hhe.a("before updateTexImage");
                                kha.a.updateTexImage();
                                kha kha2 = k3f.g;
                                kha2.getClass();
                                kha2.X.b(kha2.a, 36197);
                                nxc nxc2 = k3f.i;
                                EGLExt.eglPresentationTimeANDROID((EGLDisplay) nxc2.a, (EGLSurface) nxc2.c, bufferInfo.presentationTimeUs * 1000);
                                nxc nxc3 = k3f.i;
                                EGL14.eglSwapBuffers((EGLDisplay) nxc3.a, (EGLSurface) nxc3.c);
                            } else {
                                throw new RuntimeException("eglMakeCurrent failed");
                            }
                        }
                    }
                }
                if ((bufferInfo.flags & 4) != 0) {
                    k3f k3f2 = (k3f) this.o;
                    ((MediaCodec) k3f2.h.a).signalEndOfInputStream();
                    MediaCodec mediaCodec = (MediaCodec) k3f2.f.c;
                    if (mediaCodec != null) {
                        mediaCodec.stop();
                    }
                    MediaCodec mediaCodec2 = (MediaCodec) k3f2.f.c;
                    if (mediaCodec2 != null) {
                        mediaCodec2.release();
                    }
                    k3f2.i.U();
                    k3f2.k = true;
                }
            }
        }
    }

    public lr6 n() {
        Image image;
        synchronized (this.o) {
            try {
                image = ((ImageReader) this.c).acquireNextImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            sd sdVar = new sd(image);
            return sdVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ex b(defpackage.f28 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "createCodec:"
            p28 r1 = r6.a
            java.lang.String r1 = r1.a
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006b }
            r3.<init>(r0)     // Catch:{ Exception -> 0x006b }
            r3.append(r1)     // Catch:{ Exception -> 0x006b }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x006b }
            android.os.Trace.beginSection(r0)     // Catch:{ Exception -> 0x006b }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r1)     // Catch:{ Exception -> 0x006b }
            boolean r1 = r5.b     // Catch:{ Exception -> 0x003a }
            if (r1 == 0) goto L_0x003c
            xu5 r1 = r6.c     // Catch:{ Exception -> 0x003a }
            int r3 = defpackage.oze.a     // Catch:{ Exception -> 0x003a }
            r4 = 34
            if (r3 >= r4) goto L_0x0027
            goto L_0x003c
        L_0x0027:
            r4 = 35
            if (r3 >= r4) goto L_0x0033
            java.lang.String r1 = r1.n     // Catch:{ Exception -> 0x003a }
            boolean r1 = defpackage.c49.k(r1)     // Catch:{ Exception -> 0x003a }
            if (r1 == 0) goto L_0x003c
        L_0x0033:
            ygd r1 = new ygd     // Catch:{ Exception -> 0x003a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x003a }
            r3 = 4
            goto L_0x004c
        L_0x003a:
            r5 = move-exception
            goto L_0x006d
        L_0x003c:
            jx r1 = new jx     // Catch:{ Exception -> 0x003a }
            java.lang.Object r3 = r5.o     // Catch:{ Exception -> 0x003a }
            p3e r3 = (defpackage.p3e) r3     // Catch:{ Exception -> 0x003a }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x003a }
            android.os.HandlerThread r3 = (android.os.HandlerThread) r3     // Catch:{ Exception -> 0x003a }
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x003a }
            r3 = 0
        L_0x004c:
            ex r4 = new ex     // Catch:{ Exception -> 0x003a }
            java.lang.Object r5 = r5.c     // Catch:{ Exception -> 0x003a }
            p3e r5 = (defpackage.p3e) r5     // Catch:{ Exception -> 0x003a }
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x003a }
            android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x003a }
            r4.<init>((android.media.MediaCodec) r0, (android.os.HandlerThread) r5, (defpackage.n28) r1)     // Catch:{ Exception -> 0x003a }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0068 }
            android.media.MediaFormat r5 = r6.b     // Catch:{ Exception -> 0x0068 }
            android.view.Surface r1 = r6.d     // Catch:{ Exception -> 0x0068 }
            android.media.MediaCrypto r6 = r6.e     // Catch:{ Exception -> 0x0068 }
            defpackage.ex.m(r4, r5, r1, r6, r3)     // Catch:{ Exception -> 0x0068 }
            return r4
        L_0x0068:
            r5 = move-exception
            r2 = r4
            goto L_0x006d
        L_0x006b:
            r5 = move-exception
            r0 = r2
        L_0x006d:
            if (r2 != 0) goto L_0x0075
            if (r0 == 0) goto L_0x0078
            r0.release()
            goto L_0x0078
        L_0x0075:
            r2.release()
        L_0x0078:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud.b(f28):ex");
    }

    public void onError(Throwable th) {
        if (this.b) {
            xs7.F(th);
        } else {
            ((zhd) this.c).onError(th);
        }
    }

    public void p() {
        this.b = true;
    }

    public void s() {
        zkc zkc = (zkc) this.c;
        pc7 R = zkc.R();
        if (R.d == ob7.b) {
            R.a(new d6c(0, zkc));
            mm mmVar = (mm) this.o;
            if (!mmVar.c) {
                R.a(new v73(2, mmVar));
                mmVar.c = true;
                this.b = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public void t(Bundle bundle) {
        if (!this.b) {
            s();
        }
        pc7 R = ((zkc) this.c).R();
        if (!R.d.a(ob7.o)) {
            mm mmVar = (mm) this.o;
            if (!mmVar.c) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            } else if (!mmVar.d) {
                mmVar.a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                mmVar.d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + R.d).toString());
        }
    }

    public void u(Bundle bundle) {
        mm mmVar = (mm) this.o;
        mmVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) mmVar.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        ijc ijc = (ijc) mmVar.f;
        ijc.getClass();
        gjc gjc = new gjc(ijc);
        ijc.c.put(gjc, Boolean.FALSE);
        while (gjc.hasNext()) {
            Map.Entry entry = (Map.Entry) gjc.next();
            bundle2.putBundle((String) entry.getKey(), ((ykc) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public void v() {
        if (this.b) {
            ((Context) this.c).unregisterReceiver((n20) this.o);
            this.b = false;
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.lt4 x() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x0009 }
            lt4 r0 = (defpackage.lt4) r0     // Catch:{ all -> 0x0009 }
            monitor-exit(r1)
            return r0
        L_0x0007:
            monitor-exit(r1)     // Catch:{ all -> 0x0009 }
            throw r0
        L_0x0009:
            r0 = move-exception
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud.x():lt4");
    }

    public void y(s5g s5g) {
        synchronized (this.o) {
            try {
                if (((ArrayDeque) this.c) == null) {
                    this.c = new ArrayDeque();
                }
                ((ArrayDeque) this.c).add(s5g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        r1 = r2.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (defpackage.s5g) ((java.util.ArrayDeque) r2.c).poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r2.b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        r0.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002e, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(com.google.android.gms.tasks.Task r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.o
            monitor-enter(r0)
            java.lang.Object r1 = r2.c     // Catch:{ all -> 0x002f }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r2.b     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x000e
            goto L_0x0031
        L_0x000e:
            r1 = 1
            r2.b = r1     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
        L_0x0012:
            java.lang.Object r1 = r2.o
            monitor-enter(r1)
            java.lang.Object r0 = r2.c     // Catch:{ all -> 0x0026 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0026 }
            s5g r0 = (defpackage.s5g) r0     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0028
            r3 = 0
            r2.b = r3     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r2 = move-exception
            goto L_0x002d
        L_0x0028:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            r0.b(r3)
            goto L_0x0012
        L_0x002d:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r2
        L_0x002f:
            r2 = move-exception
            goto L_0x0033
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ud.z(com.google.android.gms.tasks.Task):void");
    }

    public /* synthetic */ ud(int i, byte b2) {
        this.a = i;
    }

    public /* synthetic */ ud(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
    }

    public /* synthetic */ ud(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj2;
        this.b = z;
        this.o = obj;
    }

    public ud(l0g l0g, lt4 lt4) {
        this.a = 19;
        this.o = l0g;
        this.b = true;
        this.c = lt4;
    }

    public ud(ke1 ke1, boolean z, w2d w2d) {
        this.a = 17;
        this.c = ke1;
        this.b = z;
        this.o = w2d;
    }

    public ud(xwb xwb) {
        this.a = 18;
        this.c = new HashMap();
        this.o = xwb;
    }

    public ud(Context context) {
        Sensor defaultSensor;
        this.a = 11;
        grd a2 = hrd.a(Float.valueOf(100.0f));
        this.c = a2;
        this.o = new t0c(a2);
        SensorManager sensorManager = (SensorManager) hq3.b(context, SensorManager.class);
        if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(5)) != null) {
            sensorManager.registerListener(new sc7(0, this), defaultSensor, 3, 2500000);
        }
    }

    public ud(String str, MediaFormat mediaFormat, kha kha, k3f k3f) {
        this.a = 4;
        this.b = false;
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(str);
        this.c = createDecoderByType;
        udd.p("ud", mediaFormat.toString(), new Object[0]);
        createDecoderByType.configure(mediaFormat, kha.b, (MediaCrypto) null, 0);
        createDecoderByType.start();
        this.o = k3f;
    }

    public ud(zkc zkc) {
        this.a = 14;
        this.c = zkc;
        this.o = new mm();
    }

    public ud(Context context, Handler handler, g45 g45) {
        this.a = 2;
        this.c = context.getApplicationContext();
        this.o = new n20(this, handler, g45, 0);
    }

    public ud(Context context, Handler handler, h45 h45) {
        this.a = 3;
        this.c = context.getApplicationContext();
        this.o = new n20(this, handler, h45, 1);
    }

    public ud(ImageReader imageReader) {
        this.a = 0;
        this.o = new Object();
        this.b = true;
        this.c = imageReader;
    }

    public ud(et1 et1) {
        this.a = 6;
        this.c = et1;
        this.o = mod.y(et1);
        int[] iArr = (int[]) et1.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (iArr[i] == 18) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.b = z;
    }

    public ud(int i) {
        this.a = 1;
        cx cxVar = new cx(i, 1);
        cx cxVar2 = new cx(i, 3);
        this.c = cxVar;
        this.o = cxVar2;
        this.b = true;
    }

    public ud(zq1 zq1, ryc ryc) {
        this.a = 7;
        this.b = false;
        this.c = new og0(6, (byte) 0);
        this.o = ryc;
    }

    public ud(cd8 cd8, ic8 ic8, boolean z, eya eya) {
        this.a = 12;
        this.o = cd8;
        this.c = ic8;
        this.b = z;
    }
}
