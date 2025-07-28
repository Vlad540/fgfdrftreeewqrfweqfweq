package defpackage;

/* renamed from: e55  reason: default package */
public final class e55 {
    public final uoe a;
    public final int[] b;

    public e55(uoe uoe, int[] iArr) {
        if (iArr.length == 0) {
            ez3.B("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = uoe;
        this.b = iArr;
    }
}
