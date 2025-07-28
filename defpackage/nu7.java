package defpackage;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.animation.Animation;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.DataChannel;
import org.webrtc.EncodedImage;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFallback;
import ru.ok.tamtam.nano.Protos;

/* renamed from: nu7  reason: default package */
public class nu7 implements g28, s3e, oaa, g73, DataChannel.Observer, i36, kja, hx9, c39, VideoDecoder {
    public static final pv0 c = new pv0(19);
    public Object a;
    public Object b;

    public /* synthetic */ nu7(Object obj) {
        this.a = obj;
    }

    public static tn4[] h(tn4 tn4, tn4 tn42, tn4 tn43) {
        float f = tn4.a;
        float f2 = tn42.a;
        float f3 = f - f2;
        float f4 = tn4.b;
        float f5 = tn42.b;
        float f6 = f4 - f5;
        float f7 = tn43.a;
        float f8 = f2 - f7;
        float f9 = tn43.b;
        float f10 = f5 - f9;
        float f11 = (f + f2) / 2.0f;
        float f12 = (f4 + f5) / 2.0f;
        float f13 = (f2 + f7) / 2.0f;
        float f14 = (f9 + f5) / 2.0f;
        float sqrt = (float) Math.sqrt((double) ((f6 * f6) + (f3 * f3)));
        float sqrt2 = (float) Math.sqrt((double) ((f10 * f10) + (f8 * f8)));
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float f17 = sqrt2 / (sqrt + sqrt2);
        if (Float.isNaN(f17)) {
            f17 = 0.0f;
        }
        float f18 = tn42.a - ((f15 * f17) + f13);
        float f19 = f5 - ((f16 * f17) + f14);
        return new tn4[]{new tn4(f11 + f18, f12 + f19), new tn4(f13 + f18, f14 + f19)};
    }

    public static s2e q(SpannableString spannableString, int i, x2e x2e) {
        s2e s2e;
        int i2 = 0;
        s2e[] s2eArr = (s2e[]) spannableString.getSpans(0, spannableString.length(), s2e.class);
        if (s2eArr != null) {
            int length = s2eArr.length;
            while (true) {
                if (i2 >= length) {
                    s2e = null;
                    break;
                }
                s2e = s2eArr[i2];
                int spanStart = spannableString.getSpanStart(s2e);
                int spanEnd = spannableString.getSpanEnd(s2e);
                if (s2e.a.a == x2e.a && spanStart <= i && i <= spanEnd && spanEnd - spanStart > 0) {
                    break;
                }
                i2++;
            }
            if (s2e != null) {
                return s2e;
            }
        }
        return null;
    }

