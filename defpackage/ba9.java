package defpackage;

import one.me.messages.list.loader.MessageModel;

/* renamed from: ba9  reason: default package */
public final /* synthetic */ class ba9 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ da9 b;

    public /* synthetic */ ba9(da9 da9, int i) {
        this.a = i;
        this.b = da9;
    }

    public final Object invoke(Object obj) {
        MessageModel K;
        int i = this.a;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                da9 da9 = this.b;
                uw8 uw8 = da9.b;
                boolean z = false;
                if (uw8.j() > intValue && intValue >= 0 && (K = uw8.K(intValue)) != null) {
                    z = ((r99) da9.c.g.a.getValue()).a.contains(Long.valueOf(K.a));
                }
                return Boolean.valueOf(z);
            case 1:
                MessageModel K2 = this.b.b.K(intValue);
                boolean z2 = false;
                if (K2 != null && K2.G0 && K2.C0 == null) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                MessageModel K3 = this.b.b.K(intValue);
                boolean z3 = false;
                if (K3 != null) {
                    z3 = !ht8.a(K3.L0, 0);
                }
                return Boolean.valueOf(z3);
        }
    }
}
