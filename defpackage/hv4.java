package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* renamed from: hv4  reason: default package */
public final class hv4 extends e07 {
    public final gv4 g;

    public hv4(TextView textView) {
        this.g = new gv4(textView);
    }

    public final void L(boolean z) {
        if (!(!(pt4.p != null))) {
            this.g.L(z);
        }
    }

    public final void M(boolean z) {
        boolean z2 = !(pt4.p != null);
        gv4 gv4 = this.g;
        if (z2) {
            gv4.i = z;
        } else {
            gv4.M(z);
        }
    }

    public final TransformationMethod N(TransformationMethod transformationMethod) {
        return (pt4.p != null) ^ true ? transformationMethod : this.g.N(transformationMethod);
    }

    public final InputFilter[] t(InputFilter[] inputFilterArr) {
        return (pt4.p != null) ^ true ? inputFilterArr : this.g.t(inputFilterArr);
    }

    public final boolean z() {
        return this.g.i;
    }
}
