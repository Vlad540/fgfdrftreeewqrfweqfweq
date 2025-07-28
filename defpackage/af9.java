package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.location.TamSupportMapFragment;

/* renamed from: af9  reason: default package */
public final class af9 extends v2 implements gne, xhe, ge9 {
    public final g2b A0;
    public final qmc B0;
    public final rf4 C0;
    public final boolean D0;
    public final ezd E0;
    public TamSupportMapFragment F0;
    public AppCompatImageView G0;
    public Group H0;
    public OneMeButton I0;
    public OneMeButton J0;
    public n97 K0;
    public gd9 L0;
    public ViewStub M0;
    public ef9 N0;
    public nt7 O0;
    public kt7 P0;
    public zg4 Q0;
    public ValueAnimator R0;
    public hm7 S0;
    public final w6a X;
    public final di3 Y;
    public final st7 Z;
    public final n83 o = new Object();
    public final bd w0;
    public final c x0;
    public final long y0;
    public final tg z0;

    /* JADX WARNING: type inference failed for: r1v1, types: [n83, java.lang.Object] */
    public af9(Context context, ViewGroup viewGroup, w6a w6a, di3 di3, st7 st7, bd bdVar, c cVar, long j, tg tgVar, j2b j2b, qmc qmc, rf4 rf4, boolean z, ezd ezd) {
        super(context);
        this.X = w6a;
        this.Y = di3;
        this.Z = st7;
        this.w0 = bdVar;
        this.x0 = cVar;
        this.y0 = j;
        this.z0 = tgVar;
        this.A0 = j2b;
        this.B0 = qmc;
        this.C0 = rf4;
        this.D0 = z;
        this.E0 = ezd;
        m(viewGroup, zrb.frg_location_map);
    }

    public final void A(long j, boolean z) {
        mv9 mv9;
        nt7 nt7 = this.O0;
        if (nt7 != null) {
            long j2 = nt7.q;
            nt7.q = j;
            tic.b(nt7.r);
            st7 st7 = nt7.e;
            Context context = (Context) this.b;
            synchronized (st7) {
                mv9 = new mv9(1, new e44(st7, 20, context));
            }
            yhd i = mv9.m(nt7.f).i(de.a());
            pn1 pn1 = new pn1(new rh0(nt7, j2, z, j), 2, new pv0(26));
            i.k(pn1);
            nt7.r = pn1;
        }
    }

