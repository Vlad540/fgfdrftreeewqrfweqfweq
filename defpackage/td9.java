package defpackage;

/* renamed from: td9  reason: default package */
public final /* synthetic */ class td9 implements t26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vd9 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ td9(vd9 vd9, Object obj, int i) {
        this.a = i;
        this.b = vd9;
        this.c = obj;
    }

    public final Object apply(Object obj) {
        nl7 nl7 = (nl7) obj;
        switch (this.a) {
            case 0:
                vd9 vd9 = this.b;
                vd9.getClass();
                ud9 ud9 = (ud9) this.c;
                nl7.j = ud9.b.a;
                nl7.a = true;
                nl7.b = true;
                nl7.a();
                nl7.c = false;
                nl7.p = vd9.x0.d;
                nl7.q = ud9.e;
                return nl7;
            default:
                vd9 vd92 = this.b;
                vd92.getClass();
                nl7.a = false;
                nl7.b = true;
                nl7.c = false;
                nl7.j = (qjb) this.c;
                nl7.a();
                nl7.p = vd92.x0.d;
                return nl7;
        }
    }
}
