package defpackage;

/* renamed from: r0g  reason: default package */
public final class r0g extends bzf {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0g(hy5 hy5) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 1);
        this.e = hy5;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [zl3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v13, types: [vyf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H0(int r25, android.os.Parcel r26, android.os.Parcel r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = 18
            r3 = 16
            r4 = 15
            r5 = 20
            r6 = 3
            java.lang.Object r7 = r0.e
            r9 = 0
            r10 = 1
            int r0 = r0.d
            switch(r0) {
                case 0: goto L_0x027e;
                case 1: goto L_0x0061;
                default: goto L_0x0016;
            }
        L_0x0016:
            if (r1 != r10) goto L_0x0060
            android.os.Parcelable$Creator<com.google.android.gms.maps.model.LatLng> r0 = com.google.android.gms.maps.model.LatLng.CREATOR
            int r1 = defpackage.u1g.a
            int r1 = r26.readInt()
            if (r1 != 0) goto L_0x0026
            r11 = r26
            r8 = 0
            goto L_0x002f
        L_0x0026:
            r11 = r26
            java.lang.Object r0 = r0.createFromParcel(r11)
            r8 = r0
            android.os.Parcelable r8 = (android.os.Parcelable) r8
        L_0x002f:
            com.google.android.gms.maps.model.LatLng r8 = (com.google.android.gms.maps.model.LatLng) r8
            defpackage.u1g.a(r26)
            hy5 r7 = (defpackage.hy5) r7
            java.lang.Object r0 = r7.b
            oh0 r0 = (oh0) r0
            nt7 r1 = r0.a
            r1.getClass()
            af9 r0 = r0.b
            r0.getClass()
            java.lang.Object r0 = r0.a
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x004c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r0.next()
            be9 r1 = (be9) r1
            r1.getClass()
            goto L_0x004c
        L_0x005c:
            r27.writeNoException()
            r9 = r10
        L_0x0060:
            return r9
        L_0x0061:
            r11 = r26
            if (r1 != r10) goto L_0x027d
            android.os.IBinder r0 = r26.readStrongBinder()
            if (r0 != 0) goto L_0x006d
            r12 = 0
            goto L_0x007f
        L_0x006d:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
            android.os.IInterface r12 = r0.queryLocalInterface(r1)
            boolean r13 = r12 instanceof defpackage.x3g
            if (r13 == 0) goto L_0x007a
            x3g r12 = (defpackage.x3g) r12
            goto L_0x007f
        L_0x007a:
            x3g r12 = new x3g
            r12.<init>(r0, r1, r6)
        L_0x007f:
            defpackage.u1g.a(r26)
            qe4 r0 = new qe4
            r0.<init>((defpackage.x3g) r12)
            x3e r7 = (x3e) r7
            r7.getClass()
            java.lang.Object r1 = r0.b     // Catch:{ RemoteException -> 0x0276 }
            x3g r1 = (defpackage.x3g) r1     // Catch:{ RemoteException -> 0x0276 }
            android.os.Parcel r11 = r1.G0()     // Catch:{ RemoteException -> 0x0276 }
            r11.writeInt(r9)     // Catch:{ RemoteException -> 0x0276 }
            r11.writeInt(r9)     // Catch:{ RemoteException -> 0x0276 }
            r11.writeInt(r9)     // Catch:{ RemoteException -> 0x0276 }
            r11.writeInt(r9)     // Catch:{ RemoteException -> 0x0276 }
            r12 = 39
            r1.H0(r11, r12)     // Catch:{ RemoteException -> 0x0276 }
            mod r14 = new mod
            r14.<init>(r5, r0)
            nt7 r0 = new nt7
            g02 r1 = new g02
            r11 = 8
            r1.<init>(r11)
            qr4 r11 = new qr4
            r12 = 7
            r11.<init>(r12)
            zl3 r19 = new zl3
            r19.<init>()
            j67 r12 = new j67
            r12.<init>(r4)
            j67 r15 = new j67
            r15.<init>(r3)
            j67 r13 = new j67
            r8 = 17
            r13.<init>(r8)
            j67 r8 = new j67
            r8.<init>(r2)
            st7 r4 = r7.a
            qmc r3 = r7.b
            r22 = r13
            r13 = r0
            r21 = r15
            r15 = r4
            r16 = r3
            r17 = r1
            r18 = r11
            r20 = r12
            r23 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            af9 r1 = r7.c
            r1.O0 = r0
            kt7 r3 = r1.P0
            boolean r4 = r3.c
            boolean r7 = r3.d
            boolean r8 = r3.e
            java.lang.Object r11 = r1.b
            android.content.Context r11 = (android.content.Context) r11
            r0.g(r11, r8)
            mod r8 = r0.d
            java.lang.Object r12 = r8.b
            qe4 r12 = (defpackage.qe4) r12
            ple r13 = r12.z()
            if (r13 != 0) goto L_0x010c
            r13 = 0
            goto L_0x0115
        L_0x010c:
            vle r13 = new vle
            ple r12 = r12.z()
            r13.<init>(r12)
        L_0x0115:
            if (r13 != 0) goto L_0x0118
            goto L_0x0156
        L_0x0118:
            java.lang.Object r12 = r13.a
            ple r12 = (defpackage.ple) r12
            r12.getClass()
            java.lang.Object r12 = r12.a
            g2g r12 = (defpackage.g2g) r12
            android.os.Parcel r13 = r12.G0()     // Catch:{ RemoteException -> 0x026f }
            r13.writeInt(r4)     // Catch:{ RemoteException -> 0x026f }
            r12.H0(r13, r10)     // Catch:{ RemoteException -> 0x026f }
            android.os.Parcel r4 = r12.G0()     // Catch:{ RemoteException -> 0x0268 }
            r4.writeInt(r7)     // Catch:{ RemoteException -> 0x0268 }
            r13 = 5
            r12.H0(r4, r13)     // Catch:{ RemoteException -> 0x0268 }
            android.os.Parcel r4 = r12.G0()     // Catch:{ RemoteException -> 0x0261 }
            r4.writeInt(r7)     // Catch:{ RemoteException -> 0x0261 }
            r12.H0(r4, r5)     // Catch:{ RemoteException -> 0x0261 }
            android.os.Parcel r4 = r12.G0()     // Catch:{ RemoteException -> 0x025a }
            r4.writeInt(r9)     // Catch:{ RemoteException -> 0x025a }
            r12.H0(r4, r2)     // Catch:{ RemoteException -> 0x025a }
            android.os.Parcel r2 = r12.G0()     // Catch:{ RemoteException -> 0x0253 }
            r2.writeInt(r9)     // Catch:{ RemoteException -> 0x0253 }
            r12.H0(r2, r6)     // Catch:{ RemoteException -> 0x0253 }
        L_0x0156:
            int r2 = r3.f
            r0.f(r2)
            double r4 = r3.a
            r6 = 3936146074321813504(0x36a0000000000000, double:1.401298464324817E-45)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0183
            double r12 = r3.b
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0183
            float r2 = r3.g
            java.lang.Float r20 = java.lang.Float.valueOf(r2)
            float r2 = r3.h
            java.lang.Float r21 = java.lang.Float.valueOf(r2)
            float r2 = r3.i
            java.lang.Float r22 = java.lang.Float.valueOf(r2)
            r15 = r0
            r16 = r4
            r18 = r12
            r15.d(r16, r18, r20, r21, r22)
        L_0x0183:
            oh0 r2 = new oh0
            r2.<init>(r0, r1)
            hy5 r3 = new hy5
            r4 = 16
            r3.<init>(r4, r2)
            java.lang.Object r2 = r8.b
            qe4 r2 = (defpackage.qe4) r2
            r2.H(r3)
            oh0 r3 = new oh0
            r3.<init>(r0, r1)
            hy5 r0 = new hy5
            r4 = 15
            r0.<init>(r4, r3)
            r2.I(r0)
            s59 r0 = defpackage.km4.y0
            km4 r0 = r0.n(r11)
            pda r0 = r0.g()
            c33 r0 = r0.g()
            c33 r2 = c33.b
            if (r0 != r2) goto L_0x0210
            nt7 r0 = r1.O0
            int r2 = tsb.google_map_night_style
            if (r2 != 0) goto L_0x01c1
            r0.getClass()
            goto L_0x0221
        L_0x01c1:
            java.util.HashMap r3 = r0.c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r3.get(r4)
            ut7 r3 = (ut7) r3
            if (r3 == 0) goto L_0x01db
            mod r0 = r0.d
            java.lang.Object r0 = r0.b
            qe4 r0 = (defpackage.qe4) r0
            tt7 r2 = r3.a
            r0.G(r2)
            goto L_0x0221
        L_0x01db:
            pn1 r3 = r0.n
            tic.b(r3)
            ph0 r3 = new ph0
            r3.<init>(r0, r11, r2, r9)
            mv9 r4 = new mv9
            r4.<init>(r10, r3)
            qmc r3 = r0.f
            yhd r3 = r4.m(r3)
            qmc r4 = defpackage.de.a()
            yhd r3 = r3.i(r4)
            hc0 r4 = new hc0
            r4.<init>(r2, r10, r0)
            pv0 r2 = new pv0
            r5 = 28
            r2.<init>(r5)
            pn1 r5 = new pn1
            r6 = 2
            r5.<init>(r4, r6, r2)
            r3.k(r5)
            r0.n = r5
            goto L_0x0221
        L_0x0210:
            nt7 r0 = r1.O0
            pn1 r2 = r0.n
            tic.b(r2)
            mod r0 = r0.d
            java.lang.Object r0 = r0.b
            qe4 r0 = (defpackage.qe4) r0
            r2 = 0
            r0.G(r2)
        L_0x0221:
            java.lang.Object r0 = r1.a
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0229:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x024e
            java.lang.Object r1 = r0.next()
            be9 r1 = (be9) r1
            r1.e2()
            r1.d2()
            hm7 r2 = r1.G0
            long r2 = r2.h
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0248
            r1.g2(r2)
        L_0x0248:
            mm7 r2 = r1.Y
            r2.a(r1)
            goto L_0x0229
        L_0x024e:
            r27.writeNoException()
            r9 = r10
            goto L_0x027d
        L_0x0253:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x025a:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0261:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0268:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x026f:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0276:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x027d:
            return r9
        L_0x027e:
            r11 = r26
            r2 = 0
            if (r1 != r10) goto L_0x0318
            android.os.IBinder r0 = r26.readStrongBinder()
            if (r0 != 0) goto L_0x028b
            r8 = r2
            goto L_0x029e
        L_0x028b:
            java.lang.String r1 = "com.google.android.gms.maps.model.internal.IMarkerDelegate"
            android.os.IInterface r2 = r0.queryLocalInterface(r1)
            boolean r3 = r2 instanceof defpackage.f1g
            if (r3 == 0) goto L_0x0299
            r8 = r2
            f1g r8 = (defpackage.f1g) r8
            goto L_0x029e
        L_0x0299:
            d1g r8 = new d1g
            r8.<init>(r0, r1, r6)
        L_0x029e:
            defpackage.u1g.a(r26)
            defpackage.a24.o(r8)
            hy5 r7 = (defpackage.hy5) r7
            java.lang.Object r0 = r7.b
            oh0 r0 = (oh0) r0
            nt7 r1 = r0.a
            r1.getClass()
            d1g r8 = (defpackage.d1g) r8     // Catch:{ RemoteException -> 0x0311 }
            android.os.Parcel r2 = r8.G0()     // Catch:{ RemoteException -> 0x0311 }
            r3 = 30
            android.os.Parcel r2 = r8.R(r2, r3)     // Catch:{ RemoteException -> 0x0311 }
            android.os.IBinder r3 = r2.readStrongBinder()     // Catch:{ RemoteException -> 0x0311 }
            un6 r3 = defpackage.ks9.K0(r3)     // Catch:{ RemoteException -> 0x0311 }
            r2.recycle()     // Catch:{ RemoteException -> 0x0311 }
            java.lang.Object r2 = defpackage.ks9.L0(r3)     // Catch:{ RemoteException -> 0x0311 }
            boolean r3 = r2 instanceof java.lang.Long
            if (r3 != 0) goto L_0x02cf
            goto L_0x0307
        L_0x02cf:
            java.lang.Long r2 = (java.lang.Long) r2
            r2.getClass()
            java.util.LinkedHashMap r3 = r1.a
            java.lang.Object r3 = r3.get(r2)
            sh0 r3 = (sh0) r3
            af9 r0 = r0.b
            if (r3 == 0) goto L_0x02ef
            av7 r1 = r3.b
            r0.getClass()
            bi0 r2 = new bi0
            r2.<init>(r1, r9)
            r0.o(r2)
        L_0x02ed:
            r9 = r10
            goto L_0x0307
        L_0x02ef:
            java.util.LinkedHashMap r1 = r1.b
            java.lang.Object r1 = r1.get(r2)
            sh0 r1 = (sh0) r1
            if (r1 == 0) goto L_0x0307
            av7 r1 = r1.b
            r0.getClass()
            bi0 r2 = new bi0
            r2.<init>(r1, r10)
            r0.o(r2)
            goto L_0x02ed
        L_0x0307:
            r27.writeNoException()
            r0 = r27
            r0.writeInt(r9)
            r9 = r10
            goto L_0x0318
        L_0x0311:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x0318:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0g.H0(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0g(hy5 hy5, byte b) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener", 1);
        this.e = hy5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0g(x3e x3e) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 1);
        this.e = x3e;
    }
}