    public final void B(double d, double d2, boolean z) {
        if (this.O0 != null) {
            if (z) {
                double[] D = D();
                if (this.H0.getVisibility() == 0 && Math.abs(D[0] - d) <= 0.001d && Math.abs(D[1] - d2) <= 0.001d) {
                    F();
                }
            }
            nt7 nt7 = this.O0;
            nt7.g.getClass();
            LatLng latLng = new LatLng(d, d2);
            try {
                m1g m1g = mt0.i;
                a24.p(m1g, "CameraUpdateFactory is not initialized");
                Parcel G02 = m1g.G0();
                u1g.b(G02, latLng);
                Parcel R = m1g.R(G02, 8);
                un6 K02 = ks9.K0(R.readStrongBinder());
                R.recycle();
                nt7.e(new gvf(6, new mod(K02)), true);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01c2, code lost:
        if (r6 != r4) goto L_0x01cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(java.util.List r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r4 = 1
            nt7 r5 = r0.O0
            if (r5 != 0) goto L_0x000a
            return
        L_0x000a:
            int r5 = r18.size()
            if (r5 > r4) goto L_0x0016
            nt7 r0 = r0.O0
            r0.b()
            return
        L_0x0016:
            r7e r5 = defpackage.wce.a0
            java.lang.Object r5 = r0.b
            android.content.Context r5 = (android.content.Context) r5
            wce r6 = fja.E(r5)
            if (r1 == 0) goto L_0x0025
            int r6 = r6.k
            goto L_0x0027
        L_0x0025:
            int r6 = r6.M
        L_0x0027:
            nt7 r7 = r0.O0
            zg4 r8 = r0.Q0
            int r8 = r8.b
            float r8 = (float) r8
            hm7 r0 = r0.S0
            long r9 = r0.o
            r7.c()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r11 = r18.size()
            r0.<init>(r11)
            java.util.Iterator r11 = r18.iterator()
        L_0x0042:
            boolean r12 = r11.hasNext()
            mod r13 = r7.d
            if (r12 == 0) goto L_0x00aa
            java.lang.Object r12 = r11.next()
            av7 r12 = (defpackage.av7) r12
            dm7 r14 = new dm7
            dm7 r15 = r12.a
            r16 = r5
            double r4 = r15.a
            double r2 = r15.b
            r14.<init>(r4, r2)
            r0.add(r14)
            j67 r14 = r7.j
            java.lang.Object r14 = r14.b()
            dv7 r14 = (defpackage.dv7) r14
            com.google.android.gms.maps.model.LatLng r15 = new com.google.android.gms.maps.model.LatLng
            r15.<init>(r4, r2)
            cv7 r2 = r14.a
            r2.a = r15
            r3 = 0
            r2.Z = r3
            r4 = 1056964608(0x3f000000, float:0.5)
            r2.X = r4
            r2.Y = r4
            r2.w0 = r3
            qr4 r2 = r7.h
            r2.getClass()
            om0 r2 = qr4.m()
            cv7 r3 = r14.a
            lhd r2 = r2.a
            r3.o = r2
            c9 r2 = r13.v(r14)
            long r3 = r12.j
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r2.x(r5)
            java.util.LinkedHashMap r5 = r7.b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            sh0 r4 = new sh0
            r4.<init>(r12, r2)
            r5.put(r3, r4)
            r5 = r16
            r4 = 1
            goto L_0x0042
        L_0x00aa:
            r16 = r5
            nfc r2 = r7.o
            r3 = 10
            if (r2 != 0) goto L_0x0156
            j67 r2 = r7.l
            java.lang.Object r2 = r2.b()
            c0b r2 = (defpackage.c0b) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r3 = q23.H(r0, r3)
            r4.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x00c7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00e0
            java.lang.Object r3 = r0.next()
            dm7 r3 = (defpackage.dm7) r3
            com.google.android.gms.maps.model.LatLng r5 = new com.google.android.gms.maps.model.LatLng
            double r11 = r3.a
            double r14 = r3.b
            r5.<init>(r11, r14)
            r4.add(r5)
            goto L_0x00c7
        L_0x00e0:
            b0b r0 = r2.a
            r0.getClass()
            java.util.Iterator r2 = r4.iterator()
        L_0x00e9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00fb
            java.lang.Object r3 = r2.next()
            com.google.android.gms.maps.model.LatLng r3 = (com.google.android.gms.maps.model.LatLng) r3
            java.util.List r4 = r0.a
            r4.add(r3)
            goto L_0x00e9
        L_0x00fb:
            r0.b = r8
            r0.c = r6
            r2 = 2
            r0.y0 = r2
            r13.getClass()
            java.lang.Object r2 = r13.b
            qe4 r2 = (qe4) r2
            r2.getClass()
            a0b r3 = new a0b     // Catch:{ RemoteException -> 0x014f }
            java.lang.Object r2 = r2.b     // Catch:{ RemoteException -> 0x014f }
            x3g r2 = (x3g) r2     // Catch:{ RemoteException -> 0x014f }
            android.os.Parcel r4 = r2.G0()     // Catch:{ RemoteException -> 0x014f }
            u1g.b(r4, r0)     // Catch:{ RemoteException -> 0x014f }
            r0 = 9
            android.os.Parcel r0 = r2.R(r4, r0)     // Catch:{ RemoteException -> 0x014f }
            android.os.IBinder r2 = r0.readStrongBinder()     // Catch:{ RemoteException -> 0x014f }
            int r4 = j1g.d     // Catch:{ RemoteException -> 0x014f }
            if (r2 != 0) goto L_0x0129
            r2 = 0
            goto L_0x013e
        L_0x0129:
            java.lang.String r4 = "com.google.android.gms.maps.model.internal.IPolylineDelegate"
            android.os.IInterface r5 = r2.queryLocalInterface(r4)     // Catch:{ RemoteException -> 0x014f }
            boolean r6 = r5 instanceof k1g     // Catch:{ RemoteException -> 0x014f }
            if (r6 == 0) goto L_0x0137
            r2 = r5
            k1g r2 = (k1g) r2     // Catch:{ RemoteException -> 0x014f }
            goto L_0x013e
        L_0x0137:
            i1g r5 = new i1g     // Catch:{ RemoteException -> 0x014f }
            r6 = 3
            r5.<init>(r2, r4, r6)     // Catch:{ RemoteException -> 0x014f }
            r2 = r5
        L_0x013e:
            r0.recycle()     // Catch:{ RemoteException -> 0x014f }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x014f }
            nfc r0 = new nfc
            r2 = 23
            r0.<init>(r2, r3)
            r7.o = r0
            goto L_0x0225
        L_0x014f:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0156:
            java.lang.Object r2 = r2.b
            a0b r2 = (a0b) r2
            r2.getClass()
            k1g r2 = r2.a     // Catch:{ RemoteException -> 0x0274 }
            i1g r2 = (i1g) r2     // Catch:{ RemoteException -> 0x0274 }
            android.os.Parcel r4 = r2.G0()     // Catch:{ RemoteException -> 0x0274 }
            r5 = 4
            android.os.Parcel r2 = r2.R(r4, r5)     // Catch:{ RemoteException -> 0x0274 }
            android.os.Parcelable$Creator r4 = com.google.android.gms.maps.model.LatLng.CREATOR     // Catch:{ RemoteException -> 0x0274 }
            java.util.ArrayList r4 = r2.createTypedArrayList(r4)     // Catch:{ RemoteException -> 0x0274 }
            r2.recycle()     // Catch:{ RemoteException -> 0x0274 }
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = q23.H(r4, r3)
            r2.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0180:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0199
            java.lang.Object r5 = r4.next()
            com.google.android.gms.maps.model.LatLng r5 = (com.google.android.gms.maps.model.LatLng) r5
            dm7 r8 = new dm7
            double r11 = r5.a
            double r13 = r5.b
            r8.<init>(r11, r13)
            r2.add(r8)
            goto L_0x0180
        L_0x0199:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            boolean r2 = r0.equals(r4)
            if (r2 == 0) goto L_0x01cc
            nfc r2 = r7.o
            java.lang.Object r2 = r2.b
            a0b r2 = (a0b) r2
            r2.getClass()
            k1g r2 = r2.a     // Catch:{ RemoteException -> 0x01c5 }
            i1g r2 = (i1g) r2     // Catch:{ RemoteException -> 0x01c5 }
            android.os.Parcel r4 = r2.G0()     // Catch:{ RemoteException -> 0x01c5 }
            r5 = 8
            android.os.Parcel r2 = r2.R(r4, r5)     // Catch:{ RemoteException -> 0x01c5 }
            int r4 = r2.readInt()     // Catch:{ RemoteException -> 0x01c5 }
            r2.recycle()     // Catch:{ RemoteException -> 0x01c5 }
            if (r6 == r4) goto L_0x0225
            goto L_0x01cc
        L_0x01c5:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x01cc:
            nfc r2 = r7.o
            r2.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r3 = q23.H(r0, r3)
            r4.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x01de:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01f7
            java.lang.Object r3 = r0.next()
            dm7 r3 = (defpackage.dm7) r3
            com.google.android.gms.maps.model.LatLng r5 = new com.google.android.gms.maps.model.LatLng
            double r11 = r3.a
            double r13 = r3.b
            r5.<init>(r11, r13)
            r4.add(r5)
            goto L_0x01de
        L_0x01f7:
            java.lang.Object r0 = r2.b
            a0b r0 = (a0b) r0
            r0.getClass()
            k1g r0 = r0.a     // Catch:{ RemoteException -> 0x026d }
            i1g r0 = (i1g) r0     // Catch:{ RemoteException -> 0x026d }
            android.os.Parcel r2 = r0.G0()     // Catch:{ RemoteException -> 0x026d }
            r2.writeTypedList(r4)     // Catch:{ RemoteException -> 0x026d }
            r3 = 3
            r0.H0(r2, r3)     // Catch:{ RemoteException -> 0x026d }
            nfc r0 = r7.o
            java.lang.Object r0 = r0.b
            a0b r0 = (a0b) r0
            r0.getClass()
            k1g r0 = r0.a     // Catch:{ RemoteException -> 0x0266 }
            i1g r0 = (i1g) r0     // Catch:{ RemoteException -> 0x0266 }
            android.os.Parcel r2 = r0.G0()     // Catch:{ RemoteException -> 0x0266 }
            r2.writeInt(r6)     // Catch:{ RemoteException -> 0x0266 }
            r3 = 7
            r0.H0(r2, r3)     // Catch:{ RemoteException -> 0x0266 }
        L_0x0225:
            pn1 r0 = r7.p
            defpackage.tic.b(r0)
            st7 r2 = r7.e
            monitor-enter(r2)
            e44 r0 = new e44     // Catch:{ all -> 0x0263 }
            r3 = 20
            r5 = r16
            r0.<init>(r2, r3, r5)     // Catch:{ all -> 0x0263 }
            mv9 r3 = new mv9     // Catch:{ all -> 0x0263 }
            r4 = 1
            r3.<init>(r4, r0)     // Catch:{ all -> 0x0263 }
            monitor-exit(r2)
            qmc r0 = r7.f
            yhd r0 = r3.m(r0)
            qmc r2 = de.a()
            yhd r0 = r0.i(r2)
            qh0 r2 = new qh0
            r2.<init>((defpackage.nt7) r7, (boolean) r1, (long) r9)
            pv0 r1 = new pv0
            r3 = 29
            r1.<init>(r3)
            pn1 r3 = new pn1
            r4 = 2
            r3.<init>(r2, r4, r1)
            r0.k(r3)
            r7.p = r3
            return
        L_0x0263:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0263 }
            throw r0
        L_0x0266:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x026d:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0274:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af9.C(java.util.List, boolean):void");
    }

    public final double[] D() {
        nt7 nt7 = this.O0;
        if (nt7 == null) {
            return new double[]{1.401298464324817E-45d, 1.401298464324817E-45d};
        }
        LatLng latLng = ((CameraPosition) nt7.d.B().b).a;
        return new double[]{latLng.a, latLng.b};
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, kt7] */
    public final kt7 E() {
        boolean z;
        boolean z2;
        nt7 nt7 = this.O0;
        vle vle = null;
        if (nt7 == null) {
            return null;
        }
        mod mod = nt7.d;
        CameraPosition cameraPosition = (CameraPosition) mod.B().b;
        LatLng latLng = cameraPosition.a;
        double d = latLng.a;
        qe4 qe4 = (qe4) mod.b;
        if (qe4.z() != null) {
            vle = new vle(qe4.z());
        }
        boolean z3 = true;
        if (vle != null) {
            ple ple = (ple) vle.a;
            ple.getClass();
            g2g g2g = (g2g) ple.a;
            try {
                Parcel R = g2g.R(g2g.G0(), 9);
                int i = u1g.a;
                z = R.readInt() != 0;
                R.recycle();
                try {
                    Parcel R2 = g2g.R(g2g.G0(), 13);
                    z2 = R2.readInt() != 0;
                    R2.recycle();
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (RemoteException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            z2 = false;
            z = false;
        }
        ? obj = new Object();
        obj.a = d;
        obj.b = latLng.b;
        obj.c = z;
        obj.d = z2;
        qe4.getClass();
        try {
            x3g x3g = (x3g) qe4.b;
            Parcel R3 = x3g.R(x3g.G0(), 21);
            int i2 = u1g.a;
            if (R3.readInt() == 0) {
                z3 = false;
            }
            R3.recycle();
            obj.e = z3;
            obj.f = mod.C();
            obj.g = cameraPosition.b;
            obj.h = cameraPosition.c;
            obj.i = cameraPosition.o;
            return new kt7(obj);
        } catch (RemoteException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final void F() {
        ValueAnimator valueAnimator = this.R0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) (-this.Q0.n)});
        this.R0 = ofFloat;
        tg tgVar = this.z0;
        ofFloat.setInterpolator(tgVar.a.p());
        this.R0.setDuration(tgVar.a.b());
        this.R0.setRepeatMode(2);
        this.R0.setRepeatCount(1);
        this.R0.addUpdateListener(new c00(2, this));
        this.R0.start();
    }

    public final void c() {
        View view = (View) this.c;
        if (view != null) {
            ((View) this.c).setBackgroundColor(km4.y0.r(view).b().f);
            this.G0.setImageTintList(ColorStateList.valueOf(-16745729));
        }
    }

    /* JADX WARNING: type inference failed for: r0v35, types: [java.lang.Object, zq3, n97] */
    public final void n() {
        ViewGroup viewGroup = (ViewGroup) ((View) this.c);
        nea nea = new nea(viewGroup.getContext(), 4);
        nea.setId(yqb.frg_location_map__toolbar);
        nea.setLayoutParams(new re3(-1, -2));
        re3 layoutParams = nea.getLayoutParams();
        layoutParams.i = 0;
        layoutParams.t = 0;
        layoutParams.v = 0;
        nea.setLayoutParams(layoutParams);
        viewGroup.addView(nea);
        ((View) this.c).getContext();
        this.Q0 = zg4.b();
        nea nea2 = (nea) ((View) this.c).findViewById(yqb.frg_location_map__toolbar);
        nea2.setTitle(cic.R2);
        nea2.setForm(fea.a);
        nea2.setLeftActions(new wda(new l(12, this)));
        this.F0 = this.x0.D(yqb.frg_location_map__map);
        this.G0 = ((View) this.c).findViewById(yqb.frg_location_map__marker_head);
        this.H0 = ((View) this.c).findViewById(yqb.frg_location_map__marker_group);
        OneMeButton oneMeButton = (OneMeButton) ((View) this.c).findViewById(yqb.frg_location_map__current_location_fab);
        this.I0 = oneMeButton;
        v0a v0a = v0a.c;
        oneMeButton.setSize(v0a);
        OneMeButton oneMeButton2 = this.I0;
        u0a u0a = u0a.a;
        oneMeButton2.setMode(u0a);
        OneMeButton oneMeButton3 = this.I0;
        s0a s0a = s0a.a;
        oneMeButton3.setAppearance(s0a);
        this.I0.d(Integer.valueOf(phc.q0), true);
        OneMeButton oneMeButton4 = (OneMeButton) ((View) this.c).findViewById(yqb.frg_location_map__layer_fab);
        this.J0 = oneMeButton4;
        oneMeButton4.setSize(v0a);
        this.J0.setMode(u0a);
        this.J0.setAppearance(s0a);
        this.J0.d(Integer.valueOf(zhc.F), true);
        ci0 ci0 = new ci0(this, 0);
        ci0 ci02 = new ci0(this, 1);
        ci0 ci03 = new ci0(this, 2);
        int X2 = a24.X(((float) 240) * dh4.c().getDisplayMetrics().density);
        Context context = (Context) this.b;
        ? zq3 = new zq3(context, X2);
        zq3.d = false;
        zq3.a.a(p23.B(new oq3[]{new oq3(new hge(cic.u0), (Integer) null, ci0, 14), new oq3(new hge(cic.v0), (Integer) null, ci02, 14), new oq3(new hge(cic.t0), (Integer) null, ci03, 14)}), new bk(7, zq3));
        this.K0 = zq3;
        yu7 yu7 = new yu7(this.y0, 0);
        g2b g2b = this.A0;
        rf4 rf4 = this.C0;
        this.L0 = new gd9(new le9((Context) this.b, this.X, this.Y, g2b, rf4, (ViewStub) ((View) this.c).findViewById(yqb.frg_location_map__contact_location)), yu7, this);
        this.M0 = (ViewStub) ((View) this.c).findViewById(yqb.frg_location_map__send_location);
        this.N0 = new ef9(context, this.D0);
        this.F0.r1.setListener(this);
        at7.i(this.J0, new di0(this, 0));
        at7.i(this.I0, new di0(this, 1));
        this.E0.getClass();
    }
}
