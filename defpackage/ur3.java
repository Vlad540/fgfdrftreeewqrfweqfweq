package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.ui.common.c;
import com.facebook.fresco.ui.common.d;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: ur3  reason: default package */
public final class ur3 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public ur3(xp0 xp0, r57 r57, yuf yuf, ur3[] ur3Arr) {
        this.b = xp0;
        this.c = r57;
        this.d = yuf;
        this.e = ur3Arr;
        this.f = r57.a;
        int ordinal = yuf.ordinal();
        if (ur3Arr != null) {
            ur3 ur3 = ur3Arr[ordinal];
            if (ur3 != null || ur3 != this) {
                ur3Arr[ordinal] = this;
            }
        }
    }

    public void a() {
        if (!this.a) {
            ViewPager2 viewPager2 = (ViewPager2) this.c;
            f6c adapter = viewPager2.getAdapter();
            this.e = adapter;
            if (adapter != null) {
                this.a = true;
                TabLayout tabLayout = (TabLayout) this.b;
                ic6 ic6 = new ic6(tabLayout, 2);
                this.f = ic6;
                viewPager2.b(ic6);
                jt5 jt5 = new jt5(3, viewPager2);
                this.g = jt5;
                tabLayout.a(jt5);
                jw4 jw4 = new jw4(8, this);
                this.h = jw4;
                ((f6c) this.e).z(jw4);
                s();
                tabLayout.q(viewPager2.getCurrentItem(), 0.0f, true, true, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        r6 = r5[r1.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ur3 b(defpackage.syc r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            r57 r0 = (defpackage.r57) r0
            yuf r1 = defpackage.a06.I(r0, r6)
            char r2 = r1.a
            java.lang.Object r3 = r5.b
            xp0 r3 = (defpackage.xp0) r3
            r3.u(r2)
            r3.j()
            java.lang.Object r2 = r5.g
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x003a
            java.lang.Object r4 = r5.h
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0024
            java.lang.String r4 = r6.a()
        L_0x0024:
            r3.o()
            r5.m(r2)
            r6 = 58
            r3.u(r6)
            r3.y()
            r5.m(r4)
            r6 = 0
            r5.g = r6
            r5.h = r6
        L_0x003a:
            java.lang.Object r6 = r5.d
            yuf r6 = (defpackage.yuf) r6
            if (r6 != r1) goto L_0x0041
            return r5
        L_0x0041:
            java.lang.Object r5 = r5.e
            ur3[] r5 = (defpackage.ur3[]) r5
            if (r5 == 0) goto L_0x0050
            int r6 = r1.ordinal()
            r6 = r5[r6]
            if (r6 == 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            ur3 r6 = new ur3
            r6.<init>(r3, r0, r1, r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur3.b(syc):ur3");
    }

    public void c() {
        f6c f6c = (f6c) this.e;
        if (f6c != null) {
            f6c.B((jw4) this.h);
            this.h = null;
        }
        ((TabLayout) this.b).l((jt5) this.g);
        ((ViewPager2) this.c).g((ic6) this.f);
        this.g = null;
        this.f = null;
        this.e = null;
        this.a = false;
    }

    public void d(boolean z) {
        if (this.a) {
            m(String.valueOf(z));
        } else {
            ((og0) ((xp0) this.b).b).K(String.valueOf(z));
        }
    }

    public void e(syc syc, int i, boolean z) {
        f(syc, i);
        d(z);
    }

    public void f(syc syc, int i) {
        int ordinal = ((yuf) this.d).ordinal();
        boolean z = true;
        xp0 xp0 = (xp0) this.b;
        if (ordinal == 1) {
            if (!xp0.a) {
                xp0.u(',');
            }
            xp0.o();
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                if (!xp0.a) {
                    xp0.u(',');
                }
                xp0.o();
                bm3.x((r57) this.c, syc);
                m(syc.g(i));
                xp0.u(':');
                xp0.y();
                return;
            }
            if (i == 0) {
                this.a = true;
            }
            if (i == 1) {
                xp0.u(',');
                xp0.y();
                this.a = false;
            }
        } else if (!xp0.a) {
            if (i % 2 == 0) {
                xp0.u(',');
                xp0.o();
            } else {
                xp0.u(':');
                xp0.y();
                z = false;
            }
            this.a = z;
        } else {
            this.a = true;
            xp0.o();
        }
    }

    public void g(syc syc, int i) {
        m(syc.g(i));
    }

    public void h() {
        ((xp0) this.b).v("null");
    }

    public void i(syc syc, int i, Object obj) {
        d0e d0e = d0e.a;
        if (obj != null || ((t57) this.f).f) {
            j(syc, i, obj);
        }
    }

    public void j(syc syc, int i, Object obj) {
        d0e d0e = d0e.a;
        f(syc, i);
        d0e d0e2 = d0e.a;
        if (obj == null) {
            h();
        } else {
            l(d0e, obj);
        }
    }

    public void k(syc syc, int i, l77 l77, Object obj) {
        f(syc, i);
        l(l77, obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(defpackage.l77 r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            r57 r0 = (defpackage.r57) r0
            t57 r1 = r0.a
            boolean r2 = r1.i
            if (r2 == 0) goto L_0x000e
            r5.b(r4, r6)
            goto L_0x0075
        L_0x000e:
            int r1 = r1.p
            int r1 = defpackage.hr1.t(r1)
            if (r1 == 0) goto L_0x0063
            r2 = 1
            if (r1 == r2) goto L_0x0023
            r0 = 2
            if (r1 != r0) goto L_0x001d
            goto L_0x0063
        L_0x001d:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x0023:
            syc r1 = r5.d()
            d8 r1 = r1.e()
            t0e r2 = defpackage.t0e.f
            boolean r2 = defpackage.hhd.f(r1, r2)
            if (r2 != 0) goto L_0x003b
            t0e r2 = defpackage.t0e.i
            boolean r1 = defpackage.hhd.f(r1, r2)
            if (r1 == 0) goto L_0x0063
        L_0x003b:
            syc r1 = r5.d()
            java.util.List r1 = r1.getAnnotations()
            java.util.Iterator r1 = r1.iterator()
        L_0x0047:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r1.next()
            java.lang.annotation.Annotation r2 = (java.lang.annotation.Annotation) r2
            boolean r3 = r2 instanceof defpackage.s57
            if (r3 == 0) goto L_0x0047
            s57 r2 = (defpackage.s57) r2
            java.lang.String r0 = r2.discriminator()
            goto L_0x0064
        L_0x005e:
            t57 r0 = r0.a
            java.lang.String r0 = r0.j
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            if (r0 == 0) goto L_0x0072
            syc r1 = r5.d()
            java.lang.String r1 = r1.a()
            r4.g = r0
            r4.h = r1
        L_0x0072:
            r5.b(r4, r6)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur3.l(l77, java.lang.Object):void");
    }

    public void m(String str) {
        ((xp0) this.b).w(str);
    }

    public void n(syc syc, int i, String str) {
        f(syc, i);
        m(str);
    }

    public void o() {
        yuf yuf = (yuf) this.d;
        char c2 = yuf.b;
        xp0 xp0 = (xp0) this.b;
        xp0.z();
        xp0.q();
        xp0.u(yuf.b);
    }

    public void p(d dVar, sq6 sq6) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        y66 y66;
        lfc lfc;
        dVar.getClass();
        if (this.a && (copyOnWriteArrayList = (CopyOnWriteArrayList) this.h) != null && !copyOnWriteArrayList.isEmpty()) {
            if (!(sq6 != sq6.c || (y66 = ((xwa) this.b).h) == null || (lfc = y66.d) == null)) {
                Rect bounds = lfc.getBounds();
                bounds.width();
                d dVar2 = (d) this.d;
                dVar2.getClass();
                bounds.height();
                dVar2.getClass();
            }
            c b2 = dVar.b2();
            Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
            while (it.hasNext()) {
                ((ImagePerfDataListener) it.next()).onImageLoadStatusUpdated(b2, sq6);
            }
        }
    }

    public void q() {
        wr3 wr3 = (wr3) this.d;
        rr3 rr3 = (rr3) this.b;
        if (rr3 != null) {
            rr3.changeEnded(wr3, (xr3) this.e);
        }
        rr3 rr32 = (rr3) this.c;
        if (rr32 != null) {
            wr3.c.remove(rr32.getInstanceId());
            rr32.changeEnded(wr3, (xr3) this.f);
        }
        for (vr3 b2 : (List) this.g) {
            b2.b(rr32, rr3, this.a);
        }
        if (wr3.a) {
            ViewGroup viewGroup = null;
            View view = (View) this.h;
            ViewParent parent = view != null ? view.getParent() : null;
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        if (wr3.d() && rr3 != null) {
            rr3.setNeedsAttach(false);
        }
    }

    public FileInputStream r(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                ((tab) this.c).getClass();
            }
            return null;
        }
    }

    public void s() {
        int min;
        TabLayout tabLayout = (TabLayout) this.b;
        tabLayout.k();
        f6c f6c = (f6c) this.e;
        if (f6c != null) {
            int j = f6c.j();
            for (int i = 0; i < j; i++) {
                j9e i2 = tabLayout.i();
                ((m9e) this.d).c(i2, i);
                tabLayout.b(i2, tabLayout.b.size(), false);
            }
            if (j > 0 && (min = Math.min(((ViewPager2) this.c).getCurrentItem(), tabLayout.getTabCount() - 1)) != tabLayout.getSelectedTabPosition()) {
                tabLayout.o(tabLayout.h(min), true);
            }
        }
    }

    public void t(int i, Serializable serializable) {
        ((Executor) this.b).execute(new wg1((Object) this, i, (Object) serializable, 6));
    }

    public void u() {
        ArrayList arrayList;
        y7c y7c;
        int i;
        if (this.a) {
            ArrayList arrayList2 = new ArrayList();
            int i2 = Build.VERSION.SDK_INT;
            PackageManager packageManager = (PackageManager) this.e;
            if (i2 >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                for (ResolveInfo resolveInfo : packageManager.queryIntentServices(intent, 0)) {
                    arrayList3.add(resolveInfo.serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i3 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = (ArrayList) this.f;
                boolean z = true;
                y7c = (y7c) this.c;
                if (!hasNext) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((yb8.d == null ? false : yb8.c().d) && !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            ServiceInfo serviceInfo2 = (ServiceInfo) it2.next();
                            if (serviceInfo.packageName.equals(serviceInfo2.packageName) && serviceInfo.name.equals(serviceInfo2.name)) {
                                break;
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            i4 = -1;
                            break;
                        }
                        ComponentName componentName = ((x7c) arrayList.get(i4)).x0;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 < 0) {
                        x7c x7c = new x7c((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        x7c.E0 = new ss8(this, x7c);
                        if (!x7c.A0) {
                            if (x7c.F0) {
                                x7c.toString();
                            }
                            x7c.A0 = true;
                            x7c.m();
                        }
                        i = i3 + 1;
                        arrayList.add(i3, x7c);
                        ((ub8) y7c).a(x7c);
                    } else if (i4 >= i3) {
                        x7c x7c2 = (x7c) arrayList.get(i4);
                        if (!x7c2.A0) {
                            if (x7c.F0) {
                                x7c2.toString();
                            }
                            x7c2.A0 = true;
                            x7c2.m();
                        }
                        if (x7c2.C0 == null) {
                            if (!x7c2.A0 || (x7c2.X == null && x7c2.z0.isEmpty())) {
                                z = false;
                            }
                            if (z) {
                                x7c2.l();
                                x7c2.i();
                            }
                        }
                        i = i3 + 1;
                        Collections.swap(arrayList, i4, i3);
                    }
                    i3 = i;
                }
            }
            if (i3 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i3; size2--) {
                    x7c x7c3 = (x7c) arrayList.get(size2);
                    ub8 ub8 = (ub8) y7c;
                    wb8 d2 = ub8.d(x7c3);
                    if (d2 != null) {
                        x7c3.getClass();
                        yb8.b();
                        x7c3.o = null;
                        x7c3.h((va8) null);
                        ub8.l(d2, (pb8) null);
                        if (yb8.c) {
                            d2.toString();
                        }
                        ub8.m.b(514, d2);
                        ub8.i.remove(d2);
                    }
                    arrayList.remove(x7c3);
                    x7c3.E0 = null;
                    if (x7c3.A0) {
                        if (x7c.F0) {
                            x7c3.toString();
                        }
                        x7c3.A0 = false;
                        x7c3.m();
                    }
                }
            }
        }
    }

    public void v(boolean z) {
        this.a = z;
        if (z) {
            dr6 dr6 = (dr6) this.f;
            d dVar = (d) this.d;
            b69 b69 = (b69) this.c;
            if (dr6 == null) {
                this.f = new dr6(b69, dVar, this);
            }
            if (((cr6) this.e) == null) {
                this.e = new cr6(b69, dVar);
            }
            if (((xw5) this.g) == null) {
                this.g = new xw5((cr6) this.e);
            }
            dr6 dr62 = (dr6) this.f;
            if (dr62 != null) {
                ((xwa) this.b).g.addListener(dr62);
            }
            xw5 xw5 = (xw5) this.g;
            if (xw5 != null) {
                xwa xwa = (xwa) this.b;
                synchronized (xwa) {
                    try {
                        if (xwa.G == null) {
                            xwa.G = new HashSet();
                        }
                        xwa.G.add(xw5);
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                return;
            }
            return;
        }
        dr6 dr63 = (dr6) this.f;
        if (dr63 != null) {
            ((xwa) this.b).g.removeListener(dr63);
        }
        xw5 xw52 = (xw5) this.g;
        if (xw52 != null) {
            xwa xwa2 = (xwa) this.b;
            synchronized (xwa2) {
                HashSet hashSet = xwa2.G;
                if (hashSet != null) {
                    hashSet.remove(xw52);
                }
            }
        }
    }

    public boolean w() {
        return ((t57) this.f).a;
    }

    public ur3(AwakeTimeSinceBootClock awakeTimeSinceBootClock, xwa xwa) {
        this.c = awakeTimeSinceBootClock;
        this.b = xwa;
        u2 u2Var = new u2(6);
        sq6 sq6 = sq6.a;
        mdf mdf = mdf.a;
        this.d = u2Var;
    }

    public ur3(Context context, y7c y7c) {
        this.f = new ArrayList();
        this.g = new an(10, this);
        this.h = new vp6(23, this);
        this.b = context;
        this.c = y7c;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public ur3(TabLayout tabLayout, ViewPager2 viewPager2, m9e m9e) {
        this.b = tabLayout;
        this.c = viewPager2;
        this.d = m9e;
    }

    public ur3(AssetManager assetManager, Executor executor, tab tab, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = tab;
        this.f = str;
        this.e = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 29:
                case 30:
                    bArr = r1g.e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = r1g.d;
                    break;
            }
        }
        this.d = bArr;
    }

    public ur3(rr3 rr3, wr3 wr3, xr3 xr3, rr3 rr32, List list, View view, xr3 xr32, boolean z, ViewGroup viewGroup) {
        this.b = rr3;
        this.d = wr3;
        this.e = xr3;
        this.c = rr32;
        this.g = list;
        this.h = view;
        this.f = xr32;
        this.a = z;
    }
}
