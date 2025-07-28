package defpackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l25  reason: default package */
public final class l25 implements Enumeration {
    public final Enumeration a;

    public l25(m25 m25) {
        this.a = Collections.enumeration(m25.a);
    }

    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    public final Object nextElement() {
        return new HashMap((Map) this.a.nextElement());
    }
}
