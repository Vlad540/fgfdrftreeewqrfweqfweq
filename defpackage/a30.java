package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* renamed from: a30  reason: default package */
public final class a30 implements yg7 {
    public final Object X;
    public Object Y;
    public Object Z;
    public boolean a;
    public final Object b;
    public Object c;
    public Object o;
    public Object w0;
    public Object x0;
    public Object y0;

    public a30(v2d v2d, dja dja, dja dja2, dja dja3, dja dja4, dja dja5, dja dja6, dja dja7, dja dja8, boolean z) {
        this.b = v2d;
        this.c = dja;
        this.o = dja2;
        this.X = dja3;
        this.Y = dja4;
        this.Z = dja5;
        this.w0 = dja6;
        this.x0 = dja7;
        this.y0 = dja8;
        this.a = z;
    }

    public void a(int i, int i2) {
        hda hda = (hda) this.o;
        if (hda != null) {
            hda.m(i);
            j9e i3 = hda.i();
            c(i3, i2);
            hda.b(i3, i2, hda.b.isEmpty());
            j();
        }
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, ox3] */
    public ox3 b(hda hda, ViewPager2 viewPager2, u16 u16, i26 i26) {
        this.o = hda;
        this.Y = u16;
        this.Z = i26;
        jt5 jt5 = new jt5(0, this);
        hda.a(jt5);
        this.c = jt5;
        it5 it5 = new it5(this, hda, 0);
        it5 it52 = new it5(this, hda, 1);
        ? obj = new Object();
        obj.d = hda;
        obj.e = viewPager2;
        obj.a = true;
        obj.b = false;
        obj.f = it5;
        obj.g = it52;
        return obj;
    }

