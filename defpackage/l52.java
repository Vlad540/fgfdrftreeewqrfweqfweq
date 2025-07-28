package defpackage;

/* renamed from: l52  reason: default package */
public final /* synthetic */ class l52 implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l52(aa5 aa5) {
        this.a = 3;
        this.c = aa5;
        this.b = 0;
    }

    public final void run() {
        long j = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                t52 t52 = (t52) obj;
                t52.e();
                t52.f0("localRemoveChat", new q50(t52, j, 3));
                xdc xdc = ((hz3) ((a04) t52.l.get())).b;
                xdc.getClass();
                xdc.a.m().p(new wdc(0, new nv2(xdc, j, 2)));
                to8 to8 = (to8) t52.s.get();
                to8.getClass();
                udd.q("to8", "deleteMessages %d, all!");
                ((hz3) to8.a).c.d().e(j);
                return;
            case 1:
                di3 di3 = (di3) obj;
                di3.c(j, new f00(((j2b) di3.h).a.m(), 13));
                return;
            case 2:
                ((gy9) ((w95) obj).a).g(5, j);
                return;
            default:
                ((gy9) ((aa5) obj).a).g(4, j);
                return;
        }
    }

    public /* synthetic */ l52(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
