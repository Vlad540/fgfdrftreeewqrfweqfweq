package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.camera.core.ProcessingException;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ydc  reason: default package */
public final class ydc implements l13, nw9, ms7, tqe, z4f {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ ydc(int i, boolean z) {
        this.a = i;
    }

    public static ydc D(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new ydc(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, e06] */
    public static z64 u(w58 w58) {
        h84 h84 = new h84();
        byte[] bArr = null;
        h84.b = null;
        Uri uri = w58.b;
        String uri2 = uri == null ? null : uri.toString();
        boolean z = w58.f;
        ? obj = new Object();
        oyb.d(!z || !TextUtils.isEmpty(uri2));
        obj.b = h84;
        obj.c = uri2;
        obj.a = z;
        obj.o = new HashMap();
        rue g = w58.c.f().g();
        while (g.hasNext()) {
            Map.Entry entry = (Map.Entry) g.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) obj.o)) {
                ((HashMap) obj.o).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = yu0.a;
        mk9 mk9 = new mk9(9);
        UUID uuid2 = w58.a;
        uuid2.getClass();
        boolean z2 = w58.d;
        boolean z3 = w58.e;
        int[] H = xie.H(w58.g);
        int length = H.length;
        for (int i = 0; i < length; i++) {
            int i2 = H[i];
            oyb.d(i2 == 2 || i2 == 1);
        }
        z64 z64 = new z64(uuid2, obj, hashMap, z2, (int[]) H.clone(), z3, mk9, 300000);
        byte[] bArr2 = w58.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        oyb.k(z64.m.isEmpty());
        z64.v = 0;
        z64.w = bArr;
        return z64;
    }

    public Typeface A(int i, int i2, eo eoVar) {
        int resourceId = ((TypedArray) this.c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.o) == null) {
            this.o = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.o;
        ThreadLocal threadLocal = ubc.a;
        Context context = (Context) this.b;
        if (context.isRestricted()) {
            return null;
        }
        return ubc.b(context, resourceId, typedValue, i2, eoVar, true, false);
    }

