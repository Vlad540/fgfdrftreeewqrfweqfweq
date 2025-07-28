package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import org.webrtc.YuvConverter;

/* renamed from: jl7  reason: default package */
public final class jl7 {
    public final DisplayMetrics A = new DisplayMetrics();
    public final Size B = new Size(0, 0);
    public final ufc C;
    public final j8e D;
    public final ygd E;
    public final EglBase.Context a;
    public final ow0 b;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public final Context d;
    public final k40 e;
    public final zk7 f;
    public final Executor g;
    public final MediaStream h;
    public final l50 i;
    public final l50 j;
    public final String k;
    public final String l;
    public final String m;
    public final xwb n;
    public final boolean o;
    public j8f p;
    public volatile VideoSink q;
    public volatile at1 r;
    public volatile qu1 s;
    public volatile pnc t;
    public volatile noc u;
    public volatile kl7 v;
    public final boolean w = false;
    public qqe x;
    public final z7f y;
    public final goc z;

    /* JADX WARNING: type inference failed for: r7v9, types: [j8e, java.lang.Object] */
    public jl7(il7 il7) {
        j8e j8e;
        xwb xwb = il7.h;
        this.n = xwb;
        this.d = il7.d;
        PeerConnectionFactory peerConnectionFactory = il7.a;
        this.e = il7.b;
        this.f = il7.q;
        this.g = il7.c;
        String str = il7.g;
        String str2 = il7.f;
        this.m = il7.e;
        this.o = il7.p;
        this.a = il7.i;
        boolean z2 = il7.k;
        this.b = il7.j;
        this.w = il7.l;
        String l2 = wn6.l(new StringBuilder(), il7.e, "sc0");
        this.k = l2;
        String l3 = wn6.l(new StringBuilder(), il7.e, "as0");
        this.l = l3;
        MediaStream createLocalMediaStream = peerConnectionFactory.createLocalMediaStream(il7.e);
        this.h = createLocalMediaStream;
        MediaStream createLocalMediaStream2 = peerConnectionFactory.createLocalMediaStream(l2);
        if (il7.o) {
            ? obj = new Object();
            obj.o = this;
            obj.b = new Handler(Looper.getMainLooper());
            obj.c = new lde(11, obj);
            j8e = obj;
        } else {
            j8e = null;
        }
        this.D = j8e;
        this.E = il7.r;
        createLocalMediaStream = !z2 ? null : createLocalMediaStream;
        l50 l50 = new l50(peerConnectionFactory, str, createLocalMediaStream, xwb);
        this.i = l50;
        l50.l();
        l50.o(false);
        l50 l502 = new l50(peerConnectionFactory, l3, createLocalMediaStream, xwb);
        this.j = l502;
        l502.l();
        l502.o(false);
        PeerConnectionFactory peerConnectionFactory2 = peerConnectionFactory;
        z7f z7f = new z7f(peerConnectionFactory2, str2, createLocalMediaStream, il7.s, il7.t, new lyf(this), xwb);
        this.y = z7f;
        z7f.l();
        goc goc = new goc(peerConnectionFactory2, l2, createLocalMediaStream2, xwb, il7.r, il7.m);
        this.z = goc;
        goc.l();
        this.C = il7.m;
    }

    public final void a() {
        j8f j8f = this.p;
        if (j8f != null) {
            j8f.a = null;
            this.n.log("OKRTCLmsAdapter", this + ": " + d59.c(this.p) + " was cleared");
        }
    }

