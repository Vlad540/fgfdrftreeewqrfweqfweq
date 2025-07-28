package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: j84  reason: default package */
public final class j84 extends uw5 {
    public final /* synthetic */ int B0;
    public final Map C0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j84(int i, Map map) {
        super(10);
        this.B0 = i;
        this.C0 = map;
    }

    public final Map Z() {
        switch (this.B0) {
            case 0:
                return this.C0;
            default:
                return this.C0;
        }
    }

    public final boolean containsKey(Object obj) {
        switch (this.B0) {
            case 0:
                return obj != null && super.containsKey(obj);
            default:
                return obj != null && super.containsKey(obj);
        }
    }

    public final Set entrySet() {
        switch (this.B0) {
            case 0:
                return gp0.j(super.entrySet(), new i84(2));
            default:
                return gp0.j(super.entrySet(), new i84(1));
        }
    }

    public final boolean equals(Object obj) {
        switch (this.B0) {
            case 0:
                return obj != null && ct0.j(this, obj);
            default:
                return obj != null && ct0.j(this, obj);
        }
    }

    public final Object get(Object obj) {
        switch (this.B0) {
            case 0:
                if (obj == null) {
                    return null;
                }
                return (List) super.get(obj);
            default:
                if (obj == null) {
                    return null;
                }
                return (List) super.get(obj);
        }
    }

    public final int hashCode() {
        switch (this.B0) {
            case 0:
                return gp0.v(entrySet());
            default:
                return gp0.v(entrySet());
        }
    }

    public final boolean isEmpty() {
        switch (this.B0) {
            case 0:
                if (!super.isEmpty()) {
                    return super.size() == 1 && super.containsKey((Object) null);
                }
                return true;
            default:
                if (!super.isEmpty()) {
                    return super.size() == 1 && super.containsKey((Object) null);
                }
                return true;
        }
    }

    public final Set keySet() {
        switch (this.B0) {
            case 0:
                return gp0.j(super.keySet(), new i84(0));
            default:
                return gp0.j(super.keySet(), new i84(3));
        }
    }

    public final Object n() {
        switch (this.B0) {
            case 0:
                return this.C0;
            default:
                return this.C0;
        }
    }

    public final int size() {
        switch (this.B0) {
            case 0:
                return super.size() - (super.containsKey((Object) null) ? 1 : 0);
            default:
                return super.size() - (super.containsKey((Object) null) ? 1 : 0);
        }
    }
}