    public String B(int i) {
        udd.p("ydc", "getVcfByPhoneContactId: phoneContactId %d", new Object[]{Integer.valueOf(i)});
        try {
            String str = (String) xie.u((Context) this.b, Collections.singletonList(Integer.valueOf(i)), (g15) this.o).get(i);
            if (!r1g.p(str)) {
                return str;
            }
            udd.t("ydc", "getVcfByPhoneContactId: vCard is empty for phoneContactId %d", new Object[]{Integer.valueOf(i)});
            return null;
        } catch (Exception e) {
            Locale locale = Locale.ENGLISH;
            udd.s("ydc", "getVcfByPhoneContactId: exception for phoneContactId " + i, e);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public long C(ni3 ni3) {
        do3 x = x();
        long j = ni3.a;
        ij3 ij3 = new ij3(0, j, 0, 0, ni3);
        ConcurrentHashMap concurrentHashMap = ((l16) ((r7e) this.o).getValue()).a;
        aec aec = x.a;
        aec.b();
        aec.c();
        try {
            long D = x.b.D(ij3);
            aec.r();
            aec.l();
            if (ni3.j == 0 || !ni3.a()) {
                Object obj = concurrentHashMap.get(Long.valueOf(j));
                List list = ni3.f;
                if (!(obj == null ? false : obj.equals(Integer.valueOf(list.hashCode())))) {
                    concurrentHashMap.remove(Long.valueOf(j));
                    p7c p7c = o16.a;
                    m16 b2 = o16.b(list);
                    if (b2 != null) {
                        String c2 = ehe.c(ni3.p);
                        if (r1g.p(c2)) {
                            c2 = "";
                        }
                        String k = gsc.k(c2);
                        String str = null;
                        m16 m16 = b2.c;
                        String str2 = m16 != null ? m16.a : null;
                        if (m16 != null) {
                            str = m16.b;
                        }
                        x.b(k, b2.a, b2.b, str2, str, j);
                        concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(list.hashCode()));
                        String name = do3.class.getName();
                        udd.q(name, "update_fts_title_contacts2 for #" + j);
                    }
                }
            }
            return D;
        } catch (Throwable th) {
            aec.l();
            throw th;
        }
    }

    public void E() {
        ((TypedArray) this.c).recycle();
    }

    public void F(long j) {
    }

    public void G(Iterable iterable) {
        synchronized (this.o) {
            try {
                for (oe3 oe3 : (oe3[]) this.c) {
                    if (oe3.e != null) {
                        oe3.e = null;
                        oe3.d((ydc) null, oe3.d);
                    }
                }
                for (oe3 c2 : (oe3[]) this.c) {
                    c2.c(iterable);
                }
                for (oe3 oe32 : (oe3[]) this.c) {
                    if (oe32.e != this) {
                        oe32.e = this;
                        oe32.d(this, oe32.d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void H() {
        synchronized (this.o) {
            for (oe3 oe3 : (oe3[]) this.c) {
                ArrayList arrayList = oe3.b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    oe3.a.n(oe3);
                }
            }
        }
    }

    public void I(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public rp4 J(ab0 ab0) {
        o4e o4e;
        Rect rect;
        ab0 ab02 = ab0;
        gt0.i();
        this.o = new HashMap();
        Iterator it = ab02.b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            o4e = ab02.a;
            if (hasNext) {
                ba0 ba0 = (ba0) it.next();
                rp4 rp4 = (rp4) this.o;
                Rect rect2 = ba0.d;
                Matrix matrix = new Matrix(o4e.b);
                RectF rectF = new RectF(rect2);
                RectF rectF2 = hqe.a;
                float f = (float) 0;
                Size size = ba0.e;
                RectF rectF3 = new RectF(f, f, (float) size.getWidth(), (float) size.getHeight());
                int i = ba0.f;
                boolean z = ba0.g;
                Matrix a2 = hqe.a(rectF, rectF3, i, z);
                matrix.postConcat(a2);
                e07.k(hqe.d(hqe.g(hqe.e(rect2), i), false, size));
                if (ba0.h) {
                    Rect rect3 = ba0.d;
                    Rect rect4 = o4e.d;
                    boolean contains = rect3.contains(rect4);
                    e07.j("Output crop rect " + rect3 + " must contain input crop rect " + rect4, contains);
                    rect = new Rect();
                    RectF rectF4 = new RectF(rect4);
                    a2.mapRect(rectF4);
                    rectF4.round(rect);
                } else {
                    rect = hqe.h(size);
                }
                uwb a3 = o4e.g.a();
                a3.b = size;
                va0 i2 = a3.i();
                int i3 = o4e.i - i;
                boolean z2 = o4e.e != z;
                o4e o4e2 = r8;
                o4e o4e3 = new o4e(ba0.b, ba0.c, i2, matrix, false, rect, i3, -1, z2);
                rp4.put(ba0, o4e2);
            } else {
                try {
                    break;
                } catch (ProcessingException unused) {
                }
            }
        }
        ((r4e) this.b).a(o4e.d((hu1) this.c, true));
        for (Map.Entry entry : ((rp4) this.o).entrySet()) {
            t(o4e, entry);
            ((o4e) entry.getValue()).a(new ncd(this, o4e, entry, 5));
        }
        jv1 jv1 = new jv1(7, (rp4) this.o);
        o4e.getClass();
        o4e.o.add(jv1);
        return (rp4) this.o;
    }

    public void a() {
        ((tqe) this.b).a();
    }

    public void b(String str, List list) {
        ((xra) this.b).q().h = null;
        boolean f = hhd.f(str, (String) this.c);
        yv1 yv1 = (yv1) this.o;
        if (f) {
            yv1.resumeWith(list);
            return;
        }
        CancellationException cancellationException = new CancellationException("Nothing found");
        cancellationException.initCause((Throwable) null);
        yv1.resumeWith(new kcc(cancellationException));
    }

    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        ((nf3) this.c).accept(new ExportException("Video frame processing error", videoFrameProcessingException, 5001));
    }

    public boolean d() {
        return ((l13) this.b).d();
    }

    public void e() {
        ((t55) this.b).e();
        ((te4) this.c).e = true;
    }

    public w54 f(xu5 xu5) {
        w54 f = ((l13) this.b).f(xu5);
        this.c = f.b();
        return f;
    }

    public ob6 h(int i) {
        return ((tqe) this.b).h(i);
    }

    public void i(long j) {
        ((n8f) this.o).i = j;
        try {
            ((n8f) this.o).f.b();
        } catch (ExportException e) {
            ((nf3) this.c).accept(e);
        }
    }

    public boolean j() {
        return ((l13) this.b).j();
    }

    public boolean k() {
        return ((tqe) this.b).k();
    }

    public void l(p4e p4e) {
        ((tqe) this.b).l(p4e);
    }

    public void m(hl hlVar) {
        ((ql6) this.o).e = hlVar;
    }

    public w54 n(xu5 xu5) {
        w54 n = ((l13) this.b).n(xu5);
        this.o = n.b();
        return n;
    }

    public void o(int i, int i2) {
        p4e p4e;
        try {
            p4e = ((n8f) this.o).f.a(i, i2);
        } catch (ExportException e) {
            ((nf3) this.c).accept(e);
            p4e = null;
        }
        l(p4e);
    }

    public void p() {
        ObjectAnimator objectAnimator = (ObjectAnimator) this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.b;
        if (view.getAlpha() < 1.0f) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{view.getAlpha(), 1.0f});
            ofFloat.setDuration(500);
            ofFloat.setInterpolator((AccelerateDecelerateInterpolator) this.o);
            ofFloat.start();
            this.c = ofFloat;
        }
    }

    public boolean q(String str) {
        boolean z;
        oe3 oe3;
        synchronized (this.o) {
            try {
                oe3[] oe3Arr = (oe3[]) this.c;
                int length = oe3Arr.length;
                z = false;
                int i = 0;
                while (true) {
                    if (i < length) {
                        oe3 = oe3Arr[i];
                        Object obj = oe3.d;
                        if (obj != null && oe3.b(obj) && oe3.c.contains(str)) {
                            break;
                        }
                        i++;
                    } else {
                        oe3 = null;
                        break;
                    }
                }
                if (oe3 != null) {
                    a24.B().t(vsf.a, "Work " + str + " constrained by " + oe3.getClass().getSimpleName());
                }
                if (oe3 == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public hb0 r() {
        String str = ((String) this.b) == null ? " backendName" : "";
        if (((t3b) this.o) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new hb0((String) this.b, (byte[]) this.c, (t3b) this.o);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void release() {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA:
                ((r4e) this.b).release();
                gt0.I(new pzb(21, this));
                return;
            default:
                ((tqe) this.b).release();
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b9 s(android.content.Intent r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAction()
            boolean r0 = r1g.p(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.String r0 = "android.intent.action.SEND"
            java.lang.String r2 = r10.getAction()
            boolean r0 = r0.equals(r2)
            java.lang.String r2 = "android.intent.extra.TEXT"
            r3 = 4
            r4 = 2
            java.lang.Object r5 = r9.b
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r6 = r9.c
            g15 r6 = (defpackage.g15) r6
            java.lang.Object r9 = r9.o
            bf5 r9 = (defpackage.bf5) r9
            r7 = 1
            if (r0 == 0) goto L_0x00af
            b9 r0 = new b9
            r0.<init>()
            int r8 = vx3.s(r10)
            r0.b = r8
            if (r8 == 0) goto L_0x0098
            if (r8 == r7) goto L_0x0091
            if (r8 == r4) goto L_0x008a
            if (r8 == r3) goto L_0x0083
            r9 = 5
            if (r8 == r9) goto L_0x0040
            goto L_0x009e
        L_0x0040:
            java.lang.String r9 = "handleVcardIntent failed, e: "
            java.lang.String r3 = "android.intent.extra.STREAM"
            android.os.Parcelable r3 = r10.getParcelableExtra(r3)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            boolean r4 = js.y(r3, r5, r6)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            if (r4 == 0) goto L_0x0051
            goto L_0x007c
        L_0x0051:
            android.content.ContentResolver r4 = r5.getContentResolver()     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            java.io.InputStream r3 = r4.openInputStream(r3)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            java.lang.String r1 = ete.F(r3)     // Catch:{ Exception -> 0x0064 }
        L_0x005d:
            ete.o(r3)
            goto L_0x007c
        L_0x0061:
            r9 = move-exception
            r1 = r3
            goto L_0x007f
        L_0x0064:
            r4 = move-exception
            goto L_0x006a
        L_0x0066:
            r9 = move-exception
            goto L_0x007f
        L_0x0068:
            r4 = move-exception
            r3 = r1
        L_0x006a:
            java.lang.String r5 = "vx3"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r6.<init>(r9)     // Catch:{ all -> 0x0061 }
            r6.append(r4)     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x0061 }
            udd.s(r5, r9, r1)     // Catch:{ all -> 0x0061 }
            goto L_0x005d
        L_0x007c:
            r0.Z = r1
            goto L_0x009e
        L_0x007f:
            ete.o(r1)
            throw r9
        L_0x0083:
            java.util.ArrayList r9 = vx3.v(r10, r5, r6, r9)
            r0.Y = r9
            goto L_0x009e
        L_0x008a:
            java.util.ArrayList r9 = vx3.v(r10, r5, r6, r9)
            r0.X = r9
            goto L_0x009e
        L_0x0091:
            java.util.ArrayList r9 = vx3.v(r10, r5, r6, r9)
            r0.o = r9
            goto L_0x009e
        L_0x0098:
            java.lang.String r9 = vx3.w(r10)
            r0.c = r9
        L_0x009e:
            int r9 = r0.b
            if (r9 == 0) goto L_0x00ae
            boolean r9 = r10.hasExtra(r2)
            if (r9 == 0) goto L_0x00ae
            java.lang.String r9 = vx3.w(r10)
            r0.c = r9
        L_0x00ae:
            return r0
        L_0x00af:
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            java.lang.String r1 = r10.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f2
            b9 r0 = new b9
            r0.<init>()
            int r1 = vx3.s(r10)
            r0.b = r1
            if (r1 == r7) goto L_0x00db
            if (r1 == r4) goto L_0x00d4
            if (r1 == r3) goto L_0x00cd
            goto L_0x00e1
        L_0x00cd:
            java.util.ArrayList r9 = vx3.u(r10, r5, r6, r9)
            r0.Y = r9
            goto L_0x00e1
        L_0x00d4:
            java.util.ArrayList r9 = vx3.u(r10, r5, r6, r9)
            r0.X = r9
            goto L_0x00e1
        L_0x00db:
            java.util.ArrayList r9 = vx3.u(r10, r5, r6, r9)
            r0.o = r9
        L_0x00e1:
            int r9 = r0.b
            if (r9 == 0) goto L_0x00f1
            boolean r9 = r10.hasExtra(r2)
            if (r9 == 0) goto L_0x00f1
            java.lang.String r9 = vx3.w(r10)
            r0.c = r9
        L_0x00f1:
            return r0
        L_0x00f2:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "shouldn't be here"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydc.s(android.content.Intent):b9");
    }

    public void t(o4e o4e, Map.Entry entry) {
        o4e o4e2 = (o4e) entry.getValue();
        ya0 ya0 = new ya0(o4e.g.a, ((ba0) entry.getKey()).d, o4e.c ? (hu1) this.c : null, ((ba0) entry.getKey()).f, ((ba0) entry.getKey()).g);
        int i = ((ba0) entry.getKey()).c;
        o4e2.getClass();
        gt0.i();
        o4e2.b();
        e07.p("Consumer can only be linked once.", !o4e2.j);
        o4e2.j = true;
        n4e n4e = o4e2.l;
        ct0.a(ct0.N(n4e.c(), new m4e(o4e2, n4e, i, ya0, (ya0) null), pa2.A()), new v2b(this, 9, o4e2), pa2.A());
    }

    public no4 v(l68 l68) {
        z64 z64;
        l68.b.getClass();
        w58 w58 = l68.b.c;
        if (w58 == null) {
            return no4.a;
        }
        synchronized (this.b) {
            try {
                if (!w58.equals((w58) this.c)) {
                    this.c = w58;
                    this.o = u(w58);
                }
                z64 = (z64) this.o;
                z64.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z64;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2 = d8.r((android.content.Context) r2.b, (r1 = r0.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList w(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L_0x001c
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L_0x001c
            java.lang.Object r2 = r2.b
            android.content.Context r2 = (android.content.Context) r2
            android.content.res.ColorStateList r2 = d8.r(r2, r1)
            if (r2 == 0) goto L_0x001c
            return r2
        L_0x001c:
            android.content.res.ColorStateList r2 = r0.getColorStateList(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydc.w(int):android.content.res.ColorStateList");
    }

    public do3 x() {
        return (do3) ((r7e) this.c).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r0.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable y(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r3)
            if (r1 == 0) goto L_0x001a
            r1 = 0
            int r1 = r0.getResourceId(r3, r1)
            if (r1 == 0) goto L_0x001a
            java.lang.Object r2 = r2.b
            android.content.Context r2 = (android.content.Context) r2
            android.graphics.drawable.Drawable r2 = am7.n(r2, r1)
            return r2
        L_0x001a:
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydc.y(int):android.graphics.drawable.Drawable");
    }

    public Drawable z(int i) {
        int resourceId;
        Drawable e;
        if (!((TypedArray) this.c).hasValue(i) || (resourceId = ((TypedArray) this.c).getResourceId(i, 0)) == 0) {
            return null;
        }
        gn a2 = gn.a();
        Context context = (Context) this.b;
        synchronized (a2) {
            e = a2.a.e(resourceId, context, true);
        }
        return e;
    }

    public /* synthetic */ ydc(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public ydc(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = new Object();
                return;
            case 9:
                this.b = new wwc(15);
                this.c = new wwc(15);
                this.o = qw4.a;
                return;
            default:
                this.b = new v4b(0);
                this.c = new r7e(new ke(14, this));
                return;
        }
    }

    public ydc(f9f f9f) {
        this.a = 8;
        this.b = f9f;
        this.o = new AccelerateDecelerateInterpolator();
    }

    public ydc(bec bec) {
        this.a = 0;
        this.b = bec;
        this.c = new r7e(new u5b(8, this));
        this.o = new r7e(yr3.B0);
    }

    public ydc(List list) {
        this.a = 10;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof m02) {
                arrayList.add(next);
            }
        }
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.c = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        this.o = arrayList3;
    }

    public ydc(l13 l13) {
        this.a = 4;
        this.b = l13;
    }

    public ydc(Context context, TypedArray typedArray) {
        this.a = 16;
        this.b = context;
        this.c = typedArray;
    }

    public ydc(j8e j8e, usf usf) {
        this.a = 18;
        oe3 dk0 = new dk0((cf3) j8e.a, 0);
        oe3 dk02 = new dk0((ek0) j8e.b, 1);
        oe3 dk03 = new dk0((cf3) j8e.o, 4);
        cf3 cf3 = (cf3) j8e.c;
        this.b = usf;
        this.c = new oe3[]{dk0, dk02, dk03, new dk0(cf3, 2), new dk0(cf3, 3), new oe3(cf3), new oe3(cf3)};
        this.o = new Object();
    }

    public ydc(Context context) {
        this.a = 13;
        this.b = new Object();
        this.o = new HashMap();
        this.c = new sfc(this, context);
    }

    public ydc(byte[] bArr, ch7 ch7) {
        this.a = 3;
        this.b = bArr;
        this.c = null;
        this.o = ch7;
    }

    public ydc(Uri uri, ch7 ch7) {
        this.a = 3;
        this.b = null;
        this.c = uri;
        this.o = ch7;
    }

    public ydc(hu1 hu1, r4e r4e) {
        this.a = 15;
        this.c = hu1;
        this.b = r4e;
    }

    public ydc(n8f n8f, Context context, sqe sqe, z23 z23, xle xle, pv0 pv0, lk9 lk9, List list) {
        n8f n8f2 = n8f;
        this.a = 17;
        this.o = n8f2;
        this.c = xle;
        this.b = sqe.b(context, z23, pv0, this, lk9, list, n8f2.h);
    }
}
