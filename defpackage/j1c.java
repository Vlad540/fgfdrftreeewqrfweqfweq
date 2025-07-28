package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;

/* renamed from: j1c  reason: default package */
public final class j1c implements nn1, zhd, i36, CapturerObserver, uw9, hx9, n8c, c1g {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ j1c() {
        this.a = 6;
    }

    public static float c(int i, float[] fArr) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += fArr[i2];
        }
        if (i > 0) {
            return f / ((float) i);
        }
        return 0.0f;
    }

    public static hhd h(View view) {
        if (view instanceof AdapterView) {
            return new fpc(0);
        }
        if (view instanceof ScrollView) {
            return new fpc(3);
        }
        if (view instanceof RecyclerView) {
            return new gpc((RecyclerView) view);
        }
        if (view instanceof NestedScrollView) {
            return new fpc(2);
        }
        if (view instanceof HorizontalScrollView) {
            return new fpc(1);
        }
        if (view.getParent() instanceof View) {
            return h((View) view.getParent());
        }
        return null;
    }

    public static View i(View view) {
        if ((view instanceof AdapterView) || (view instanceof ScrollView) || (view instanceof RecyclerView) || (view instanceof NestedScrollView) || (view instanceof HorizontalScrollView)) {
            return view;
        }
        if (view.getParent() instanceof View) {
            return i((View) view.getParent());
        }
        return null;
    }

    public nsf M(View view, nsf nsf) {
        nsf f = eaf.f(view, nsf);
        if (f.a.m()) {
            return f;
        }
        int b2 = f.b();
        Rect rect = (Rect) this.b;
        rect.left = b2;
        rect.top = f.d();
        rect.right = f.c();
        rect.bottom = f.a();
        ViewPager viewPager = (ViewPager) this.c;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            nsf b3 = eaf.b(viewPager.getChildAt(i), f);
            rect.left = Math.min(b3.b(), rect.left);
            rect.top = Math.min(b3.d(), rect.top);
            rect.right = Math.min(b3.c(), rect.right);
            rect.bottom = Math.min(b3.a(), rect.bottom);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        csf dsf = Build.VERSION.SDK_INT >= 30 ? new dsf(f) : new csf(f);
        dsf.f(qy6.b(i2, i3, i4, i5));
        return dsf.b();
    }

    public void a(Object obj) {
        switch (this.a) {
            case 4:
                ((zhd) this.b).a(obj);
                return;
            case 5:
                ((zhd) this.b).a(obj);
                return;
            case 7:
                Void voidR = (Void) obj;
                e07.p((String) null, ((sn1) this.b).b((Object) null));
                return;
            default:
                e07.p("Unexpected result from SurfaceRequest. Surface was provided twice.", ((bb0) obj).a != 3);
                ((SurfaceTexture) this.b).release();
                jhe jhe = ((ihe) this.c).a;
                if (jhe.j != null) {
                    jhe.j = null;
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081 A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0 A[Catch:{ all -> 0x00ce }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(java.lang.Object r24, java.lang.Object r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            vde r1 = (defpackage.vde) r1
            r2 = r24
            v2g r2 = (defpackage.v2g) r2
            java.lang.Object r3 = r0.b
            ud r3 = (defpackage.ud) r3
            java.lang.Object r0 = r0.c
            r5 = r0
            com.google.android.gms.location.LocationRequest r5 = (com.google.android.gms.location.LocationRequest) r5
            r2.getClass()
            lt4 r0 = r3.x()
            java.lang.Object r4 = r0.c
            r13 = r4
            ih7 r13 = (defpackage.ih7) r13
            java.util.Objects.requireNonNull(r13)
            ib5[] r4 = r2.h()
            r6 = 0
            r7 = 0
            if (r4 == 0) goto L_0x004d
            r8 = r7
        L_0x002b:
            int r9 = r4.length
            if (r8 >= r9) goto L_0x003e
            r9 = r4[r8]
            java.lang.String r10 = "location_updates_with_callback"
            java.lang.String r11 = r9.a
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            int r8 = r8 + 1
            goto L_0x002b
        L_0x003e:
            r9 = r6
        L_0x003f:
            if (r9 != 0) goto L_0x0042
            goto L_0x004d
        L_0x0042:
            long r8 = r9.b()
            r10 = 1
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x004d
            r7 = 1
        L_0x004d:
            kgd r14 = r2.P0
            monitor-enter(r14)
            kgd r4 = r2.P0     // Catch:{ all -> 0x00ce }
            java.lang.Object r4 = r4.get(r13)     // Catch:{ all -> 0x00ce }
            u2g r4 = (defpackage.u2g) r4     // Catch:{ all -> 0x00ce }
            if (r4 == 0) goto L_0x0075
            if (r7 == 0) goto L_0x005d
            goto L_0x0075
        L_0x005d:
            ud r3 = r4.d     // Catch:{ all -> 0x00ce }
            monitor-enter(r3)     // Catch:{ all -> 0x00ce }
            java.lang.Object r8 = r3.c     // Catch:{ all -> 0x006e }
            lt4 r8 = (defpackage.lt4) r8     // Catch:{ all -> 0x006e }
            if (r8 == r0) goto L_0x006c
            r8.b = r6     // Catch:{ all -> 0x006e }
            r8.c = r6     // Catch:{ all -> 0x006e }
            r3.c = r0     // Catch:{ all -> 0x006e }
        L_0x006c:
            monitor-exit(r3)     // Catch:{ all -> 0x00ce }
            goto L_0x0070
        L_0x006e:
            r0 = move-exception
            goto L_0x0073
        L_0x0070:
            r0 = r4
            r4 = r6
            goto L_0x007f
        L_0x0073:
            monitor-exit(r3)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x0075:
            u2g r0 = new u2g     // Catch:{ all -> 0x00ce }
            r0.<init>(r3)     // Catch:{ all -> 0x00ce }
            kgd r3 = r2.P0     // Catch:{ all -> 0x00ce }
            r3.put(r13, r0)     // Catch:{ all -> 0x00ce }
        L_0x007f:
            if (r7 == 0) goto L_0x00d0
            android.os.IInterface r2 = r2.o()     // Catch:{ all -> 0x00ce }
            g6g r2 = (defpackage.g6g) r2     // Catch:{ all -> 0x00ce }
            java.lang.Object r3 = r13.a     // Catch:{ all -> 0x00ce }
            int r3 = java.lang.System.identityHashCode(r3)     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r7.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r8 = r13.b     // Catch:{ all -> 0x00ce }
            r7.append(r8)     // Catch:{ all -> 0x00ce }
            java.lang.String r8 = "@"
            r7.append(r8)     // Catch:{ all -> 0x00ce }
            r7.append(r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r20 = r7.toString()     // Catch:{ all -> 0x00ce }
            d3g r3 = new d3g     // Catch:{ all -> 0x00ce }
            if (r4 != 0) goto L_0x00aa
            r17 = r6
            goto L_0x00ac
        L_0x00aa:
            r17 = r4
        L_0x00ac:
            r16 = 2
            r19 = 0
            r15 = r3
            r18 = r0
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00ce }
            s2g r0 = new s2g     // Catch:{ all -> 0x00ce }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x00ce }
            android.os.Parcel r1 = r2.G0()     // Catch:{ all -> 0x00ce }
            defpackage.t1g.b(r1, r3)     // Catch:{ all -> 0x00ce }
            defpackage.t1g.b(r1, r5)     // Catch:{ all -> 0x00ce }
            r1.writeStrongBinder(r0)     // Catch:{ all -> 0x00ce }
            r0 = 88
            r2.H0(r1, r0)     // Catch:{ all -> 0x00ce }
            goto L_0x0124
        L_0x00ce:
            r0 = move-exception
            goto L_0x0126
        L_0x00d0:
            android.os.IInterface r2 = r2.o()     // Catch:{ all -> 0x00ce }
            g6g r2 = (defpackage.g6g) r2     // Catch:{ all -> 0x00ce }
            e3g r17 = new e3g     // Catch:{ all -> 0x00ce }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 0
            r4 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00ce }
            q2g r3 = new q2g     // Catch:{ all -> 0x00ce }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x00ce }
            java.lang.Object r1 = r13.a     // Catch:{ all -> 0x00ce }
            int r1 = java.lang.System.identityHashCode(r1)     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r4.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r5 = r13.b     // Catch:{ all -> 0x00ce }
            r4.append(r5)     // Catch:{ all -> 0x00ce }
            java.lang.String r5 = "@"
            r4.append(r5)     // Catch:{ all -> 0x00ce }
            r4.append(r1)     // Catch:{ all -> 0x00ce }
            java.lang.String r22 = r4.toString()     // Catch:{ all -> 0x00ce }
            f3g r1 = new f3g     // Catch:{ all -> 0x00ce }
            r16 = 1
            r18 = 0
            r20 = 0
            r15 = r1
            r19 = r0
            r21 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x00ce }
            android.os.Parcel r0 = r2.G0()     // Catch:{ all -> 0x00ce }
            defpackage.t1g.b(r0, r1)     // Catch:{ all -> 0x00ce }
            r1 = 59
            r2.H0(r0, r1)     // Catch:{ all -> 0x00ce }
        L_0x0124:
            monitor-exit(r14)     // Catch:{ all -> 0x00ce }
            return
        L_0x0126:
            monitor-exit(r14)     // Catch:{ all -> 0x00ce }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j1c.accept(java.lang.Object, java.lang.Object):void");
    }

    public f79 b(ws8 ws8) {
        float f;
        int s0 = ws8.s0();
        xm1 xm1 = null;
        Long l = null;
        float f2 = 1.0f;
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < s0; i++) {
            if (i == 0) {
                int v0 = ws8.v0();
                xm1 xm12 = (xm1) ((ConcurrentHashMap) ((gvf) this.b).b).get(Integer.valueOf(v0));
                if (xm12 != null) {
                    xm1 = xm12;
                } else {
                    throw new RuntimeException(wn6.h(v0, "Can't find compact id for "));
                }
            } else if (i == 1) {
                byte readByte = ws8.readByte();
                if (readByte == -54) {
                    f = ws8.m0(4).getFloat(ws8.z0);
                } else if (readByte == -53) {
                    f = (float) ws8.m0(8).getDouble(ws8.z0);
                } else {
                    throw ws8.r0("Float", readByte);
                }
                f2 = f;
            } else if (i == 2) {
                z = ws8.u0();
            } else if (i != 3) {
                if (i != 4) {
                    ws8.z();
                } else {
                    z2 = ws8.u0();
                }
            } else if (ws8.n().a() == 3) {
                l = Long.valueOf(ws8.w0());
            }
        }
        if (xm1 != null) {
            return new f79(xm1, f2, z, l, z2);
        }
        throw new RuntimeException("Watch together parse error");
    }

    public void d(xi4 xi4) {
        switch (this.a) {
            case 4:
                ((zhd) this.b).d(xi4);
                return;
            default:
                ((zhd) this.b).d(xi4);
                return;
        }
    }

    public void e(Throwable th) {
        switch (this.a) {
            case 7:
                if (th instanceof w4e) {
                    e07.p((String) null, ((ch7) this.c).cancel(false));
                    return;
                } else {
                    e07.p((String) null, ((sn1) this.b).b((Object) null));
                    return;
                }
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
    }

    public void f(long j, ija ija) {
        if (ija.a() >= 9) {
            int g = ija.g();
            int g2 = ija.g();
            int u = ija.u();
            if (g == 434 && g2 == 1195456820 && u == 3) {
                a06.r(j, ija, (bpe[]) this.c);
            }
        }
    }

    public void g(i75 i75, pse pse) {
        int i = 0;
        while (true) {
            bpe[] bpeArr = (bpe[]) this.c;
            if (i < bpeArr.length) {
                pse.a();
                pse.b();
                bpe B = i75.B(pse.e, 3);
                xu5 xu5 = (xu5) ((List) this.b).get(i);
                String str = xu5.n;
                oyb.c("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                uu5 uu5 = new uu5();
                pse.b();
                uu5.a = pse.f;
                uu5.m = c49.l(str);
                uu5.e = xu5.e;
                uu5.d = xu5.d;
                uu5.F = xu5.G;
                uu5.p = xu5.q;
                B.e(new xu5(uu5));
                bpeArr[i] = B;
                i++;
            } else {
                return;
            }
        }
    }

    public void j(y0c y0c, xbc xbc) {
        int intValue;
        ye6 ye6;
        ye6 ye62;
        String str;
        xbc xbc2 = xbc;
        pd pdVar = xbc2.B0;
        boolean z = true;
        try {
            ((k1c) this.b).a(xbc2, pdVar);
            y0c y0c2 = (y0c) pdVar.c;
            if (!y0c2.w0) {
                y0c2.w0 = true;
                y0c2.c.j();
                c1c f = ((m15) pdVar.Y).f();
                Socket socket = f.c;
                v0c v0c = f.g;
                u0c u0c = f.h;
                int i = 0;
                socket.setSoTimeout(0);
                f.k();
                b1c b1c = new b1c(pdVar, v0c, u0c);
                ye6 ye63 = xbc2.Y;
                int size = ye63.size();
                int i2 = 0;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                Integer num = null;
                Integer num2 = null;
                while (i2 < size) {
                    if (p0e.M(ye63.b(i2), "Sec-WebSocket-Extensions", z)) {
                        String d = ye63.d(i2);
                        int i3 = i;
                        while (i3 < d.length()) {
                            int g = nze.g(d, ',', i3, i, 4);
                            char c2 = ';';
                            int e = nze.e(';', i3, g, d);
                            String y = nze.y(i3, e, d);
                            int i4 = e + (z ? 1 : 0);
                            if (y.equalsIgnoreCase("permessage-deflate")) {
                                if (z2) {
                                    z5 = true;
                                }
                                while (i4 < g) {
                                    int e2 = nze.e(c2, i4, g, d);
                                    int e3 = nze.e('=', i4, e2, d);
                                    String y2 = nze.y(i4, e3, d);
                                    if (e3 < e2) {
                                        str = nze.y(e3 + 1, e2, d);
                                        ye62 = ye63;
                                        if (str.length() >= 2 && h0e.t0("\"", str) && h0e.U("\"", str)) {
                                            str = str.substring(1, str.length() - 1);
                                        }
                                    } else {
                                        ye62 = ye63;
                                        str = null;
                                    }
                                    int i5 = e2 + 1;
                                    if (y2.equalsIgnoreCase("client_max_window_bits")) {
                                        if (num != null) {
                                            z5 = true;
                                        }
                                        Integer G = str != null ? o0e.G(str) : null;
                                        num = G;
                                        if (G != null) {
                                            i4 = i5;
                                            ye63 = ye62;
                                            c2 = ';';
                                        }
                                    } else {
                                        if (y2.equalsIgnoreCase("client_no_context_takeover")) {
                                            if (z3) {
                                                z5 = true;
                                            }
                                            z5 = str != null ? true : z5;
                                            z3 = true;
                                        } else if (y2.equalsIgnoreCase("server_max_window_bits")) {
                                            if (num2 != null) {
                                                z5 = true;
                                            }
                                            Integer G2 = str != null ? o0e.G(str) : null;
                                            num2 = G2;
                                            if (G2 != null) {
                                            }
                                        } else if (y2.equalsIgnoreCase("server_no_context_takeover")) {
                                            if (z4) {
                                                z5 = true;
                                            }
                                            z5 = str != null ? true : z5;
                                            z4 = true;
                                        }
                                        i4 = i5;
                                        ye63 = ye62;
                                        c2 = ';';
                                    }
                                    z5 = true;
                                    i4 = i5;
                                    ye63 = ye62;
                                    c2 = ';';
                                }
                                ye6 = ye63;
                                i3 = i4;
                                z2 = true;
                            } else {
                                ye6 = ye63;
                                i3 = i4;
                                z5 = true;
                            }
                            ye63 = ye6;
                            z = true;
                            i = 0;
                        }
                    }
                    i2++;
                    ye63 = ye63;
                    z = true;
                    i = 0;
                }
                ((k1c) this.b).v = new mpf(z2, num, z3, num2, z4, z5);
                if (z5 || num != null || (num2 != null && (8 > (intValue = num2.intValue()) || 15 < intValue))) {
                    synchronized (((k1c) this.b)) {
                        ((k1c) this.b).j.clear();
                        ((k1c) this.b).b(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    ((k1c) this.b).d(nze.g + " WebSocket " + ((lac) this.c).b.g(), b1c);
                    ((k1c) this.b).s.b();
                    ((k1c) this.b).e();
                } catch (Exception e4) {
                    ((k1c) this.b).c(e4);
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IOException e5) {
            if (pdVar != null) {
                pdVar.a(true, true, (IOException) null);
            }
            ((k1c) this.b).c(e5);
            nze.c(xbc);
        }
    }

    public oef k(ws8 ws8) {
        int s0 = ws8.s0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < s0; i++) {
            try {
                arrayList.add(b(ws8));
            } catch (Throwable th) {
                ((xwb) this.c).log("WatchTogetherUpdateParser", "Can't parse video state update " + th);
            }
        }
        return new oef(new g79(arrayList));
    }

    public void l(Task task) {
        ((Map) ((d4b) this.c).c).remove((vde) this.b);
    }

    public void m() {
        k18 k18 = (k18) this.b;
        if (k18.a) {
            k18.d();
            for (int i = 0; i < 2; i++) {
                ((float[]) k18.d)[i] = ((float[]) k18.f)[i];
                ((float[]) k18.e)[i] = ((float[]) k18.g)[i];
            }
            if (!k18.a) {
                k18.a = true;
            }
        }
    }

    public Object n() {
        Context context = (Context) ((t4g) ((c1g) this.b)).a.a;
        if (context != null) {
            return new y5g(context, (d6g) ((c1g) this.c).n());
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public void onCapturerStarted(boolean z) {
        z7f z7f = (z7f) this.c;
        ((xwb) z7f.c).log("VideoRecord", "Capture started (success=" + z + "), notify listener");
        lyf lyf = z7f.Z;
        if (lyf != null) {
            ((jl7) lyf.a).g.execute(new kyf(lyf, z, !z));
        }
    }

    public void onCapturerStopped() {
        z7f z7f = (z7f) this.c;
        ((xwb) z7f.c).log("VideoRecord", "Capture stopped, notify listener");
        lyf lyf = z7f.Z;
        if (lyf != null) {
            ((jl7) lyf.a).g.execute(new kyf(lyf, false, false));
        }
    }

    public void onError(Throwable th) {
        Object obj;
        switch (this.a) {
            case 4:
                try {
                    ((mhd) this.c).c.accept(th);
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    th = new CompositeException(th, th2);
                }
                ((zhd) this.b).onError(th);
                return;
            default:
                aid aid = (aid) this.c;
                j26 j26 = aid.b;
                zhd zhd = (zhd) this.b;
                if (j26 != null) {
                    try {
                        obj = j26.apply(th);
                    } catch (Throwable th3) {
                        ek8.a0(th3);
                        zhd.onError(new CompositeException(th, th3));
                        return;
                    }
                } else {
                    obj = aid.c;
                }
                if (obj == null) {
                    NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                    nullPointerException.initCause(th);
                    zhd.onError(nullPointerException);
                    return;
                }
                zhd.a(obj);
                return;
        }
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        ((CapturerObserver) this.b).onFrameCaptured(videoFrame);
    }

    public void r(y0c y0c, IOException iOException) {
        ((k1c) this.b).c(iOException);
    }

    public /* synthetic */ j1c(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ j1c(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public j1c(k96 k96, View view) {
        this.a = 2;
        this.b = view;
    }

    public j1c(List list) {
        this.a = 10;
        this.b = list;
        this.c = new bpe[list.size()];
    }

    public j1c(ExecutorService executorService) {
        this.a = 1;
        this.c = new kgd(0);
        this.b = executorService;
    }

    public j1c(k18 k18) {
        this.a = 9;
        this.c = null;
        this.b = k18;
        k18.h = this;
    }

    public j1c(ViewPager viewPager) {
        this.a = 12;
        this.c = viewPager;
        this.b = new Rect();
    }
}
