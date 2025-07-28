package defpackage;

import android.text.Spanned;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fj  reason: default package */
public final class fj {
    public final AtomicReference a = new AtomicReference(bqc.b);
    public final HashMap b;

    static {
        m7c.a(fj.class).b();
    }

    public fj() {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.b = new HashMap();
    }

    public final List a(CharSequence charSequence) {
        if ((charSequence instanceof Spanned) && charSequence.length() != 0) {
            HashMap hashMap = this.b;
            if (!hashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                int length = charSequence.length();
                Object[] objArr = null;
                try {
                    Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
                    if (spanned != null) {
                        objArr = spanned.getSpans(0, length, ite.class);
                    }
                } catch (Throwable unused) {
                }
                ite[] iteArr = (ite[]) objArr;
                if (iteArr != null) {
                    for (ite ite : iteArr) {
                        try {
                            hr1.r(hashMap.get(charSequence.subSequence(((Spanned) charSequence).getSpanStart(ite), ((Spanned) charSequence).getSpanEnd(ite)).toString()));
                        } catch (Throwable unused2) {
                        }
                    }
                }
                return o23.m0(arrayList, new zo4(7));
            }
        }
        return hw4.a;
    }
}
