package defpackage;

/* renamed from: s54  reason: default package */
public abstract class s54 extends zg0 {
    public final void finalize() {
        if (!isClosed()) {
            m75.m("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }
}
