package defpackage;

/* renamed from: oq0  reason: default package */
public abstract class oq0 {
    public boolean canRepeat() {
        return true;
    }

    public dl intoParam(String str) {
        return intoParam(new mq0(str));
    }

    public boolean isSupplied() {
        return false;
    }

    public boolean shouldPost() {
        return false;
    }

    public boolean shouldSkipParam() {
        return false;
    }

    public abstract void write(t67 t67);

    public final dl intoParam(mq0 mq0) {
        return new nq0(mq0, this);
    }
}
