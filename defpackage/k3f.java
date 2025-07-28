package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.webrtc.EglBase;

/* renamed from: k3f  reason: default package */
public final class k3f {
    public ByteBuffer a;
    public MediaExtractor b;
    public xc9 c;
    public int d = -1;
    public int e = -1;
    public ud f;
    public kha g;
    public it4 h;
    public nxc i;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public final Context o;
    public final g15 p;
    public final String q;
    public final String r;
    public final float s;
    public final float t;
    public final rjb u;
    public final boolean v;
    public final mod w;
    public long x;
    public long y;

    public k3f(Context context, g15 g15, String str, String str2, float f2, float f3, rjb rjb, boolean z, mod mod) {
        this.o = context;
        this.p = g15;
        this.q = str;
        this.r = str2;
        this.s = f2;
        this.t = f3;
        this.u = rjb;
        this.v = z;
        this.w = mod;
    }

    public static boolean a(Context context, g15 g15, String str, String str2, float f2, float f3, rjb rjb, boolean z, mod mod) {
        MediaCodec mediaCodec;
        MediaCodec mediaCodec2;
        kha kha;
        MediaCodec mediaCodec3;
        MediaCodec mediaCodec4;
        MediaCodec mediaCodec5;
        MediaCodec mediaCodec6;
        MediaCodec mediaCodec7;
        MediaCodec mediaCodec8;
        k3f k3f = new k3f(context, g15, str, str2, f2, f3, rjb, z, mod);
        udd.p("k3f", "Start convert with parameters: \nsrcUri: %s\ndstPath: %s\nstartPosition: %f\nendPosition: %f\nquality: %s\nmute: %s", new Object[]{str, str2, Float.valueOf(f2), Float.valueOf(f3), rjb, Boolean.valueOf(z)});
        try {
            if (!k3f.b()) {
                udd.s("k3f", "execute: failed to init recorder", (Throwable) null);
                it4 it4 = k3f.h;
                if (!(it4 == null || (mediaCodec8 = (MediaCodec) it4.a) == null)) {
                    mediaCodec8.release();
                }
                ud udVar = k3f.f;
                if (!(udVar == null || (mediaCodec7 = (MediaCodec) udVar.c) == null)) {
                    mediaCodec7.release();
                }
                MediaExtractor mediaExtractor = k3f.b;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                xc9 xc9 = k3f.c;
                if (xc9 != null) {
                    ((MediaMuxer) xc9.f).release();
                }
                nxc nxc = k3f.i;
                if (!(nxc == null || ((Surface) nxc.o) == null)) {
                    nxc.U();
                }
                kha = k3f.g;
                if (kha == null || kha.b == null) {
                    return false;
                }
                kha.a();
                return false;
            }
            long j2 = k3f.x;
            if (j2 > 0) {
                k3f.b.seekTo(j2, 0);
            } else {
                k3f.b.seekTo(0, 0);
            }
            while (!k3f.l) {
                while (true) {
                    if (k3f.j) {
                        break;
                    } else if (!Thread.currentThread().isInterrupted()) {
                        int sampleTrackIndex = k3f.b.getSampleTrackIndex();
                        if (sampleTrackIndex != -1) {
                            if (!k3f.n || !k3f.m) {
                                if (sampleTrackIndex == k3f.d) {
                                    ud udVar2 = k3f.f;
                                    MediaExtractor mediaExtractor2 = k3f.b;
                                    MediaCodec mediaCodec9 = (MediaCodec) udVar2.c;
                                    int dequeueInputBuffer = mediaCodec9.dequeueInputBuffer(10000);
                                    if (dequeueInputBuffer >= 0) {
                                        ((MediaCodec) udVar2.c).queueInputBuffer(dequeueInputBuffer, 0, mediaExtractor2.readSampleData(mediaCodec9.getInputBuffer(dequeueInputBuffer), 0), mediaExtractor2.getSampleTime(), 0);
                                        mediaExtractor2.advance();
                                    }
                                } else {
                                    int i2 = k3f.e;
                                    if (sampleTrackIndex != i2 || i2 == -1) {
                                        k3f.b.advance();
                                    } else {
                                        if (!z) {
                                            if (k3f.b.getSampleTime() < k3f.y) {
                                                if (k3f.b.getSampleTime() > k3f.x) {
                                                    k3f.a.rewind();
                                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                                    bufferInfo.offset = 0;
                                                    bufferInfo.size = k3f.b.readSampleData(k3f.a, 0);
                                                    bufferInfo.presentationTimeUs = k3f.b.getSampleTime();
                                                    bufferInfo.flags = k3f.b.getSampleFlags();
                                                    bufferInfo.presentationTimeUs -= k3f.x;
                                                    xc9 xc92 = k3f.c;
                                                    ByteBuffer byteBuffer = k3f.a;
                                                    if (xc92.b()) {
                                                        boolean z2 = xc92.c;
                                                        MediaMuxer mediaMuxer = (MediaMuxer) xc92.f;
                                                        if (!z2) {
                                                            mediaMuxer.start();
                                                            xc92.c = true;
                                                        }
                                                        xc92.a();
                                                        mediaMuxer.writeSampleData(xc92.b, byteBuffer, bufferInfo);
                                                    } else {
                                                        ((ArrayList) xc92.g).add(new wc9(xc92.b, byteBuffer, bufferInfo));
                                                    }
                                                }
                                                k3f.b.advance();
                                            }
                                        }
                                        k3f.n = true;
                                        k3f.b.advance();
                                    }
                                }
                            }
                        }
                        k3f.j = true;
                        k3f.b.release();
                        ud udVar3 = k3f.f;
                        int dequeueInputBuffer2 = ((MediaCodec) udVar3.c).dequeueInputBuffer(10000);
                        if (dequeueInputBuffer2 >= 0) {
                            ((MediaCodec) udVar3.c).queueInputBuffer(dequeueInputBuffer2, 0, 0, 0, 4);
                            udVar3.b = false;
                        } else {
                            udVar3.b = true;
                        }
                    } else {
                        throw new InterruptedException("conversion is interrupted");
                    }
                }
                if (!k3f.k) {
                    k3f.f.m();
                }
                if (!k3f.l) {
                    k3f.h.e();
                }
            }
            it4 it42 = k3f.h;
            if (!(it42 == null || (mediaCodec6 = (MediaCodec) it42.a) == null)) {
                mediaCodec6.release();
            }
            ud udVar4 = k3f.f;
            if (!(udVar4 == null || (mediaCodec5 = (MediaCodec) udVar4.c) == null)) {
                mediaCodec5.release();
            }
            MediaExtractor mediaExtractor3 = k3f.b;
            if (mediaExtractor3 != null) {
                mediaExtractor3.release();
            }
            xc9 xc93 = k3f.c;
            if (xc93 != null) {
                ((MediaMuxer) xc93.f).release();
            }
            nxc nxc2 = k3f.i;
            if (!(nxc2 == null || ((Surface) nxc2.o) == null)) {
                nxc2.U();
            }
            kha kha2 = k3f.g;
            if (!(kha2 == null || kha2.b == null)) {
                kha2.a();
            }
            udd.q("k3f", "Video convert successfully done");
            return true;
        } catch (Throwable th) {
            it4 it43 = k3f.h;
            if (!(it43 == null || (mediaCodec2 = (MediaCodec) it43.a) == null)) {
                mediaCodec2.release();
            }
            ud udVar5 = k3f.f;
            if (!(udVar5 == null || (mediaCodec = (MediaCodec) udVar5.c) == null)) {
                mediaCodec.release();
            }
            MediaExtractor mediaExtractor4 = k3f.b;
            if (mediaExtractor4 != null) {
                mediaExtractor4.release();
            }
            xc9 xc94 = k3f.c;
            if (xc94 != null) {
                ((MediaMuxer) xc94.f).release();
            }
            nxc nxc3 = k3f.i;
            if (!(nxc3 == null || ((Surface) nxc3.o) == null)) {
                nxc3.U();
            }
            kha kha3 = k3f.g;
            if (!(kha3 == null || kha3.b == null)) {
                kha3.a();
            }
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, xc9] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.view.Surface, android.media.MediaCrypto, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v0, types: [it4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v12, types: [nxc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v24 */
    public final boolean b() {
        int i2;
        boolean z;
        int i3;
        File parentFile;
        this.a = ByteBuffer.allocate(262144);
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.b = mediaExtractor;
        ? r7 = 0;
        mediaExtractor.setDataSource(this.o, Uri.parse(this.q), (Map) null);
        String str = this.r;
        File file = new File(str);
        if (!file.exists() && (parentFile = file.getParentFile()) != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        ? obj = new Object();
        obj.c = false;
        int i4 = -1;
        obj.a = -1;
        obj.b = -1;
        obj.d = false;
        obj.e = false;
        obj.g = new ArrayList();
        obj.f = new MediaMuxer(str, 0);
        this.c = obj;
        int trackCount = this.b.getTrackCount();
        int i5 = 0;
        while (true) {
            if (i5 >= trackCount) {
                i2 = i4;
                break;
            }
            MediaFormat trackFormat = this.b.getTrackFormat(i5);
            String string = trackFormat.getString("mime");
            udd.q("k3f", string);
            udd.q("k3f", trackFormat.toString());
            this.b.selectTrack(i5);
            if (string.startsWith("video/")) {
                this.d = i5;
                float f2 = (float) trackFormat.getLong("durationUs");
                this.x = (long) (this.s * f2);
                this.y = (long) (f2 * this.t);
                rjb rjb = this.u;
                int i6 = rjb.b;
                int i7 = i6 - (i6 % 4);
                int i8 = rjb.c;
                int i9 = i8 - (i8 % 4);
                try {
                    i3 = trackFormat.getInteger("frame-rate");
                } catch (Throwable unused) {
                    i3 = 15;
                }
                int i10 = rjb.d;
                ? obj2 = new Object();
                obj2.b = this;
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i7, i9);
                createVideoFormat.setInteger("frame-rate", i3);
                createVideoFormat.setInteger("bitrate", i10);
                createVideoFormat.setInteger("color-format", 2130708361);
                createVideoFormat.setInteger("i-frame-interval", 1);
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
                obj2.a = createEncoderByType;
                createEncoderByType.configure(createVideoFormat, r7, r7, 1);
                obj2.c = createEncoderByType.createInputSurface();
                createEncoderByType.start();
                this.h = obj2;
                ? obj3 = new Object();
                obj3.a = EGL14.EGL_NO_DISPLAY;
                obj3.b = EGL14.EGL_NO_CONTEXT;
                obj3.c = EGL14.EGL_NO_SURFACE;
                Surface surface = (Surface) obj2.c;
                surface.getClass();
                obj3.o = surface;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                obj3.a = eglGetDisplay;
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        if (EGL14.eglChooseConfig((EGLDisplay) obj3.a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                            obj3.b = EGL14.eglCreateContext((EGLDisplay) obj3.a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                            nxc.p("eglCreateContext");
                            if (((EGLContext) obj3.b) != null) {
                                obj3.c = EGL14.eglCreateWindowSurface((EGLDisplay) obj3.a, eGLConfigArr[0], (Surface) obj3.o, new int[]{12344}, 0);
                                nxc.p("eglCreateWindowSurface");
                                EGLSurface eGLSurface = (EGLSurface) obj3.c;
                                if (eGLSurface != null) {
                                    this.i = obj3;
                                    if (EGL14.eglMakeCurrent((EGLDisplay) obj3.a, eGLSurface, eGLSurface, (EGLContext) obj3.b)) {
                                        this.g = new kha();
                                        this.f = new ud(string, trackFormat, this.g, this);
                                        this.c.d = true;
                                        z = false;
                                    } else {
                                        throw new RuntimeException("eglMakeCurrent failed");
                                    }
                                } else {
                                    throw new RuntimeException("surface was null");
                                }
                            } else {
                                throw new RuntimeException("null context");
                            }
                        } else {
                            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
                        }
                    } else {
                        obj3.a = r7;
                        throw new RuntimeException("unable to initialize EGL14");
                    }
                } else {
                    throw new RuntimeException("unable to get EGL14 display");
                }
            } else {
                z = r7;
                if (string.startsWith("audio/")) {
                    this.e = i5;
                    if (this.v) {
                        this.c.e = false;
                        z = r7;
                    } else {
                        xc9 xc9 = this.c;
                        xc9.e = true;
                        xc9.b = ((MediaMuxer) xc9.f).addTrack(trackFormat);
                        z = r7;
                    }
                }
            }
            i2 = -1;
            if (this.e != -1 && this.d != -1) {
                break;
            }
            i5++;
            i4 = -1;
            r7 = z;
        }
        return this.d != i2;
    }
}