    public void c(j9e j9e, int i) {
        View view = j9e.e;
        gda gda = view instanceof gda ? (gda) view : null;
        sz9 sz9 = (sz9) ((mu) this.x0).f.get(i);
        if (gda != null) {
            gda.setTabItem(sz9);
            return;
        }
        hda hda = (hda) this.o;
        if (hda != null) {
            gda gda2 = new gda(hda.getContext());
            gda2.setIndicatorVisible(this.a);
            gda2.setTabItem(sz9);
            j9e.e = gda2;
            l9e l9e = j9e.g;
            if (l9e != null) {
                l9e.e();
            }
            j9e.g.setOnLongClickListener(new d32(this, gda2, sz9, 8));
            int X2 = a24.X(((float) 13) * dh4.c().getDisplayMetrics().density);
            l9e l9e2 = j9e.g;
            l9e2.setPadding(X2, l9e2.getPaddingTop(), X2, l9e2.getPaddingBottom());
            l9e l9e3 = j9e.g;
            afa.a(l9e3, new re(23, l9e3, this));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public void d(int i, int i2) {
        hda hda = (hda) this.o;
        if (hda != null) {
            int i3 = i2 + i;
            while (i < i3) {
                j9e i4 = hda.i();
                c(i4, i);
                hda.b(i4, i, hda.b.isEmpty());
                i++;
            }
            j();
        }
    }

    public void e(int i, int i2) {
        hda hda = (hda) this.o;
        if (hda != null) {
            if (i == 0 && i2 == hda.getTabCount()) {
                hda.k();
                return;
            }
            int i3 = i2 + i;
            while (i < i3) {
                hda.m(i);
                i++;
            }
            j();
        }
    }

    public void f(int i, int i2, Object obj) {
        hda hda = (hda) this.o;
        if (hda != null) {
            int i3 = i2 + i;
            while (i < i3) {
                j9e h = hda.h(i);
                if (h != null) {
                    sz9 sz9 = (sz9) ((mu) this.x0).f.get(i);
                    View view = h.e;
                    gda gda = view instanceof gda ? (gda) view : null;
                    if (gda != null) {
                        gda.setTabItem(sz9);
                    }
                }
                i++;
            }
            j();
        }
    }

    public void g(w20 w20) {
        h9c h9c;
        boolean z;
        npe npe;
        if (this.a && !w20.equals((w20) this.w0)) {
            this.w0 = w20;
            c54 c54 = (c54) ((r34) this.c).b;
            c54.getClass();
            Looper myLooper = Looper.myLooper();
            Looper looper = c54.i0;
            if (looper != myLooper) {
                throw new IllegalStateException(c3d.i("Current looper (", myLooper == null ? "null" : myLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
            } else if (!w20.equals(c54.x)) {
                c54.x = w20;
                lhd lhd = c54.s;
                if (lhd != null) {
                    m28 m28 = (m28) lhd.b;
                    synchronized (m28.a) {
                        h9c = m28.F0;
                    }
                    if (h9c != null) {
                        bc4 bc4 = (bc4) h9c;
                        synchronized (bc4.c) {
                            z = bc4.g.w0;
                        }
                        if (z && (npe = bc4.a) != null) {
                            ((z45) npe).w0.f(26);
                        }
                    }
                }
            }
        }
    }

    public void h(AudioDeviceInfo audioDeviceInfo) {
        i30 i30 = (i30) this.x0;
        i30 i302 = null;
        if (!oze.a(audioDeviceInfo, i30 == null ? null : i30.a)) {
            if (audioDeviceInfo != null) {
                i302 = new i30(audioDeviceInfo);
            }
            this.x0 = i302;
            g(w20.b((Context) this.b, (k20) this.y0, i302));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: sz9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: sz9} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.CharSequence, pz9] */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(java.util.List r24) {
        /*
            r23 = this;
            r0 = r23
            boolean r1 = r24.isEmpty()
            java.lang.Object r2 = r0.x0
            mu r2 = (defpackage.mu) r2
            r3 = 0
            if (r1 == 0) goto L_0x0011
            r2.b(r3, r3)
            return
        L_0x0011:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r24.size()
            r1.<init>(r4)
            java.util.Iterator r4 = r24.iterator()
            r6 = 0
            r8 = r6
            r7 = 1
        L_0x0021:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x00ed
            java.lang.Object r9 = r4.next()
            int r10 = r8 + 1
            if (r8 < 0) goto L_0x00e8
            dr5 r9 = (defpackage.dr5) r9
            java.lang.Object r11 = r0.y0
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L_0x003b
            if (r8 != 0) goto L_0x003b
            r8 = 1
            goto L_0x0041
        L_0x003b:
            java.lang.String r8 = r9.a
            boolean r8 = defpackage.hhd.f(r11, r8)
        L_0x0041:
            if (r8 == 0) goto L_0x0044
            r7 = r6
        L_0x0044:
            java.lang.String r11 = r9.a
            java.lang.Object r12 = r0.X
            jc9 r12 = (defpackage.jc9) r12
            java.lang.Object r13 = r12.f(r11)
            dv3 r15 = r9.d
            if (r13 != 0) goto L_0x0078
            sz9 r13 = new sz9
            if (r8 == 0) goto L_0x0059
            r19 = 1
            goto L_0x005b
        L_0x0059:
            r19 = 2
        L_0x005b:
            pz9 r14 = new pz9
            int r5 = r15.a
            r14.<init>(r5)
            java.lang.String r5 = r9.a
            r21 = 0
            java.lang.CharSequence r3 = r9.b
            r22 = 0
            r16 = r13
            r17 = r5
            r18 = r3
            r20 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r12.k(r11, r13)
        L_0x0078:
            sz9 r13 = (defpackage.sz9) r13
            if (r8 == 0) goto L_0x007e
            r14 = 1
            goto L_0x007f
        L_0x007e:
            r14 = 2
        L_0x007f:
            int r3 = r13.c
            java.lang.CharSequence r5 = r9.b
            if (r3 != r14) goto L_0x00cb
            fja r3 = r13.d
            boolean r8 = r3 instanceof defpackage.pz9
            if (r8 == 0) goto L_0x00cb
            pz9 r3 = (defpackage.pz9) r3
            int r3 = r3.e
            int r8 = r15.a
            if (r3 != r8) goto L_0x00cb
            java.lang.CharSequence r3 = r13.b
            boolean r8 = defpackage.p0e.J(r3, r5)
            if (r8 != 0) goto L_0x009f
            r24 = r4
            r3 = r6
            goto L_0x00c8
        L_0x009f:
            boolean r8 = r3 instanceof android.text.Spanned
            if (r8 == 0) goto L_0x00c5
            boolean r8 = r5 instanceof android.text.Spanned
            if (r8 == 0) goto L_0x00c5
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r8 = r3.length()
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            java.lang.Object[] r3 = r3.getSpans(r6, r8, r11)
            r8 = r5
            android.text.Spanned r8 = (android.text.Spanned) r8
            r24 = r4
            int r4 = r8.length()
            java.lang.Object[] r4 = r8.getSpans(r6, r4, r11)
            boolean r3 = defpackage.cs.O(r3, r4)
            goto L_0x00c8
        L_0x00c5:
            r24 = r4
            r3 = 1
        L_0x00c8:
            if (r3 != 0) goto L_0x00da
            goto L_0x00cd
        L_0x00cb:
            r24 = r4
        L_0x00cd:
            pz9 r3 = new pz9
            int r4 = r15.a
            r3.<init>(r4)
            r4 = 49
            sz9 r13 = defpackage.sz9.a(r13, r5, r14, r3, r4)
        L_0x00da:
            java.lang.String r3 = r9.a
            r12.k(r3, r13)
            r1.add(r13)
            r4 = r24
            r8 = r10
            r3 = 0
            goto L_0x0021
        L_0x00e8:
            defpackage.p23.G()
            r3 = 0
            throw r3
        L_0x00ed:
            if (r7 == 0) goto L_0x0103
            java.lang.Object r4 = r1.get(r6)
            sz9 r4 = (defpackage.sz9) r4
            r5 = 59
            r7 = 1
            sz9 r4 = defpackage.sz9.a(r4, r3, r7, r3, r5)
            java.lang.String r3 = r4.a
            r0.y0 = r3
            r1.set(r6, r4)
        L_0x0103:
            java.lang.Object r3 = r0.o
            hda r3 = (defpackage.hda) r3
            if (r3 != 0) goto L_0x010c
            r0.w0 = r1
            return
        L_0x010c:
            r0 = 0
            r2.b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a30.i(java.util.List):void");
    }

    public void j() {
        hda hda = (hda) this.o;
        if (hda != null) {
            int tabCount = hda.getTabCount();
            mu muVar = (mu) this.x0;
            if (!muVar.f.isEmpty() && tabCount != 0) {
                int i = tabCount - 1;
                Iterator it = muVar.f.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (((sz9) it.next()).c == 1) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 <= i) {
                    i = i2;
                }
                if (i >= 0 && i != hda.getSelectedTabPosition()) {
                    hda.o(hda.h(i), true);
                }
            }
        }
    }

    public a30(ExecutorService executorService, int i) {
        boolean z = (i & 1) != 0;
        executorService = (i & 2) != 0 ? tp2.a.c().a() : executorService;
        xr7 b2 = tp2.a.b();
        this.a = z;
        this.b = b2;
        this.X = new jc9();
        this.x0 = new mu(this, new qe4((Object) executorService, 4, (Object) new w04(6)));
    }

    public a30(Context context, r34 r34, k20 k20, i30 i30) {
        Uri uri;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = r34;
        this.y0 = k20;
        this.x0 = i30;
        z20 z20 = null;
        Handler p = oze.p((fi4) null);
        this.o = p;
        int i = oze.a;
        this.X = i >= 23 ? new y20(this) : null;
        this.Y = i >= 21 ? new an(1, this) : null;
        w20 w20 = w20.c;
        String str = oze.c;
        if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
            uri = Settings.Global.getUriFor("external_surround_sound_enabled");
        } else {
            uri = null;
        }
        this.Z = uri != null ? new z20(this, p, applicationContext.getContentResolver(), uri) : z20;
    }
}
