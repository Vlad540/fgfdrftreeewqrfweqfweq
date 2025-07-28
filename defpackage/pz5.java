package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: pz5  reason: default package */
public final class pz5 implements yc9 {
    public static final e8c w0;
    public static final e8c x0;
    public oz5 X;
    public boolean Y;
    public boolean Z;
    public final MediaMuxer a;
    public final long b;
    public final HashMap c = new HashMap();
    public final HashMap o = new HashMap();

    /* JADX WARNING: type inference failed for: r0v0, types: [ms6, ts6] */
    static {
        ? ms6 = new ms6(4);
        ms6.b("video/avc", "video/3gpp", "video/mp4v-es");
        int i = oze.a;
        if (i >= 24) {
            ms6.a("video/hevc");
        }
        if (i >= 34) {
            ms6.a("video/av01");
        }
        w0 = ms6.j();
        Object[] objArr = {"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"};
        e07.n(3, objArr);
        x0 = ws6.h(3, objArr);
    }

    public pz5(MediaMuxer mediaMuxer, long j) {
        this.a = mediaMuxer;
        this.b = oze.S(j);
    }

    public static void a(MediaMuxer mediaMuxer) {
        Class<MediaMuxer> cls = MediaMuxer.class;
        try {
            mediaMuxer.stop();
        } catch (RuntimeException e) {
            if (oze.a < 30) {
                try {
                    Field declaredField = cls.getDeclaredField("MUXER_STATE_STOPPED");
                    declaredField.setAccessible(true);
                    Integer num = (Integer) declaredField.get(mediaMuxer);
                    num.getClass();
                    Field declaredField2 = cls.getDeclaredField("mState");
                    declaredField2.setAccessible(true);
                    declaredField2.set(mediaMuxer, num);
                } catch (Exception unused) {
                }
            }
            throw e;
        }
    }

    public final void close() {
        if (!this.Z) {
            boolean z = this.Y;
            MediaMuxer mediaMuxer = this.a;
            if (!z) {
                try {
                    mediaMuxer.start();
                    this.Y = true;
                } catch (RuntimeException e) {
                    throw new Exception("Failed to start the muxer", e);
                }
            }
            if (!(this.b == -9223372036854775807L || this.X == null)) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.set(0, 0, this.b, 4);
                oz5 oz5 = this.X;
                oz5.getClass();
                j(oz5, ByteBuffer.allocateDirect(0), bufferInfo);
            }
            this.Y = false;
            try {
                a(mediaMuxer);
                mediaMuxer.release();
                this.Z = true;
            } catch (RuntimeException e2) {
                throw new Exception("Failed to stop the MediaMuxer", e2);
            } catch (Throwable th) {
                mediaMuxer.release();
                this.Z = true;
                throw th;
            }
        }
    }

    public final void h(x29 x29) {
        if (x29 instanceof u79) {
            u79 u79 = (u79) x29;
            this.a.setLocation(u79.a, u79.b);
        }
    }

    public final void j(oz5 oz5, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        oz5 oz52 = oz5;
        MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
        long j = bufferInfo2.presentationTimeUs;
        long j2 = this.b;
        if (j2 == -9223372036854775807L || oz52 != this.X || j <= j2) {
            boolean z = this.Y;
            HashMap hashMap = this.o;
            MediaMuxer mediaMuxer = this.a;
            if (!z) {
                if (oze.a < 30 && j < 0) {
                    hashMap.put(oz52, Long.valueOf(-j));
                }
                try {
                    mediaMuxer.start();
                    this.Y = true;
                } catch (RuntimeException e) {
                    throw new Exception("Failed to start the muxer", e);
                }
            }
            long longValue = hashMap.containsKey(oz52) ? ((Long) hashMap.get(oz52)).longValue() : 0;
            long j3 = j + longValue;
            HashMap hashMap2 = this.c;
            long longValue2 = hashMap2.containsKey(oz52) ? ((Long) hashMap2.get(oz52)).longValue() : 0;
            boolean z2 = oze.a > 24 || j3 >= longValue2;
            StringBuilder k = hr1.k(j3, "Samples not in presentation order (", " < ");
            k.append(longValue2);
            k.append(") unsupported on this API version");
            oyb.j(k.toString(), z2);
            hashMap2.put(oz52, Long.valueOf(j3));
            boolean z3 = longValue == 0 || j3 >= longValue2;
            StringBuilder k2 = hr1.k(j3, "Samples not in presentation order (", " < ");
            k2.append(longValue2);
            k2.append(") unsupported when using negative PTS workaround");
            oyb.j(k2.toString(), z3);
            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, j3, bufferInfo2.flags);
            try {
                oyb.k(oz52 instanceof oz5);
                mediaMuxer.writeSampleData(oz52.a, byteBuffer, bufferInfo2);
            } catch (RuntimeException e2) {
                StringBuilder k3 = hr1.k(j3, "Failed to write sample for presentationTimeUs=", ", size=");
                k3.append(bufferInfo2.size);
                throw new Exception(k3.toString(), e2);
            }
        }
    }

    public final oz5 s(xu5 xu5) {
        MediaFormat mediaFormat;
        int i = xu5.w;
        String str = xu5.n;
        str.getClass();
        boolean k = c49.k(str);
        MediaMuxer mediaMuxer = this.a;
        if (k) {
            mediaFormat = MediaFormat.createVideoFormat(str, xu5.t, xu5.u);
            iu7.H(mediaFormat, xu5.A);
            try {
                mediaMuxer.setOrientationHint(i);
            } catch (RuntimeException e) {
                throw new Exception(wn6.h(i, "Failed to set orientation hint with rotationDegrees="), e);
            }
        } else {
            mediaFormat = MediaFormat.createAudioFormat(str, xu5.C, xu5.B);
            String str2 = xu5.d;
            if (str2 != null) {
                mediaFormat.setString("language", str2);
            }
        }
        iu7.X(mediaFormat, xu5.q);
        try {
            oz5 oz5 = new oz5(mediaMuxer.addTrack(mediaFormat));
            if (k) {
                this.X = oz5;
            }
            return oz5;
        } catch (RuntimeException e2) {
            throw new Exception("Failed to add track with format=" + xu5, e2);
        }
    }
}
