package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: tf  reason: default package */
public final class tf {
    public final EnhancedVectorDrawable a;
    public final ArrayList b;
    public final ArrayMap c;

    public tf(EnhancedVectorDrawable enhancedVectorDrawable, ArrayList arrayList, ArrayMap arrayMap) {
        this.a = enhancedVectorDrawable;
        this.b = arrayList;
        this.c = arrayMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf)) {
            return false;
        }
        tf tfVar = (tf) obj;
        return hhd.f(this.a, tfVar.a) && hhd.f(this.b, tfVar.b) && hhd.f(this.c, tfVar.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ParsedResource(drawable=" + this.a + ", animators=" + this.b + ", targetNameMap=" + this.c + ")";
    }
}
