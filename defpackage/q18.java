package defpackage;

/* renamed from: q18  reason: default package */
public final class q18 extends p18 {
    public final /* synthetic */ wd8 g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q18(wd8 wd8) {
        super(wd8);
        this.g = wd8;
    }

    public final pd8 K() {
        wd8 wd8 = this.g;
        l18 l18 = wd8.Y;
        if (l18 == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        } else if (l18 != wd8.c) {
            return l18.d;
        } else {
            o18 o18 = (o18) this.b;
            o18.getClass();
            return new pd8(o18.getCurrentBrowserInfo());
        }
    }
}
