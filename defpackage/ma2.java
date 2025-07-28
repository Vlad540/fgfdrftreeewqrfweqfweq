package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: ma2  reason: default package */
public final class ma2 implements ho2, jte {
    public final Context a;
    public final s16 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final t97 h;
    public final r7e i = new r7e(new fa2(this, 3));
    public final r7e j = new r7e(new fa2(this, 5));
    public final r7e k = new r7e(new fa2(this, 6));
    public final r7e l = new r7e(new fa2(this, 7));
    public final r7e m = new r7e(new fa2(this, 8));
    public final r7e n = new r7e(new fa2(this, 9));
    public final r7e o = new r7e(new fa2(this, 10));
    public final r7e p = new r7e(new fa2(this, 0));
    public final r7e q = new r7e(new fa2(this, 1));
    public final r7e r = new r7e(new fa2(this, 2));
    public final r7e s = new r7e(new fa2(this, 4));
    public final ja2 t = new ja2(this);
    public final String u = ma2.class.getName();
    public final la2 v;

    public ma2(Context context, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, pae pae, t97 t976, jq2 jq2) {
        this.a = context;
        this.b = jq2;
        this.c = t972;
        this.d = t97;
        this.e = t974;
        this.f = t973;
        this.g = t975;
        this.h = t976;
        this.v = new la2(t972, t97, this);
        context.registerComponentCallbacks(new ga2(0, (Object) this));
        ez3.N(new ck5((t0c) km4.y0.n(context).x0, new ka2(this, (Continuation) null), 5), n1g.a(((n3a) pae).a()));
    }