    public final void b(ml7 ml7) {
        j8e j8e = this.D;
        if (j8e != null && ml7 != null) {
            j8e.a = ml7;
            Handler handler = (Handler) j8e.b;
            lde lde = (lde) j8e.c;
            handler.removeCallbacks(lde);
            ((jl7) j8e.o).n.log("OKRTCLmsAdapter", "Schedule check screen dimensions in 1500ms");
            handler.postDelayed(lde, 1500);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [j8f, java.lang.Object] */
    public final void c(VideoCapturer videoCapturer) {
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForCamera for " + d59.c(videoCapturer));
        if (videoCapturer != null) {
            this.y.l();
            z7f z7f = this.y;
            Context context = this.d;
            EglBase.Context context2 = this.a;
            VideoSource videoSource = (VideoSource) ((MediaSource) z7f.o);
            CapturerObserver capturerObserver = videoSource != null ? videoSource.getCapturerObserver() : null;
            if (capturerObserver == null) {
                throw new IllegalStateException("Can't set capture in absence of video source");
            } else if (z7f.w0 == null) {
                SurfaceTextureHelper create = SurfaceTextureHelper.create("VideoCapturerThread", context2, false, new YuvConverter(), (SurfaceTextureHelper.FrameRefMonitor) null, z7f);
                z7f.w0 = create;
                z7f.x0 = new j1c(z7f, capturerObserver, false, 11);
                videoCapturer.initialize(create, context.getApplicationContext(), z7f.x0);
                if (!this.w) {
                    VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) this.y.X);
                    if (videoTrack != null) {
                        if (this.p == null) {
                            ? obj = new Object();
                            this.p = obj;
                            obj.a = this.q;
                        }
                        videoTrack.addSink(this.p);
                    }
                } else if (videoCapturer instanceof vka) {
                    ((vka) videoCapturer).Y = this.q;
                } else {
                    throw new IllegalArgumentException("Video capturer is expected to be an implementation of ".concat(vka.class.getName()));
                }
            } else {
                throw new IllegalStateException("An attempt to create surface texture screencast=false, while got one");
            }
        } else {
            throw new IllegalArgumentException("Video capturer is expected to be not null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.cc9 r12) {
        /*
            r11 = this;
            boolean r0 = r12.f
            java.lang.String r1 = "startCameraVideoCapture, start="
            java.lang.String r1 = defpackage.us8.k(r1, r0)
            xwb r2 = r11.n
            java.lang.String r3 = "OKRTCLmsAdapter"
            r2.log(r3, r1)
            k40 r1 = r11.e
            r2 = 0
            r4 = 1
            if (r1 != 0) goto L_0x002d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r1 = ": has no video capturer factory"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            xwb r1 = r11.n
            r1.log(r3, r0)
            goto L_0x012f
        L_0x002d:
            if (r0 == 0) goto L_0x0114
            at1 r0 = r11.r
            if (r0 == 0) goto L_0x0043
            at1 r0 = r11.r
            if (r0 != 0) goto L_0x0039
            goto L_0x012f
        L_0x0039:
            r0.a()
            z7f r0 = r11.y
            r0.o(r4)
            goto L_0x012f
        L_0x0043:
            r11.a()
            r11.g()
            k40 r0 = r11.e
            qu1 r1 = r11.s
            java.lang.Object r5 = r0.o
            xwb r5 = (defpackage.xwb) r5
            java.lang.String r6 = "OKRTCSvcFactory"
            java.lang.String r7 = "createCameraCapturer"
            r5.log(r6, r7)
            java.lang.Object r5 = r0.X
            zk7 r5 = (defpackage.zk7) r5
            r7 = 0
            if (r5 == 0) goto L_0x00a2
            boolean r5 = r5.d
            if (r5 != 0) goto L_0x0064
            goto L_0x00a2
        L_0x0064:
            at1 r0 = r0.b(r1)     // Catch:{ all -> 0x0069 }
            goto L_0x00ac
        L_0x0069:
            r5 = move-exception
            java.lang.Object r8 = r0.o
            xwb r8 = (defpackage.xwb) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Camera capturer creation failed. Is Camera2: "
            r9.<init>(r10)
            boolean r10 = r0.b
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.reportException(r6, r9, r5)
            boolean r5 = r0.b
            if (r5 != 0) goto L_0x0087
        L_0x0085:
            r0 = r7
            goto L_0x00ac
        L_0x0087:
            java.lang.Object r5 = r0.o
            xwb r5 = (defpackage.xwb) r5
            java.lang.String r8 = "Failed to create camera capturer using camera2 API. Fallback to camera1"
            r5.log(r6, r8)
            r0.b = r2
            at1 r0 = r0.b(r1)     // Catch:{ all -> 0x0097 }
            goto L_0x00ac
        L_0x0097:
            r1 = move-exception
            java.lang.Object r0 = r0.o
            xwb r0 = (defpackage.xwb) r0
            java.lang.String r5 = "Camera capturer creation failed after fallback to camera1"
            r0.reportException(r6, r5, r1)
            goto L_0x0085
        L_0x00a2:
            java.lang.String r1 = "No video permissions"
            java.lang.Object r0 = r0.o
            xwb r0 = (defpackage.xwb) r0
            r0.log(r6, r1)
            goto L_0x0085
        L_0x00ac:
            r11.r = r0
            at1 r0 = r11.r
            if (r0 != 0) goto L_0x00c9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r1 = ": can't get camera capturer from factory"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            xwb r1 = r11.n
            r1.log(r3, r0)
            goto L_0x0112
        L_0x00c9:
            at1 r0 = r11.r
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.f
            r0.add(r11)
            at1 r0 = r11.r     // Catch:{ RuntimeException -> 0x00e9 }
            ea6 r0 = r0.c     // Catch:{ RuntimeException -> 0x00e9 }
            java.lang.Object r0 = r0.b     // Catch:{ RuntimeException -> 0x00e9 }
            org.webrtc.CameraVideoCapturer r0 = (org.webrtc.CameraVideoCapturer) r0     // Catch:{ RuntimeException -> 0x00e9 }
            r11.c(r0)     // Catch:{ RuntimeException -> 0x00e9 }
            at1 r0 = r11.r
            if (r0 != 0) goto L_0x00e0
            goto L_0x0112
        L_0x00e0:
            r0.a()
            z7f r0 = r11.y
            r0.o(r4)
            goto L_0x0112
        L_0x00e9:
            r0 = move-exception
            xwb r1 = r11.n
            java.lang.String r5 = "camera.video.track.create"
            r1.reportException(r3, r5, r0)
            at1 r0 = r11.r
            xwb r1 = r0.e
            java.lang.String r5 = "CameraCapturerAdapter"
            java.lang.String r6 = "release"
            r1.log(r5, r6)
            java.util.concurrent.CopyOnWriteArraySet r1 = r0.f
            r1.clear()
            r0.b()
            ea6 r0 = r0.c
            java.lang.Object r0 = r0.b
            org.webrtc.CameraVideoCapturer r0 = (org.webrtc.CameraVideoCapturer) r0
            r0.dispose()
            r11.r = r7
            r11.g()
        L_0x0112:
            r0 = r4
            goto L_0x0130
        L_0x0114:
            at1 r0 = r11.r
            if (r0 == 0) goto L_0x012f
            boolean r0 = r11.o
            if (r0 == 0) goto L_0x0122
            at1 r0 = r11.r
            r0.b()
            goto L_0x012f
        L_0x0122:
            at1 r0 = r11.r
            if (r0 != 0) goto L_0x0127
            goto L_0x012f
        L_0x0127:
            r0.a()
            z7f r0 = r11.y
            r0.o(r2)
        L_0x012f:
            r0 = r2
        L_0x0130:
            boolean r12 = r12.e
            l50 r1 = r11.i
            java.lang.Object r5 = r1.X
            org.webrtc.MediaStreamTrack r5 = (org.webrtc.MediaStreamTrack) r5
            if (r5 == 0) goto L_0x013f
            boolean r5 = r5.enabled()
            goto L_0x0140
        L_0x013f:
            r5 = r2
        L_0x0140:
            if (r5 == r12) goto L_0x0151
            java.lang.String r2 = "setAudioTrackEnabled, enabled="
            java.lang.String r2 = defpackage.us8.k(r2, r12)
            xwb r5 = r11.n
            r5.log(r3, r2)
            r1.o(r12)
            r2 = r4
        L_0x0151:
            r12 = r0 | r2
            if (r12 == 0) goto L_0x016b
            java.util.concurrent.CopyOnWriteArraySet r12 = r11.c
            java.util.Iterator r12 = r12.iterator()
        L_0x015b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r12.next()
            ll7 r0 = (defpackage.ll7) r0
            r0.b(r11)
            goto L_0x015b
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl7.d(cc9):void");
    }

    public final void e() {
        Display[] displays = ((DisplayManager) this.d.getSystemService("display")).getDisplays();
        if (displays.length > 0) {
            displays[0].getRealMetrics(this.A);
        }
    }

    public final void f(VideoCapturer videoCapturer) {
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForScreenCapture for " + d59.c(videoCapturer));
        if (videoCapturer != null) {
            goc goc = this.z;
            goc.l();
            Context applicationContext = this.d.getApplicationContext();
            VideoSource videoSource = (VideoSource) ((MediaSource) goc.o);
            CapturerObserver capturerObserver = videoSource != null ? videoSource.getCapturerObserver() : null;
            if (capturerObserver != null) {
                w4g w4g = goc.w0;
                w4g.o = capturerObserver;
                SurfaceTextureHelper surfaceTextureHelper = goc.Z;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.dispose();
                }
                SurfaceTextureHelper create = SurfaceTextureHelper.create("ScreenCapturerThread", this.a);
                goc.Z = create;
                videoCapturer.initialize(create, applicationContext.getApplicationContext(), w4g);
                return;
            }
            throw new IllegalStateException("Can't set capture in absence of video source");
        }
        throw new IllegalArgumentException("videoCapturer must not be null");
    }

    public final void g() {
        j8f j8f;
        xwb xwb = this.n;
        xwb.log("OKRTCLmsAdapter", "releaseCameraVideoTrack");
        a();
        z7f z7f = this.y;
        VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) z7f.X);
        if (!(videoTrack == null || (j8f = this.p) == null)) {
            try {
                videoTrack.removeSink(j8f);
            } catch (Exception unused) {
            }
            xwb.log("OKRTCLmsAdapter", this + ": " + d59.c(this.p) + " was removed from " + d59.c(videoTrack));
        }
        this.p = null;
        z7f.m();
    }

    public final Size h() {
        at1 at1 = this.r;
        if (at1 == null) {
            return new Size(0, 0);
        }
        Size size = new Size(at1.n, at1.m);
        z7f z7f = this.y;
        z7f.getClass();
        Size b2 = z7f.y0.b(size.width, size.height);
        return b2 == null ? size : b2;
    }

    public final void i(at1 at1, boolean z2) {
        this.n.log("OKRTCLmsAdapter", us8.k("onCameraCapturerSwitchDone, switched ? ", z2));
        if (z2) {
            qqe qqe = this.x;
            if (qqe != null) {
                ((gx0) qqe.a).k(g41.Z, Boolean.TRUE);
            }
            this.g.execute(new zo5(this, 14, at1));
        }
    }

    public final void j(boolean z2) {
        l50 l50 = this.j;
        MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) l50.X;
        if ((mediaStreamTrack != null ? mediaStreamTrack.enabled() : false) != z2) {
            this.n.log("OKRTCLmsAdapter", us8.k("setAudioShareTrackEnabled, enabled=", z2));
            l50.o(z2);
        }
    }

    public final void k(VideoSink videoSink) {
        this.n.log("OKRTCLmsAdapter", "setVideoRenderer, " + d59.c(videoSink));
        this.q = videoSink;
        if (this.w) {
            at1 at1 = this.r;
            CameraVideoCapturer cameraVideoCapturer = at1 != null ? (CameraVideoCapturer) at1.c.b : null;
            if (cameraVideoCapturer instanceof vka) {
                ((vka) cameraVideoCapturer).Y = videoSink;
            } else if (cameraVideoCapturer != null) {
                throw new IllegalArgumentException("Video capturer is expected to be an implementation of ".concat(vka.class.getName()));
            }
        }
        j8f j8f = this.p;
        if (j8f != null) {
            j8f.a = videoSink;
        }
    }

    public final void l(qu1 qu1) {
        du1 du1;
        this.n.log("OKRTCLmsAdapter", "switchCamera, " + this);
        if (this.r != null) {
            at1 at1 = this.r;
            at1.e.log("CameraCapturerAdapter", "switchCamera");
            if (!at1.k) {
                at1.e.log("CameraCapturerAdapter", "Camera is not started");
                return;
            }
            int i2 = 1;
            if (at1.j) {
                synchronized (at1.g) {
                    try {
                        if (at1.j) {
                            at1.e.log("CameraCapturerAdapter", "Camera switch is pending");
                            return;
                        }
                        at1.j = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (qu1 == null) {
                if (at1.i) {
                    i2 = 2;
                }
                du1 = at1.d.I(i2);
            } else {
                du1 = at1.d.I(qu1.a);
            }
            if (du1 != null && !Objects.equals(at1.h, du1.a())) {
                String a2 = du1.a();
                ((CameraVideoCapturer) at1.c.b).switchCamera(new afc(at1, a2, false), a2);
            }
        } else if (qu1 != null) {
            this.n.log("OKRTCLmsAdapter", "Got cameraParams while no capturer created yet. Remember for future use");
            this.s = qu1;
        } else {
            this.n.log("OKRTCLmsAdapter", this + ": has no camera capturer");
        }
    }

    public final void m(Float f2, Float f3) {
        Integer num;
        float f4;
        z7f z7f = this.y;
        y4f y4f = z7f.y0;
        if (f2 != null) {
            y4f.getClass();
            int X = a24.X(((float) y4f.c) * f2.floatValue());
            num = Integer.valueOf(gwf.j(X - (X % 16), 320, 4096));
        } else {
            num = null;
        }
        y4f.e = num;
        u16 u16 = y4f.b;
        u16.invoke("Set scale restriction: " + f2 + " ");
        z7f.u();
        z7f z7f2 = this.y;
        if (f3 != null) {
            z7f2.getClass();
            if (f3.floatValue() > 0.0f && ((double) f3.floatValue()) < 1.0d) {
                f4 = f3.floatValue();
                z7f2.A0 = f4;
                z7f2.u();
            }
        }
        f4 = 1.0f;
        z7f2.A0 = f4;
        z7f2.u();
    }

    public final String toString() {
        return d59.c(this);
    }
}
