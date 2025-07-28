package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: x48  reason: default package */
public final /* synthetic */ class x48 implements y48, kt0, e26, bd8, le8, nf3, ke8 {
    public final /* synthetic */ int a;

    public /* synthetic */ x48(int i) {
        this.a = i;
    }

    public void a(hc8 hc8, int i) {
        switch (this.a) {
            case 8:
                hc8.getClass();
                return;
            case 9:
                hc8.getClass();
                return;
            default:
                hc8.b(i);
                return;
        }
    }

    public void accept(Object obj) {
        qza qza = (qza) obj;
        switch (this.a) {
            case 13:
                qza.pause();
                return;
            case 14:
                qza.f0();
                return;
            case 15:
                qza.D0();
                return;
            case 16:
                qza.L0();
                return;
            case 18:
                qza.V();
                return;
            case 19:
                qza.D();
                return;
            case 21:
                qza.K0();
                return;
            case 22:
                qza.J0();
                return;
            case 25:
                qza.J();
                return;
            default:
                qza.stop();
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [g68, java.lang.Object] */
    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                izd izd = (izd) obj;
                izd.getClass();
                Bundle bundle = new Bundle();
                int i = izd.a;
                if (i != 0) {
                    bundle.putInt(izd.o, i);
                }
                int i2 = izd.b;
                if (i2 != 0) {
                    bundle.putInt(izd.X, i2);
                }
                int i3 = izd.c;
                if (i3 != 0) {
                    bundle.putInt(izd.Y, i3);
                }
                return bundle;
            case 5:
                h68 h68 = (h68) obj;
                h68.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(h68.h, h68.a);
                String str = h68.b;
                if (str != null) {
                    bundle2.putString(h68.i, str);
                }
                String str2 = h68.c;
                if (str2 != null) {
                    bundle2.putString(h68.j, str2);
                }
                int i4 = h68.d;
                if (i4 != 0) {
                    bundle2.putInt(h68.k, i4);
                }
                int i5 = h68.e;
                if (i5 != 0) {
                    bundle2.putInt(h68.l, i5);
                }
                String str3 = h68.f;
                if (str3 != null) {
                    bundle2.putString(h68.m, str3);
                }
                String str4 = h68.g;
                if (str4 != null) {
                    bundle2.putString(h68.n, str4);
                }
                return bundle2;
            default:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(h68.h);
                uri.getClass();
                String string = bundle3.getString(h68.i);
                String string2 = bundle3.getString(h68.j);
                int i6 = bundle3.getInt(h68.k, 0);
                int i7 = bundle3.getInt(h68.l, 0);
                String string3 = bundle3.getString(h68.m);
                String string4 = bundle3.getString(h68.n);
                ? obj2 = new Object();
                obj2.a = uri;
                obj2.b = c49.l(string);
                obj2.c = string2;
                obj2.d = i6;
                obj2.e = i7;
                obj2.f = string3;
                obj2.g = string4;
                return new h68(obj2);
        }
    }

    public void b(qza qza, ic8 ic8, List list) {
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                qza.w0(list);
                return;
            default:
                qza.w0(list);
                return;
        }
    }

    public void c(o48 o48) {
        if (o48.isConnected()) {
            r38 r38 = o48.a;
            r38.getClass();
            oyb.k(Looper.myLooper() == r38.X.getLooper());
            r38.o.getClass();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v122, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r0v24, types: [w78, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.lt0 e(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r0 = r0.a
            switch(r0) {
                case 1: goto L_0x031d;
                case 2: goto L_0x02be;
                case 3: goto L_0x027b;
                default: goto L_0x0009;
            }
        L_0x0009:
            w78 r0 = new w78
            r0.<init>()
            r2 = 0
            r3 = 36
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.a = r2
            r2 = 1
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.b = r2
            r2 = 2
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.c = r2
            r2 = 3
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.d = r2
            r2 = 4
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.e = r2
            r2 = 5
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.f = r2
            r2 = 6
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.g = r2
            r2 = 7
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Parcelable r2 = r1.getParcelable(r2)
            android.net.Uri r2 = (android.net.Uri) r2
            r0.h = r2
            r2 = 10
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            byte[] r2 = r1.getByteArray(r2)
            r4 = 29
            java.lang.String r5 = java.lang.Integer.toString(r4, r3)
            boolean r5 = r1.containsKey(r5)
            r6 = 0
            if (r5 == 0) goto L_0x008e
            java.lang.String r4 = java.lang.Integer.toString(r4, r3)
            int r4 = r1.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x008f
        L_0x008e:
            r4 = r6
        L_0x008f:
            if (r2 != 0) goto L_0x0092
            goto L_0x0099
        L_0x0092:
            java.lang.Object r2 = r2.clone()
            r6 = r2
            byte[] r6 = (byte[]) r6
        L_0x0099:
            r0.k = r6
            r0.l = r4
            r2 = 11
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Parcelable r2 = r1.getParcelable(r2)
            android.net.Uri r2 = (android.net.Uri) r2
            r0.m = r2
            r2 = 22
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.x = r2
            r2 = 23
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.y = r2
            r2 = 24
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.z = r2
            r2 = 27
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.C = r2
            r2 = 28
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.D = r2
            r2 = 30
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.CharSequence r2 = r1.getCharSequence(r2)
            r0.E = r2
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Bundle r2 = r1.getBundle(r2)
            r0.F = r2
            r2 = 8
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            lpa r5 = defpackage.zxb.a
            if (r4 == 0) goto L_0x011f
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Bundle r2 = r1.getBundle(r2)
            if (r2 == 0) goto L_0x011f
            lt0 r2 = r5.e(r2)
            zxb r2 = (defpackage.zxb) r2
            r0.i = r2
        L_0x011f:
            r2 = 9
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x013d
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            android.os.Bundle r2 = r1.getBundle(r2)
            if (r2 == 0) goto L_0x013d
            lt0 r2 = r5.e(r2)
            zxb r2 = (defpackage.zxb) r2
            r0.j = r2
        L_0x013d:
            r2 = 12
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0157
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.n = r2
        L_0x0157:
            r2 = 13
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0171
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.o = r2
        L_0x0171:
            r2 = 14
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x018b
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.p = r2
        L_0x018b:
            r2 = 15
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x01a5
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            boolean r2 = r1.getBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.q = r2
        L_0x01a5:
            r2 = 16
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x01bf
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.r = r2
        L_0x01bf:
            r2 = 17
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x01d9
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.s = r2
        L_0x01d9:
            r2 = 18
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x01f3
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.t = r2
        L_0x01f3:
            r2 = 19
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x020d
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.u = r2
        L_0x020d:
            r2 = 20
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0227
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.v = r2
        L_0x0227:
            r2 = 21
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0241
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.w = r2
        L_0x0241:
            r2 = 25
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x025b
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r2 = r1.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.A = r2
        L_0x025b:
            r2 = 26
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0275
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            int r1 = r1.getInt(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.B = r1
        L_0x0275:
            y78 r1 = new y78
            r1.<init>(r0)
            return r1
        L_0x027b:
            y58 r0 = new y58
            r2 = 0
            r3 = 36
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = r1.getLong(r2, r4)
            r2 = 1
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            long r8 = r1.getLong(r2, r4)
            r2 = 2
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            long r10 = r1.getLong(r2, r4)
            r2 = 3
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r12 = r1.getFloat(r2, r4)
            r2 = 4
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            float r1 = r1.getFloat(r2, r4)
            r2 = r0
            r3 = r6
            r5 = r8
            r7 = r10
            r9 = r12
            r10 = r1
            r2.<init>(r3, r5, r7, r9, r10)
            return r0
        L_0x02be:
            r58 r0 = new r58
            r0.<init>()
            r2 = 0
            r3 = 36
            java.lang.String r4 = java.lang.Integer.toString(r2, r3)
            r5 = 0
            long r7 = r1.getLong(r4, r5)
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r9 = 1
            if (r4 < 0) goto L_0x02d7
            r4 = r9
            goto L_0x02d8
        L_0x02d7:
            r4 = r2
        L_0x02d8:
            swb.e(r4)
            r0.a = r7
            java.lang.String r4 = java.lang.Integer.toString(r9, r3)
            r7 = -9223372036854775808
            long r10 = r1.getLong(r4, r7)
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x02f1
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x02f0
            goto L_0x02f1
        L_0x02f0:
            r9 = r2
        L_0x02f1:
            swb.e(r9)
            r0.b = r10
            r4 = 2
            java.lang.String r4 = java.lang.Integer.toString(r4, r3)
            boolean r4 = r1.getBoolean(r4, r2)
            r0.c = r4
            r4 = 3
            java.lang.String r4 = java.lang.Integer.toString(r4, r3)
            boolean r4 = r1.getBoolean(r4, r2)
            r0.d = r4
            r4 = 4
            java.lang.String r3 = java.lang.Integer.toString(r4, r3)
            boolean r1 = r1.getBoolean(r3, r2)
            r0.e = r1
            u58 r1 = new u58
            r1.<init>(r0)
            return r1
        L_0x031d:
            r0 = 0
            r2 = 36
            java.lang.String r3 = java.lang.Integer.toString(r0, r2)
            java.lang.String r4 = ""
            java.lang.String r6 = r1.getString(r3, r4)
            r6.getClass()
            r3 = 1
            java.lang.String r4 = java.lang.Integer.toString(r3, r2)
            android.os.Bundle r4 = r1.getBundle(r4)
            r5 = 3
            r7 = 2
            if (r4 != 0) goto L_0x033e
            y58 r0 = defpackage.y58.Y
            r9 = r0
            goto L_0x037c
        L_0x033e:
            y58 r17 = new y58
            java.lang.String r0 = java.lang.Integer.toString(r0, r2)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r10 = r4.getLong(r0, r8)
            java.lang.String r0 = java.lang.Integer.toString(r3, r2)
            long r12 = r4.getLong(r0, r8)
            java.lang.String r0 = java.lang.Integer.toString(r7, r2)
            long r14 = r4.getLong(r0, r8)
            java.lang.String r0 = java.lang.Integer.toString(r5, r2)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r0 = r4.getFloat(r0, r3)
            r8 = 4
            java.lang.String r8 = java.lang.Integer.toString(r8, r2)
            float r16 = r4.getFloat(r8, r3)
            r8 = r17
            r9 = r10
            r11 = r12
            r13 = r14
            r15 = r0
            r8.<init>(r9, r11, r13, r15, r16)
            r9 = r17
        L_0x037c:
            java.lang.String r0 = java.lang.Integer.toString(r7, r2)
            android.os.Bundle r0 = r1.getBundle(r0)
            if (r0 != 0) goto L_0x038a
            y78 r0 = defpackage.y78.W0
        L_0x0388:
            r10 = r0
            goto L_0x0393
        L_0x038a:
            x48 r3 = defpackage.y78.X0
            lt0 r0 = r3.e(r0)
            y78 r0 = (defpackage.y78) r0
            goto L_0x0388
        L_0x0393:
            java.lang.String r0 = java.lang.Integer.toString(r5, r2)
            android.os.Bundle r0 = r1.getBundle(r0)
            if (r0 != 0) goto L_0x03a1
            u58 r0 = defpackage.u58.Z
        L_0x039f:
            r7 = r0
            goto L_0x03aa
        L_0x03a1:
            x48 r1 = defpackage.s58.Y
            lt0 r0 = r1.e(r0)
            u58 r0 = (defpackage.u58) r0
            goto L_0x039f
        L_0x03aa:
            j68 r0 = new j68
            r8 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x48.e(android.os.Bundle):lt0");
    }

    public Object h(cd8 cd8, ic8 ic8, int i) {
        switch (this.a) {
            case 11:
                hr1.r(cd8);
                throw null;
            case 12:
                hr1.r(cd8);
                throw null;
            case 17:
                return cd8.m(ic8);
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                hr1.r(cd8);
                throw null;
            case 23:
                cd8.s(ic8);
                cd8.e.getClass();
                return swb.A(new p2d(-6));
            case 27:
                hr1.r(cd8);
                throw null;
            default:
                hr1.r(cd8);
                throw null;
        }
    }

    public /* synthetic */ x48(Object obj, int i, Object obj2) {
        this.a = i;
    }
}
