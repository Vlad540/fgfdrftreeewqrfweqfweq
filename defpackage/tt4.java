package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: tt4  reason: default package */
public final class tt4 implements nu4 {
    public final pt4 a;

    public tt4(pt4 pt4) {
        this.a = pt4;
    }

    public final boolean a(int i, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && i >= 0 && i < charSequence.length()) {
            try {
                CharSequence g = this.a.g(0, charSequence.length(), charSequence, Integer.MAX_VALUE, 1);
                if (g instanceof Spanned) {
                    Spanned spanned = (Spanned) g;
                    ite[] iteArr = (ite[]) spanned.getSpans(0, spanned.length(), ite.class);
                    if (!(iteArr == null || iteArr.length == 0)) {
                        for (ite ite : iteArr) {
                            int spanStart = spanned.getSpanStart(ite);
                            int spanEnd = spanned.getSpanEnd(ite);
                            if (i >= spanStart && i < spanEnd) {
                                return true;
                            }
                            if (i >= spanEnd) {
                                return false;
                            }
                        }
                    }
                }
                return false;
            } catch (Exception e) {
                udd.s("tt4", String.format(Locale.ENGLISH, "Can't know is emoji at position %s", new Object[]{charSequence}), e);
            }
        }
        return false;
    }

    public final List c(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return Collections.emptyList();
        }
        try {
            CharSequence g = this.a.g(0, charSequence.length(), charSequence, Integer.MAX_VALUE, 1);
            if (!(g instanceof Spanned)) {
                return Collections.emptyList();
            }
            Spanned spanned = (Spanned) g;
            ite[] iteArr = (ite[]) spanned.getSpans(0, spanned.length(), ite.class);
            if (iteArr == null || iteArr.length == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(iteArr.length);
            for (ite ite : iteArr) {
                int spanStart = spanned.getSpanStart(ite);
                int spanEnd = spanned.getSpanEnd(ite);
                try {
                    arrayList.add(spanned.subSequence(spanStart, spanEnd));
                } catch (Exception unused) {
                    udd.r("tt4", String.format(Locale.ENGLISH, "Can't create emoji span: start = %d, end = %d, text = %s", new Object[]{Integer.valueOf(spanStart), Integer.valueOf(spanEnd), charSequence}));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            udd.u("tt4", th, "Can't get emoji tokens %s", new Object[]{charSequence});
            return Collections.emptyList();
        }
    }

    public final CharSequence e(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        try {
            CharSequence g = this.a.g(0, charSequence.length(), charSequence, Integer.MAX_VALUE, 1);
            return g == null ? "" : g;
        } catch (Exception e) {
            udd.s("tt4", String.format(Locale.ENGLISH, "Can't process emoji %s", new Object[]{charSequence}), e);
            return charSequence;
        }
    }

    public final boolean g(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        List<CharSequence> c = c(charSequence);
        if (c.isEmpty()) {
            return false;
        }
        String trim = charSequence.toString().trim();
        for (CharSequence charSequence2 : c) {
            String charSequence3 = charSequence2.toString();
            if (!trim.startsWith(charSequence3)) {
                return false;
            }
            trim = trim.replaceFirst(Pattern.quote(charSequence3), "").trim();
        }
        return trim.length() == 0;
    }
}
