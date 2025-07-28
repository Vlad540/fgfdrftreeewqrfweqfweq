package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* renamed from: jv4  reason: default package */
public final class jv4 implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ jv4(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    public final void afterTextChanged(Editable editable) {
        ite[] iteArr;
        Object value;
        grd grd;
        Object value2;
        int i;
        Object[] objArr;
        switch (this.a) {
            case 0:
                if (!TextUtils.isEmpty(editable) && !this.b) {
                    this.b = true;
                    String obj = editable.toString();
                    if (!TextUtils.isEmpty(obj)) {
                        for (CharSequence charSequence : ((nu4) this.c).c(obj)) {
                            int indexOf = obj.indexOf(charSequence.toString());
                            if (indexOf >= 0 && ((iteArr = (ite[]) editable.getSpans(indexOf, charSequence.length() + indexOf, ite.class)) == null || iteArr.length <= 0)) {
                                editable.replace(indexOf, charSequence.length() + indexOf, charSequence);
                            }
                        }
                    }
                    this.b = false;
                    return;
                }
                return;
            default:
                jq8 jq8 = (jq8) this.c;
                grd grd2 = jq8.P0;
                do {
                    value = grd2.getValue();
                    ((Number) value).intValue();
                } while (!grd2.b(value, Integer.valueOf(jq8.c.getSelectionEnd())));
                do {
                    grd = jq8.N0;
                    value2 = grd.getValue();
                    CharSequence charSequence2 = (CharSequence) value2;
                    objArr = null;
                } while (!grd.b(value2, editable != null ? editable.subSequence(0, editable.length()) : null));
                s59 s59 = km4.y0;
                if (editable == null || h0e.c0(editable)) {
                    jq8.k(s59.r(jq8));
                } else if (!this.b) {
                    jq8.k(s59.r(jq8));
                }
                if (editable != null) {
                    try {
                        objArr = editable.getSpans(0, editable.length(), oe.class);
                    } catch (Throwable unused) {
                    }
                    if (objArr == null) {
                        objArr = new oe[0];
                    }
                    for (oe oeVar : (oe[]) objArr) {
                        ((ak) oeVar).w0.start();
                    }
                    return;
                }
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                return;
            default:
                this.b = !(charSequence == null || h0e.c0(charSequence));
                return;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }
}
