package defpackage;

import android.text.Spannable;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: qu4  reason: default package */
public final class qu4 implements nu4 {
    public final t97 a;
    public final t97 b;

    public qu4(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    public final boolean a(int i, CharSequence charSequence) {
        h().getClass();
        if (charSequence == null || charSequence.length() == 0 || i < 0 || i > h0e.V(charSequence)) {
            return false;
        }
        int codePointAt = charSequence.toString().codePointAt(i);
        return a24.R(codePointAt) || codePointAt == 8205 || codePointAt == 8419;
    }

    public final CharSequence b(int i, CharSequence charSequence) {
        Spannable e = h().e(i, charSequence);
        return e == null ? BuildConfig.FLAVOR : e;
    }

    public final List c(CharSequence charSequence) {
        List<wia> d = h().d(charSequence);
        ArrayList arrayList = new ArrayList(q23.H(d, 10));
        for (wia wia : d) {
            arrayList.add((CharSequence) wia.a);
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: yu4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence d(long r13, java.lang.String r15, java.lang.String r16, java.lang.CharSequence r17, int r18) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            r2 = r17
            r9 = r18
            java.lang.CharSequence r3 = r12.b(r9, r2)
            int r4 = r3.length()
            r5 = 0
            r10 = 0
            boolean r6 = r3 instanceof android.text.Spanned     // Catch:{ all -> 0x0022 }
            if (r6 == 0) goto L_0x0018
            r6 = r3
            android.text.Spanned r6 = (android.text.Spanned) r6     // Catch:{ all -> 0x0022 }
            goto L_0x0019
        L_0x0018:
            r6 = r5
        L_0x0019:
            if (r6 == 0) goto L_0x0022
            java.lang.Class<yu4> r7 = yu4.class
            java.lang.Object[] r4 = r6.getSpans(r10, r4, r7)     // Catch:{ all -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r4 = r5
        L_0x0023:
            yu4[] r4 = (yu4[]) r4
            if (r4 == 0) goto L_0x002e
            java.lang.Object r4 = defpackage.cs.Y(r4)
            r5 = r4
            yu4 r5 = (yu4) r5
        L_0x002e:
            if (r5 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x0085
            t97 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            ji r0 = (ji) r0
            r0.getClass()
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0085
            int r4 = r17.length()
            if (r4 != 0) goto L_0x0048
            goto L_0x0085
        L_0x0048:
            zj r11 = new zj
            ese r4 = new ese
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            if (r16 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r3 = r16
        L_0x0055:
            r4.<init>(r6, r15, r3)
            grd r6 = defpackage.hrd.a(r4)
            ki r7 = new ki
            android.graphics.drawable.Drawable r1 = r5.Y
            r7.<init>(r1)
            android.content.Context r4 = r0.b
            fi r8 = r0.a
            r3 = r11
            r5 = r18
            r3.<init>(r4, r5, r6, r7, r8)
            r11.setBounds(r10, r10, r9, r9)
            ak r0 = new ak
            r3 = r13
            r0.<init>(r13, r11)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r2)
            int r2 = r17.length()
            r3 = 33
            r1.setSpan(r0, r10, r2, r3)
            r3 = r1
        L_0x0085:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qu4.d(long, java.lang.String, java.lang.String, java.lang.CharSequence, int):java.lang.CharSequence");
    }

    public final CharSequence e(CharSequence charSequence) {
        wv4 h = h();
        h.c.getClass();
        Spannable e = h.e(a24.X(TypedValue.applyDimension(2, (float) 20, dh4.c().getDisplayMetrics())), charSequence);
        return e == null ? BuildConfig.FLAVOR : e;
    }

    public final List f(CharSequence charSequence) {
        return h().d(charSequence);
    }

    public final boolean g(CharSequence charSequence) {
        h().getClass();
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        return charSequence.codePoints().allMatch(new sf3(1));
    }

    public final wv4 h() {
        return (wv4) this.a.getValue();
    }
}