    public static boolean v(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            m75.n("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", new Object[]{bitmap});
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            m75.n("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", new Object[]{bitmap});
            return false;
        }
    }

    public ha0 A() {
        JSONObject jSONObject;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(s());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", (String) null);
        int i = hr1.w(5)[optInt];
        if (i != 0) {
            Long valueOf = Long.valueOf(optLong);
            Long valueOf2 = Long.valueOf(optLong2);
            String str = i == 0 ? " registrationStatus" : "";
            if (str.isEmpty()) {
                return new ha0(i, valueOf2.longValue(), valueOf.longValue(), optString, optString2, optString3, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
        throw th;
    }

    public void I(CharSequence charSequence) {
        String str;
        k77[] k77Arr = ChatsListSearchScreen.N0;
        bt2 m0 = ((ChatsListSearchScreen) this.a).m0();
        String str2 = "";
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = str2;
        }
        grd grd = m0.I0;
        if (str.equals(((js2) grd.getValue()).b)) {
            udd.q(m0.N0, "Same query for search, ignore it");
            return;
        }
        String str3 = ((js2) grd.getValue()).b;
        if (str3 != null) {
            str2 = str3;
        }
        grd.m((Object) null, new js2(is2.a, str, dp6.d, (str.length() <= 0 || !h0e.t0(str, str2)) ? hw4.a : ((js2) grd.getValue()).d, true));
        if (str.length() == 0) {
            m0.t(false);
            return;
        }
        qod qod = m0.Q0;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        m0.o.d();
        qod qod2 = m0.R0;
        if (qod2 != null) {
            qod2.cancel((CancellationException) null);
        }
        g37 g37 = (g37) m0.T0.T0(m0, bt2.U0[0]);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        m0.K0.m((Object) null, str);
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        ((vx4) this.b).k.n.remove((yw4) this.a);
    }

    public void b() {
        ((g73) this.b).b();
    }

    public void c(apa apa) {
        ((ConcurrentHashMap) this.a).put(((dt7) this.b).d(apa), apa);
    }

    public long createNative(long j) {
        return ((VideoDecoder) this.a).createNative(j);
    }

    public void d(xi4 xi4) {
        bj4.c((AtomicReference) this.a, xi4);
    }

    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, long j) {
        return ((VideoDecoder) this.a).decode(encodedImage, decodeInfo, j);
    }

    public void e(Throwable th) {
        vx4 vx4 = (vx4) this.b;
        vx4.k.n.remove((yw4) this.a);
        boolean z = th instanceof MediaCodec.CodecException;
        xx4 xx4 = vx4.k;
        if (z) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            xx4.getClass();
            xx4.b(1, codecException.getMessage(), codecException);
            return;
        }
        xx4.b(0, th.getMessage(), th);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [stf, java.lang.Object] */
    public Object get() {
        n80 n80 = (n80) this.a;
        int i = n80.c;
        if (i == -1) {
            i = 5;
        }
        int i2 = n80.b;
        if (i2 == -1) {
            i2 = 2;
        }
        e90 e90 = (e90) this.b;
        int i3 = e90.e;
        int i4 = n80.e;
        if (i4 != -1) {
            i3 = i4;
        }
        int M = gwf.M(n80.d, i3, i2, e90.d);
        List list = m80.e;
        ? obj = new Object();
        obj.a = -1;
        obj.b = -1;
        obj.c = -1;
        obj.o = -1;
        obj.a = Integer.valueOf(i);
        obj.o = Integer.valueOf(i2);
        obj.c = Integer.valueOf(i3);
        obj.b = Integer.valueOf(M);
        return obj.b();
    }

    public String getImplementationName() {
        VideoDecoder videoDecoder = (VideoDecoder) this.a;
        return videoDecoder instanceof VideoDecoderFallback ? "VideoDecoderFallback" : videoDecoder.getImplementationName();
    }

    public void i() {
        ul7 ul7 = (ul7) this.a;
        if (ul7 != null) {
            ((AtomicBoolean) ul7.b).set(true);
            ((ScheduledFuture) ul7.a).cancel(true);
        }
        this.a = null;
    }

    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        ((xwb) this.b).log("VideoDecoderLifecycleLogger", "initDecode(cores=" + settings.numberOfCores + ", size=" + settings.width + "x" + settings.height + ")");
        return ((VideoDecoder) this.a).initDecode(settings, callback);
    }

    public void j(Object obj, String str) {
        obj.getClass();
        ((HashMap) this.a).put(str, obj);
        ((ArrayList) this.b).remove(str);
    }

    public Object k(Uri uri, tz3 tz3) {
        pg5 pg5 = (pg5) ((kja) this.a).k(uri, tz3);
        List list = (List) this.b;
        return (list == null || list.isEmpty()) ? pg5 : (pg5) pg5.a(list);
    }

    public void l(Task task) {
        Exception e = task.e();
        if (e != null) {
            udd.s(((fb6) this.b).b, "fail deletePushToken", new Exception("failure to delete token", e));
        }
        ((Continuation) this.a).resumeWith(jue.a);
    }

    public w9 m() {
        return new w9((rn4) this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dx g(e28 r10) {
        /*
            r9 = this;
            o28 r0 = r10.a
            java.lang.String r0 = r0.a
            r1 = 0
            java.lang.String r2 = "createCodec:"
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0016 }
            int r4 = r3.length()     // Catch:{ Exception -> 0x0016 }
            if (r4 == 0) goto L_0x0019
            java.lang.String r2 = r2.concat(r3)     // Catch:{ Exception -> 0x0016 }
            goto L_0x001f
        L_0x0016:
            r9 = move-exception
            r0 = r1
            goto L_0x0056
        L_0x0019:
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0016 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0016 }
            r2 = r3
        L_0x001f:
            xs7.e(r2)     // Catch:{ Exception -> 0x0016 }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0016 }
            dx r2 = new dx     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r3 = r9.a     // Catch:{ Exception -> 0x0055 }
            p3e r3 = (p3e) r3     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0055 }
            r5 = r3
            android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r9 = r9.b     // Catch:{ Exception -> 0x0055 }
            p3e r9 = (p3e) r9     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r9 = r9.get()     // Catch:{ Exception -> 0x0055 }
            r6 = r9
            android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch:{ Exception -> 0x0055 }
            r7 = 0
            r8 = 1
            r3 = r2
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0055 }
            xs7.l()     // Catch:{ Exception -> 0x0052 }
            android.media.MediaFormat r9 = r10.b     // Catch:{ Exception -> 0x0052 }
            android.view.Surface r1 = r10.d     // Catch:{ Exception -> 0x0052 }
            android.media.MediaCrypto r10 = r10.e     // Catch:{ Exception -> 0x0052 }
            dx.a(r2, r9, r1, r10)     // Catch:{ Exception -> 0x0052 }
            return r2
        L_0x0052:
            r9 = move-exception
            r1 = r2
            goto L_0x0056
        L_0x0055:
            r9 = move-exception
        L_0x0056:
            if (r1 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x0061
            r0.release()
            goto L_0x0061
        L_0x005e:
            r1.release()
        L_0x0061:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu7.g(e28):dx");
    }

    public void onBufferedAmountChange(long j) {
        az3 az3 = (az3) this.b;
        Iterator it = az3.e.iterator();
        while (it.hasNext()) {
            hz5 hz5 = (hz5) it.next();
            try {
                if (az3 == hz5.b) {
                    hz5.b(hz5.g);
                }
            } catch (Throwable th) {
                az3.b.reportException("DataChannelRtcTransport", "rtc.datachannel.buffer.listen", new Exception(th));
            }
        }
    }

    public void onError(Throwable th) {
        ((g73) this.b).onError(th);
    }

    public void onMessage(DataChannel.Buffer buffer) {
        ByteBuffer byteBuffer = buffer.data;
        byte[] bArr = new byte[byteBuffer.remaining()];
        int i = buffer.binary ? 2 : 1;
        byteBuffer.get(bArr);
        az3 az3 = (az3) this.b;
        Iterator it = az3.d.iterator();
        while (it.hasNext()) {
            try {
                ((nhc) it.next()).a(az3, bArr, i);
            } catch (Throwable th) {
                az3.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.response", new Exception(th));
            }
        }
    }

    public void onStateChange() {
        boolean z = ((DataChannel) this.a).state() == DataChannel.State.OPEN;
        az3 az3 = (az3) this.b;
        Iterator it = az3.c.iterator();
        while (it.hasNext()) {
            try {
                ((mhc) it.next()).a(az3, z);
            } catch (Throwable th) {
                az3.b.reportException("DataChannelRtcTransport", "rtc.datachannel.handle.connection", new Exception(th));
            }
        }
    }

    public void p() {
        bm3.r((nea) this.b);
        zu2.c.P1().d();
    }

    public Bitmap r(int i) {
        Object obj;
        jj7 jj7 = (jj7) this.b;
        synchronized (jj7) {
            lr0 lr0 = (lr0) ((SparseArray) jj7.a).get(i);
            if (lr0 == null) {
                obj = null;
            } else {
                obj = lr0.c.pollFirst();
                if (((lr0) jj7.b) != lr0) {
                    jj7.E(lr0);
                    lr0 lr02 = (lr0) jj7.b;
                    if (lr02 == null) {
                        jj7.b = lr0;
                        jj7.c = lr0;
                    } else {
                        lr0.d = lr02;
                        lr02.a = lr0;
                        jj7.b = lr0;
                    }
                }
            }
        }
        if (obj != null) {
            synchronized (this) {
                ((HashSet) this.a).remove(obj);
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || !v(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    public VideoCodecStatus release() {
        ((xwb) this.b).log("VideoDecoderLifecycleLogger", "release()");
        return ((VideoDecoder) this.a).release();
    }

    public File s() {
        if (((File) this.a) == null) {
            synchronized (this) {
                try {
                    if (((File) this.a) == null) {
                        ih5 ih5 = (ih5) this.b;
                        ih5.a();
                        File filesDir = ih5.a.getFilesDir();
                        this.a = new File(filesDir, "PersistedInstallation." + ((ih5) this.b).c() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.a;
    }

    public List t(CharSequence charSequence) {
        if (charSequence == null || h0e.c0(charSequence)) {
            return hw4.a;
        }
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.b;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        spannableStringBuilder.append(charSequence);
        Object[] spans = spannableStringBuilder.getSpans(0, charSequence.length(), ip8.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (((ip8) obj).a.c == ep8.a) {
                arrayList.add(obj);
            }
        }
        return o23.s0(arrayList);
    }

    public void u(ha0 ha0) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", (Object) ha0.a);
            jSONObject.put("Status", hr1.t(ha0.b));
            jSONObject.put("AuthToken", (Object) ha0.c);
            jSONObject.put("RefreshToken", (Object) ha0.d);
            jSONObject.put("TokenCreationEpochInSecs", ha0.f);
            jSONObject.put("ExpiresInSecs", ha0.e);
            jSONObject.put("FisError", (Object) ha0.g);
            ih5 ih5 = (ih5) this.b;
            ih5.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", ih5.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(s())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void w(MotionEvent motionEvent) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.add(new tn4(motionEvent.getX(), motionEvent.getY()));
        int size = arrayList.size();
        rn4 rn4 = (rn4) this.a;
        if (size == 2) {
            float f = ((tn4) arrayList.get(0)).a;
            float f2 = ((tn4) arrayList.get(0)).b;
            float f3 = ((tn4) arrayList.get(1)).a;
            float f4 = ((tn4) arrayList.get(1)).b;
            rn4.a.add(new sn4(1, new float[]{f, f2, f3, f4}));
            Path path = rn4.b;
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
        }
        if (arrayList.size() > 3) {
            tn4[] h = h((tn4) arrayList.get(0), (tn4) arrayList.get(1), (tn4) arrayList.get(2));
            tn4[] h2 = h((tn4) arrayList.get(1), (tn4) arrayList.get(2), (tn4) arrayList.get(3));
            float f5 = ((tn4) arrayList.get(1)).a;
            float f6 = ((tn4) arrayList.get(1)).b;
            tn4 tn4 = h[1];
            float f7 = tn4.a;
            tn4 tn42 = h2[0];
            float f8 = tn42.a;
            float f9 = ((tn4) arrayList.get(2)).a;
            float f10 = ((tn4) arrayList.get(2)).b;
            float f11 = tn4.b;
            float f12 = tn42.b;
            rn4.a.add(new sn4(2, new float[]{f5, f6, f7, f11, f8, f12, f9, f10}));
            Path path2 = rn4.b;
            path2.moveTo(f5, f6);
            float f13 = f9;
            path2.cubicTo(f7, f11, f8, f12, f13, f10);
            arrayList.remove(0);
        }
    }

    public void x(Exception exc, boolean z) {
        this.b = null;
        HashSet hashSet = (HashSet) this.a;
        ws6 j = ws6.j(hashSet);
        hashSet.clear();
        po5 l = j.l(0);
        while (l.hasNext()) {
            v64 v64 = (v64) l.next();
            v64.getClass();
            v64.j(exc, z ? 1 : 3);
        }
    }

    public Object y() {
        Object obj;
        jj7 jj7 = (jj7) this.b;
        synchronized (jj7) {
            lr0 lr0 = (lr0) jj7.c;
            if (lr0 == null) {
                obj = null;
            } else {
                Object pollLast = lr0.c.pollLast();
                if (lr0.c.isEmpty()) {
                    jj7.E(lr0);
                    ((SparseArray) jj7.a).remove(lr0.b);
                }
                obj = pollLast;
            }
        }
        if (obj != null) {
            synchronized (this) {
                ((HashSet) this.a).remove(obj);
            }
        }
        return obj;
    }

    public void z(v64 v64) {
        ((HashSet) this.a).add(v64);
        if (((v64) this.b) == null) {
            this.b = v64;
            k35 b2 = v64.b.b();
            v64.y = b2;
            r64 r64 = v64.s;
            int i = oze.a;
            b2.getClass();
            r64.getClass();
            r64.obtainMessage(1, new t64(yi7.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), b2)).sendToTarget();
        }
    }

    public /* synthetic */ nu7(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ nu7(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public nu7(VideoDecoder videoDecoder, VideoCodecInfo videoCodecInfo, xwb xwb) {
        this.a = videoDecoder;
        this.b = xwb;
        try {
            if (videoDecoder instanceof VideoDecoderFallback) {
                xwb.log("VideoDecoderLifecycleLogger", "createDecoder(VideoDecoderFallback), codec: " + videoCodecInfo);
                return;
            }
            xwb.log("VideoDecoderLifecycleLogger", "createDecoder(" + videoDecoder.getImplementationName() + "), codec: " + videoCodecInfo);
        } catch (Throwable th) {
            xwb.logException("VideoDecoderLifecycleLogger", "createDecoder failed to read implementation name from " + videoDecoder.getClass().getName() + ", codec: " + videoCodecInfo, th);
        }
    }

    public nu7(il ilVar, Object obj) {
        this.a = obj;
        this.b = ilVar.a;
    }

    public nu7(int i, boolean z) {
        switch (i) {
            case 13:
                this.a = new HashMap();
                this.b = new ArrayList();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                this.a = new HashSet();
                return;
            default:
                this.a = new HashSet();
                this.b = new jj7(3);
                return;
        }
    }

    public nu7(dt7 dt7) {
        this.a = new ConcurrentHashMap();
        this.b = dt7;
    }

    public nu7(Animation animation) {
        this.a = animation;
        this.b = null;
    }

    public nu7(Bundle bundle) {
        this.a = "androidx.media3.session.MediaLibraryService";
        this.b = bundle;
    }
}
