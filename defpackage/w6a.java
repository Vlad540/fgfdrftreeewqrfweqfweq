package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: w6a  reason: default package */
public final class w6a {
    public static final /* synthetic */ int s = 0;
    public final Context a;
    public final xz9 b;
    public final i03 c;
    public final t97 d;
    public final dhe e;
    public int f = -1;
    public String g;
    public Pattern h;
    public final g2b i;
    public final nu4 j;
    public final xz9 k;
    public final lhd l;
    public final g15 m;
    public final v6a n;
    public final t97 o;
    public int p = -1;
    public int q = -1;
    public int r = -1;

    public w6a(Context context, g2b g2b, nu4 nu4, lhd lhd, xz9 xz9, g15 g15, t97 t97, dhe dhe, v6a v6a, t97 t972) {
        this.a = context.getApplicationContext();
        this.c = ((j2b) g2b).a;
        this.b = xz9;
        this.d = t97;
        this.e = dhe;
        this.i = g2b;
        this.j = nu4;
        this.l = lhd;
        this.k = xz9;
        this.m = g15;
        this.n = v6a;
        this.o = t972;
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence a(java.lang.CharSequence r17, boolean r18, boolean r19, boolean r20, java.util.List r21, boolean r22) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r22
            java.lang.String r5 = "OneMeLinksProcessor"
            java.lang.String r6 = "ONEME-6282"
            boolean r7 = android.text.TextUtils.isEmpty(r17)
            if (r7 == 0) goto L_0x0015
            java.lang.String r0 = ""
            return r0
        L_0x0015:
            java.lang.String r7 = r1.g
            if (r7 != 0) goto L_0x0034
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            android.content.Context r8 = r1.a
            int r9 = defpackage.ysb.app_scheme
            java.lang.String r8 = r8.getString(r9)
            r7.append(r8)
            java.lang.String r8 = "://"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r1.g = r7
        L_0x0034:
            java.util.regex.Pattern r7 = r1.h
            if (r7 != 0) goto L_0x0051
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r1.g
            r7.append(r8)
            java.lang.String r8 = "[^\\s]+"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)
            r1.h = r7
        L_0x0051:
            java.util.regex.Pattern r7 = defpackage.fhe.a
            boolean r7 = r0 instanceof android.text.Spannable
            if (r7 == 0) goto L_0x005b
            android.text.Spannable r0 = (android.text.Spannable) r0
        L_0x0059:
            r7 = r0
            goto L_0x0060
        L_0x005b:
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r17)
            goto L_0x0059
        L_0x0060:
            xz9 r0 = r1.k
            int r8 = r0.a(r3)
            if (r19 == 0) goto L_0x006d
            sf7 r0 = sf7.c
            defpackage.fhe.a(r7, r0, r2, r8)
        L_0x006d:
            if (r20 == 0) goto L_0x0072
            r0 = 7
            r9 = r0
            goto L_0x0073
        L_0x0072:
            r9 = 1
        L_0x0073:
            lhd r0 = r1.l
            r0.getClass()
            java.lang.Object r0 = r0.b
            r10 = r0
            t97 r10 = (defpackage.t97) r10
            r11 = 0
            boolean r0 = android.text.util.Linkify.addLinks(r7, r9)     // Catch:{ all -> 0x0083 }
            goto L_0x00b4
        L_0x0083:
            r0 = move-exception
            r12 = r0
            boolean r0 = r12 instanceof java.lang.ArrayIndexOutOfBoundsException
            if (r0 == 0) goto L_0x00a5
            java.lang.CharSequence r0 = defpackage.mt0.F(r7)     // Catch:{ all -> 0x0094 }
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch:{ all -> 0x0094 }
            boolean r0 = android.text.util.Linkify.addLinks(r0, r9)     // Catch:{ all -> 0x0094 }
            goto L_0x00b4
        L_0x0094:
            r0 = move-exception
            java.lang.String r9 = "LinkifyCompat.addLinks with mask text.safeCopy() failed"
            defpackage.udd.s(r5, r9, r0)
            java.lang.Object r9 = r10.getValue()
            pv3 r9 = (pv3) r9
            r9.a(r6, r0)
        L_0x00a3:
            r0 = r11
            goto L_0x00b4
        L_0x00a5:
            java.lang.String r0 = "LinkifyCompat.addLinks with mask failed"
            defpackage.udd.s(r5, r0, r12)
            java.lang.Object r0 = r10.getValue()
            pv3 r0 = (pv3) r0
            r0.a(r6, r12)
            goto L_0x00a3
        L_0x00b4:
            if (r0 != 0) goto L_0x00f5
            java.util.regex.Pattern r9 = r1.h
            java.lang.String r12 = r1.g
            boolean r0 = android.text.util.Linkify.addLinks(r7, r9, r12)     // Catch:{ all -> 0x00bf }
            goto L_0x00f0
        L_0x00bf:
            r0 = move-exception
            r13 = r0
            boolean r0 = r13 instanceof java.lang.ArrayIndexOutOfBoundsException
            if (r0 == 0) goto L_0x00e1
            java.lang.CharSequence r0 = defpackage.mt0.F(r7)     // Catch:{ all -> 0x00d0 }
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch:{ all -> 0x00d0 }
            boolean r0 = android.text.util.Linkify.addLinks(r0, r9, r12)     // Catch:{ all -> 0x00d0 }
            goto L_0x00f0
        L_0x00d0:
            r0 = move-exception
            java.lang.String r9 = "LinkifyCompat.addLinks with pattern text.safeCopy() failed"
            defpackage.udd.s(r5, r9, r0)
            java.lang.Object r5 = r10.getValue()
            pv3 r5 = (pv3) r5
            r5.a(r6, r0)
        L_0x00df:
            r0 = r11
            goto L_0x00f0
        L_0x00e1:
            java.lang.String r0 = "LinkifyCompat.addLinks with pattern failed"
            defpackage.udd.s(r5, r0, r13)
            java.lang.Object r0 = r10.getValue()
            pv3 r0 = (pv3) r0
            r0.a(r6, r13)
            goto L_0x00df
        L_0x00f0:
            if (r0 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r0 = r11
            goto L_0x00f6
        L_0x00f5:
            r0 = 1
        L_0x00f6:
            if (r0 == 0) goto L_0x0177
            int r0 = r7.length()
            java.lang.Class<android.text.style.URLSpan> r5 = android.text.style.URLSpan.class
            java.lang.Object[] r0 = r7.getSpans(r11, r0, r5)
            android.text.style.URLSpan[] r0 = (android.text.style.URLSpan[]) r0
            if (r0 == 0) goto L_0x0177
            int r5 = r0.length
            if (r5 != 0) goto L_0x010b
            goto L_0x0177
        L_0x010b:
            int r5 = r7.length()
            java.lang.Class<lf7> r6 = lf7.class
            java.lang.Object[] r5 = r7.getSpans(r11, r5, r6)
            lf7[] r5 = (lf7[]) r5
            if (r5 == 0) goto L_0x0177
            int r6 = r5.length
            if (r6 != 0) goto L_0x011d
            goto L_0x0177
        L_0x011d:
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r5 = java.util.Arrays.asList(r5)
            r6.<init>(r5)
            int r5 = r0.length
            r9 = r11
            r10 = r9
        L_0x0129:
            if (r9 >= r5) goto L_0x0177
            r12 = r0[r9]
            boolean r13 = r6.isEmpty()
            if (r13 == 0) goto L_0x0134
            goto L_0x0177
        L_0x0134:
            int r13 = r7.getSpanStart(r12)
            if (r13 >= 0) goto L_0x013b
            goto L_0x0141
        L_0x013b:
            int r14 = r7.getSpanEnd(r12)
            if (r14 >= 0) goto L_0x0143
        L_0x0141:
            r4 = 1
            goto L_0x0174
        L_0x0143:
            r15 = r11
        L_0x0144:
            int r11 = r6.size()
            if (r15 >= r11) goto L_0x0170
            java.lang.Object r11 = r6.get(r15)
            lf7 r11 = (lf7) r11
            int r4 = r7.getSpanStart(r11)
            if (r4 >= 0) goto L_0x0157
            goto L_0x015d
        L_0x0157:
            int r11 = r7.getSpanEnd(r11)
            if (r11 >= 0) goto L_0x015f
        L_0x015d:
            r4 = 1
            goto L_0x016e
        L_0x015f:
            if (r4 != r13) goto L_0x016c
            if (r11 != r14) goto L_0x016c
            r7.removeSpan(r12)
            r6.remove(r15)
            r4 = 1
            r10 = 1
            goto L_0x0171
        L_0x016c:
            r4 = 1
            r10 = 1
        L_0x016e:
            int r15 = r15 + r4
            goto L_0x0144
        L_0x0170:
            r4 = 1
        L_0x0171:
            if (r10 != 0) goto L_0x0174
            goto L_0x0177
        L_0x0174:
            int r9 = r9 + r4
            r11 = 0
            goto L_0x0129
        L_0x0177:
            sf7 r0 = sf7.o
            defpackage.fhe.a(r7, r0, r2, r8)
            if (r21 == 0) goto L_0x01cb
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x01cb
            java.util.Iterator r4 = r21.iterator()
        L_0x0188:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r0 = r4.next()
            r5 = r0
            fp8 r5 = (fp8) r5
            int r0 = r5.d
            int r6 = r5.e
            int r6 = r6 + r0
            java.lang.Class<efb> r9 = efb.class
            java.lang.Object[] r0 = r7.getSpans(r0, r6, r9)
            r6 = r0
            efb[] r6 = (efb[]) r6
            if (r6 == 0) goto L_0x01c1
            int r0 = r6.length
            if (r0 > 0) goto L_0x01a9
            goto L_0x01c1
        L_0x01a9:
            int r9 = r6.length
            r10 = 0
        L_0x01ab:
            if (r10 >= r9) goto L_0x01c1
            r0 = r6[r10]
            r7.removeSpan(r0)     // Catch:{ Exception | StackOverflowError -> 0x01b4 }
        L_0x01b2:
            r11 = 1
            goto L_0x01bf
        L_0x01b4:
            r0 = move-exception
            boolean r11 = r0 instanceof java.lang.StackOverflowError
            if (r11 == 0) goto L_0x01b2
            g15 r11 = r1.m
            r11.a(r0)
            goto L_0x01b2
        L_0x01bf:
            int r10 = r10 + r11
            goto L_0x01ab
        L_0x01c1:
            r11 = 1
            r6 = 0
            java.lang.CharSequence r0 = r1.b(r7, r5, r6, r3)
            r7 = r0
            android.text.Spannable r7 = (android.text.Spannable) r7
            goto L_0x0188
        L_0x01cb:
            sf7 r0 = sf7.b
            defpackage.fhe.a(r7, r0, r2, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w6a.a(java.lang.CharSequence, boolean, boolean, boolean, java.util.List, boolean):java.lang.CharSequence");
    }

    public final CharSequence b(CharSequence charSequence, fp8 fp8, boolean z, boolean z2) {
        if (fp8.g.contains(fp8.c)) {
            return charSequence;
        }
        int i2 = fp8.d;
        int i3 = fp8.e;
        int i4 = i2 + i3;
        if (i4 > charSequence.length() || i2 < 0) {
            udd.R("w6a", (IOException) null, "addMessageElement: can't add message element, text length: %s, from: %s, length: %s", Arrays.copyOf(new Object[]{Integer.valueOf(charSequence.length()), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
            return charSequence;
        } else if (z && charSequence.charAt(i2) == '@') {
            return charSequence;
        } else {
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(new ip8(fp8, this.b.a(z2)), i2, i4, 33);
            return spannableStringBuilder;
        }
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2, int i2) {
        if (z) {
            spannableStringBuilder.insert(i2, "⁠ ");
            spannableStringBuilder.setSpan(new c1f(this.a, 1, false, new un8(z2, 2)), i2 + 1, i2 + 2, 33);
        }
    }

    public final String d(long j2) {
        i03 i03 = this.c;
        sz0 v = xs7.v(j2, i03.m());
        Locale u = i03.u();
        String[] strArr = dhe.b;
        int t = hr1.t(v.b);
        Context context = this.a;
        long j3 = v.c;
        switch (t) {
            case 0:
                return context.getString(avb.tt_dates_right_now);
            case 1:
                return dhe.s(fsb.tt_dates_minutes_past, (int) j3, context);
            case 2:
                return dhe.s(fsb.tt_dates_hours_past, (int) j3, context);
            case 3:
                return String.format(context.getString(avb.tt_dates_yesterday_at), new Object[]{xs7.p(context, j3, u)});
            case 4:
                return dhe.s(fsb.tt_dates_days_past, (int) j3, context);
            case 5:
                return dhe.s(fsb.tt_dates_weeks_past, (int) j3, context);
            case 6:
                return dhe.s(fsb.tt_dates_months_past, (int) j3, context);
            case 7:
                return xs7.w(u, j3, true);
            default:
                return BuildConfig.FLAVOR;
        }
    }

    public final int e() {
        if (this.q == -1) {
            this.q = (int) this.a.getResources().getDimension(yhc.b);
        }
        return this.q;
    }

    public final int f() {
        if (this.p == -1) {
            this.p = (int) (dh4.d(this.i.c.g.getFloat("app.extra.text.size.sp", 0.0f)) + this.a.getResources().getDimension(yhc.a));
        }
        return this.p;
    }

    public final int g() {
        if (this.r == -1) {
            this.r = (int) (dh4.d(this.i.c.g.getFloat("app.extra.text.size.sp", 0.0f)) + this.a.getResources().getDimension(yhc.c));
        }
        return this.r;
    }

    public final q1b h(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) ? q1b.a() : new q1b(this.j.e(charSequence), ehe.d(charSequence.toString(), this));
    }

    public final q1b i(String str, ArrayList arrayList) {
        return TextUtils.isEmpty(str) ? q1b.a() : arrayList.isEmpty() ? h(str) : new q1b(j(str, arrayList, dh4.b(18)), ehe.d(str.toString(), this));
    }

    public final CharSequence j(CharSequence charSequence, List list, int i2) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        boolean a2 = ((rj) this.o.getValue()).a();
        nu4 nu4 = this.j;
        if (!a2) {
            return nu4.b(i2, charSequence);
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : list) {
                try {
                    if (((fp8) next).c == ep8.z0) {
                        arrayList2.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        return arrayList.isEmpty() ? nu4.b(i2, charSequence) : this.n.a(charSequence, arrayList, 1, false, i2, true);
    }

    public final CharSequence k(CharSequence charSequence, List list) {
        CharSequence a2 = charSequence == null ? null : this.n.a(charSequence, list, 1, true, 0, false);
        if (TextUtils.isEmpty(a2) || ek8.J(list)) {
            return a2;
        }
        CharSequence spannableStringBuilder = new SpannableStringBuilder(a2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fp8 fp8 = (fp8) it.next();
            if (fp8.c == ep8.a) {
                spannableStringBuilder = b(spannableStringBuilder, fp8, false, true);
            }
        }
        return spannableStringBuilder;
    }
}