    public final boolean a(int i2, i22 i22, xm8 xm8, SpannableStringBuilder spannableStringBuilder, boolean z) {
        if (i2 != 1 && !z && !xm8.a.v()) {
            s59 s59 = km4.y0;
            Context context = this.a;
            tf3 tf3 = xm8.b;
            if (tf3 == null || tf3.n() != ((Number) this.b.invoke()).longValue()) {
                if (i22.H()) {
                    az9 az9 = new az9(context, dz9.a);
                    String p2 = tf3.p(fj0.a);
                    if (p2 != null) {
                        try {
                            az9.c(p2);
                        } catch (Throwable th) {
                            udd.s(this.u, "fail to set avatar url", th);
                            ((pv3) this.h.getValue()).a("ONEME-4183", th);
                            az9.b(new ub0(tf3.m(), tf3.n()));
                        }
                    } else {
                        az9.b(new ub0(tf3.m(), tf3.n()));
                    }
                    udd.c(spannableStringBuilder, 8203, new bi5(az9, (vh5) null, 6));
                    spannableStringBuilder.append(8288);
                    udd.c(spannableStringBuilder, 8203, new wld(a24.X(((float) 4) * dh4.c().getDisplayMetrics().density)));
                    spannableStringBuilder.append(8288);
                    udd.d(spannableStringBuilder, String.valueOf(tf3.d()), new whe(s59.n(context).g(), new hd1(9)));
                    spannableStringBuilder.append(8288);
                    if (tf3.u()) {
                        spannableStringBuilder.append(" ");
                        spannableStringBuilder.setSpan(new c1f(context, 1, true, new hd1(10)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append(8288);
                    }
                    udd.d(spannableStringBuilder, ":", new whe(s59.n(context).g(), new hd1(11)));
                    spannableStringBuilder.append(8288);
                    udd.c(spannableStringBuilder, 8203, new wld(a24.X(((float) 6) * dh4.c().getDisplayMetrics().density)));
                    return true;
                }
            } else if (i22.H()) {
                udd.d(spannableStringBuilder, hr1.g(context.getString(whc.E), ":"), new whe(s59.n(context).g(), new hd1(13)));
                spannableStringBuilder.append(8288);
                udd.c(spannableStringBuilder, 8203, new wld(a24.X(((float) 6) * dh4.c().getDisplayMetrics().density)));
                spannableStringBuilder.append(8288);
                return true;
            }
        }
        return false;
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, xm8 xm8, boolean z) {
        List list;
        Drawable drawable;
        o00 d2;
        o00 d3;
        vo8 vo8 = xm8.a;
        dyc dyc = pw4.a;
        if (vo8 == null) {
            udd.s(this.u, "Empty MessageDb while process message", (Throwable) null);
        } else if (vo8.o()) {
            dyc = cs.K(new Drawable[]{(Drawable) this.i.getValue()});
        } else if (vo8.u()) {
            dyc = cs.K(new Drawable[]{(Drawable) this.j.getValue()});
        } else if (vo8.w()) {
            dyc = cs.K(new Drawable[]{(Drawable) this.k.getValue()});
        } else if (vo8.s()) {
            dyc = cs.K(new Drawable[]{(Drawable) this.l.getValue()});
        } else if (vo8.x()) {
            dyc = cs.K(new Drawable[]{(Drawable) this.m.getValue()});
        } else if (vo8.t()) {
            o00 d4 = vo8.d();
            if (d4 == null || !d4.d() || (d3 = vo8.d()) == null || !d3.b()) {
                o00 d5 = vo8.d();
                if (d5 == null || !d5.d()) {
                    o00 d6 = vo8.d();
                    if (d6 == null || d6.d() || (d2 = vo8.d()) == null || !d2.b()) {
                        o00 d7 = vo8.d();
                        r7e r7e = this.n;
                        drawable = (d7 == null || d7.d()) ? (Drawable) r7e.getValue() : (Drawable) r7e.getValue();
                    } else {
                        drawable = (Drawable) this.p.getValue();
                    }
                } else {
                    drawable = (Drawable) this.o.getValue();
                }
            } else {
                drawable = (Drawable) this.q.getValue();
            }
            dyc = cs.K(new Drawable[]{drawable});
        } else {
            jj7 jj7 = vo8.D0;
            dyc S = (jj7 == null || (list = (List) jj7.a) == null) ? null : myc.S(myc.Q(new es(2, list), new ka(this, 3, xm8)), 3);
            if (S != null) {
                dyc = S;
            }
        }
        List U = myc.U(dyc);
        if (!(!U.isEmpty())) {
            U = null;
        }
        if (U != null) {
            if (!z) {
                udd.c(spannableStringBuilder, 8203, new wld(a24.X(((float) 6) * dh4.c().getDisplayMetrics().density)));
                spannableStringBuilder.append(8288);
            }
            int i2 = 0;
            for (Object next : U) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    udd.c(spannableStringBuilder, 8203, new bi5((Drawable) next, vh5.a, 4));
                    spannableStringBuilder.append(8288);
                    if (i2 < U.size() - 1) {
                        udd.c(spannableStringBuilder, 8203, new wld(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density)));
                        spannableStringBuilder.append(8288);
                    }
                    i2 = i3;
                } else {
                    p23.G();
                    throw null;
                }
            }
            udd.c(spannableStringBuilder, 8203, new wld(a24.X(((float) 6) * dh4.c().getDisplayMetrics().density)));
            spannableStringBuilder.append(8288);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: bmd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: bmd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: bmd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: bmd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: bmd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: bmd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: bmd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r17, i22 r18, xm8 r19, android.text.SpannableStringBuilder r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 1
            vo8 r7 = r3.a
            r6 = 0
            if (r7 != 0) goto L_0x0019
            java.lang.String r0 = r0.u
            java.lang.String r1 = "Empty MessageDb while process message"
            defpackage.udd.s(r0, r1, r6)
            goto L_0x01bf
        L_0x0019:
            boolean r8 = r7.B()
            if (r8 == 0) goto L_0x0051
            t97 r1 = r0.e
            java.lang.Object r1 = r1.getValue()
            r5 = r1
            dhe r5 = (dhe) r5
            t97 r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            r7 = r1
            w6a r7 = (defpackage.w6a) r7
            vo8 r8 = r3.a
            s16 r1 = r0.b
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            long r13 = r1.longValue()
            android.content.Context r6 = r0.a
            r10 = 1
            r15 = 0
            r9 = 0
            r11 = 1
            r12 = 0
            java.lang.String r0 = r5.f(r6, r7, r8, r9, r10, r11, r12, r13, r15)
            if (r0 == 0) goto L_0x01bf
            r4.append(r0)
            goto L_0x01bf
        L_0x0051:
            boolean r8 = r7.u()
            r9 = 0
            if (r8 == 0) goto L_0x006f
            android.content.Context r1 = r0.a
            q00 r2 = r7.e()
            t97 r0 = r0.g
            java.lang.Object r0 = r0.getValue()
            zf3 r0 = (zf3) r0
            java.lang.String r0 = dhe.j(r1, r2, r0, r9, r9)
            r4.append(r0)
            goto L_0x01bf
        L_0x006f:
            boolean r8 = r7.A()
            if (r8 == 0) goto L_0x00cb
            o1b r0 = r3.X
            r0.f = r2
            w6a r1 = r0.a
            int r3 = r1.f()
            int r1 = r1.e()
            r0.i(r2, r3, r1)
            java.lang.CharSequence r0 = r0.g
            if (r0 == 0) goto L_0x00c4
            int r1 = bmd.a
            bmd r0 = oa2.F(r0, r5)
            int r1 = r0.length()
            java.lang.Class<android.text.style.ClickableSpan> r2 = android.text.style.ClickableSpan.class
            java.lang.Object[] r1 = r0.getSpans(r9, r1, r2)     // Catch:{ all -> 0x009b }
            goto L_0x009c
        L_0x009b:
            r1 = r6
        L_0x009c:
            android.text.style.ClickableSpan[] r1 = (android.text.style.ClickableSpan[]) r1
            if (r1 == 0) goto L_0x00ab
            int r2 = r1.length
            r3 = r9
        L_0x00a2:
            if (r3 >= r2) goto L_0x00ab
            r7 = r1[r3]
            r0.removeSpan(r7)
            int r3 = r3 + r5
            goto L_0x00a2
        L_0x00ab:
            int r1 = r0.length()
            java.lang.Class<android.text.style.URLSpan> r2 = android.text.style.URLSpan.class
            java.lang.Object[] r6 = r0.getSpans(r9, r1, r2)     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            android.text.style.URLSpan[] r6 = (android.text.style.URLSpan[]) r6
            if (r6 == 0) goto L_0x00c3
            int r1 = r6.length
        L_0x00ba:
            if (r9 >= r1) goto L_0x00c3
            r2 = r6[r9]
            r0.removeSpan(r2)
            int r9 = r9 + r5
            goto L_0x00ba
        L_0x00c3:
            r6 = r0
        L_0x00c4:
            if (r6 == 0) goto L_0x01bf
            r4.append(r6)
            goto L_0x01bf
        L_0x00cb:
            boolean r8 = r7.v()
            if (r8 == 0) goto L_0x0120
            t00 r8 = r7.f()
            if (r8 == 0) goto L_0x00da
            s00 r8 = r8.a
            goto L_0x00db
        L_0x00da:
            r8 = r6
        L_0x00db:
            s00 r10 = s00.y0
            if (r8 != r10) goto L_0x0120
            if (r21 != 0) goto L_0x0105
            wld r1 = new wld
            r6 = 6
            float r6 = (float) r6
            android.content.res.Resources r7 = dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = defpackage.a24.X(r6)
            r1.<init>(r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r6 = 8203(0x200b, float:1.1495E-41)
            defpackage.udd.c(r4, r6, r1)
            r1 = 8288(0x2060, float:1.1614E-41)
            r4.append(r1)
        L_0x0105:
            android.content.Context r1 = r0.a
            int r6 = rhc.r0
            java.lang.String r1 = r1.getString(r6)
            r4.append(r1)
            java.lang.String r1 = ": "
            r4.append(r1)
            xm8 r1 = r3.o
            android.text.SpannableString r0 = r0.d(r2, r1, r5, false)
            r4.append(r0)
            goto L_0x01bf
        L_0x0120:
            boolean r8 = r7.t()
            if (r8 == 0) goto L_0x013f
            android.content.Context r6 = r0.a
            s16 r0 = r0.b
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r10 = r0.longValue()
            r8 = 0
            r9 = 1
            java.lang.String r0 = dhe.h(r6, r7, r8, r9, r10)
            r4.append(r0)
            goto L_0x01bf
        L_0x013f:
            boolean r7 = r7.o()
            if (r7 == 0) goto L_0x0162
            xm8 r7 = r19.a()
            if (r7 == 0) goto L_0x0162
            xm8 r3 = r19.a()
        L_0x014f:
            xm8 r6 = r3.a()
            if (r6 == 0) goto L_0x015a
            xm8 r3 = r3.a()
            goto L_0x014f
        L_0x015a:
            android.text.SpannableString r0 = r0.d(r2, r3, r1, r5)
            r4.append(r0)
            goto L_0x01bf
        L_0x0162:
            r0 = 2
            if (r1 != r0) goto L_0x017e
            r18.g0()
            java.lang.CharSequence r0 = r2.z0
            if (r0 == 0) goto L_0x0172
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0173
        L_0x0172:
            r9 = r5
        L_0x0173:
            r1 = r9 ^ 1
            if (r1 == 0) goto L_0x0178
            r6 = r0
        L_0x0178:
            if (r6 == 0) goto L_0x01bf
            r4.append(r6)
            goto L_0x01bf
        L_0x017e:
            if (r1 != r5) goto L_0x01bf
            nge r0 = nte.l
            yq4 r1 = yq4.b
            long r0 = r0.g(r1)
            float r0 = ah4.e(r0)
            android.content.res.Resources r1 = dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = (int) r0
            o1b r1 = r3.X
            r1.f = r2
            boolean r3 = r1.q
            if (r3 != 0) goto L_0x01b8
            vo8 r3 = r1.d
            java.lang.String r2 = r1.a(r2, r3)
            w6a r6 = r1.a
            nu4 r7 = r6.j
            java.lang.CharSequence r2 = r7.b(r0, r2)
            java.util.List r3 = r3.V0
            java.lang.CharSequence r0 = r6.j(r2, r3, r0)
            r1.j = r0
            r1.q = r5
        L_0x01b8:
            java.lang.CharSequence r0 = r1.j
            if (r0 == 0) goto L_0x01bf
            r4.append(r0)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma2.c(int, i22, xm8, android.text.SpannableStringBuilder, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061 A[LOOP:0: B:17:0x005f->B:18:0x0061, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableString d(i22 r9, xm8 r10, int r11, boolean r12) {
        /*
            r8 = this;
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            r7 = 0
            r0 = r8
            r1 = r11
            r2 = r9
            r3 = r10
            r4 = r6
            r5 = r12
            boolean r12 = r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x001b }
            if (r12 != 0) goto L_0x001d
            int r12 = r6.length()     // Catch:{ all -> 0x001b }
            if (r12 != 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            r5 = r7
            goto L_0x001f
        L_0x001b:
            r9 = move-exception
            goto L_0x002d
        L_0x001d:
            r12 = 1
            r5 = r12
        L_0x001f:
            r8.b(r6, r10, r5)     // Catch:{ all -> 0x001b }
            r0 = r8
            r1 = r11
            r2 = r9
            r3 = r10
            r4 = r6
            r0.c(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x001b }
            jue r9 = defpackage.jue.a     // Catch:{ all -> 0x001b }
            goto L_0x0033
        L_0x002d:
            kcc r10 = new kcc
            r10.<init>(r9)
            r9 = r10
        L_0x0033:
            java.lang.Throwable r9 = defpackage.mcc.a(r9)
            if (r9 == 0) goto L_0x0052
            java.lang.String r10 = r8.u
            java.lang.String r11 = "FAILURE process last message for chatRow"
            defpackage.udd.s(r10, r11, r9)
            t97 r8 = r8.h
            java.lang.Object r8 = r8.getValue()
            pv3 r8 = (pv3) r8
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r11, r9)
            java.lang.String r9 = "ONEME-16071"
            r8.a(r9, r10)
        L_0x0052:
            android.text.SpannableString r8 = new android.text.SpannableString
            int r9 = r6.length()
            java.lang.Class<uu7> r10 = uu7.class
            java.lang.Object[] r9 = r6.getSpans(r7, r9, r10)
            int r10 = r9.length
        L_0x005f:
            if (r7 >= r10) goto L_0x006b
            r11 = r9[r7]
            uu7 r11 = (uu7) r11
            r6.removeSpan(r11)
            int r7 = r7 + 1
            goto L_0x005f
        L_0x006b:
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma2.d(i22, xm8, int, boolean):android.text.SpannableString");
    }

    public final CharSequence f(long j2) {
        yb9 yb9;
        Map a2 = ((iv6) this.c.getValue()).a(j2);
        if (a2 == null) {
            return null;
        }
        if (a2.isEmpty()) {
            yb9 = pq7.a;
        } else {
            yb9 yb92 = new yb9(a2.size());
            for (Map.Entry entry : a2.entrySet()) {
                yb92.e(((Number) entry.getKey()).longValue(), entry.getValue());
            }
            yb9 = yb92;
        }
        if (yb9 == null) {
            return null;
        }
        return (CharSequence) this.v.c(new ia2(j2, yb9));
    }
}
