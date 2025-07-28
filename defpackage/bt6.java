package defpackage;

import java.util.AbstractMap;
import java.util.Set;

/* renamed from: bt6  reason: default package */
public final class bt6 extends AbstractMap {
    public final uze[] a;

    public bt6(uze[] uzeArr) {
        this.a = uzeArr;
    }

    public final Set entrySet() {
        return new tr(this.a);
    }
}
