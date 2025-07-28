package defpackage;

import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Range;
import android.util.Size;
import android.view.View;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: f2b  reason: default package */
public final class f2b implements yx4, bw9, JavaAudioDeviceModule.AudioRecordErrorCallback, wx7, i36 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ f2b(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 7:
                ((wx7) this.c).a(obj);
                return;
            default:
                Void voidR = (Void) obj;
                ((z9e) this.c).b.z();
                return;
        }
    }

    public void b() {
        switch (this.a) {
            case 4:
                ((d5b) this.b).i((Throwable) null);
                return;
            default:
                ((wx7) this.c).b();
                return;
        }
    }

    public void c(Object obj) {
        try {
            at7.Y((d5b) this.b, obj);
        } catch (InterruptedException unused) {
        }
    }

    public void d(xi4 xi4) {
        AtomicReference atomicReference;
        switch (this.a) {
            case 4:
                break;
            default:
                bj4.c((AtomicReference) this.b, xi4);
                return;
        }
        do {
            atomicReference = (AtomicReference) this.c;
            if (atomicReference.compareAndSet((Object) null, xi4)) {
                return;
            }
        } while (atomicReference.get() == null);
        xi4.f();
    }

    public void e(Throwable th) {
        qe4 qe4 = (qe4) this.b;
        if (!((xac) qe4.c).g) {
            int a2 = ((pw1) ((List) qe4.b).get(0)).a();
            boolean z = th instanceof ImageCaptureException;
            z9e z9e = (z9e) this.c;
            if (z) {
                s86 s86 = z9e.c;
                eb0 eb0 = new eb0(a2, (ImageCaptureException) th);
                s86.getClass();
                gt0.i();
                ((x80) s86.X).k.accept(eb0);
            } else {
                s86 s862 = z9e.c;
                eb0 eb02 = new eb0(a2, new Exception("Failed to submit capture request", th));
                s862.getClass();
                gt0.i();
                ((x80) s862.X).k.accept(eb02);
            }
            z9e.b.z();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.e2e f(long r19, java.util.ArrayList r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, defpackage.l2b r25, int r26) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            r9 = r23
            int r2 = r21.size()
            r3 = 1
            if (r2 != 0) goto L_0x0022
            e2e r10 = new e2e
            java.lang.String r6 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r0 = r10
            r1 = r19
            r7 = r24
            r8 = r25
            r9 = r23
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            return r10
        L_0x0022:
            r2 = 0
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r1g.p(r22)
            java.lang.Object r6 = r0.b
            gsc r6 = (defpackage.gsc) r6
            r7 = 0
            if (r5 != 0) goto L_0x003e
            r5 = r22
            boolean r8 = r6.h(r5, r9)
            if (r8 == 0) goto L_0x0040
            r10 = r5
            goto L_0x005f
        L_0x003e:
            r5 = r22
        L_0x0040:
            java.util.Iterator r8 = r21.iterator()
        L_0x0044:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x005e
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = r1g.c(r10, r4)
            if (r11 == 0) goto L_0x0057
            goto L_0x0044
        L_0x0057:
            boolean r11 = r6.h(r10, r9)
            if (r11 == 0) goto L_0x0044
            goto L_0x005f
        L_0x005e:
            r10 = r7
        L_0x005f:
            boolean r6 = r1g.p(r10)
            r8 = 1
            if (r6 == 0) goto L_0x0092
            boolean r6 = r1g.p(r22)
            if (r6 != 0) goto L_0x006e
            r7 = r5
            goto L_0x0093
        L_0x006e:
            java.util.Iterator r6 = r21.iterator()
        L_0x0072:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x008f
            java.lang.Object r10 = r6.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0088 }
            boolean r11 = r1g.c(r11, r4)     // Catch:{ all -> 0x0088 }
            r11 = r11 ^ r8
            if (r11 == 0) goto L_0x0072
            r7 = r10
            goto L_0x008f
        L_0x0088:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x008f:
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0093
        L_0x0092:
            r7 = r10
        L_0x0093:
            boolean r6 = r1g.p(r22)
            if (r6 != 0) goto L_0x00a2
            r6 = r26
            if (r6 != r8) goto L_0x00a2
            java.lang.String r1 = r22.trim()
            goto L_0x00ac
        L_0x00a2:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.trim()
        L_0x00ac:
            fp8 r2 = new fp8
            ep8 r14 = defpackage.ep8.a
            int r16 = r1.length()
            r13 = 0
            r15 = 0
            r17 = 0
            r10 = r2
            r11 = r19
            r10.<init>(r11, r13, r14, r15, r16, r17)
            boolean r5 = r1g.p(r22)
            if (r5 == 0) goto L_0x00d7
            boolean r5 = r1g.p(r1)
            if (r5 != 0) goto L_0x00d4
            java.lang.Object r0 = r0.c
            w6a r0 = (w6a) r0
            java.lang.CharSequence r0 = r0.b(r1, r2, r8, r8)
        L_0x00d2:
            r6 = r0
            goto L_0x00d8
        L_0x00d4:
            java.lang.String r0 = ""
            goto L_0x00d2
        L_0x00d7:
            r6 = r1
        L_0x00d8:
            e2e r10 = new e2e
            r0 = r10
            r1 = r19
            r5 = r7
            r7 = r24
            r8 = r25
            r9 = r23
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2b.f(long, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, l2b, int):e2e");
    }

    public View g(int i, int i2, int i3, int i4) {
        m9f m9f = (m9f) this.b;
        int i5 = m9f.i();
        int l = m9f.l();
        int i6 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View m = m9f.m(i);
            int d = m9f.d(m);
            int n = m9f.n(m);
            ve veVar = (ve) this.c;
            veVar.b = i5;
            veVar.c = l;
            veVar.d = d;
            veVar.e = n;
            if (i3 != 0) {
                veVar.a = i3;
                if (veVar.a()) {
                    return m;
                }
            }
            if (i4 != 0) {
                veVar.a = i4;
                if (veVar.a()) {
                    view = m;
                }
            }
            i += i6;
        }
        return view;
    }

    public zx4 h(int i) {
        HashMap hashMap = (HashMap) this.c;
        return (hashMap == null || !hashMap.containsKey(Integer.valueOf(i))) ? ((yx4) this.b).r(i) : (zx4) hashMap.get(Integer.valueOf(i));
    }

    public boolean i(View view) {
        m9f m9f = (m9f) this.b;
        int i = m9f.i();
        int l = m9f.l();
        int d = m9f.d(view);
        int n = m9f.n(view);
        ve veVar = (ve) this.c;
        veVar.b = i;
        veVar.c = l;
        veVar.d = d;
        veVar.e = n;
        veVar.a = 24579;
        return veVar.a();
    }

    public void j() {
        ihd ihd = (nhd) this.b;
        if (!ihd.h()) {
            ihd.onError(new FetcherException(4, "Failed to fetch Vimeo video"));
        }
    }

    public nqd k(btf btf) {
        nqd nqd;
        synchronized (this.b) {
            nqd = (nqd) ((LinkedHashMap) this.c).remove(btf);
        }
        return nqd;
    }

    public List l(String str) {
        List s0;
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
                    if (hhd.f(((btf) entry.getKey()).a, str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (btf remove : linkedHashMap.keySet()) {
                    ((LinkedHashMap) this.c).remove(remove);
                }
                s0 = o23.s0(linkedHashMap.values());
            } finally {
            }
        }
        return s0;
    }

    public nqd m(btf btf) {
        nqd nqd;
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                Object obj = linkedHashMap.get(btf);
                if (obj == null) {
                    obj = new nqd(btf);
                    linkedHashMap.put(btf, obj);
                }
                nqd = (nqd) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nqd;
    }

    public boolean o(int i) {
        return h(i) != null;
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 4:
                ((d5b) this.b).i(th);
                return;
            default:
                ((wx7) this.c).onError(th);
                return;
        }
    }

    public void onWebRtcAudioRecordError(String str) {
        ((m50) this.b).onWebRtcAudioRecordError(str);
        xwb xwb = (xwb) this.c;
        xwb.log("SharedPeerConnectionFac", "onWebRtcAudioRecordError: " + str);
        xwb.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordError", new Exception(rf0.h("onWebRtcAudioRecordError ", str)));
    }

    public void onWebRtcAudioRecordInitError(String str) {
        ((m50) this.b).onWebRtcAudioRecordInitError(str);
        xwb xwb = (xwb) this.c;
        xwb.log("SharedPeerConnectionFac", "onWebRtcAudioRecordInitError: " + str);
        xwb.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordInitError", new Exception(rf0.h("onWebRtcAudioRecordInitError ", str)));
    }

    public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        ((m50) this.b).onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        xwb xwb = (xwb) this.c;
        xwb.log("SharedPeerConnectionFac", "onWebRtcAudioRecordStartError: . " + str);
        xwb.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordStartError", new Exception(rf0.h("onWebRtcAudioRecordStartError ", str)));
    }

    public zx4 r(int i) {
        return h(i);
    }

    public /* synthetic */ f2b(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public f2b(IBinder iBinder) {
        this.a = 18;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new m2g(iBinder);
            this.b = null;
        } else {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            throw new RemoteException();
        }
    }

    public f2b(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new pq3(vhc.g, (mge) new hge(whc.i), Integer.valueOf(zhc.e), (Integer) null, 20);
                this.c = new pq3(vhc.c, (mge) new hge(whc.f), Integer.valueOf(zhc.t), (Integer) null, 20);
                return;
            case 8:
                this.b = new Object();
                this.c = new LinkedHashMap();
                return;
            case 13:
                return;
            default:
                t97 t97 = mqc.l;
                this.b = new r7e(new xq());
                this.c = t97;
                return;
        }
    }

    public f2b(fu1 fu1, yx4 yx4, xe6 xe6) {
        Range range;
        this.a = 2;
        this.b = yx4;
        ArrayList k = xe6.k(ExtraSupportedQualityQuirk.class);
        if (!k.isEmpty()) {
            q3f q3f = null;
            e07.p((String) null, k.size() == 1);
            ((ExtraSupportedQualityQuirk) k.get(0)).getClass();
            if (!"motorola".equalsIgnoreCase(Build.BRAND) || !"moto c".equalsIgnoreCase(Build.MODEL)) {
                q3f = Collections.emptyMap();
            } else if ("1".equals(fu1.d()) && !yx4.o(4)) {
                zx4 r = yx4.r(1);
                g90 g90 = (r == null || r.d().isEmpty()) ? null : (g90) r.d().get(0);
                if (g90 != null) {
                    try {
                        q3f = s3f.a(r3f.Z1(t2f.d(g90)), (Size) null);
                    } catch (InvalidConfigException unused) {
                    }
                    if (q3f != null) {
                        range = q3f.b1();
                    } else {
                        range = mb0.f;
                    }
                    Size size = hjd.d;
                    f90 e = f90.e(r.a(), r.b(), r.c(), Collections.singletonList(x87.D(g90, size, range)));
                    q3f = new HashMap();
                    q3f.put(4, e);
                    Size size2 = new Size(g90.e, g90.f);
                    if (size.getHeight() * size.getWidth() > size2.getHeight() * size2.getWidth()) {
                        q3f.put(1, e);
                    }
                }
            }
            if (q3f != null) {
                this.c = new HashMap(q3f);
            }
        }
    }

    public f2b(xne xne) {
        this.a = 11;
        this.b = xne.a;
        this.c = xne.b;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, ve] */
    public f2b(m9f m9f) {
        this.a = 14;
        this.b = m9f;
        ? obj = new Object();
        obj.a = 0;
        this.c = obj;
    }
}
