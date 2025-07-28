package defpackage;

/* renamed from: pt1  reason: default package */
public final /* synthetic */ class pt1 implements t26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pt1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                ((st1) this.b).j((f4b) obj);
                return null;
            case 1:
                nl7 nl7 = (nl7) obj;
                nl7.j = (qjb) this.b;
                return nl7;
            case 2:
                Void voidR = (Void) obj;
                ((e3b) this.b).b(j3b.b);
                return null;
            default:
                return (e4b) ((u16) this.b).invoke(obj);
        }
    }
}
