package defpackage;

import android.animation.TypeEvaluator;

/* renamed from: mhb  reason: default package */
public final class mhb implements TypeEvaluator {
    public ela[] a = null;

    public final Object evaluate(float f, Object obj, Object obj2) {
        ela[] elaArr = (ela[]) obj;
        ela[] elaArr2 = (ela[]) obj2;
        if (h2g.b(elaArr, elaArr2)) {
            if (!h2g.b(this.a, elaArr)) {
                this.a = elaArr != null ? h2g.g(elaArr) : null;
            }
            ela[] elaArr3 = this.a;
            if (elaArr3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (elaArr != null) {
                int length = elaArr.length;
                for (int i = 0; i < length; i++) {
                    if (elaArr2 != null) {
                        elaArr3[i].b(elaArr[i], elaArr2[i], f);
                    }
                }
                return elaArr3;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}
