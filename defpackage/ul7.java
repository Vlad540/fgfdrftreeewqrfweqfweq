package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.media3.common.ParserException;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ul7  reason: default package */
public final class ul7 implements d4f, lj7, g73, of3, ys, ktc, ix4, h1e, c1g {
    public static final sz0 X = new sz0(-9223372036854775807L, 2, 5, false);
    public static final sz0 Y = new sz0(-9223372036854775807L, 3, 5, false);
    public static final sz0 o = new sz0(-9223372036854775807L, 0, 5, false);
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ ul7(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public boolean A() {
        return ((ej7) this.b) != null;
    }

    public String B() {
        if (x()) {
            String str = (String) this.a;
            this.a = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public dgd C(JSONObject jSONObject) {
        try {
            hw4 arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("rooms");
            if (optJSONArray == null) {
                arrayList = hw4.a;
            } else {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    cgd k = optJSONObject != null ? ((oz2) this.c).k(optJSONObject) : null;
                    if (k != null) {
                        arrayList.add(k);
                    }
                }
            }
            ((jk9) this.b).getClass();
            return new dgd(jk9.q(jSONObject), arrayList);
        } catch (JSONException e) {
            ((xwb) this.a).logException("SessionRoomsParser", "Can't parse rooms state", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r7.length() == 1) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        if (r7 == 0) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        if ((r9 == null || h0e.c0(r9)) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0040 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList D(java.util.List r21) {
        /*
            r20 = this;
            r0 = r20
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r21.iterator()
        L_0x000b:
            boolean r3 = r2.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r2.next()
            r6 = r3
            l3e r6 = (defpackage.l3e) r6
            e2e r7 = r6.a
            int r7 = r7.b
            if (r7 == r4) goto L_0x0021
            goto L_0x0031
        L_0x0021:
            n62 r7 = defpackage.n62.a
            java.lang.Object r8 = r0.a
            n62 r8 = (defpackage.n62) r8
            boolean r6 = r6.b
            if (r8 != r7) goto L_0x002d
            r4 = r6
            goto L_0x0031
        L_0x002d:
            if (r6 != 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r4 = r5
        L_0x0031:
            if (r4 == 0) goto L_0x000b
            r1.add(r3)
            goto L_0x000b
        L_0x0037:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0040:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0104
            java.lang.Object r3 = r1.next()
            l3e r3 = (defpackage.l3e) r3
            e2e r6 = r3.a
            java.lang.String r7 = r6.h
            java.lang.Object r8 = r0.b
            t97 r8 = (t97) r8
            java.lang.String r6 = r6.c
            if (r7 == 0) goto L_0x0066
            int r9 = r7.length()
            if (r9 != 0) goto L_0x005f
            goto L_0x0066
        L_0x005f:
            int r9 = r7.length()
            if (r9 != r4) goto L_0x0066
            goto L_0x0076
        L_0x0066:
            java.lang.Object r9 = r8.getValue()
            gsc r9 = (defpackage.gsc) r9
            boolean r9 = r9.h(r6, r7)
            if (r9 == 0) goto L_0x0076
            android.text.SpannableStringBuilder r6 = r0.y(r7, r6)
        L_0x0076:
            e2e r3 = r3.a
            java.lang.String r7 = r3.h
            java.lang.String r9 = r3.d
            r10 = 0
            if (r7 == 0) goto L_0x0095
            int r11 = r7.length()
            if (r11 != 0) goto L_0x0086
            goto L_0x0095
        L_0x0086:
            int r11 = r7.length()
            if (r11 != r4) goto L_0x0095
            if (r9 == 0) goto L_0x00af
            int r7 = r9.length()
            if (r7 != 0) goto L_0x00b0
            goto L_0x00af
        L_0x0095:
            if (r9 == 0) goto L_0x00af
            int r11 = r9.length()
            if (r11 != 0) goto L_0x009e
            goto L_0x00af
        L_0x009e:
            java.lang.Object r8 = r8.getValue()
            gsc r8 = (defpackage.gsc) r8
            boolean r8 = r8.h(r9, r7)
            if (r8 == 0) goto L_0x00b0
            android.text.SpannableStringBuilder r9 = r0.y(r7, r9)
            goto L_0x00b0
        L_0x00af:
            r9 = r10
        L_0x00b0:
            if (r6 == 0) goto L_0x00bb
            boolean r7 = h0e.c0(r6)
            if (r7 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            r7 = r5
            goto L_0x00bc
        L_0x00bb:
            r7 = r4
        L_0x00bc:
            if (r7 == 0) goto L_0x00cd
            if (r9 == 0) goto L_0x00c9
            boolean r7 = h0e.c0(r9)
            if (r7 == 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r7 = r5
            goto L_0x00ca
        L_0x00c9:
            r7 = r4
        L_0x00ca:
            if (r7 == 0) goto L_0x00cd
            goto L_0x00fd
        L_0x00cd:
            long r12 = r3.a
            if (r6 != 0) goto L_0x00d7
            java.lang.String r6 = "id"
            java.lang.String r6 = defpackage.us8.i(r12, r6)
        L_0x00d7:
            r14 = r6
            java.lang.String r6 = ""
            if (r9 != 0) goto L_0x00df
            r16 = r6
            goto L_0x00e1
        L_0x00df:
            r16 = r9
        L_0x00e1:
            java.lang.String r7 = r3.f
            if (r7 != 0) goto L_0x00e7
            r15 = r6
            goto L_0x00e8
        L_0x00e7:
            r15 = r7
        L_0x00e8:
            java.lang.String r7 = r3.h
            if (r7 != 0) goto L_0x00ef
            r17 = r6
            goto L_0x00f1
        L_0x00ef:
            r17 = r7
        L_0x00f1:
            hw4 r18 = hw4.a
            x2e r10 = new x2e
            int r3 = r3.b
            r11 = r10
            r19 = r3
            r11.<init>(r12, r14, r15, r16, r17, r18, r19)
        L_0x00fd:
            if (r10 == 0) goto L_0x0040
            r2.add(r10)
            goto L_0x0040
        L_0x0104:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul7.D(java.util.List):java.util.ArrayList");
    }

    public void E(ij7 ij7) {
        ej7 ej7 = (ej7) this.b;
        if (ej7 != null) {
            ej7.a(true);
        }
        ExecutorService executorService = (ExecutorService) this.a;
        if (ij7 != null) {
            executorService.execute(new vp6(8, ij7));
        }
        executorService.shutdown();
    }

    public long F(gj7 gj7, dj7 dj7, int i) {
        Looper myLooper = Looper.myLooper();
        oyb.l(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ej7 ej7 = new ej7(this, myLooper, gj7, dj7, i, elapsedRealtime, 1);
        oyb.k(((ej7) this.b) == null);
        this.b = ej7;
        ej7.o = null;
        ((ExecutorService) this.a).execute(ej7);
        return elapsedRealtime;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        d8.f(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        throw r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x003e, B:20:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            java.lang.Object r12 = r11.b
            java.lang.String r12 = (java.lang.String) r12
            fn6 r0 = udd.e
            r1 = 0
            if (r0 != 0) goto L_0x000a
            goto L_0x001f
        L_0x000a:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x001f
            tn7 r2 = defpackage.tn7.X
            java.lang.Object r3 = r11.a
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "Fetch video. Local fetcher, path "
            java.lang.String r3 = defpackage.rf0.h(r4, r3)
            r0.d(r2, r12, r3, r1)
        L_0x001f:
            r2 = 0
            android.media.MediaMetadataRetriever r12 = new android.media.MediaMetadataRetriever     // Catch:{ all -> 0x0051 }
            r12.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r11.c     // Catch:{ all -> 0x0047 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0047 }
            java.lang.Object r4 = r11.a     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0047 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x0047 }
            r12.setDataSource(r0, r4)     // Catch:{ all -> 0x0047 }
            android.graphics.Point r0 = defpackage.x87.W(r12)     // Catch:{ all -> 0x0047 }
            int r2 = defpackage.x87.T(r12)     // Catch:{ all -> 0x0045 }
            long r2 = (long) r2
            d8.f(r12, r1)     // Catch:{ all -> 0x0042 }
            goto L_0x006c
        L_0x0042:
            r12 = move-exception
            r1 = r0
            goto L_0x0052
        L_0x0045:
            r1 = move-exception
            goto L_0x004b
        L_0x0047:
            r0 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
        L_0x004b:
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r4 = move-exception
            d8.f(r12, r1)     // Catch:{ all -> 0x0042 }
            throw r4     // Catch:{ all -> 0x0042 }
        L_0x0051:
            r12 = move-exception
        L_0x0052:
            java.lang.Object r0 = r11.b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r11.a
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Can't get video params for path "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            udd.s(r0, r4, r12)
            r0 = r1
        L_0x006c:
            wb5 r12 = new wb5
            java.lang.Object r11 = r11.a
            r9 = r11
            java.lang.String r9 = (java.lang.String) r9
            r11 = 0
            if (r0 == 0) goto L_0x007a
            int r1 = r0.x
            r6 = r1
            goto L_0x007b
        L_0x007a:
            r6 = r11
        L_0x007b:
            if (r0 == 0) goto L_0x007f
            int r11 = r0.y
        L_0x007f:
            r7 = r11
            int r8 = (int) r2
            r5 = 3
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            yb5 r11 = new yb5
            java.util.List r12 = java.util.Collections.singletonList(r12)
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul7.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void accept(Object obj) {
        kt ktVar = (kt) obj;
        udd.q(ck4.i, "MsgGetCmd success");
        ((ck4) this.a).c((i22) this.b, (nzc) this.c);
    }

    public void b() {
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            ((n83) this.a).f();
            ((g73) this.c).b();
        }
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

    public void d(xi4 xi4) {
        ((n83) this.a).a(xi4);
    }

    public void e(cke cke, i75 i75, pse pse) {
        this.b = cke;
        pse.a();
        pse.b();
        bpe B = i75.B(pse.e, 5);
        this.c = B;
        B.e((xu5) this.a);
    }

    public void f(ija ija) {
        long d;
        long j;
        oyb.l((cke) this.b);
        int i = oze.a;
        cke cke = (cke) this.b;
        synchronized (cke) {
            try {
                long j2 = cke.c;
                d = j2 != -9223372036854775807L ? j2 + cke.b : cke.d();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        cke cke2 = (cke) this.b;
        synchronized (cke2) {
            j = cke2.b;
        }
        if (d != -9223372036854775807L && j != -9223372036854775807L) {
            xu5 xu5 = (xu5) this.a;
            if (j != xu5.s) {
                uu5 a2 = xu5.a();
                a2.r = j;
                xu5 xu52 = new xu5(a2);
                this.a = xu52;
                ((bpe) this.c).e(xu52);
            }
            int a3 = ija.a();
            ((bpe) this.c).b(ija, a3, 0);
            ((bpe) this.c).a(d, 1, a3, 0, (zoe) null);
        }
    }

    public void g(EncodeException encodeException) {
        ((sn1) this.a).d(encodeException);
    }

    public int h(long j) {
        long[] jArr = (long[]) this.c;
        int b2 = oze.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public void i() {
        ((sn1) this.a).b((Object) null);
    }

    public void j(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("filters must not be null");
        } else if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                IntentFilter intentFilter = (IntentFilter) it.next();
                if (intentFilter != null) {
                    if (((ArrayList) this.c) == null) {
                        this.c = new ArrayList();
                    }
                    if (!((ArrayList) this.c).contains(intentFilter)) {
                        ((ArrayList) this.c).add(intentFilter);
                    }
                }
            }
        }
    }

    public long k(int i) {
        boolean z = false;
        oyb.d(i >= 0);
        long[] jArr = (long[]) this.c;
        if (i < jArr.length) {
            z = true;
        }
        oyb.d(z);
        return jArr[i];
    }

    public at l(gs4 gs4, Looper looper, zs zsVar, s93 s93) {
        t74 t74 = new t74();
        if (gs4.d) {
            synchronized (t74) {
                t74.c = 4;
            }
        }
        return new ci9((Context) this.c, gs4, new n94((Context) this.c, t74), (k13) this.a, s93.b, looper, zsVar, (z7e) this.b);
    }

    public void m(xw4 xw4) {
        y5c y5c = (y5c) this.c;
        MediaMuxer mediaMuxer = y5c.C;
        na0 na0 = (na0) this.b;
        if (mediaMuxer != null) {
            try {
                y5c.K(xw4, na0);
                xw4.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else if (!y5c.r) {
            xw4 xw42 = y5c.U;
            if (xw42 != null) {
                xw42.close();
                y5c.U = null;
            }
            if (xw4.I()) {
                y5c.U = xw4;
                if (!y5c.n() || !y5c.V.g()) {
                    y5c.C(na0);
                    return;
                }
                return;
            }
            xx4 xx4 = y5c.F;
            xx4.h.execute(new lx4(xx4, 3));
            xw4.close();
            return;
        } else {
            xw4.close();
            return;
        }
        throw th;
    }

    public Object n() {
        Object n = ((c1g) this.a).n();
        w1g w1g = (w1g) ((c1g) this.b).n();
        Context context = (Context) ((c1g) this.c).a.a;
        if (context != null) {
            return new y3g((y5g) n, context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public ta8 o() {
        ArrayList arrayList = (ArrayList) this.c;
        Bundle bundle = (Bundle) this.a;
        if (arrayList != null) {
            bundle.putParcelableArrayList("controlFilters", arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.b;
        if (arrayList2 != null) {
            bundle.putStringArrayList("groupMemberIds", arrayList2);
        }
        return new ta8(bundle);
    }

    public void onError(Throwable th) {
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            ((n83) this.a).f();
            ((g73) this.c).onError(th);
            return;
        }
        xs7.F(th);
    }

    public void p(r34 r34) {
        ((y5c) this.c).G = r34;
    }

    public List q(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            List list = (List) this.a;
            if (i2 >= list.size()) {
                break;
            }
            int i3 = i2 * 2;
            long[] jArr = (long[]) this.b;
            if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                jqf jqf = (jqf) list.get(i2);
                uw3 uw3 = jqf.a;
                if (uw3.e == -3.4028235E38f) {
                    arrayList2.add(jqf);
                } else {
                    arrayList.add(uw3);
                }
            }
            i2++;
        }
        Collections.sort(arrayList2, new yqf(0));
        while (i < arrayList2.size()) {
            uw3 uw32 = ((jqf) arrayList2.get(i)).a;
            ArrayList arrayList3 = arrayList2;
            uw3 uw33 = r4;
            uw3 uw34 = new uw3(uw32.a, uw32.b, uw32.c, uw32.d, (float) (-1 - i), 1, uw32.g, uw32.h, uw32.i, uw32.n, uw32.o, uw32.j, uw32.k, uw32.l, uw32.m, uw32.p, uw32.q);
            arrayList.add(uw33);
            i++;
            arrayList2 = arrayList3;
        }
        return arrayList;
    }

    public String r(int i, long j, long j2, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            List list = (List) this.b;
            int size = list.size();
            List list2 = (List) this.a;
            if (i2 < size) {
                sb.append((String) list2.get(i2));
                if (((Integer) list.get(i2)).intValue() == 1) {
                    sb.append(str);
                } else {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    List list3 = (List) this.c;
                    if (intValue == 2) {
                        sb.append(String.format(Locale.US, (String) list3.get(i2), new Object[]{Long.valueOf(j)}));
                    } else if (((Integer) list.get(i2)).intValue() == 3) {
                        sb.append(String.format(Locale.US, (String) list3.get(i2), new Object[]{Integer.valueOf(i)}));
                    } else if (((Integer) list.get(i2)).intValue() == 4) {
                        sb.append(String.format(Locale.US, (String) list3.get(i2), new Object[]{Long.valueOf(j2)}));
                    }
                }
                i2++;
            } else {
                sb.append((String) list2.get(list.size()));
                return sb.toString();
            }
        }
    }

    public void s() {
        ej7 ej7 = (ej7) this.b;
        oyb.l(ej7);
        ej7.a(false);
    }

    public pda t(String str) {
        return (pda) ((ConcurrentHashMap) ((t97) this.c).getValue()).computeIfAbsent(str, new di(18, new lxc((Object) this, str, 6)));
    }

    public int u() {
        return ((long[]) this.c).length;
    }

    public long v() {
        r74 r74 = (r74) this.c;
        if (r74 != null) {
            return r74.o;
        }
        return -1;
    }

    public boolean w() {
        return ((IOException) this.c) != null;
    }

    public boolean x() {
        String trim;
        if (((String) this.a) != null) {
            return true;
        }
        Queue queue = (Queue) this.c;
        if (!queue.isEmpty()) {
            String str = (String) queue.poll();
            str.getClass();
            this.a = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.b).readLine();
            this.a = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.a = trim;
        } while (trim.isEmpty());
        return true;
    }

    public SpannableStringBuilder y(String str, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (!(charSequence == null || str == null)) {
            t97 t97 = (t97) this.b;
            for (fsc fsc : ((gsc) t97.getValue()).d(charSequence.toString(), ((gsc) t97.getValue()).e(charSequence.toString(), str))) {
                spannableStringBuilder.setSpan(new whe(km4.y0.n((Context) this.c).g(), new u1c(18)), fsc.a, fsc.b, 17);
            }
        }
        return spannableStringBuilder;
    }

    public void z(qz3 qz3, Uri uri, Map map, long j, long j2, i75 i75) {
        boolean z;
        boolean z2 = true;
        r74 r74 = new r74(qz3, j, j2);
        this.c = r74;
        if (((e75) this.b) == null) {
            Uri uri2 = uri;
            Map map2 = map;
            e75[] b2 = ((k75) this.a).b(uri, map);
            int length = b2.length;
            po5 po5 = ws6.b;
            ete.l(length, "expectedSize");
            ms6 ms6 = new ms6(length);
            if (b2.length == 1) {
                this.b = b2[0];
            } else {
                int length2 = b2.length;
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        break;
                    }
                    e75 e75 = b2[i];
                    try {
                        if (e75.n(r74)) {
                            this.b = e75;
                            r74.Y = 0;
                            break;
                        }
                        ms6.e(e75.o());
                        z = ((e75) this.b) != null || r74.o == j;
                        oyb.k(z);
                        r74.Y = 0;
                        i++;
                    } catch (EOFException unused) {
                        z = ((e75) this.b) != null || r74.o == j;
                    } catch (Throwable th) {
                        if (((e75) this.b) == null && r74.o != j) {
                            z2 = false;
                        }
                        oyb.k(z2);
                        r74.Y = 0;
                        throw th;
                    }
                }
                if (((e75) this.b) == null) {
                    StringBuilder sb = new StringBuilder("None of the available extractors (");
                    o15 o15 = new o15(", ", 1);
                    Iterator it = jjd.S(new ak0(5), ws6.k(b2)).iterator();
                    StringBuilder sb2 = new StringBuilder();
                    o15.a(sb2, it);
                    sb.append(sb2.toString());
                    sb.append(") could read the stream.");
                    String sb3 = sb.toString();
                    uri.getClass();
                    e8c j3 = ms6.j();
                    ParserException parserException = new ParserException(sb3, (Exception) null, false, 1);
                    ws6.j(j3);
                    throw parserException;
                }
            }
            ((e75) this.b).S(i75);
        }
    }

    public /* synthetic */ ul7(boolean z, Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public ul7(String str, int i) {
        switch (i) {
            case Protos.Attaches.Attach.PRESENT:
                uu5 uu5 = new uu5();
                uu5.m = c49.l(str);
                this.a = new xu5(uu5);
                return;
            default:
                String concat = "ExoPlayer:Loader:".concat(str);
                int i2 = oze.a;
                this.a = Executors.newSingleThreadExecutor(new v93(2, concat));
                return;
        }
    }

    public ul7(String str, String str2) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        if (str != null) {
            bundle.putString(ApiProtocol.KEY_ID, str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            }
            throw new NullPointerException("name must not be null");
        }
        throw new NullPointerException("id must not be null");
    }

    public ul7(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.c = arrayDeque;
        this.b = bufferedReader;
    }
}
