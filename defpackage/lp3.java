package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: lp3  reason: default package */
public final class lp3 extends kh0 {
    public final List b;

    public lp3(long j) {
        this.b = Collections.singletonList(Long.valueOf(j));
    }

    public final String toString() {
        return "ContactsUpdateEvent{idList=" + this.b + '}';
    }

    public lp3(Collection collection) {
        this.b = new ArrayList(collection);
    }

    public lp3(long j, Collection collection) {
        super(j);
        this.b = new ArrayList(collection);
    }
}
