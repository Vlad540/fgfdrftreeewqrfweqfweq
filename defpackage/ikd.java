package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Iterator;

/* renamed from: ikd  reason: default package */
public final class ikd implements TextWatcher {
    public final /* synthetic */ jkd a;
    public final /* synthetic */ int b;

    public ikd(jkd jkd, int i) {
        this.a = jkd;
        this.b = i;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        dc3 dc3;
        hx6 H0;
        int length = charSequence != null ? charSequence.length() : 0;
        String obj = charSequence != null ? charSequence.subSequence(i, i3 + i).toString() : null;
        String str = "";
        if (obj == null) {
            obj = str;
        }
        int i4 = this.b;
        jkd jkd = this.a;
        if (length == 2 && obj.length() == 1) {
            hc3 hc3 = (hc3) jkd.K0;
            if (hc3.I0(i4) && obj.length() == 1) {
                hx6 H02 = hc3.H0(i4);
                if (H02 != null) {
                    ((jkd) H02).B(obj);
                }
                hx6 H03 = hc3.H0(i4 + 1);
                if (H03 != null) {
                    ((jkd) H03).L0.requestFocus();
                }
            }
        } else if (length > 1) {
            ((hc3) jkd.K0).J0(i4, String.valueOf(charSequence));
        } else {
            cx6 cx6 = jkd.K0;
            String valueOf = String.valueOf(charSequence);
            hc3 hc32 = (hc3) cx6;
            if (hc32.I0(i4) && valueOf.length() == 1) {
                if (i4 < hc32.getCountCells() - 1 && (H0 = hc32.H0(i4 + 1)) != null) {
                    ((jkd) H0).L0.requestFocus();
                }
                Iterator it = hc3.G0(hc32).iterator();
                while (it.hasNext()) {
                    str = hr1.g(str, ((jkd) ((hx6) it.next())).A());
                }
                if (str.length() > 0 && str.length() == hc32.getCountCells() && TextUtils.isDigitsOnly(str) && (dc3 = hc32.a2) != null) {
                    dc3.d(str);
                }
            }
        }
    }
}
