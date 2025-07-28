package defpackage;

/* renamed from: xa8  reason: default package */
public final class xa8 {
    public final Object a;
    public final int b;

    public xa8(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = 1;
        } else if (obj instanceof xb8) {
            this.b = 2;
        } else {
            this.b = 0;
        }
    }
}
