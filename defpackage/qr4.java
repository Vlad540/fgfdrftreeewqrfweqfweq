package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qr4  reason: default package */
public class qr4 implements o20, i83, dfe, kja, a28, x89, c6c, vcd {
    public static final qr4 X = new qr4(5);
    public static final qr4 b = new qr4(1);
    public static final qr4 c = new qr4(2);
    public static final qr4 o = new qr4(3);
    public final /* synthetic */ int a;

    public /* synthetic */ qr4(int i) {
        this.a = i;
    }

    public static final String c(Uri uri) {
        String uri2 = uri.toString();
        return uri2.length() > 30 ? uri2.substring(0, 30).concat("...") : uri2;
    }

    public static final void e(tr6 tr6) {
        if (!(tr6.l.a <= 3)) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000b, code lost:
        r0 = r2.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
        if (r0 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
        r0 = r0.getClass().getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r0.equals("libcore.io.GaiException") != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        throw new java.net.UnknownHostException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0006, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0007, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0008, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0009, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(java.net.HttpURLConnection r2) {
        /*
            r2.connect()     // Catch:{ SecurityException -> 0x000a, IllegalArgumentException -> 0x0008, NullPointerException -> 0x0006, all -> 0x0004 }
            return
        L_0x0004:
            r2 = move-exception
            throw r2
        L_0x0006:
            r2 = move-exception
            throw r2
        L_0x0008:
            r2 = move-exception
            throw r2
        L_0x000a:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto L_0x0030
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "libcore.io.GaiException"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x002a
            java.lang.String r1 = "android.system.GaiException"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            throw r2
        L_0x002a:
            java.net.UnknownHostException r2 = new java.net.UnknownHostException
            r2.<init>()
            throw r2
        L_0x0030:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr4.g(java.net.HttpURLConnection):void");
    }

    public static e13 l(e13 e13) {
        try {
            if (e13.n0(e13) && (e13.e0() instanceof CloseableStaticBitmap)) {
                return ((CloseableStaticBitmap) e13.e0()).cloneUnderlyingBitmapReference();
            }
            e13.S(e13);
            return null;
        } finally {
            e13.S(e13);
        }
    }

    public static om0 m() {
        try {
            r4g r4g = n06.e;
            a24.p(r4g, "IBitmapDescriptorFactory is not initialized");
            e4g e4g = (e4g) r4g;
            Parcel R = e4g.R(e4g.G0(), 4);
            un6 K0 = ks9.K0(R.readStrongBinder());
            R.recycle();
            return new om0(new lhd(K0));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static om6 n(stf stf) {
        BufferedOutputStream bufferedOutputStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) stf.b).openConnection();
        Iterator it = ((ds) stf.c).iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                hm6 hm6 = (hm6) u1Var.next();
                httpURLConnection.setRequestProperty(hm6.a, hm6.b);
            } else {
                try {
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new IOException(e);
                } catch (IOException e2) {
                    httpURLConnection.disconnect();
                    throw e2;
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            }
        }
        httpURLConnection.setRequestMethod((String) stf.a);
        i6g i6g = (i6g) stf.o;
        if (i6g != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setChunkedStreamingMode(0);
        }
        g(httpURLConnection);
        if (i6g != null) {
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            fl flVar = (fl) i6g.a;
            boolean shouldGzip = flVar.shouldGzip();
            int i = i6g.b;
            wk wkVar = (wk) i6g.c;
            ql6 ql6 = (ql6) i6g.o;
            if (shouldGzip) {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                ql6.b.c(gZIPOutputStream, flVar, wkVar, i);
                gZIPOutputStream.finish();
                gZIPOutputStream.m();
            } else {
                ql6.b.c(bufferedOutputStream, flVar, wkVar, i);
            }
            bufferedOutputStream.close();
        }
        ArrayList arrayList = new ArrayList();
        int responseCode = httpURLConnection.getResponseCode();
        for (String next : httpURLConnection.getHeaderFields().keySet()) {
            if (next != null) {
                arrayList.add(new hm6(next, httpURLConnection.getHeaderField(next)));
            }
        }
        return new om6(responseCode, new ds(1, (hm6[]) arrayList.toArray(new hm6[0])), new sz5(2, httpURLConnection), 1);
    }

    public static om0 p(Bitmap bitmap) {
        try {
            r4g r4g = n06.e;
            a24.p(r4g, "IBitmapDescriptorFactory is not initialized");
            e4g e4g = (e4g) r4g;
            Parcel G0 = e4g.G0();
            u1g.b(G0, bitmap);
            Parcel R = e4g.R(G0, 6);
            un6 K0 = ks9.K0(R.readStrongBinder());
            R.recycle();
            return new om0(new lhd(K0));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static s62 r(String str) {
        pz4 pz4 = s62.X;
        pz4.getClass();
        u1 u1Var = new u1(0, pz4);
        while (u1Var.hasNext()) {
            s62 s62 = (s62) u1Var.next();
            if (hhd.f(s62.a, str)) {
                return s62;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static void s(String str, String str2, String str3) {
        if (str != null && p0e.Q(str, "{", false)) {
            try {
                t(new JSONObject(str), str2, str3);
            } catch (JSONException unused) {
            }
        }
    }

    public static void t(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject = jSONObject.optJSONObject("commands");
        if (optJSONObject != null) {
            long optLong = optJSONObject.optLong("tagShutdownMs");
            long optLong2 = optJSONObject.optLong("featureShutdownMs");
            Long valueOf = Long.valueOf(optJSONObject.optLong("globalShutdownMs"));
            Long valueOf2 = Long.valueOf(optLong2);
            Long valueOf3 = Long.valueOf(optLong);
            ht7 ht7 = new ht7();
            vx3.d(ht7, "system.shutdown.until.ts", valueOf);
            vx3.d(ht7, "system." + str + ".shutdown.until.ts", valueOf2);
            if (str2 != null) {
                vx3.d(ht7, "system." + str + '.' + str2 + ".shutdown.until.ts", valueOf3);
            }
            ht7 b2 = ht7.b();
            v2b v2b = xhd.a;
            if (v2b != null) {
                AtomicReference atomicReference = (AtomicReference) ((r7e) v2b.c).getValue();
                loop0:
                while (true) {
                    Map map = (Map) atomicReference.get();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    Iterator it = ((it7) b2.entrySet()).iterator();
                    while (((gt7) it).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((et7) it).next();
                        String str3 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value == null) {
                            linkedHashMap.remove(str3);
                        } else {
                            linkedHashMap.put(str3, value);
                        }
                    }
                    while (true) {
                        if (atomicReference.compareAndSet(map, linkedHashMap)) {
                            break loop0;
                        } else if (atomicReference.get() != map) {
                        }
                    }
                }
                v2b v2b2 = xhd.a;
                if (v2b2 != null) {
                    v2b2.s();
                    return;
                }
                throw new IllegalStateException("Tracer settings are not initialized.");
            }
            throw new IllegalStateException("Tracer settings are not initialized.");
        }
    }

    public long a() {
        throw new NoSuchElementException();
    }

    public long b() {
        throw new NoSuchElementException();
    }

    public int d(int i, CharSequence charSequence) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            efe efe = gfe.a;
            if (directionality != 0) {
                if (!(directionality == 1 || directionality == 2)) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i2 = 2;
                            break;
                    }
                }
                i2 = 0;
            }
            i2 = 1;
        }
        return i2;
    }

    public Object f(ws8 ws8) {
        long j = 0;
        try {
            j = jjd.J(ws8, 0);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t != 0) {
                if (t != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
        }
        return Long.valueOf(j);
    }

    public Object h(uwb uwb) {
        return kjd.r((Executor) uwb.f(new pjb(tc7.class, Executor.class)));
    }

    public boolean i(UnsatisfiedLinkError unsatisfiedLinkError, ild[] ildArr) {
        if (!(unsatisfiedLinkError instanceof hld) || (unsatisfiedLinkError instanceof gld)) {
            return false;
        }
        String str = ((hld) unsatisfiedLinkError).a;
        Objects.toString(unsatisfiedLinkError);
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (uue uue : ildArr) {
            if (uue instanceof uue) {
                uue uue2 = uue;
                if (!(uue2 instanceof je0)) {
                    try {
                        uue2.getClass();
                        uue2.d(2);
                    } catch (Exception unused) {
                        uue2.getClass();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public pj5 j(zqd zqd) {
        return new tj5(3, tcd.a);
    }

    public Object k(Uri uri, tz3 tz3) {
        return Long.valueOf(mze.G(new BufferedReader(new InputStreamReader(tz3)).readLine()));
    }

    public boolean next() {
        return false;
    }

    public boolean o() {
        return this instanceof bv7;
    }

    public void q(float f, float f2, float f3, nad nad) {
        nad.c(f, 0.0f);
    }

    public String toString() {
        switch (this.a) {
            case 17:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }
}
