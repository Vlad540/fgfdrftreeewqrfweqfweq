package defpackage;

import java.util.Iterator;

/* renamed from: rue  reason: default package */
public abstract class rue implements Iterator {
    public final /* synthetic */ int a;

    public /* synthetic */ rue(int i) {
        this.a = i;
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
