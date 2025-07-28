package defpackage;

import java.io.Serializable;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: q33  reason: default package */
public final class q33 implements hu3, Serializable {
    public final hu3 a;
    public final fu3 b;

    public q33(hu3 hu3, fu3 fu3) {
        this.a = hu3;
        this.b = fu3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof q33)) {
                return false;
            }
            q33 q33 = (q33) obj;
            q33.getClass();
            int i = 2;
            q33 q332 = q33;
            int i2 = 2;
            while (true) {
                hu3 hu3 = q332.a;
                q332 = hu3 instanceof q33 ? (q33) hu3 : null;
                if (q332 == null) {
                    break;
                }
                i2++;
            }
            q33 q333 = this;
            while (true) {
                hu3 hu32 = q333.a;
                q333 = hu32 instanceof q33 ? (q33) hu32 : null;
                if (q333 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            while (true) {
                fu3 fu3 = this.b;
                if (hhd.f(q33.get(fu3.getKey()), fu3)) {
                    hu3 hu33 = this.a;
                    if (!(hu33 instanceof q33)) {
                        fu3 fu32 = (fu3) hu33;
                        z = hhd.f(q33.get(fu32.getKey()), fu32);
                        break;
                    }
                    this = (q33) hu33;
                } else {
                    z = false;
                    break;
                }
            }
            return z;
        }
    }

    public final Object fold(Object obj, i26 i26) {
        return i26.invoke(this.a.fold(obj, i26), this.b);
    }

    public final fu3 get(gu3 gu3) {
        while (true) {
            fu3 fu3 = this.b.get(gu3);
            if (fu3 != null) {
                return fu3;
            }
            hu3 hu3 = this.a;
            if (!(hu3 instanceof q33)) {
                return hu3.get(gu3);
            }
            this = (q33) hu3;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    public final hu3 minusKey(gu3 gu3) {
        fu3 fu3 = this.b;
        fu3 fu32 = fu3.get(gu3);
        hu3 hu3 = this.a;
        if (fu32 != null) {
            return hu3;
        }
        hu3 minusKey = hu3.minusKey(gu3);
        return minusKey == hu3 ? this : minusKey == bw4.a ? fu3 : new q33(minusKey, fu3);
    }

    public final hu3 plus(hu3 hu3) {
        return hhd.I(this, hu3);
    }

    public final String toString() {
        return me4.l(new StringBuilder("["), (String) fold(BuildConfig.FLAVOR, p33.b), ']');
    }
}
