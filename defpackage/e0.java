package defpackage;

/* renamed from: e0  reason: default package */
public abstract class e0 implements fu3 {
    private final gu3 key;

    public e0(gu3 gu3) {
        this.key = gu3;
    }

    public <R> R fold(R r, i26 i26) {
        return i26.invoke(r, this);
    }

    public fu3 get(gu3 gu3) {
        return urd.r(this, gu3);
    }

    public gu3 getKey() {
        return this.key;
    }

    public hu3 minusKey(gu3 gu3) {
        return urd.z(this, gu3);
    }

    public hu3 plus(hu3 hu3) {
        return hhd.I(this, hu3);
    }
}
