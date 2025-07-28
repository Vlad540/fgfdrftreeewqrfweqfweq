package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: au3  reason: default package */
public final class au3 implements Iterable {
    public List X;
    public final /* synthetic */ int a;
    public final Object b;
    public final HashMap c;
    public Set o;

    public au3(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Object();
                this.c = new HashMap();
                this.o = Collections.emptySet();
                this.X = Collections.emptyList();
                return;
            default:
                this.b = new Object();
                this.c = new HashMap();
                this.o = Collections.emptySet();
                this.X = Collections.emptyList();
                return;
        }
    }

    public final int a(Object obj) {
        int intValue;
        int intValue2;
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    try {
                        intValue = this.c.containsKey(obj) ? ((Integer) this.c.get(obj)).intValue() : 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return intValue;
            default:
                synchronized (this.b) {
                    try {
                        intValue2 = this.c.containsKey(obj) ? ((Integer) this.c.get(obj)).intValue() : 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return intValue2;
        }
    }

    public final Iterator iterator() {
        Iterator it;
        Iterator it2;
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    it = this.X.iterator();
                }
                return it;
            default:
                synchronized (this.b) {
                    it2 = this.X.iterator();
                }
                return it2;
        }
    }
}
