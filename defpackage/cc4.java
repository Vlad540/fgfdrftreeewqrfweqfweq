package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cc4  reason: default package */
public final class cc4 {
    public final /* synthetic */ int a;
    public int b;
    public final List c;

    public /* synthetic */ cc4(List list, int i, int i2) {
        this.a = i2;
        this.b = i;
        this.c = list;
    }

    public qse a(int i, jj7 jj7) {
        if (i != 2) {
            String str = (String) jj7.a;
            if (i == 3 || i == 4) {
                return new xna(new a89(str));
            }
            if (i == 21) {
                return new xna(new uq4(2));
            }
            if (i != 27) {
                if (i == 36) {
                    return new xna(new pd6(new d4b(c(jj7))));
                }
                if (i == 89) {
                    return new xna(new uq4(0, (List) jj7.b));
                }
                if (i != 138) {
                    if (i == 172) {
                        return new xna(new t3(str, 1));
                    }
                    if (i == 257) {
                        return new ltc(new it4("application/vnd.dvb.ait"));
                    }
                    if (i != 134) {
                        if (i != 135) {
                            switch (i) {
                                case 15:
                                    if (f(2)) {
                                        return null;
                                    }
                                    return new xna(new gc(str, false));
                                case 16:
                                    return new xna(new jd6(new v2b(c(jj7))));
                                case 17:
                                    if (f(2)) {
                                        return null;
                                    }
                                    return new xna(new l97(str));
                                default:
                                    switch (i) {
                                        case 128:
                                            break;
                                        case 129:
                                            break;
                                        case 130:
                                            if (!f(64)) {
                                                return null;
                                            }
                                            break;
                                        default:
                                            return null;
                                    }
                            }
                        }
                        return new xna(new t3(str, 0));
                    } else if (f(16)) {
                        return null;
                    } else {
                        return new ltc(new it4("application/x-scte35"));
                    }
                }
                return new xna(new lp4(str));
            } else if (f(4)) {
                return null;
            } else {
                return new xna(new nd6(new d4b(c(jj7)), f(1), f(8)));
            }
        }
        return new xna(new fd6(new v2b(c(jj7))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        return new defpackage.yna(new defpackage.u3(r2, r7.j(), 0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.rse b(int r6, defpackage.di9 r7) {
        /*
            r5 = this;
            r0 = 2
            if (r6 == r0) goto L_0x015f
            r1 = 3
            java.lang.Object r2 = r7.b
            java.lang.String r2 = (java.lang.String) r2
            if (r6 == r1) goto L_0x0150
            r1 = 4
            if (r6 == r1) goto L_0x0150
            r3 = 21
            if (r6 == r3) goto L_0x0144
            r3 = 27
            r4 = 0
            if (r6 == r3) goto L_0x011e
            r1 = 36
            if (r6 == r1) goto L_0x010a
            r1 = 45
            if (r6 == r1) goto L_0x00ff
            r1 = 89
            if (r6 == r1) goto L_0x00ef
            r1 = 172(0xac, float:2.41E-43)
            if (r6 == r1) goto L_0x00df
            r1 = 257(0x101, float:3.6E-43)
            if (r6 == r1) goto L_0x00d0
            r1 = 138(0x8a, float:1.93E-43)
            if (r6 == r1) goto L_0x00bf
            r1 = 139(0x8b, float:1.95E-43)
            if (r6 == r1) goto L_0x00ae
            switch(r6) {
                case 15: goto L_0x0097;
                case 16: goto L_0x0083;
                case 17: goto L_0x006d;
                default: goto L_0x0035;
            }
        L_0x0035:
            switch(r6) {
                case 128: goto L_0x015f;
                case 129: goto L_0x005d;
                case 130: goto L_0x0054;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r6) {
                case 134: goto L_0x003c;
                case 135: goto L_0x005d;
                case 136: goto L_0x00bf;
                default: goto L_0x003b;
            }
        L_0x003b:
            return r4
        L_0x003c:
            r6 = 16
            boolean r5 = r5.f(r6)
            if (r5 == 0) goto L_0x0045
            goto L_0x0053
        L_0x0045:
            mtc r4 = new mtc
            ul7 r5 = new ul7
            java.lang.String r6 = "application/x-scte35"
            r7 = 12
            r5.<init>(r6, r7)
            r4.<init>(r5)
        L_0x0053:
            return r4
        L_0x0054:
            r6 = 64
            boolean r5 = r5.f(r6)
            if (r5 != 0) goto L_0x00bf
            return r4
        L_0x005d:
            yna r5 = new yna
            u3 r6 = new u3
            int r7 = r7.j()
            r0 = 0
            r6.<init>(r2, r7, r0)
            r5.<init>(r6)
            return r5
        L_0x006d:
            boolean r5 = r5.f(r0)
            if (r5 == 0) goto L_0x0074
            goto L_0x0082
        L_0x0074:
            yna r4 = new yna
            m97 r5 = new m97
            int r6 = r7.j()
            r5.<init>(r2, r6)
            r4.<init>(r5)
        L_0x0082:
            return r4
        L_0x0083:
            yna r6 = new yna
            jd6 r0 = new jd6
            j1c r1 = new j1c
            java.util.List r5 = r5.d(r7)
            r1.<init>((java.util.List) r5)
            r0.<init>((defpackage.j1c) r1)
            r6.<init>(r0)
            return r6
        L_0x0097:
            boolean r5 = r5.f(r0)
            if (r5 == 0) goto L_0x009e
            goto L_0x00ad
        L_0x009e:
            yna r4 = new yna
            hc r5 = new hc
            int r6 = r7.j()
            r7 = 0
            r5.<init>(r7, r2, r6)
            r4.<init>(r5)
        L_0x00ad:
            return r4
        L_0x00ae:
            yna r5 = new yna
            mp4 r6 = new mp4
            int r7 = r7.j()
            r0 = 5408(0x1520, float:7.578E-42)
            r6.<init>(r2, r7, r0)
            r5.<init>(r6)
            return r5
        L_0x00bf:
            yna r5 = new yna
            mp4 r6 = new mp4
            int r7 = r7.j()
            r0 = 4096(0x1000, float:5.74E-42)
            r6.<init>(r2, r7, r0)
            r5.<init>(r6)
            return r5
        L_0x00d0:
            mtc r5 = new mtc
            ul7 r6 = new ul7
            java.lang.String r7 = "application/vnd.dvb.ait"
            r0 = 12
            r6.<init>(r7, r0)
            r5.<init>(r6)
            return r5
        L_0x00df:
            yna r5 = new yna
            u3 r6 = new u3
            int r7 = r7.j()
            r0 = 1
            r6.<init>(r2, r7, r0)
            r5.<init>(r6)
            return r5
        L_0x00ef:
            yna r5 = new yna
            uq4 r6 = new uq4
            java.lang.Object r7 = r7.c
            java.util.List r7 = (java.util.List) r7
            r0 = 1
            r6.<init>(r0, r7)
            r5.<init>(r6)
            return r5
        L_0x00ff:
            yna r5 = new yna
            d89 r6 = new d89
            r6.<init>()
            r5.<init>(r6)
            return r5
        L_0x010a:
            yna r6 = new yna
            pd6 r0 = new pd6
            v4b r1 = new v4b
            java.util.List r5 = r5.d(r7)
            r1.<init>(r5)
            r0.<init>((v4b) r1)
            r6.<init>(r0)
            return r6
        L_0x011e:
            boolean r6 = r5.f(r1)
            if (r6 == 0) goto L_0x0125
            goto L_0x0143
        L_0x0125:
            yna r4 = new yna
            nd6 r6 = new nd6
            v4b r0 = new v4b
            java.util.List r7 = r5.d(r7)
            r0.<init>(r7)
            r7 = 1
            boolean r7 = r5.f(r7)
            r1 = 8
            boolean r5 = r5.f(r1)
            r6.<init>((v4b) r0, (boolean) r7, (boolean) r5)
            r4.<init>(r6)
        L_0x0143:
            return r4
        L_0x0144:
            yna r5 = new yna
            uq4 r6 = new uq4
            r7 = 3
            r6.<init>(r7)
            r5.<init>(r6)
            return r5
        L_0x0150:
            yna r5 = new yna
            b89 r6 = new b89
            int r7 = r7.j()
            r6.<init>(r2, r7)
            r5.<init>(r6)
            return r5
        L_0x015f:
            yna r6 = new yna
            gd6 r0 = new gd6
            j1c r1 = new j1c
            java.util.List r5 = r5.d(r7)
            r1.<init>((java.util.List) r5)
            r0.<init>(r1)
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc4.b(int, di9):rse");
    }

    public List c(jj7 jj7) {
        ArrayList arrayList;
        String str;
        int i;
        List list;
        boolean f = f(32);
        List list2 = this.c;
        if (f) {
            return list2;
        }
        yze yze = new yze((byte[]) jj7.c);
        List list3 = list2;
        while (yze.c() > 0) {
            int v = yze.v();
            int v2 = yze.b + yze.v();
            if (v == 134) {
                ArrayList arrayList2 = new ArrayList();
                int v3 = yze.v() & 31;
                for (int i2 = 0; i2 < v3; i2++) {
                    String t = yze.t(3, f22.c);
                    int v4 = yze.v();
                    boolean z = (v4 & 128) != 0;
                    if (z) {
                        i = v4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte v5 = (byte) yze.v();
                    yze.I(1);
                    if (z) {
                        list = Collections.singletonList((v5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    tu5 tu5 = new tu5();
                    tu5.k = str;
                    tu5.c = t;
                    tu5.C = i;
                    tu5.m = list;
                    arrayList2.add(new vu5(tu5));
                }
                arrayList = arrayList2;
            } else {
                arrayList = list3;
            }
            yze.H(v2);
            list3 = arrayList;
        }
        return list3;
    }

    public List d(di9 di9) {
        ArrayList arrayList;
        String str;
        int i;
        List list;
        boolean f = f(32);
        List list2 = this.c;
        if (f) {
            return list2;
        }
        ija ija = new ija((byte[]) di9.d);
        List list3 = list2;
        while (ija.a() > 0) {
            int u = ija.u();
            int u2 = ija.b + ija.u();
            if (u == 134) {
                ArrayList arrayList2 = new ArrayList();
                int u3 = ija.u() & 31;
                for (int i2 = 0; i2 < u3; i2++) {
                    String s = ija.s(3, f22.c);
                    int u4 = ija.u();
                    boolean z = (u4 & 128) != 0;
                    if (z) {
                        i = u4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte u5 = (byte) ija.u();
                    ija.H(1);
                    if (z) {
                        list = Collections.singletonList((u5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    uu5 uu5 = new uu5();
                    uu5.m = c49.l(str);
                    uu5.d = s;
                    uu5.F = i;
                    uu5.p = list;
                    arrayList2.add(new xu5(uu5));
                }
                arrayList = arrayList2;
            } else {
                arrayList = list3;
            }
            ija.G(u2);
            list3 = arrayList;
        }
        return list3;
    }

    public boolean e() {
        return this.b < this.c.size();
    }

    public boolean f(int i) {
        switch (this.a) {
            case 0:
                return (this.b & i) != 0;
            default:
                return (this.b & i) != 0;
        }
    }

    public cc4(ArrayList arrayList) {
        this.a = 2;
        this.c = arrayList;
    }
}
