package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Provider;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: jj7  reason: default package */
public final class jj7 implements kj7, nl, rl, nw9, tn1, Provider, rnc, j28 {
    public static final sz0 X = new sz0(-9223372036854775807L, 2, 4, false);
    public static final sz0 Y = new sz0(-9223372036854775807L, 3, 4, false);
    public static volatile jj7 Z;
    public static final sz0 o = new sz0(-9223372036854775807L, 0, 4, false);
    public static final Object w0 = new Object();
    public final Object a;
    public Object b;
    public Object c;

    public /* synthetic */ jj7(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static jj7 A(Context context) {
        if (Z == null) {
            synchronized (w0) {
                try {
                    if (Z == null) {
                        Z = new jj7(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Z;
    }

    public static sz0 q(long j, boolean z) {
        return new sz0(j, z ? 1 : 0, 4, false);
    }

    public boolean B() {
        return ((IOException) this.c) != null;
    }

    public boolean C() {
        return ((ej7) this.b) != null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [mr5, ig7] */
    /* JADX WARNING: type inference failed for: r1v0, types: [fv4, ig7] */
    public boolean D(int i) {
        ChatsListWidget chatsListWidget = (ChatsListWidget) this.a;
        return i == chatsListWidget.D0.j() + chatsListWidget.E0.j() && chatsListWidget.F0.j() > 0;
    }

    public synchronized void E(lr0 lr0) {
        try {
            lr0 lr02 = lr0.a;
            lr0 lr03 = lr0.d;
            if (lr02 != null) {
                lr02.d = lr03;
            }
            if (lr03 != null) {
                lr03.a = lr02;
            }
            lr0.a = null;
            lr0.d = null;
            if (lr0 == ((lr0) this.b)) {
                this.b = lr03;
            }
            if (lr0 == ((lr0) this.c)) {
                this.c = lr02;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void F(hj7 hj7) {
        ej7 ej7 = (ej7) this.b;
        if (ej7 != null) {
            ej7.a(true);
        }
        ExecutorService executorService = (ExecutorService) this.a;
        if (hj7 != null) {
            executorService.execute(new vp6(7, hj7));
        }
        executorService.shutdown();
    }

    public long G(fj7 fj7, cj7 cj7, int i) {
        Looper myLooper = Looper.myLooper();
        swb.i(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ej7 ej7 = new ej7(this, myLooper, fj7, cj7, i, elapsedRealtime, 0);
        swb.h(((ej7) this.b) == null);
        this.b = ej7;
        ej7.o = null;
        ((ExecutorService) this.a).execute(ej7);
        return elapsedRealtime;
    }

    public void H(TextPaint textPaint) {
        nge nge = nte.q;
        EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.c;
        nge.c(nge, textPaint, endlessRecyclerView2.getResources().getDisplayMetrics());
        textPaint.setColor(km4.y0.r(endlessRecyclerView2).getText().h);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, p10] */
    public p10 I() {
        ? obj = new Object();
        obj.a = new ArrayList((List) this.a);
        obj.b = (vw6) this.b;
        return obj;
    }

    public void a(ahc ahc) {
        ((Handler) this.c).post(new zwf(this, ahc, 1));
    }

    public void b(long j, int i, int i2, int i3) {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    public void c() {
        IOException iOException;
        IOException iOException2 = (IOException) this.c;
        if (iOException2 == null) {
            ej7 ej7 = (ej7) this.b;
            if (ej7 != null && (iOException = ej7.o) != null && ej7.X > ej7.b) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public void d(int i, long j) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, j);
    }

    public void e() {
        ((t55) this.a).e();
        ((te4) this.b).e = true;
    }

    public int f() {
        return ((MediaCodec) this.a).dequeueInputBuffer(0);
    }

    public void flush() {
        ((MediaCodec) this.a).flush();
    }

    public int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && oze.a < 21) {
                this.c = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public Object get() {
        return new fnc(((Integer) ((Provider) this.c).get()).intValue(), (Context) ((Provider) this.a).get(), (String) ((Provider) this.b).get());
    }

    public ByteBuffer getInputBuffer(int i) {
        return oze.a >= 21 ? ((MediaCodec) this.a).getInputBuffer(i) : ((ByteBuffer[]) this.b)[i];
    }

    public ByteBuffer getOutputBuffer(int i) {
        return oze.a >= 21 ? ((MediaCodec) this.a).getOutputBuffer(i) : ((ByteBuffer[]) this.c)[i];
    }

    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.a).getOutputFormat();
    }

    public ml getSessionInfo() {
        try {
            lqc y = y();
            y.getClass();
            List arrayList = new ArrayList();
            String string = y.g.getString("user.callSession", (String) null);
            if (string != null) {
                arrayList = Arrays.asList(TextUtils.split(string, ","));
            }
            if (arrayList == null) {
                return null;
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() < 3) {
                return null;
            }
            return new ml((String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2));
        } catch (Throwable th) {
            udd.o("OKConfigStoreTag", "Call session info cache error: ", th);
            return null;
        }
    }

    public void h(int i) {
        ((MediaCodec) this.a).setVideoScalingMode(i);
    }

    public void i(int i, nw3 nw3, long j, int i2) {
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) nw3.i, j, i2);
    }

    public void j(Surface surface) {
        ((MediaCodec) this.a).setOutputSurface(surface);
    }

    public void l() {
        mnc mnc = (mnc) ((s16) this.a).invoke();
        if (mnc != null) {
            ((xg9) ((t97) this.c).getValue()).f(mnc, (eja) ((s16) this.b).invoke());
        }
    }

    public void m(hl hlVar) {
        ql6 ql6 = (ql6) this.c;
        if (ql6 instanceof ql6) {
            ql6.e = hlVar;
        }
    }

    public ql n() {
        String str = (String) xs7.M(bw4.a, new a21(this, (Continuation) null));
        vqc vqc = (xzc) ((t97) this.b).getValue();
        vqc.getClass();
        String v = vqc.v(PmsKey.calls-endpoint, (String) null);
        if (v == null) {
            v = BuildConfig.FLAVOR;
        }
        return new ql(str, v);
    }

    public void o() {
        ej7 ej7 = (ej7) this.b;
        swb.i(ej7);
        ej7.a(false);
    }

    public void p(i38 i38, Handler handler) {
        ((MediaCodec) this.a).setOnFrameRenderedListener(new bx(this, i38, 3), handler);
    }

    public void r(Bundle bundle) {
        HashSet hashSet;
        String string = ((Context) this.c).getString(cvb.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = (HashSet) this.b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (tw6.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    s((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void release() {
        MediaCodec mediaCodec = (MediaCodec) this.a;
        this.b = null;
        this.c = null;
        try {
            int i = oze.a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    public void releaseOutputBuffer(int i, boolean z) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, z);
    }

    public Object s(Class cls, HashSet hashSet) {
        Object obj;
        if (kne.a()) {
            try {
                Trace.beginSection(am7.C(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = (HashMap) this.a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                tw6 tw6 = (tw6) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> a2 = tw6.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            s(cls2, hashSet);
                        }
                    }
                }
                obj = tw6.b((Context) this.c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }

    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    public void setSessionInfo(ml mlVar) {
        if (mlVar == null) {
            lqc y = y();
            hw4 hw4 = hw4.a;
            lqc lqc = y;
            lqc.getClass();
            String join = TextUtils.join(",", hw4);
            te5 te5 = (te5) lqc.g.edit();
            te5.putString("user.callSession", join);
            te5.apply();
            return;
        }
        lqc y2 = y();
        List B = p23.B(mlVar.a, mlVar.b, mlVar.c);
        lqc lqc2 = y2;
        lqc2.getClass();
        String join2 = TextUtils.join(",", B);
        te5 te52 = (te5) lqc2.g.edit();
        te52.putString("user.callSession", join2);
        te52.apply();
    }

    public void t(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.a;
        thb thb = new thb(byteArrayOutputStream, map, (Map) this.b, (is9) this.c);
        is9 is9 = (is9) map.get(obj.getClass());
        if (is9 != null) {
            is9.a(obj, thb);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    public o10 u(int i) {
        if (i < 0) {
            return null;
        }
        List list = (List) this.a;
        if (i >= list.size()) {
            return null;
        }
        return (o10) list.get(i);
    }

    public int v() {
        List list = (List) this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public o10 w(String str) {
        for (o10 o10 : (List) this.a) {
            if (r1g.c(str, o10.q)) {
                return o10;
            }
        }
        return null;
    }

    public o10 x(j10 j10) {
        for (o10 o10 : (List) this.a) {
            if (o10.a == j10) {
                return o10;
            }
        }
        return null;
    }

    public f03 y() {
        return (f03) ((t97) this.a).getValue();
    }

    public String z(sn1 sn1) {
        sn1.a(new re(29, this), pa2.j());
        ((ud6) this.c).a.set(sn1);
        return "HandlerScheduledFuture-" + ((Callable) this.b).toString();
    }

    public jj7(xwb xwb) {
        this.b = new CopyOnWriteArrayList();
        this.c = new Handler(Looper.getMainLooper());
        if (xwb != null) {
            this.a = xwb;
            return;
        }
        throw new IllegalArgumentException("Illegal 'uncaughtExceptionHandler' value: null");
    }

    public jj7(s16 s16, opd opd, int i) {
        opd = (i & 2) != 0 ? new opd(2) : opd;
        r7e d = wrd.a.getAccessor().d(xg9.class);
        this.a = s16;
        this.b = opd;
        this.c = d;
    }

    public jj7(mnc mnc) {
        this((s16) new u5b(26, mnc), (s16) null, 6);
    }

    public jj7(ea6 ea6) {
        gk9 gk9 = oyb.a;
        hk9 hk9 = udd.c;
        this.a = ea6;
        this.b = gk9;
        this.c = hk9;
    }

    public jj7(int i) {
        switch (i) {
            case 8:
                Bitmap[] bitmapArr = new Bitmap[25];
                for (int i2 = 0; i2 < 25; i2++) {
                    bitmapArr[i2] = null;
                }
                this.a = bitmapArr;
                Integer num = 50;
                this.b = new xm0(a24.W(num.doubleValue() * ((double) 1048576)), 0);
                this.c = new kr7(100);
                return;
            default:
                this.a = new SparseArray();
                return;
        }
    }

    public jj7(p10 p10) {
        this.a = p10.a;
        this.b = p10.b;
        this.c = p10.c;
    }

    public jj7(Context context) {
        this.c = context.getApplicationContext();
        this.b = new HashSet();
        this.a = new HashMap();
    }

    public jj7(int i, String str, ArrayList arrayList, byte[] bArr) {
        List list;
        this.a = str;
        if (arrayList == null) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(arrayList);
        }
        this.b = list;
        this.c = bArr;
    }

    public jj7(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (oze.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: i50[]} */
    /* JADX WARNING: type inference failed for: r1v0, types: [pld, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public jj7(defpackage.i50... r6) {
        /*
            r5 = this;
            fgd r0 = new fgd
            r0.<init>()
            pld r1 = new pld
            r1.<init>()
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.c = r2
            r1.d = r2
            g50 r2 = defpackage.g50.e
            r1.e = r2
            r1.f = r2
            r1.g = r2
            r1.h = r2
            java.nio.ByteBuffer r2 = defpackage.i50.a
            r1.k = r2
            java.nio.ShortBuffer r3 = r2.asShortBuffer()
            r1.l = r3
            r1.m = r2
            r2 = -1
            r1.b = r2
            r5.<init>()
            int r2 = r6.length
            int r2 = r2 + 2
            i50[] r2 = new defpackage.i50[r2]
            r5.a = r2
            r3 = 0
            int r4 = r6.length
            java.lang.System.arraycopy(r6, r3, r2, r3, r4)
            r5.b = r0
            r5.c = r1
            int r5 = r6.length
            r2[r5] = r0
            int r5 = r6.length
            int r5 = r5 + 1
            r2[r5] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj7.<init>(i50[]):void");
    }

    public jj7(ud6 ud6, Handler handler, Callable callable) {
        this.c = ud6;
        this.a = handler;
        this.b = callable;
    }

    public jj7(String str) {
        String concat = str.length() != 0 ? "ExoPlayer:Loader:".concat(str) : new String("ExoPlayer:Loader:");
        int i = mze.a;
        this.a = Executors.newSingleThreadExecutor(new v93(1, concat));
    }

    public jj7(u48 u48) {
        this.c = u48;
        this.a = new g18(this);
    }
}
