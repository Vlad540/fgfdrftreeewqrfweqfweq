package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: n50  reason: default package */
public final class n50 implements u4c, MediaRecorder.OnInfoListener {
    public MediaRecorder X;
    public q4c Y;
    public volatile String Z;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 o;

    public n50(t97 t97, t97 t972, t97 t973) {
        r7e d = xuf.a.getAccessor().d(xzc.class);
        this.a = t97;
        this.b = d;
        this.c = t972;
        this.o = t973;
    }

    public final int a() {
        MediaRecorder mediaRecorder = this.X;
        if (mediaRecorder == null) {
            return 0;
        }
        try {
            return mediaRecorder.getMaxAmplitude();
        } catch (RuntimeException e) {
            udd.s(n50.class.getName(), "Can't getRecorderAmplitude illegal state", e);
            return 0;
        }
    }

    public final boolean b() {
        return this.X != null;
    }

    public final boolean c(int i, int i2, Integer num, String str) {
        try {
            MediaRecorder j = Build.VERSION.SDK_INT >= 31 ? p20.j((Context) this.a.getValue()) : new MediaRecorder();
            this.X = j;
            j.setAudioSource(1);
            j.setOutputFormat(6);
            j.setAudioEncoder(i);
            j.setOnInfoListener(this);
            vqc vqc = (vqc) ((xzc) this.b.getValue());
            vqc.getClass();
            j.setMaxDuration(((int) vqc.o(PmsKey.f58maxaudiolength, (long) 3600)) * 1000);
            j.setAudioSamplingRate(i2);
            if (num != null) {
                j.setAudioEncodingBitRate(num.intValue());
            }
            j.setAudioChannels(1);
            j.setOutputFile(str);
            j.prepare();
            j.start();
            return true;
        } catch (RuntimeException e) {
            String name = n50.class.getName();
            fn6 fn6 = udd.e;
            if (fn6 == null || !fn6.c()) {
                return false;
            }
            tn7 tn7 = tn7.w0;
            String message = e.getMessage();
            fn6.d(tn7, name, message + " encoder: " + i, (Throwable) null);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r0 == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        r4.X = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        if (r0 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r4 = this;
            android.media.MediaRecorder r0 = r4.X
            if (r0 == 0) goto L_0x0032
            r1 = 0
            if (r0 == 0) goto L_0x002d
            r0.stop()     // Catch:{ RuntimeException -> 0x000d }
            goto L_0x002d
        L_0x000b:
            r0 = move-exception
            goto L_0x0023
        L_0x000d:
            r0 = move-exception
            java.lang.Class<n50> r2 = defpackage.n50.class
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x000b }
            java.lang.String r3 = "Can't stopRecordAudio"
            udd.s(r2, r3, r0)     // Catch:{ all -> 0x000b }
            android.media.MediaRecorder r0 = r4.X
            if (r0 == 0) goto L_0x0020
        L_0x001d:
            r0.release()
        L_0x0020:
            r4.X = r1
            goto L_0x0032
        L_0x0023:
            android.media.MediaRecorder r2 = r4.X
            if (r2 == 0) goto L_0x002a
            r2.release()
        L_0x002a:
            r4.X = r1
            throw r0
        L_0x002d:
            android.media.MediaRecorder r0 = r4.X
            if (r0 == 0) goto L_0x0020
            goto L_0x001d
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n50.d():void");
    }

    public final void e() {
        MediaRecorder mediaRecorder = this.X;
        if (mediaRecorder != null) {
            mediaRecorder.resume();
        }
    }

    public final Object f(long j, Continuation continuation) {
        String absolutePath = ((mg5) ((bf5) this.o.getValue())).d(j).getAbsolutePath();
        jue jue = jue.a;
        if (absolutePath == null) {
            udd.q(n50.class.getName(), "Couldn't create a file for the audio message");
            return jue;
        }
        this.Z = absolutePath;
        if (!c(3, 90000, new Integer(60000), absolutePath) && !c(3, 45000, new Integer(30000), absolutePath) && !c(3, 16000, (Integer) null, absolutePath)) {
            c(0, 16000, (Integer) null, absolutePath);
        }
        return jue;
    }

    public final Object g(t4c t4c, Continuation continuation) {
        String str;
        if (!(t4c instanceof r4c) || (str = this.Z) == null) {
            return null;
        }
        r4c r4c = (r4c) t4c;
        return new l40(str, r4c.a, r4c.b);
    }

    public final void h() {
        MediaRecorder mediaRecorder = this.X;
        if (mediaRecorder != null) {
            mediaRecorder.pause();
        }
    }

    public final boolean i() {
        return ((qna) this.c.getValue()).b(qna.h);
    }

    public final void j(y3c y3c) {
        this.Y = y3c;
    }

    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        q4c q4c;
        if ((i == 800 || i == 801) && (q4c = this.Y) != null) {
            y3c y3c = (y3c) q4c;
            hge hge = new hge(z9a.f);
            h3c h3c = y3c.c;
            h3c.getClass();
            taf.o(h3c.b, new e3c(hge));
            y3c.A0.m((Object) null, new o3c(3, false, false));
            o60 o60 = (o60) y3c.z0.getValue();
            if (o60 != null) {
                o60.a();
            }
            y3c.B();
        }
    }
}
