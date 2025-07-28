package defpackage;

/* renamed from: x53  reason: default package */
public final class x53 extends z53 {
    public final /* synthetic */ int X;
    public final /* synthetic */ b63 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x53(b63 b63, int i) {
        super(b63);
        this.X = i;
        this.Y = b63;
    }

    public final Object a(int i) {
        switch (this.X) {
            case 0:
                return this.Y.i()[i];
            case 1:
                return new a63(this.Y, i);
            default:
                return this.Y.j()[i];
        }
    }
}
