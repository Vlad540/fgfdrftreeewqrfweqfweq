package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.media3.effect.DefaultVideoFrameProcessor;
import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jg8  reason: default package */
public final class jg8 implements k13, of3, p0c, ne8 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ jg8(int i) {
        this.a = i;
    }

    public static void A(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void B(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static ArrayList u(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(os.a);
        arrayList2.add(os.c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (os.a(size, (Rational) it2.next(), hjd.c)) {
                            break;
                        }
                    } else {
                        arrayList2.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational w(int i, boolean z) {
        if (i == 0) {
            return z ? os.a : os.b;
        }
        if (i != 1) {
            return null;
        }
        return z ? os.c : os.d;
    }

    public static HashMap x(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = u(arrayList).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (os.a(size, rational, hjd.c)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public void C() {
        Integer num;
        c83 c83 = (c83) this.c;
        ArrayList arrayList = c83.d;
        String str = (String) this.b;
        if (!arrayList.contains(str) && (num = (Integer) c83.b.remove(str)) != null) {
            c83.a.remove(num);
        }
        c83.e.remove(str);
        LinkedHashMap linkedHashMap = c83.f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = c83.g;
        if (bundle.containsKey(str)) {
            Objects.toString((h8) ek8.E(bundle, str, h8.class));
            bundle.remove(str);
        }
        hr1.r(c83.c.get(str));
    }

    /* JADX INFO: finally extract failed */
    public void D(j9 j9Var) {
        File file = (File) this.c;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                FilterOutputStream filterOutputStream = new FilterOutputStream(fileOutputStream);
                filterOutputStream.a = 0;
                InputStream n = ((ax4) j9Var.b).n();
                if (n != null) {
                    ((ys0) j9Var.c).c.j(n, filterOutputStream);
                    filterOutputStream.flush();
                    long j = filterOutputStream.a;
                    fileOutputStream.close();
                    if (file.length() != j) {
                        long length = file.length();
                        StringBuilder k = hr1.k(j, "File was not written completely. Expected: ", ", found: ");
                        k.append(length);
                        throw new IOException(k.toString());
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            gk9 gk9 = ((m64) this.o).d;
            int i = m64.g;
            gk9.getClass();
            throw e;
        }
    }

    public Object T0(Object obj, k77 k77) {
        Object obj2 = this.b;
        if (obj2 != null) {
            return obj2;
        }
        try {
            Object invoke = ((s16) this.c).invoke();
            this.b = invoke;
            ((b75) this.o).b.add(new a75(invoke, new gz3(7, this)));
            return invoke;
        } catch (Throwable th) {
            throw new RuntimeException("could not extract value for name ".concat(k77.getName()), th);
        }
    }

    public void a(yfd yfd) {
        ((ajb) this.b).c(yfd);
    }

    public void accept(Object obj) {
        udd.s(ck4.i, "MsgGetCmd failed", (Throwable) obj);
        ((ck4) this.c).c((i22) this.b, (nzc) this.o);
    }

    public w54 b(xu5 xu5, Surface surface, boolean z) {
        w54 b2 = ((k13) this.c).b(xu5, surface, z);
        this.o = b2.b();
        return b2;
    }

    public void c(yfd yfd) {
        ((ne8) this.c).c(yfd);
    }

    public w54 d(xu5 xu5) {
        w54 d = ((k13) this.c).d(xu5);
        this.b = d.b();
        return d;
    }

    public void e(kqe kqe) {
        String str = (String) this.b;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, "Transformer.abortSafely, cancel transformer", (Throwable) null);
        }
        try {
            kqe.c();
        } catch (Throwable th) {
            udd.S((String) this.b, "Transformer.abortSafely, failed to cancel transformer", th);
        }
    }

    public void f(int i, String str) {
        h(String.valueOf(i), str);
    }

    public void g(String str, boolean z) {
        h(String.valueOf(z), str);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ul7, java.lang.Object] */
    public void h(Object obj, String str) {
        ? obj2 = new Object();
        ((ul7) this.o).c = obj2;
        this.o = obj2;
        obj2.b = obj;
        obj2.a = str;
    }

    public z90 i() {
        String str = ((mb0) this.c) == null ? " videoSpec" : "";
        if (((n80) this.b) == null) {
            str = str.concat(" audioSpec");
        }
        if (((Integer) this.o) == null) {
            str = hr1.g(str, " outputFormat");
        }
        if (str.isEmpty()) {
            return new z90((mb0) this.c, (n80) this.b, ((Integer) this.o).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void j(kqe kqe) {
        try {
            kqe.g();
            qh7 qh7 = kqe.f;
            qh7.g();
            qh7.d.clear();
        } catch (Throwable th) {
            udd.S((String) this.b, "Transformer.cleanupSafely, failed to cleanup transformer", th);
        }
    }

    public bd5 k() {
        m64 m64 = (m64) this.o;
        m64.e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        File h = m64.h((String) this.b);
        try {
            d8.A((File) this.c, h);
            if (h.exists()) {
                h.setLastModified(currentTimeMillis);
            }
            return new bd5(h);
        } catch (FileUtils.RenameException e) {
            Throwable cause = e.getCause();
            if (cause != null && !(cause instanceof FileUtils.ParentDirNotFoundException)) {
                boolean z = cause instanceof FileNotFoundException;
            }
            int i = m64.g;
            m64.d.getClass();
            throw e;
        }
    }

    public j93 l(gg8 gg8, hs4 hs4) {
        int i = 0;
        ms6 ms6 = new ms6(4);
        ms6.a(hs4);
        ms6.b(new hs4[0]);
        e8c j = ms6.j();
        oyb.c("The composition must contain at least one EditedMediaItemSequence.", !j.isEmpty());
        ws6 j2 = ws6.j(j);
        lk9 lk9 = lk9.Z;
        qs4 qs4 = qs4.c;
        yf8 yf8 = (yf8) this.c;
        if (!yf8.j || !yf8.k) {
            i = 2;
            gg8.e = 2;
        } else {
            gg8.e = 0;
        }
        return new j93(j2, lk9, qs4, false, false, false, i, false);
    }

    public gs4 m(l68 l68) {
        qs4 qs4 = qs4.c;
        yf8 yf8 = (yf8) this.c;
        boolean z = yf8.i;
        ete.l(4, "initialCapacity");
        Object[] objArr = new Object[4];
        objArr[0] = u2b.e(yf8.d, yf8.e);
        return new gs4(l68, z, false, false, -9223372036854775807L, -2147483647, new qs4(hw4.a, ws6.h(1, objArr)));
    }

    public m74 n(gg8 gg8) {
        gg8.d = 1;
        int i = ((yf8) this.c).f;
        v3f v3f = new v3f(i > 0 ? i : -1, 1, -1, -1, 1.0f, -1, -1, false);
        m74 m74 = new m74((Context) this.o);
        m74.c = v3f;
        m74.o = false;
        return new m74(m74);
    }

    public l68 o(k58 k58) {
        a68 a68;
        k58 k582 = k58;
        r58 r58 = new r58();
        q44 q44 = new q44();
        List emptyList = Collections.emptyList();
        e8c e8c = e8c.X;
        x58 x58 = new x58();
        d68 d68 = d68.d;
        yf8 yf8 = (yf8) this.c;
        Uri uri = yf8.b;
        if (k582 != null) {
            long j = k582.a;
            if (j != -9223372036854775807L) {
                float f = yf8.g;
                if (!(f == 0.0f && yf8.h == 1.0f)) {
                    float f2 = (float) j;
                    float f3 = f * f2;
                    float f4 = f2 * yf8.h;
                    r58 r582 = new r58();
                    r582.f((long) f3);
                    r582.d((long) f4);
                    r58 = new t58(r582).a();
                }
            }
        }
        oyb.k(((Uri) q44.e) == null || ((UUID) q44.d) != null);
        w58 w58 = null;
        if (uri != null) {
            if (((UUID) q44.d) != null) {
                w58 = new w58(q44);
            }
            a68 = new a68(uri, (String) null, w58, (p58) null, emptyList, (String) null, e8c, (Object) null, -9223372036854775807L);
        } else {
            a68 = null;
        }
        return new l68("", new t58(r58), a68, new z58(x58), z78.J, d68);
    }

    public void o1(Object obj, k77 k77, Object obj2) {
        if (obj2 == null) {
            this.b = null;
        }
    }

    public kqe p(m74 m74, ig8 ig8) {
        String str;
        String str2;
        Context applicationContext = ((Context) this.o).getApplicationContext();
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        gf6 gf6 = new gf6(9);
        qc4 build = new DefaultVideoFrameProcessor.Factory.Builder().build();
        applicationContext.getApplicationContext();
        lhd lhd = new lhd(13, (byte) 0);
        Looper w = oze.w();
        qh7 qh7 = new qh7(w, z7e.a, new kce(26));
        qh7.g();
        qh7.d.clear();
        qh7.a(ig8);
        if (!((yf8) this.c).k) {
            str = c49.l("video/avc");
            oyb.c("Not a video MIME type: " + str, c49.k(str));
        } else {
            str = null;
        }
        if (str != null) {
            str2 = c49.l(str);
            oyb.c("Not a video MIME type: " + str2, str2 == null || c49.k(str2));
        } else {
            str2 = null;
        }
        iqe iqe = new iqe((String) null, -1, 0, str2);
        le4 le4 = (le4) lhd.b;
        String str3 = iqe.b;
        if (str3 != null) {
            oyb.j("Unsupported sample MIME type ".concat(str3), le4.b(c49.g(str3)).contains(str3));
        }
        String str4 = iqe.c;
        if (str4 != null) {
            oyb.j("Unsupported sample MIME type ".concat(str4), le4.b(c49.g(str4)).contains(str4));
        }
        return new kqe(applicationContext, iqe, 10000, qh7, gf6, build, m74, lhd, w);
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [one.me.sdk.media.transformer.MediaTransformException, java.lang.RuntimeException] */
    /* JADX WARNING: type inference failed for: r0v22, types: [one.me.sdk.media.transformer.MediaTransformException, java.lang.RuntimeException] */
    public void q(gg8 gg8, j93 j93) {
        gg8 gg82 = gg8;
        String str = (String) this.b;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, "executeWithMainLooper", (Throwable) null);
        }
        String str2 = ((yf8) this.c).c;
        Handler handler = new Handler(Looper.getMainLooper());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ig8 ig8 = new ig8(gg82, this, countDownLatch, 1);
        kqe p = p(n(gg8), ig8);
        if (!handler.post(new co1(this, p, j93, str2, ig8, 6))) {
            gg82.a(new RuntimeException("Failed to start media transform on main loop", (Throwable) null));
            if (!handler.post(new hg8(this, p, 0))) {
                String str3 = (String) this.b;
                fn6 fn62 = udd.e;
                if (fn62 != null && fn62.c()) {
                    fn62.d(tn7.Z, str3, "executeWithMainLooper, failed to cleanup transformer on main loop", (Throwable) null);
                    return;
                }
                return;
            }
            return;
        }
        yf8 yf8 = (yf8) this.c;
        yf8.getClass();
        Handler handler2 = handler;
        kqe kqe = p;
        bg8 bg8 = new bg8(handler, p, 500, 300000, yf8.l);
        bg8.b();
        String str4 = (String) this.b;
        fn6 fn63 = udd.e;
        if (fn63 != null && fn63.c()) {
            fn63.d(tn7.X, str4, "executeWithMainLooper, waiting for completion ...", (Throwable) null);
        }
        try {
            countDownLatch.await();
            String str5 = (String) this.b;
            fn6 fn64 = udd.e;
            if (fn64 != null) {
                if (fn64.c()) {
                    fn64.d(tn7.X, str5, "executeWithMainLooper, completed", (Throwable) null);
                }
            }
            bg8.a();
            if (!handler2.post(new hg8(this, kqe, 1))) {
                String str6 = (String) this.b;
                fn6 fn65 = udd.e;
                if (fn65 != null && fn65.c()) {
                    fn65.d(tn7.Z, str6, "executeWithMainLooper, failed to cleanup transformer on main loop", (Throwable) null);
                }
            }
        } catch (InterruptedException e) {
            gg82.a(new RuntimeException("Waiting for media transform completion interrupted", e));
            if (!handler2.post(new hg8(this, kqe, 2))) {
                String str7 = (String) this.b;
                fn6 fn66 = udd.e;
                if (fn66 != null) {
                    if (fn66.c()) {
                        fn66.d(tn7.Z, str7, "executeWithMainLooper, failed to abort media transformer on main loop", (Throwable) null);
                    }
                }
            }
            bg8.a();
            if (!handler2.post(new hg8(this, kqe, 1))) {
                String str8 = (String) this.b;
                fn6 fn67 = udd.e;
                if (fn67 != null && fn67.c()) {
                    fn67.d(tn7.Z, str8, "executeWithMainLooper, failed to cleanup transformer on main loop", (Throwable) null);
                }
            }
        } catch (Throwable th) {
            bg8.a();
            if (!handler2.post(new hg8(this, kqe, 1))) {
                String str9 = (String) this.b;
                fn6 fn68 = udd.e;
                if (fn68 != null && fn68.c()) {
                    fn68.d(tn7.Z, str9, "executeWithMainLooper, failed to cleanup transformer on main loop", (Throwable) null);
                }
            }
            throw th;
        }
    }

    public bk9 r() {
        y76 y76 = bk9.a;
        String string = s().getString("nightmode", "");
        y76.getClass();
        List p0 = h0e.p0(string, new char[]{','});
        boolean isEmpty = p0.isEmpty();
        ak9 ak9 = ak9.b;
        if (isEmpty) {
            return ak9;
        }
        String str = (String) o23.V(p0);
        switch (str.hashCode()) {
            case -1609594047:
                return !str.equals("enabled") ? ak9 : yj9.b;
            case -887328209:
                boolean equals = str.equals("system");
                return ak9;
            case -697920873:
                if (!str.equals("schedule")) {
                    return ak9;
                }
                int i = zp4.o;
                int parseInt = Integer.parseInt((String) p0.get(1));
                eq4 eq4 = eq4.X;
                return new zj9(mt0.P(parseInt, eq4), mt0.P(Integer.parseInt((String) p0.get(2)), eq4));
            case 3005871:
                return !str.equals("auto") ? ak9 : new wj9(Integer.parseInt((String) p0.get(1)));
            case 270940796:
                return !str.equals("disabled") ? ak9 : xj9.b;
            default:
                return ak9;
        }
    }

    public SharedPreferences s() {
        return (SharedPreferences) ((t97) this.c).getValue();
    }

    public hbc t(int i, int i2, boolean z) {
        int i3;
        int intValue = ((Number) ((r7e) this.b).getValue()).intValue();
        int intValue2 = ((Number) ((r7e) this.c).getValue()).intValue();
        if (!z) {
            intValue = intValue2;
        }
        if (i2 * i < intValue * intValue) {
            return null;
        }
        if (i2 <= intValue && i <= intValue) {
            return null;
        }
        if (i2 > i) {
            int i4 = intValue;
            intValue = (int) ((((float) i) / ((float) i2)) * ((float) intValue));
            i3 = i4;
        } else {
            i3 = (int) ((((float) i2) / ((float) i)) * ((float) intValue));
        }
        return new hbc(0.0f, intValue, i3, 12);
    }

    public String toString() {
        switch (this.a) {
            case 11:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                ul7 ul7 = (ul7) ((ul7) this.c).c;
                String str = "";
                while (ul7 != null) {
                    Object obj = ul7.b;
                    sb.append(str);
                    String str2 = (String) ul7.a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    ul7 = (ul7) ul7.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.util.Size} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
        if (hjd.a(r3) < (r4.getHeight() * r4.getWidth())) goto L_0x00b6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList v(pye r13) {
        /*
            r12 = this;
            r0 = r13
            br6 r0 = (br6) r0
            z80 r1 = br6.K
            r2 = 0
            java.lang.Object r1 = r0.d(r1, r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0014
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            goto L_0x0015
        L_0x0014:
            r3 = r2
        L_0x0015:
            if (r3 == 0) goto L_0x0018
            return r3
        L_0x0018:
            z80 r1 = br6.J
            java.lang.Object r1 = r0.d(r1, r2)
            ibc r1 = (ibc) r1
            z80 r3 = br6.I
            java.lang.Object r3 = r0.d(r3, r2)
            java.util.List r3 = (java.util.List) r3
            int r4 = r13.getInputFormat()
            if (r3 == 0) goto L_0x004d
            java.util.Iterator r3 = r3.iterator()
        L_0x0032:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x004d
            java.lang.Object r5 = r3.next()
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r6 = r5.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != r4) goto L_0x0032
            java.lang.Object r3 = r5.second
            android.util.Size[] r3 = (android.util.Size[]) r3
            goto L_0x004e
        L_0x004d:
            r3 = r2
        L_0x004e:
            if (r3 != 0) goto L_0x0052
            r3 = r2
            goto L_0x0056
        L_0x0052:
            java.util.List r3 = java.util.Arrays.asList(r3)
        L_0x0056:
            java.lang.Object r5 = r12.c
            fu1 r5 = (fu1) r5
            if (r3 != 0) goto L_0x0060
            java.util.List r3 = r5.q(r4)
        L_0x0060:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            d63 r3 = new d63
            r6 = 1
            r3.<init>(r6)
            java.util.Collections.sort(r4, r3)
            r4.isEmpty()
            r3 = 0
            if (r1 != 0) goto L_0x0211
            java.lang.Object r12 = r12.o
            s79 r12 = (s79) r12
            r12.getClass()
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0083
            goto L_0x01ec
        L_0x0083:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            d63 r1 = new d63
            r1.<init>(r6)
            java.util.Collections.sort(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            br6 r13 = (br6) r13
            z80 r4 = br6.H
            java.lang.Object r4 = r13.d(r4, r2)
            android.util.Size r4 = (android.util.Size) r4
            java.lang.Object r3 = r0.get(r3)
            android.util.Size r3 = (android.util.Size) r3
            if (r4 == 0) goto L_0x00b6
            int r5 = hjd.a(r3)
            int r7 = r4.getWidth()
            int r8 = r4.getHeight()
            int r8 = r8 * r7
            if (r5 >= r8) goto L_0x00b7
        L_0x00b6:
            r4 = r3
        L_0x00b7:
            android.util.Size r3 = r12.a(r13)
            android.util.Size r5 = hjd.c
            int r7 = hjd.a(r5)
            int r8 = hjd.a(r4)
            if (r8 >= r7) goto L_0x00ca
            android.util.Size r5 = hjd.a
            goto L_0x00d8
        L_0x00ca:
            if (r3 == 0) goto L_0x00d8
            int r8 = r3.getWidth()
            int r9 = r3.getHeight()
            int r9 = r9 * r8
            if (r9 >= r7) goto L_0x00d8
            r5 = r3
        L_0x00d8:
            java.util.Iterator r7 = r0.iterator()
        L_0x00dc:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0110
            java.lang.Object r8 = r7.next()
            android.util.Size r8 = (android.util.Size) r8
            int r9 = hjd.a(r8)
            int r10 = r4.getWidth()
            int r11 = r4.getHeight()
            int r11 = r11 * r10
            if (r9 > r11) goto L_0x00dc
            int r9 = r8.getWidth()
            int r10 = r8.getHeight()
            int r10 = r10 * r9
            int r9 = hjd.a(r5)
            if (r10 < r9) goto L_0x00dc
            boolean r9 = r1.contains(r8)
            if (r9 != 0) goto L_0x00dc
            r1.add(r8)
            goto L_0x00dc
        L_0x0110:
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto L_0x01ed
            z80 r0 = br6.B
            boolean r4 = r13.l(r0)
            if (r4 == 0) goto L_0x012f
            java.lang.Object r0 = r13.h(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r4 = r12.c
            android.util.Rational r0 = w(r0, r4)
            goto L_0x0163
        L_0x012f:
            android.util.Size r0 = r12.a(r13)
            if (r0 == 0) goto L_0x0162
            java.util.ArrayList r4 = u(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x013d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0153
            java.lang.Object r5 = r4.next()
            android.util.Rational r5 = (android.util.Rational) r5
            android.util.Size r7 = hjd.c
            boolean r7 = os.a(r0, r5, r7)
            if (r7 == 0) goto L_0x013d
            r0 = r5
            goto L_0x0163
        L_0x0153:
            android.util.Rational r4 = new android.util.Rational
            int r5 = r0.getWidth()
            int r0 = r0.getHeight()
            r4.<init>(r5, r0)
            r0 = r4
            goto L_0x0163
        L_0x0162:
            r0 = r2
        L_0x0163:
            if (r3 != 0) goto L_0x016e
            z80 r3 = br6.G
            java.lang.Object r13 = r13.d(r3, r2)
            r3 = r13
            android.util.Size r3 = (android.util.Size) r3
        L_0x016e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            if (r0 != 0) goto L_0x0183
            r4.addAll(r1)
            if (r3 == 0) goto L_0x01ec
            A(r4, r3, r6)
            goto L_0x01ec
        L_0x0183:
            java.util.HashMap r13 = x(r1)
            if (r3 == 0) goto L_0x01a7
            java.util.Set r1 = r13.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0191:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01a7
            java.lang.Object r2 = r1.next()
            android.util.Rational r2 = (android.util.Rational) r2
            java.lang.Object r2 = r13.get(r2)
            java.util.List r2 = (java.util.List) r2
            A(r2, r3, r6)
            goto L_0x0191
        L_0x01a7:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r13.keySet()
            r1.<init>(r2)
            ns r2 = new ns
            java.io.Serializable r12 = r12.o
            android.util.Rational r12 = (android.util.Rational) r12
            r2.<init>(r0, r12)
            java.util.Collections.sort(r1, r2)
            java.util.Iterator r12 = r1.iterator()
        L_0x01c0:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r0 = r12.next()
            android.util.Rational r0 = (android.util.Rational) r0
            java.lang.Object r0 = r13.get(r0)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x01d6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01c0
            java.lang.Object r1 = r0.next()
            android.util.Size r1 = (android.util.Size) r1
            boolean r2 = r4.contains(r1)
            if (r2 != 0) goto L_0x01d6
            r4.add(r1)
            goto L_0x01d6
        L_0x01ec:
            return r4
        L_0x01ed:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "All supported output sizes are filtered out according to current resolution selection settings. \nminSize = "
            r13.<init>(r1)
            r13.append(r5)
            java.lang.String r1 = "\nmaxSize = "
            r13.append(r1)
            r13.append(r4)
            java.lang.String r1 = "\ninitial size list: "
            r13.append(r1)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0211:
            r7 = r13
            br6 r7 = (br6) r7
            z80 r8 = br6.H
            java.lang.Object r2 = r7.d(r8, r2)
            android.util.Size r2 = (android.util.Size) r2
            r0.B(r3)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            z80 r8 = pye.r0
            java.lang.Object r7 = r13.d(r8, r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x024f
            int r13 = r13.getInputFormat()
            int r1 = r1.c
            if (r1 != r6) goto L_0x024f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r4)
            java.util.List r13 = r5.k(r13)
            r1.addAll(r13)
            d63 r13 = new d63
            r13.<init>(r6)
            java.util.Collections.sort(r1, r13)
            r4 = r1
        L_0x024f:
            z80 r13 = br6.J
            java.lang.Object r13 = r0.h(r13)
            ibc r13 = (ibc) r13
            ii5 r0 = r13.a
            java.util.HashMap r1 = x(r4)
            java.lang.Object r12 = r12.b
            android.util.Rational r12 = (android.util.Rational) r12
            if (r12 == 0) goto L_0x026d
            int r4 = r12.getNumerator()
            int r5 = r12.getDenominator()
            if (r4 < r5) goto L_0x026f
        L_0x026d:
            r4 = r6
            goto L_0x0270
        L_0x026f:
            r4 = r3
        L_0x0270:
            int r0 = r0.b
            android.util.Rational r0 = w(r0, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.Set r5 = r1.keySet()
            r4.<init>(r5)
            ns r5 = new ns
            r5.<init>(r0, r12)
            java.util.Collections.sort(r4, r5)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.Iterator r0 = r4.iterator()
        L_0x0290:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02a6
            java.lang.Object r4 = r0.next()
            android.util.Rational r4 = (android.util.Rational) r4
            java.lang.Object r5 = r1.get(r4)
            java.util.List r5 = (java.util.List) r5
            r12.put(r4, r5)
            goto L_0x0290
        L_0x02a6:
            if (r2 == 0) goto L_0x02f3
            android.util.Size r0 = hjd.a
            int r0 = r2.getWidth()
            int r1 = r2.getHeight()
            int r1 = r1 * r0
            java.util.Set r0 = r12.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x02bb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02f3
            java.lang.Object r2 = r0.next()
            android.util.Rational r2 = (android.util.Rational) r2
            java.lang.Object r2 = r12.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r2.iterator()
        L_0x02d6:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02ec
            java.lang.Object r7 = r5.next()
            android.util.Size r7 = (android.util.Size) r7
            int r8 = hjd.a(r7)
            if (r8 > r1) goto L_0x02d6
            r4.add(r7)
            goto L_0x02d6
        L_0x02ec:
            r2.clear()
            r2.addAll(r4)
            goto L_0x02bb
        L_0x02f3:
            jbc r13 = r13.b
            if (r13 != 0) goto L_0x02f8
            goto L_0x0351
        L_0x02f8:
            java.util.Set r0 = r12.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0300:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0351
            java.lang.Object r1 = r0.next()
            android.util.Rational r1 = (android.util.Rational) r1
            java.lang.Object r1 = r12.get(r1)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0319
            goto L_0x0300
        L_0x0319:
            jbc r2 = jbc.c
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L_0x0322
            goto L_0x0300
        L_0x0322:
            int r2 = r13.b
            android.util.Size r4 = r13.a
            if (r2 == 0) goto L_0x0344
            if (r2 == r6) goto L_0x0340
            r5 = 2
            if (r2 == r5) goto L_0x033c
            r5 = 3
            if (r2 == r5) goto L_0x0338
            r5 = 4
            if (r2 == r5) goto L_0x0334
            goto L_0x0300
        L_0x0334:
            B(r1, r4, r3)
            goto L_0x0300
        L_0x0338:
            B(r1, r4, r6)
            goto L_0x0300
        L_0x033c:
            A(r1, r4, r3)
            goto L_0x0300
        L_0x0340:
            A(r1, r4, r6)
            goto L_0x0300
        L_0x0344:
            boolean r2 = r1.contains(r4)
            r1.clear()
            if (r2 == 0) goto L_0x0300
            r1.add(r4)
            goto L_0x0300
        L_0x0351:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Collection r12 = r12.values()
            java.util.Iterator r12 = r12.iterator()
        L_0x035e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0384
            java.lang.Object r0 = r12.next()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x036e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x035e
            java.lang.Object r1 = r0.next()
            android.util.Size r1 = (android.util.Size) r1
            boolean r2 = r13.contains(r1)
            if (r2 != 0) goto L_0x036e
            r13.add(r1)
            goto L_0x036e
        L_0x0384:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg8.v(pye):java.util.ArrayList");
    }

    public void y(Object obj) {
        c83 c83 = (c83) this.c;
        LinkedHashMap linkedHashMap = c83.b;
        String str = (String) this.b;
        Object obj2 = linkedHashMap.get(str);
        r1g r1g = (r1g) this.o;
        if (obj2 != null) {
            int intValue = ((Number) obj2).intValue();
            ArrayList arrayList = c83.d;
            arrayList.add(str);
            try {
                c83.b(intValue, r1g, obj);
            } catch (Exception e) {
                arrayList.remove(str);
                throw e;
            }
        } else {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + r1g + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
    }

    public void z(JSONObject jSONObject) {
        y41 y41;
        m50 m50 = (m50) this.b;
        m50.getClass();
        j1c j1c = null;
        try {
            y41 m = jSONObject.has("decorativeExternalParticipantId") ? x87.m(jSONObject) : null;
            ge1 a2 = ge1.a(jSONObject.getString("participantId"));
            String x = r1g.x(jSONObject, "decorativeParticipantId");
            if (x != null) {
                ge1.a(x);
            }
            j1c = new j1c(a2, 3, m);
        } catch (JSONException e) {
            m50.a.logException("ContactCallParser", "Can't parse decorative-id-changed info", e);
        }
        if (j1c != null && (y41 = (y41) j1c.c) != null) {
            pe1 pe1 = (pe1) this.c;
            ge1 ge1 = (ge1) j1c.b;
            if (pe1.j(ge1) != null) {
                if (pe1.j(ge1) != null) {
                    w2d c2 = pe1.c(ge1);
                    List singletonList = Collections.singletonList((ke1) pe1.a(new pja(ge1, new dr9(14), new dr9(14), new dr9(14), new dr9(14), new nfc(22, y41), new dr9(14)), c2).c);
                    boolean f = hhd.f(c2, pe1.k);
                    ob1 ob1 = pe1.b;
                    if (f) {
                        ob1.a.onActiveParticipantsDeAnonimized(new nx0(singletonList, pe1.d(pe1.k).values()));
                    }
                    ob1.c.onCallParticipantsDeAnonimized(new se1(singletonList));
                }
                ((d21) this.o).onDecorativeParticipantIdChanged(new b21(ge1));
            }
        }
    }

    public /* synthetic */ jg8(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.o = obj3;
    }

    public jg8(k40 k40) {
        this.a = 15;
        this.c = k40;
        ajb ajb = new ajb();
        this.b = ajb;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qmc a2 = cnc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        this.o = new kv9(ajb, 50, timeUnit, a2, false).n(de.a()).p(new sic(29, k40));
    }

    public jg8(String str, nm6 nm6) {
        this.a = 9;
        this.b = HttpPost.METHOD_NAME;
        this.c = str;
        this.o = nm6;
    }

    public jg8(Context context, t97 t97) {
        this.a = 12;
        this.c = new r7e(new nd(t97, context, 1));
        this.b = new r7e(new nd(t97, context, 2));
        this.o = new r7e(new qk8(24, this));
    }

    public jg8(r7e r7e) {
        this.a = 13;
        this.c = r7e;
        hcd b2 = icd.b(0, 1, 2, 1);
        this.b = b2;
        this.o = new s0c(b2);
    }

    public jg8(i6g i6g) {
        this.a = 4;
        this.c = i6g;
    }

    public jg8(yf8 yf8) {
        this.a = 0;
        this.c = yf8;
        this.b = jg8.class.getName();
        this.o = yf8.a.getApplicationContext();
    }

    public jg8(b75 b75, z65 z65) {
        this.a = 8;
        this.o = b75;
        this.c = z65;
    }

    public jg8(Runnable runnable) {
        this.a = 10;
        this.b = new CopyOnWriteArrayList();
        this.o = new HashMap();
        this.c = runnable;
    }

    public jg8(fu1 fu1, Size size) {
        Rational rational;
        this.a = 14;
        this.c = fu1;
        fu1.b();
        fu1.g();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List q = fu1.q(256);
            if (q.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(q, new d63(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.b = rational;
        this.o = new s79(fu1, rational);
    }

    public jg8(String str) {
        this.a = 11;
        Object obj = new Object();
        this.c = obj;
        this.o = obj;
        this.b = str;
    }

    public jg8(m64 m64, String str, File file) {
        this.a = 6;
        this.o = m64;
        this.b = str;
        this.c = file;
    }
}
