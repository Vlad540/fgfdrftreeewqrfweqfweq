package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: x19  reason: default package */
public final class x19 implements l19, pp7 {
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final Context a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final t97 w0;
    public Integer x0;
    public final ContextScope y0;
    public final grd z0;

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, wna] */
    public x19(Context context, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978, aqc aqc, pae pae, ku3 ku3) {
        this.a = context;
        this.b = t97;
        this.c = t972;
        this.o = t973;
        this.X = t974;
        this.Y = t975;
        this.Z = t977;
        this.w0 = t978;
        ContextScope a2 = n1g.a(((n3a) pae).b().limitedParallelism(1, "notif-bundled").plus(ku3));
        this.y0 = a2;
        String string = context.getString(avb.tt_you);
        ? obj = new Object();
        obj.a = string;
        obj.b = null;
        obj.c = null;
        obj.d = null;
        obj.e = false;
        obj.f = false;
        this.z0 = hrd.a(obj);
        lqc lqc = (lqc) ((f03) aqc.a.getValue());
        pj5 z = ez3.z(new ck5(lqc.h, new zm5(new kqc(lqc, 0), (Continuation) null)));
        xs7.E(a2, (hu3) null, ru3.a, new mk5(new ck5(new v11(new u09((cw1) (!(z instanceof cw1) ? new ew1(z) : z), 1), this, aqc, 6), new p19(t976, t973, this, (Continuation) null), 5), (Continuation) null), 1);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, wna] */
    public static wna b(hr8 hr8) {
        long j = hr8.g;
        if (j == 0) {
            j = hr8.c;
        }
        String valueOf = String.valueOf(j);
        Bitmap bitmap = hr8.h;
        IconCompat b2 = bitmap != null ? IconCompat.b(bitmap) : null;
        ? obj = new Object();
        obj.a = hr8.f;
        obj.b = b2;
        obj.c = null;
        obj.d = valueOf;
        obj.e = false;
        obj.f = false;
        return obj;
    }

    public final void a() {
    }

    public final Object c(Continuation continuation) {
        udd.q("x19", "cancelAll");
        h().a(g().e());
        Object b2 = ((fj2) this.c.getValue()).b(continuation);
        return b2 == pu3.a ? b2 : jue.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(long r10, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            r0 = 1
            boolean r1 = r12 instanceof defpackage.q19
            if (r1 == 0) goto L_0x0014
            r1 = r12
            q19 r1 = (defpackage.q19) r1
            int r2 = r1.w0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0014
            int r2 = r2 - r3
            r1.w0 = r2
            goto L_0x0019
        L_0x0014:
            q19 r1 = new q19
            r1.<init>(r9, r12)
        L_0x0019:
            java.lang.Object r12 = r1.Y
            pu3 r2 = pu3.a
            int r3 = r1.w0
            jue r4 = jue.a
            r5 = 0
            if (r3 == 0) goto L_0x0038
            if (r3 != r0) goto L_0x0030
            int r9 = r1.X
            x19 r10 = r1.o
            wx3.H(r12)
            r12 = r9
            r9 = r10
            goto L_0x0084
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            wx3.H(r12)
            r6 = 0
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            java.lang.String r3 = "x19"
            if (r12 != 0) goto L_0x0049
            java.lang.String r9 = "cancelServerChatId: failed, serverChatId == 0L"
            udd.s(r3, r9, r5)
            return r4
        L_0x0049:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r6 = "cancelServerChatId: serverChatId="
            r12.<init>(r6)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            udd.q(r3, r12)
            h7a r12 = r9.g()
            r12.getClass()
            int r12 = (int) r10
            r3 = 32
            long r6 = r10 >> r3
            int r3 = (int) r6
            int r12 = r12 + r3
            o7a r3 = r9.h()
            r3.a(r12)
            t97 r3 = r9.c
            java.lang.Object r3 = r3.getValue()
            fj2 r3 = (defpackage.fj2) r3
            r1.o = r9
            r1.X = r12
            r1.w0 = r0
            java.lang.Object r10 = r3.a(r10, r1)
            if (r10 != r2) goto L_0x0084
            return r2
        L_0x0084:
            o7a r10 = r9.h()
            r10.getClass()
            android.app.NotificationManager r10 = r10.i()     // Catch:{ all -> 0x00cd }
            android.service.notification.StatusBarNotification[] r10 = r10.getActiveNotifications()     // Catch:{ all -> 0x00cd }
            int r11 = r10.length
            if (r11 != 0) goto L_0x0097
            goto L_0x00cd
        L_0x0097:
            int r11 = r10.length
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x009b:
            java.lang.String r6 = "MESS_GROUP_NOTIF"
            if (r1 >= r11) goto L_0x00b8
            r7 = r10[r1]
            java.lang.String r8 = r7.getTag()
            boolean r6 = r6.equalsIgnoreCase(r8)
            if (r6 == 0) goto L_0x00ad
            r5 = r7
            goto L_0x00b6
        L_0x00ad:
            int r6 = r7.getId()
            if (r6 != r12) goto L_0x00b5
            int r2 = r2 + r0
            goto L_0x00b6
        L_0x00b5:
            int r3 = r3 + r0
        L_0x00b6:
            int r1 = r1 + r0
            goto L_0x009b
        L_0x00b8:
            if (r5 == 0) goto L_0x00be
            if (r2 < 0) goto L_0x00cd
            if (r3 != 0) goto L_0x00cd
        L_0x00be:
            o7a r10 = r9.h()
            h7a r9 = r9.g()
            int r9 = r9.e()
            r10.b(r9, r6)
        L_0x00cd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x19.d(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String e(boolean z) {
        String str;
        boolean c2 = ((kdf) ((aq) this.b.getValue())).c();
        t97 t97 = this.Y;
        if (c2) {
            en9 en9 = (en9) t97.getValue();
            en9.c.getClass();
            if (en9.g("ru.oneme.app.inapp.2") == null) {
                en9.e(en9.d());
            }
            return "ru.oneme.app.inapp.2";
        }
        if (z) {
            en9 en92 = (en9) t97.getValue();
            en92.c.getClass();
            str = "ru.oneme.app.dialogs";
            if (en92.g(str) == null) {
                en92.e(en92.c());
            }
        } else {
            en9 en93 = (en9) t97.getValue();
            en93.c.getClass();
            str = "ru.oneme.app.chats";
            if (en93.g(str) == null) {
                en93.e(en93.b());
            }
        }
        return str;
    }

    public final un9 f(String str) {
        Context context = this.a;
        un9 un9 = str == null ? new un9(context, (String) null) : new un9(context, str);
        g().getClass();
        un9.F.icon = dob.ic_notification;
        g().d();
        un9.x = -16745729;
        un9.v = "msg";
        un9.i(16, true);
        return un9;
    }

    public final h7a g() {
        return (h7a) this.o.getValue();
    }

    public final o7a h() {
        return (o7a) this.X.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0113 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            r0 = 2
            boolean r1 = r11 instanceof defpackage.r19
            if (r1 == 0) goto L_0x0014
            r1 = r11
            r19 r1 = (defpackage.r19) r1
            int r2 = r1.w0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0014
            int r2 = r2 - r3
            r1.w0 = r2
            goto L_0x0019
        L_0x0014:
            r19 r1 = new r19
            r1.<init>(r10, r11)
        L_0x0019:
            java.lang.Object r11 = r1.Y
            pu3 r2 = pu3.a
            int r3 = r1.w0
            jue r4 = jue.a
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 1
            r9 = 0
            if (r3 == 0) goto L_0x005e
            if (r3 == r8) goto L_0x0058
            if (r3 == r0) goto L_0x0054
            if (r3 == r6) goto L_0x004a
            if (r3 == r7) goto L_0x0045
            if (r3 != r5) goto L_0x003d
            java.lang.Object r10 = r1.X
            java.util.Iterator r10 = (java.util.Iterator) r10
            x19 r0 = r1.o
            wx3.H(r11)
            goto L_0x00eb
        L_0x003d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0045:
            wx3.H(r11)
            goto L_0x0114
        L_0x004a:
            java.lang.Object r10 = r1.X
            vo9 r10 = (defpackage.vo9) r10
            x19 r3 = r1.o
            wx3.H(r11)
            goto L_0x00a2
        L_0x0054:
            wx3.H(r11)
            goto L_0x0092
        L_0x0058:
            x19 r10 = r1.o
            wx3.H(r11)
            goto L_0x007d
        L_0x005e:
            wx3.H(r11)
            java.lang.String r11 = "x19"
            java.lang.String r3 = "notifyAllChats"
            udd.q(r11, r3)
            t97 r11 = r10.c
            java.lang.Object r11 = r11.getValue()
            fj2 r11 = (defpackage.fj2) r11
            r1.o = r10
            r1.w0 = r8
            zb9 r3 = tq7.a
            java.lang.Object r11 = r11.c(r3, r1)
            if (r11 != r2) goto L_0x007d
            return r2
        L_0x007d:
            vo9 r11 = (defpackage.vo9) r11
            java.util.Map r3 = r11.a
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0093
            r1.o = r9
            r1.w0 = r0
            java.lang.Object r10 = r10.c(r1)
            if (r10 != r2) goto L_0x0092
            return r2
        L_0x0092:
            return r4
        L_0x0093:
            r1.o = r10
            r1.X = r11
            r1.w0 = r6
            java.lang.Object r3 = r10.k(r11, r1)
            if (r3 != r2) goto L_0x00a0
            return r2
        L_0x00a0:
            r3 = r10
            r10 = r11
        L_0x00a2:
            java.util.Map r11 = r10.a
            boolean r6 = r11.isEmpty()
            if (r6 == 0) goto L_0x00ab
            goto L_0x0107
        L_0x00ab:
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x00b3:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x0107
            java.lang.Object r6 = r11.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            si2 r6 = (defpackage.si2) r6
            java.util.List r6 = r6.f
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r8
            if (r6 == 0) goto L_0x00b3
            java.util.Map r10 = r10.a
            java.util.Collection r10 = r10.values()
            es r11 = new es
            r11.<init>(r0, r10)
            xz6 r10 = new xz6
            r0 = 25
            r10.<init>(r0)
            sg5 r10 = myc.L(r11, r10)
            rg5 r11 = new rg5
            r11.<init>(r10)
            r10 = r11
            r0 = r3
        L_0x00eb:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0106
            java.lang.Object r11 = r10.next()
            si2 r11 = (defpackage.si2) r11
            long r6 = r11.c
            r1.o = r0
            r1.X = r10
            r1.w0 = r5
            java.lang.Object r11 = r0.d(r6, r1)
            if (r11 != r2) goto L_0x00eb
            return r2
        L_0x0106:
            return r4
        L_0x0107:
            r1.o = r9
            r1.X = r9
            r1.w0 = r7
            java.lang.Object r10 = r3.c(r1)
            if (r10 != r2) goto L_0x0114
            return r2
        L_0x0114:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x19.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0127 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(zb9 r23, kotlin.coroutines.Continuation r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = 3
            r4 = 1
            boolean r5 = r2 instanceof defpackage.s19
            if (r5 == 0) goto L_0x001b
            r5 = r2
            s19 r5 = (defpackage.s19) r5
            int r6 = r5.D0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001b
            int r6 = r6 - r7
            r5.D0 = r6
            goto L_0x0020
        L_0x001b:
            s19 r5 = new s19
            r5.<init>(r0, r2)
        L_0x0020:
            java.lang.Object r2 = r5.B0
            pu3 r6 = pu3.a
            int r7 = r5.D0
            jue r8 = jue.a
            r10 = 8
            r11 = 2
            if (r7 == 0) goto L_0x0073
            if (r7 == r4) goto L_0x0064
            if (r7 == r11) goto L_0x0056
            if (r7 != r3) goto L_0x004e
            int r0 = r5.z0
            int r1 = r5.y0
            long r11 = r5.A0
            int r7 = r5.x0
            int r13 = r5.w0
            long[] r14 = r5.Z
            java.lang.Object r15 = r5.Y
            long[] r15 = (long[]) r15
            java.lang.Object r9 = r5.X
            vo9 r9 = (defpackage.vo9) r9
            x19 r3 = r5.o
            wx3.H(r2)
            goto L_0x0107
        L_0x004e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0056:
            java.lang.Object r0 = r5.Y
            vo9 r0 = (defpackage.vo9) r0
            java.lang.Object r1 = r5.X
            zb9 r1 = (zb9) r1
            x19 r3 = r5.o
            wx3.H(r2)
            goto L_0x00b0
        L_0x0064:
            java.lang.Object r0 = r5.X
            zb9 r0 = (zb9) r0
            x19 r1 = r5.o
            wx3.H(r2)
            r21 = r1
            r1 = r0
            r0 = r21
            goto L_0x009d
        L_0x0073:
            wx3.H(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r23}
            java.lang.String r3 = "x19"
            java.lang.String r7 = "notifyServerChatIds %s"
            udd.p(r3, r7, r2)
            boolean r2 = r23.i()
            if (r2 == 0) goto L_0x0088
            return r8
        L_0x0088:
            t97 r2 = r0.c
            java.lang.Object r2 = r2.getValue()
            fj2 r2 = (defpackage.fj2) r2
            r5.o = r0
            r5.X = r1
            r5.D0 = r4
            java.lang.Object r2 = r2.c(r1, r5)
            if (r2 != r6) goto L_0x009d
            return r6
        L_0x009d:
            vo9 r2 = (defpackage.vo9) r2
            r5.o = r0
            r5.X = r1
            r5.Y = r2
            r5.D0 = r11
            java.lang.Object r3 = r0.k(r2, r5)
            if (r3 != r6) goto L_0x00ae
            return r6
        L_0x00ae:
            r3 = r0
            r0 = r2
        L_0x00b0:
            long[] r2 = r1.b
            long[] r1 = r1.a
            int r7 = r1.length
            int r7 = r7 - r11
            if (r7 < 0) goto L_0x0151
            r9 = 0
        L_0x00b9:
            r11 = r1[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r17
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 == 0) goto L_0x0146
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r1
            r15 = r2
            r1 = r13
            r13 = r7
            r7 = r9
            r9 = r0
            r0 = 0
        L_0x00d8:
            if (r0 >= r1) goto L_0x013a
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r11 & r17
            r19 = 128(0x80, double:6.32E-322)
            int r2 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r2 >= 0) goto L_0x012d
            r2 = 3
            int r17 = r7 << 3
            int r17 = r17 + r0
            r22 = r11
            r10 = r15[r17]
            java.util.Map r2 = r9.a
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r10)
            java.lang.Object r2 = r2.get(r12)
            si2 r2 = (defpackage.si2) r2
            if (r2 == 0) goto L_0x0109
            java.util.List r2 = r2.f
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0105
            goto L_0x0109
        L_0x0105:
            r11 = r22
        L_0x0107:
            r4 = 3
            goto L_0x012a
        L_0x0109:
            r5.o = r3
            r5.X = r9
            r5.Y = r15
            r5.Z = r14
            r5.w0 = r13
            r5.x0 = r7
            r2 = r13
            r12 = r22
            r5.A0 = r12
            r5.y0 = r1
            r5.z0 = r0
            r4 = 3
            r5.D0 = r4
            java.lang.Object r10 = r3.d(r10, r5)
            if (r10 != r6) goto L_0x0128
            return r6
        L_0x0128:
            r11 = r12
            r13 = r2
        L_0x012a:
            r10 = 8
            goto L_0x0132
        L_0x012d:
            r2 = r13
            r4 = 3
            r12 = r11
            r11 = r12
            r13 = r2
        L_0x0132:
            long r11 = r11 >> r10
            r16 = 1
            int r0 = r0 + 1
            r4 = r16
            goto L_0x00d8
        L_0x013a:
            r16 = r4
            r2 = r13
            r4 = 3
            if (r1 != r10) goto L_0x0151
            r0 = r9
            r1 = r14
            r9 = r7
            r7 = r2
            r2 = r15
            goto L_0x0149
        L_0x0146:
            r16 = r4
            r4 = 3
        L_0x0149:
            if (r9 == r7) goto L_0x0151
            int r9 = r9 + 1
            r4 = r16
            goto L_0x00b9
        L_0x0151:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x19.j(zb9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(defpackage.vo9 r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            r0 = 1
            boolean r1 = r14 instanceof defpackage.t19
            if (r1 == 0) goto L_0x0014
            r1 = r14
            t19 r1 = (defpackage.t19) r1
            int r2 = r1.w0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0014
            int r2 = r2 - r3
            r1.w0 = r2
            goto L_0x0019
        L_0x0014:
            t19 r1 = new t19
            r1.<init>(r12, r14)
        L_0x0019:
            java.lang.Object r14 = r1.Y
            pu3 r2 = pu3.a
            int r3 = r1.w0
            java.lang.String r4 = "x19"
            if (r3 == 0) goto L_0x0035
            if (r3 != r0) goto L_0x002d
            vo9 r13 = r1.X
            x19 r12 = r1.o
            wx3.H(r14)
            goto L_0x004e
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0035:
            wx3.H(r14)
            java.lang.String r14 = "show(%s)"
            java.lang.Object[] r3 = new java.lang.Object[]{r13}
            udd.p(r4, r14, r3)
            r1.o = r12
            r1.X = r13
            r1.w0 = r0
            java.lang.Object r14 = r12.l(r13, r1)
            if (r14 != r2) goto L_0x004e
            return r2
        L_0x004e:
            r12.getClass()
            java.util.Map r14 = r13.a
            boolean r14 = r14.isEmpty()
            java.lang.String r1 = "showGroupSummary: skip update, no notifications!"
            if (r14 == 0) goto L_0x0060
            udd.U(r4, r1)
            goto L_0x01f8
        L_0x0060:
            int r14 = r13.d
            int r2 = r13.c
            boolean r3 = r13.f
            if (r3 == 0) goto L_0x007c
            if (r2 > 0) goto L_0x007c
            o7a r12 = r12.h()
            r12.a(r14)
            java.lang.String r12 = "showGroupSummary: skip update, no total count, %s"
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            udd.p(r4, r12, r13)
            goto L_0x01f8
        L_0x007c:
            r5 = 0
            if (r3 == 0) goto L_0x00d9
            java.lang.Integer r3 = r12.x0
            if (r3 != 0) goto L_0x0084
            goto L_0x00d9
        L_0x0084:
            int r3 = r3.intValue()
            if (r2 != r3) goto L_0x00d9
            o7a r3 = r12.h()
            h7a r6 = r12.g()
            int r6 = r6.e()
            h7a r7 = r12.g()
            r7.getClass()
            java.util.List r3 = r3.d(r5)
            boolean r7 = r3 instanceof java.util.Collection
            if (r7 == 0) goto L_0x00ac
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L_0x00ac
            goto L_0x00d9
        L_0x00ac:
            java.util.Iterator r3 = r3.iterator()
        L_0x00b0:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00d9
            java.lang.Object r7 = r3.next()
            android.service.notification.StatusBarNotification r7 = (android.service.notification.StatusBarNotification) r7     // Catch:{ all -> 0x00d2 }
            int r7 = r7.getId()     // Catch:{ all -> 0x00d2 }
            if (r7 != r6) goto L_0x00b0
            java.lang.String r13 = "showGroupSummary: skip update, same count"
            udd.q(r4, r13)
            if (r2 != 0) goto L_0x01f8
            o7a r12 = r12.h()
            r12.a(r14)
            goto L_0x01f8
        L_0x00d2:
            r12 = move-exception
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            r13.<init>(r12)
            throw r13
        L_0x00d9:
            java.util.Map r3 = r13.a
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x00ed
            o7a r12 = r12.h()
            r12.a(r14)
            udd.U(r4, r1)
            goto L_0x01f8
        L_0x00ed:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "showGroupSummary: total="
            r14.<init>(r1)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            udd.q(r4, r14)
            boolean r14 = r3.isEmpty()
            r14 = r14 ^ r0
            r1 = 0
            if (r14 == 0) goto L_0x011e
            java.util.Collection r14 = r3.values()
            java.lang.Object r14 = o23.U(r14)
            si2 r14 = (defpackage.si2) r14
            ti2 r14 = r14.e
            ti2 r4 = defpackage.ti2.a
            if (r14 != r4) goto L_0x0118
            r14 = r0
            goto L_0x0119
        L_0x0118:
            r14 = r1
        L_0x0119:
            java.lang.String r14 = r12.e(r14)
            goto L_0x014a
        L_0x011e:
            o7a r14 = r12.h()
            h7a r4 = r12.g()
            int r4 = r4.e()
            android.app.NotificationManager r14 = r14.i()
            android.service.notification.StatusBarNotification[] r14 = r14.getActiveNotifications()
            int r6 = r14.length
            r7 = r1
        L_0x0134:
            if (r7 >= r6) goto L_0x0149
            r8 = r14[r7]
            int r9 = r8.getId()
            if (r9 != r4) goto L_0x0147
            android.app.Notification r14 = r8.getNotification()
            java.lang.String r14 = r14.getChannelId()
            goto L_0x014a
        L_0x0147:
            int r7 = r7 + r0
            goto L_0x0134
        L_0x0149:
            r14 = r5
        L_0x014a:
            if (r14 != 0) goto L_0x014e
            goto L_0x01f8
        L_0x014e:
            android.content.Context r4 = r12.a
            int r6 = defpackage.fsb.tt_new_messages
            java.lang.String r4 = defpackage.dhe.s(r6, r2, r4)
            un9 r7 = r12.f(r14)
            sn9 r14 = new sn9
            r14.<init>(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r14.f = r6
            java.lang.CharSequence r4 = un9.c(r4)
            r14.d = r4
            r14.a = r0
            r7.q(r14)
            java.lang.String r14 = r13.e
            r7.r = r14
            r7.s = r0
            r7.A = r0
            r14 = 16
            r7.i(r14, r1)
            java.util.Collection r14 = r3.values()
            java.util.Iterator r14 = r14.iterator()
            boolean r1 = r14.hasNext()
            if (r1 != 0) goto L_0x018e
            r1 = r5
            goto L_0x01b3
        L_0x018e:
            java.lang.Object r1 = r14.next()
            boolean r3 = r14.hasNext()
            if (r3 != 0) goto L_0x0199
            goto L_0x01b3
        L_0x0199:
            r3 = r1
            si2 r3 = (defpackage.si2) r3
            long r3 = r3.m
        L_0x019e:
            java.lang.Object r6 = r14.next()
            r8 = r6
            si2 r8 = (defpackage.si2) r8
            long r8 = r8.m
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x01ad
            r1 = r6
            r3 = r8
        L_0x01ad:
            boolean r6 = r14.hasNext()
            if (r6 != 0) goto L_0x019e
        L_0x01b3:
            si2 r1 = (defpackage.si2) r1
            if (r1 == 0) goto L_0x01c3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r5 = r1.m
            long r3 = r3 - r5
            java.lang.String r5 = java.lang.String.valueOf(r3)
        L_0x01c3:
            r7.t = r5
            r14 = 2
            r7.C = r14
            o7a r6 = r12.h()
            o7a r14 = r12.h()
            android.content.Intent r8 = r14.f(r0)
            o7a r14 = r12.h()
            r14.getClass()
            int r0 = ru.ok.tamtam.android.services.NotificationTamService.y0
            android.content.Intent r9 = new android.content.Intent
            java.lang.Class<ru.ok.tamtam.android.services.NotificationTamService> r0 = ru.ok.tamtam.android.services.NotificationTamService.class
            android.content.Context r14 = r14.a
            r9.<init>(r14, r0)
            java.lang.String r14 = "ru.ok.tamtam.action.NOTIF_CANCEL"
            r9.setAction(r14)
            int r10 = r13.d
            java.lang.String r11 = "MESS_GROUP_NOTIF"
            r6.l(r7, r8, r9, r10, r11)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r12.x0 = r13
        L_0x01f8:
            jue r12 = jue.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x19.k(vo9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0740  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x079a  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0743 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(defpackage.vo9 r55, kotlin.coroutines.Continuation r56) {
        /*
            r54 = this;
            r0 = r54
            r1 = r55
            r2 = r56
            r5 = 1
            boolean r6 = r2 instanceof defpackage.u19
            if (r6 == 0) goto L_0x001a
            r6 = r2
            u19 r6 = (defpackage.u19) r6
            int r7 = r6.x0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001a
            int r7 = r7 - r8
            r6.x0 = r7
            goto L_0x001f
        L_0x001a:
            u19 r6 = new u19
            r6.<init>(r0, r2)
        L_0x001f:
            java.lang.Object r2 = r6.Z
            pu3 r7 = pu3.a
            int r8 = r6.x0
            jue r9 = jue.a
            if (r8 == 0) goto L_0x0040
            if (r8 != r5) goto L_0x0038
            int r0 = r6.Y
            int r1 = r6.X
            x19 r3 = r6.o
            wx3.H(r2)
            r26 = r9
            goto L_0x0798
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            wx3.H(r2)
            java.util.Map r2 = r1.a
            boolean r2 = r2.isEmpty()
            java.lang.String r8 = "x19"
            if (r2 == 0) goto L_0x0053
            java.lang.String r0 = "showBundled: skip, no data"
            udd.U(r8, r0)
            return r9
        L_0x0053:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10 = 25
            r11 = 20
            int r11 = java.lang.Math.min(r10, r11)
            java.util.Map r12 = r1.a
            java.util.Collection r12 = r12.values()
            gu6 r13 = new gu6
            r14 = 5
            r13.<init>(r14)
            java.util.List r12 = o23.m0(r12, r13)
            yb9 r13 = new yb9
            r13.<init>(r11)
            java.util.Iterator r12 = r12.iterator()
            r14 = 0
        L_0x007a:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x0759
            java.lang.Object r15 = r12.next()
            si2 r15 = (defpackage.si2) r15
            h7a r17 = r54.g()
            long r3 = r15.c
            r17.getClass()
            int r10 = (int) r3
            r18 = 32
            long r3 = r3 >> r18
            int r3 = (int) r3
            int r23 = r10 + r3
            java.util.List r3 = r15.f
            boolean r4 = r3.isEmpty()
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0719
            if (r14 >= r11) goto L_0x06ea
            int r4 = r3.size()
            r10 = 10
            if (r4 <= r10) goto L_0x00af
            java.util.List r4 = o23.o0(r10, r3)
            goto L_0x00b0
        L_0x00af:
            r4 = r3
        L_0x00b0:
            es r10 = new es
            r5 = 2
            r10.<init>(r5, r4)
            xz6 r5 = new xz6
            r25 = r12
            r12 = 26
            r5.<init>(r12)
            sg5 r5 = myc.Q(r10, r5)
            xz6 r10 = new xz6
            r12 = 27
            r10.<init>(r12)
            sg5 r5 = myc.L(r5, r10)
            rg5 r10 = new rg5
            r10.<init>(r5)
        L_0x00d3:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00f4
            java.lang.Object r5 = r10.next()
            wo9 r5 = (defpackage.wo9) r5
            t97 r12 = r0.Z
            java.lang.Object r12 = r12.getValue()
            u98 r12 = (defpackage.u98) r12
            java.lang.String r5 = r5.a
            o6a r12 = (o6a) r12
            r19 = r10
            r10 = 1
            r12.f(r5, r10)
            r10 = r19
            goto L_0x00d3
        L_0x00f4:
            if (r14 != 0) goto L_0x00fc
            boolean r5 = r15.j
            if (r5 == 0) goto L_0x00fc
            r5 = 1
            goto L_0x00fd
        L_0x00fc:
            r5 = 0
        L_0x00fd:
            java.lang.Object r10 = o23.V(r3)
            hr8 r10 = (defpackage.hr8) r10
            r12 = r9
            long r9 = r10.i
            r26 = r12
            ti2 r12 = defpackage.ti2.a
            r27 = r7
            ti2 r7 = r15.e
            r28 = r11
            if (r7 != r12) goto L_0x0114
            r11 = 1
            goto L_0x0115
        L_0x0114:
            r11 = 0
        L_0x0115:
            java.lang.String r11 = r0.e(r11)
            r29 = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[]{r11, r6}
            r30 = r14
            java.lang.String r14 = "showBundledForChat: channelId = %s, alert = %b"
            udd.p(r8, r14, r6)
            un9 r6 = r0.f(r11)
            java.lang.String r11 = r1.e
            r6.r = r11
            android.graphics.Bitmap r11 = r15.h
            r6.k(r11)
            android.app.Notification r11 = r6.F
            r14 = r2
            long r1 = r15.m
            r11.when = r1
            r11 = r8
            r19 = r9
            long r8 = r15.c
            java.lang.String r10 = java.lang.String.valueOf(r8)
            r6.B = r10
            r21 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r31 = r21 - r1
            java.lang.String r10 = java.lang.String.valueOf(r31)
            r6.t = r10
            java.lang.String r10 = r15.d
            r31 = r14
            boolean r14 = r15.k
            if (r14 == 0) goto L_0x0239
            r32 = r11
            grd r11 = r0.z0
            java.lang.Object r11 = r11.getValue()
            wna r11 = (wna) r11
            r33 = r1
            ho9 r1 = new ho9
            r1.<init>(r11)
            if (r7 != r12) goto L_0x0172
            goto L_0x017d
        L_0x0172:
            ti2 r2 = defpackage.ti2.o
            if (r7 != r2) goto L_0x0177
            goto L_0x017d
        L_0x0177:
            r1.h = r10
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.i = r2
        L_0x017d:
            java.util.Iterator r2 = r4.iterator()
        L_0x0181:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x022d
            java.lang.Object r10 = r2.next()
            hr8 r10 = (defpackage.hr8) r10
            r24 = r2
            boolean r2 = r10.n
            if (r2 == 0) goto L_0x019b
            r37 = r4
            r4 = r11
            r35 = r4
            r36 = r12
            goto L_0x01ef
        L_0x019b:
            r35 = r11
            r2 = r12
            long r11 = r10.g
            r36 = 0
            int r36 = (r11 > r36 ? 1 : (r11 == r36 ? 0 : -1))
            if (r36 == 0) goto L_0x01a7
            goto L_0x01a9
        L_0x01a7:
            long r11 = r10.c
        L_0x01a9:
            java.lang.Object r36 = r13.c(r11)
            r37 = r4
            if (r36 != 0) goto L_0x01ba
            wna r4 = b(r10)
            r13.f(r11, r4)
            r36 = r4
        L_0x01ba:
            r4 = r36
            wna r4 = (wna) r4
            r36 = r2
            androidx.core.graphics.drawable.IconCompat r2 = r4.b
            if (r2 != 0) goto L_0x01d9
            android.graphics.Bitmap r2 = r10.h
            if (r2 == 0) goto L_0x01d9
            dk r4 = r4.a()
            androidx.core.graphics.drawable.IconCompat r2 = androidx.core.graphics.drawable.IconCompat.b(r2)
            r4.X = r2
            wna r4 = r4.a()
            r13.e(r11, r4)
        L_0x01d9:
            java.lang.CharSequence r2 = r4.a
            r38 = r4
            java.lang.String r4 = r10.f
            boolean r2 = hhd.f(r2, r4)
            if (r2 != 0) goto L_0x01ed
            wna r4 = b(r10)
            r13.e(r11, r4)
            goto L_0x01ef
        L_0x01ed:
            r4 = r38
        L_0x01ef:
            ns8 r2 = r10.j
            java.lang.String r2 = r2.c
            go9 r11 = new go9
            r38 = r13
            long r12 = r10.i
            r11.<init>(r2, r12, r4)
            long r12 = r21 - r12
            java.lang.String r2 = java.lang.String.valueOf(r12)
            r6.t = r2
            wo9 r2 = r10.l
            if (r2 == 0) goto L_0x0210
            java.lang.String r4 = "image/*"
            r11.e = r4
            android.net.Uri r2 = r2.c
            r11.f = r2
        L_0x0210:
            java.util.ArrayList r2 = r1.e
            r2.add(r11)
            int r4 = r2.size()
            r11 = 25
            if (r4 <= r11) goto L_0x0221
            r4 = 0
            r2.remove(r4)
        L_0x0221:
            r2 = r24
            r11 = r35
            r12 = r36
            r4 = r37
            r13 = r38
            goto L_0x0181
        L_0x022d:
            r37 = r4
            r36 = r12
            r38 = r13
            r11 = 25
            r6.q(r1)
            goto L_0x026a
        L_0x0239:
            r33 = r1
            r37 = r4
            r32 = r11
            r36 = r12
            r38 = r13
            r11 = 25
            android.content.Context r1 = r0.a
            int r2 = defpackage.fsb.tt_new_messages
            int r4 = r15.i
            java.lang.String r1 = defpackage.dhe.s(r2, r4, r1)
            r6.f(r10)
            r6.e(r1)
            sn9 r2 = new sn9
            r4 = 0
            r2.<init>(r4)
            java.lang.CharSequence r1 = un9.c(r1)
            r2.f = r1
            java.lang.CharSequence r1 = un9.c(r10)
            r2.c = r1
            r6.q(r2)
        L_0x026a:
            if (r5 != 0) goto L_0x026f
            r1 = 1
            r6.C = r1
        L_0x026f:
            o7a r1 = r54.h()
            r1.getClass()
            java.lang.String r2 = "extendChatNotification step 1"
            java.lang.String r4 = "o7a"
            udd.q(r4, r2)
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x0289
            boolean r2 = r15.b()
            if (r2 == 0) goto L_0x028f
        L_0x0289:
            r39 = r3
            r35 = r7
            goto L_0x0471
        L_0x028f:
            boolean r2 = r15.b()
            t97 r5 = r1.d
            t97 r10 = r1.b
            t97 r12 = r1.g
            if (r2 == 0) goto L_0x02a9
            r24 = r1
            r39 = r3
            r41 = r4
            r35 = r7
            r21 = r12
            r40 = r15
            goto L_0x03e8
        L_0x02a9:
            java.lang.Object r2 = r12.getValue()
            t52 r2 = (defpackage.t52) r2
            i22 r2 = r2.y(r8)
            if (r2 == 0) goto L_0x02c4
            java.lang.Object r13 = r10.getValue()
            g2b r13 = (defpackage.g2b) r13
            j2b r13 = (defpackage.j2b) r13
            kb5 r13 = r13.e
            boolean r2 = r2.R(r13)
            goto L_0x02c5
        L_0x02c4:
            r2 = 0
        L_0x02c5:
            java.lang.Object r13 = r5.getValue()
            h7a r13 = (h7a) r13
            r13.getClass()
            int r13 = (int) r8
            r21 = r12
            long r11 = r8 >> r18
            int r11 = (int) r11
            int r13 = r13 + r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.String r0 = "android.wearable.EXTENSIONS"
            if (r2 == 0) goto L_0x0301
            int r2 = defpackage.zhc.b
            fn9 r2 = r1.e(r15, r13, r2)
            r35 = r7
            java.lang.String r7 = "flags"
            r39 = r3
            r3 = 7
            android.os.Bundle r3 = defpackage.wn6.g(r3, r7)
            android.os.Bundle r7 = r2.e
            r7.putBundle(r0, r3)
            gn9 r2 = r2.a()
            r11.add(r2)
            goto L_0x0305
        L_0x0301:
            r39 = r3
            r35 = r7
        L_0x0305:
            int r2 = defpackage.zhc.a
            fn9 r2 = r1.g(r15, r13, r2)
            gn9 r2 = r2.a()
            r11.add(r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            boolean r3 = r11.isEmpty()
            if (r3 != 0) goto L_0x03bb
            java.util.ArrayList r3 = new java.util.ArrayList
            int r7 = r11.size()
            r3.<init>(r7)
            java.util.Iterator r7 = r11.iterator()
        L_0x032a:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x03af
            java.lang.Object r11 = r7.next()
            gn9 r11 = (gn9) r11
            int r13 = android.os.Build.VERSION.SDK_INT
            r22 = r7
            androidx.core.graphics.drawable.IconCompat r7 = r11.a()
            if (r7 != 0) goto L_0x0344
            r24 = r1
            r7 = 0
            goto L_0x034b
        L_0x0344:
            r24 = r1
            r1 = 0
            android.graphics.drawable.Icon r7 = zn6.d(r7, r1)
        L_0x034b:
            java.lang.CharSequence r1 = r11.i
            r40 = r15
            android.app.PendingIntent r15 = r11.j
            android.app.Notification$Action$Builder r1 = ko9.a(r7, r1, r15)
            android.os.Bundle r7 = r11.a
            if (r7 == 0) goto L_0x035f
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r7)
            goto L_0x0364
        L_0x035f:
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
        L_0x0364:
            boolean r7 = r11.d
            r41 = r4
            java.lang.String r4 = "android.support.allowGeneratedReplies"
            r15.putBoolean(r4, r7)
            lo9.a(r1, r7)
            r4 = 31
            if (r13 < r4) goto L_0x0379
            boolean r4 = r11.k
            mo9.a(r1, r4)
        L_0x0379:
            jo9.a(r1, r15)
            u8c[] r4 = r11.c
            if (r4 == 0) goto L_0x039e
            int r7 = r4.length
            android.app.RemoteInput[] r7 = new android.app.RemoteInput[r7]
            r11 = 0
        L_0x0384:
            int r13 = r4.length
            if (r11 >= r13) goto L_0x0392
            r13 = r4[r11]
            android.app.RemoteInput r13 = u8c.a(r13)
            r7[r11] = r13
            r13 = 1
            int r11 = r11 + r13
            goto L_0x0384
        L_0x0392:
            r13 = 1
            int r4 = r7.length
            r11 = 0
        L_0x0395:
            if (r11 >= r4) goto L_0x039e
            r15 = r7[r11]
            jo9.b(r1, r15)
            int r11 = r11 + r13
            goto L_0x0395
        L_0x039e:
            android.app.Notification$Action r1 = jo9.c(r1)
            r3.add(r1)
            r7 = r22
            r1 = r24
            r15 = r40
            r4 = r41
            goto L_0x032a
        L_0x03af:
            r24 = r1
            r41 = r4
            r40 = r15
            java.lang.String r1 = "actions"
            r2.putParcelableArrayList(r1, r3)
            goto L_0x03c1
        L_0x03bb:
            r24 = r1
            r41 = r4
            r40 = r15
        L_0x03c1:
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x03d8
            int r1 = r12.size()
            android.app.Notification[] r1 = new android.app.Notification[r1]
            java.lang.Object[] r1 = r12.toArray(r1)
            android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
            java.lang.String r3 = "pages"
            r2.putParcelableArray(r3, r1)
        L_0x03d8:
            android.os.Bundle r1 = r6.w
            if (r1 != 0) goto L_0x03e3
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r6.w = r1
        L_0x03e3:
            android.os.Bundle r1 = r6.w
            r1.putBundle(r0, r2)
        L_0x03e8:
            if (r14 == 0) goto L_0x046f
            java.lang.Object r0 = r5.getValue()
            h7a r0 = (h7a) r0
            r0.getClass()
            int r0 = (int) r8
            long r1 = r8 >> r18
            int r1 = (int) r1
            int r0 = r0 + r1
            java.lang.Object r1 = r21.getValue()
            t52 r1 = (defpackage.t52) r1
            i22 r1 = r1.y(r8)
            if (r1 == 0) goto L_0x0413
            java.lang.Object r2 = r10.getValue()
            g2b r2 = (defpackage.g2b) r2
            j2b r2 = (defpackage.j2b) r2
            kb5 r2 = r2.e
            boolean r4 = r1.R(r2)
            goto L_0x0414
        L_0x0413:
            r4 = 0
        L_0x0414:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "extendChatNotification messagingEnabled = "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = r41
            udd.q(r2, r1)
            if (r4 == 0) goto L_0x044c
            int r1 = defpackage.zhc.e0
            r3 = r24
            r15 = r40
            fn9 r1 = r3.e(r15, r0, r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "extendChatNotification directReplyAction = "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            udd.q(r2, r4)
            gn9 r1 = r1.a()
            r6.a(r1)
            goto L_0x0450
        L_0x044c:
            r3 = r24
            r15 = r40
        L_0x0450:
            int r1 = defpackage.zhc.a
            fn9 r0 = r3.g(r15, r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "extendChatNotification markAsReadAction = "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            udd.q(r2, r1)
            gn9 r0 = r0.a()
            r6.a(r0)
            goto L_0x0471
        L_0x046f:
            r15 = r40
        L_0x0471:
            o7a r0 = r54.h()
            java.util.Iterator r1 = r39.iterator()
        L_0x0479:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x048a
            java.lang.Object r2 = r1.next()
            hr8 r2 = (defpackage.hr8) r2
            java.lang.Long r2 = r2.d
            if (r2 == 0) goto L_0x0479
            goto L_0x048b
        L_0x048a:
            r2 = 0
        L_0x048b:
            ejb r1 = new ejb
            ti2 r3 = r15.e
            long r4 = r15.a
            java.lang.String r7 = r15.b
            long r10 = r15.c
            long r12 = r15.l
            java.lang.String r14 = r15.n
            r21 = r8
            long r8 = r15.o
            r40 = r1
            r41 = r4
            r43 = r7
            r44 = r10
            r46 = r2
            r47 = r12
            r49 = r14
            r50 = r8
            r52 = r3
            r40.<init>(r41, r43, r44, r46, r47, r49, r50, r52)
            java.lang.Long r3 = java.lang.Long.valueOf(r19)
            r0.getClass()
            if (r2 == 0) goto L_0x04d0
            long r4 = r2.longValue()
            sr7 r2 = sr7.c
            r2.getClass()
            r2 = 0
            a34 r2 = sr7.Z1(r4, r3, r2)
            android.content.Intent r0 = r0.k(r2)
            r56 = r6
            goto L_0x051e
        L_0x04d0:
            sr7 r2 = sr7.c
            r2.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = ":chats?id="
            r56 = r6
            java.lang.String r6 = "&type=server&push_id="
            java.lang.StringBuilder r6 = hr1.k(r10, r7, r6)
            r6.append(r4)
            java.lang.String r4 = "&push_type="
            r6.append(r4)
            r6.append(r14)
            java.lang.String r4 = "&created_time="
            java.lang.String r5 = "&message_server_id="
            hr1.s(r6, r4, r8, r5)
            r6.append(r12)
            java.lang.String r4 = r6.toString()
            r2.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "&load_mark="
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            a34 r3 = new a34
            r3.<init>(r2)
            android.content.Intent r0 = r0.k(r3)
        L_0x051e:
            java.lang.String r2 = "push_action"
            java.lang.String r3 = "push_action_open_chat"
            r0.putExtra(r2, r3)
            java.lang.String r2 = "push_info"
            r0.putExtra(r2, r1)
            o7a r1 = r54.h()
            r1.getClass()
            o7a r1 = r54.h()
            r1.getClass()
            int r2 = ru.ok.tamtam.android.services.NotificationTamService.y0
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<ru.ok.tamtam.android.services.NotificationTamService> r3 = ru.ok.tamtam.android.services.NotificationTamService.class
            android.content.Context r1 = r1.a
            r2.<init>(r1, r3)
            java.lang.String r1 = "ru.ok.tamtam.action.NOTIF_CANCEL_BUNDLED"
            r2.setAction(r1)
            java.lang.String r1 = "ru.ok.tamtam.extra.CHAT_SERVER_ID"
            r3 = r21
            r2.putExtra(r1, r3)
            java.lang.String r1 = "ru.ok.tamtam.extra.MARK"
            r3 = r33
            r2.putExtra(r1, r3)
            java.lang.String r1 = "ru.ok.tamtam.extra.PUSH_ID"
            long r3 = r15.a
            r2.putExtra(r1, r3)
            java.lang.String r1 = "ru.ok.tamtam.extra.EVENT_KEY"
            java.lang.String r3 = r15.b
            r2.putExtra(r1, r3)
            java.lang.String r1 = "ru.ok.tamtam.extra.MESSAGE_SERVER_ID"
            long r3 = r15.l
            r2.putExtra(r1, r3)
            o7a r1 = r54.h()
            t97 r3 = r1.d
            java.lang.Object r3 = r3.getValue()
            h7a r3 = (h7a) r3
            r3.getClass()
            r24 = 0
            r19 = r1
            r20 = r56
            r21 = r0
            r22 = r2
            r19.l(r20, r21, r22, r23, r24)
            int r0 = r39.size()
            r1 = 10
            if (r0 <= r1) goto L_0x05b6
            es r0 = new es
            r2 = r39
            r3 = 2
            r0.<init>(r3, r2)
            int r2 = r2.size()
            int r2 = r2 - r1
            dyc r0 = myc.S(r0, r2)
            xz6 r1 = new xz6
            r2 = 23
            r1.<init>(r2)
            vqe r2 = new vqe
            r2.<init>(r0, r1)
            r0 = r31
            u23.L(r0, r2)
        L_0x05b1:
            r2 = r35
            r1 = r36
            goto L_0x05b9
        L_0x05b6:
            r0 = r31
            goto L_0x05b1
        L_0x05b9:
            if (r2 != r1) goto L_0x05bf
            r1 = 1
        L_0x05bc:
            r3 = r54
            goto L_0x05c1
        L_0x05bf:
            r1 = 0
            goto L_0x05bc
        L_0x05c1:
            java.lang.String r1 = r3.e(r1)
            o7a r2 = r54.h()
            r4 = 0
            ip9 r2 = r2.j(r4)
            android.app.NotificationManager r2 = r2.b
            boolean r2 = cp9.a(r2)
            if (r2 != 0) goto L_0x0608
            java.util.ArrayList r1 = new java.util.ArrayList
            r5 = r37
            r2 = 10
            int r2 = q23.H(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L_0x05e7:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x06dd
            java.lang.Object r6 = r2.next()
            hr8 r6 = (defpackage.hr8) r6
            or9 r14 = new or9
            long r8 = r6.c
            ep4 r16 = defpackage.ep4.SYSTEM_APP_NOTIF_DISABLED
            long r10 = r6.e
            long r12 = r6.i
            r7 = r14
            r6 = r14
            r14 = r16
            r7.<init>(r8, r10, r12, r14)
            r1.add(r6)
            goto L_0x05e7
        L_0x0608:
            r5 = r37
            t97 r2 = r3.Y
            java.lang.Object r6 = r2.getValue()
            en9 r6 = (defpackage.en9) r6
            b4a r7 = r6.d
            java.lang.String r7 = r7.b(r1)
            if (r7 != 0) goto L_0x061c
        L_0x061a:
            r6 = 1
            goto L_0x062d
        L_0x061c:
            android.app.NotificationManager r6 = r6.i()
            android.app.NotificationChannelGroup r6 = r6.getNotificationChannelGroup(r7)
            if (r6 != 0) goto L_0x0627
            goto L_0x061a
        L_0x0627:
            boolean r6 = r6.isBlocked()
            r7 = 1
            r6 = r6 ^ r7
        L_0x062d:
            if (r6 != 0) goto L_0x065f
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = q23.H(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L_0x063e:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x06dd
            java.lang.Object r6 = r2.next()
            hr8 r6 = (defpackage.hr8) r6
            or9 r14 = new or9
            long r8 = r6.c
            ep4 r16 = defpackage.ep4.NOTIFICATION_GROUP_CHANNEL_DISABLED
            long r10 = r6.e
            long r12 = r6.i
            r7 = r14
            r6 = r14
            r14 = r16
            r7.<init>(r8, r10, r12, r14)
            r1.add(r6)
            goto L_0x063e
        L_0x065f:
            java.lang.Object r2 = r2.getValue()
            en9 r2 = (defpackage.en9) r2
            android.app.NotificationManager r2 = r2.i()
            android.app.NotificationChannel r1 = r2.getNotificationChannel(r1)
            if (r1 != 0) goto L_0x0671
        L_0x066f:
            r1 = 1
            goto L_0x0679
        L_0x0671:
            int r1 = r1.getImportance()
            if (r1 <= 0) goto L_0x0678
            goto L_0x066f
        L_0x0678:
            r1 = r4
        L_0x0679:
            if (r1 != 0) goto L_0x06ab
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = q23.H(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L_0x068a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x06dd
            java.lang.Object r6 = r2.next()
            hr8 r6 = (defpackage.hr8) r6
            or9 r14 = new or9
            long r8 = r6.c
            ep4 r16 = defpackage.ep4.NOTIFICATION_CHANNEL_DISABLED
            long r10 = r6.e
            long r12 = r6.i
            r7 = r14
            r6 = r14
            r14 = r16
            r7.<init>(r8, r10, r12, r14)
            r1.add(r6)
            goto L_0x068a
        L_0x06ab:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = q23.H(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L_0x06ba:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x06dd
            java.lang.Object r6 = r2.next()
            hr8 r6 = (defpackage.hr8) r6
            pr9 r13 = new pr9
            long r8 = r6.c
            boolean r12 = r6.m
            long r10 = r6.e
            long r6 = r6.i
            r18 = r6
            r7 = r13
            r6 = r13
            r13 = r18
            r7.<init>(r8, r10, r12, r13)
            r1.add(r6)
            goto L_0x06ba
        L_0x06dd:
            r0.addAll(r1)
            int r1 = r5.size()
            int r14 = r1 + r30
            r2 = r32
            r5 = 2
            goto L_0x0736
        L_0x06ea:
            r29 = r6
            r27 = r7
            r32 = r8
            r26 = r9
            r28 = r11
            r25 = r12
            r38 = r13
            r30 = r14
            r4 = 0
            r53 = r3
            r3 = r0
            r0 = r2
            r2 = r53
            es r1 = new es
            r5 = 2
            r1.<init>(r5, r2)
            xz6 r2 = new xz6
            r6 = 24
            r2.<init>(r6)
            vqe r6 = new vqe
            r6.<init>(r1, r2)
            u23.L(r0, r6)
            r2 = r32
            goto L_0x0734
        L_0x0719:
            r3 = r0
            r0 = r2
            r29 = r6
            r27 = r7
            r32 = r8
            r26 = r9
            r28 = r11
            r25 = r12
            r38 = r13
            r30 = r14
            r4 = 0
            r5 = 2
            java.lang.String r1 = "display messages are empty"
            r2 = r32
            udd.U(r2, r1)
        L_0x0734:
            r14 = r30
        L_0x0736:
            java.util.List r1 = r15.g
            boolean r6 = r1.isEmpty()
            r7 = 1
            r6 = r6 ^ r7
            if (r6 == 0) goto L_0x0743
            r0.addAll(r1)
        L_0x0743:
            r1 = r55
            r8 = r2
            r12 = r25
            r9 = r26
            r7 = r27
            r11 = r28
            r6 = r29
            r13 = r38
            r5 = 1
            r10 = 25
            r2 = r0
            r0 = r3
            goto L_0x007a
        L_0x0759:
            r3 = r0
            r0 = r2
            r29 = r6
            r27 = r7
            r26 = r9
            r28 = r11
            r30 = r14
            t97 r1 = r3.w0
            java.lang.Object r1 = r1.getValue()
            mr9 r1 = (defpackage.mr9) r1
            r6.o = r3
            r2 = r28
            r6.X = r2
            r14 = r30
            r6.Y = r14
            r4 = 1
            r6.x0 = r4
            pae r4 = r1.a
            n3a r4 = (n3a) r4
            ju3 r4 = r4.b()
            hr9 r5 = new hr9
            r7 = 0
            r5.<init>(r1, r0, r7)
            java.lang.Object r0 = xs7.U(r4, r5, r6)
            r1 = r27
            if (r0 != r1) goto L_0x0791
            goto L_0x0793
        L_0x0791:
            r0 = r26
        L_0x0793:
            if (r0 != r1) goto L_0x0796
            return r1
        L_0x0796:
            r1 = r2
            r0 = r14
        L_0x0798:
            if (r0 < r1) goto L_0x07bc
            t97 r0 = r3.w0
            java.lang.Object r0 = r0.getValue()
            mr9 r0 = (defpackage.mr9) r0
            nr9 r0 = r0.e()
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "onNotificationsMaxCountReached: maxCount="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = defpackage.nr9.d
            udd.q(r1, r0)
        L_0x07bc:
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x19.l(vo9, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
