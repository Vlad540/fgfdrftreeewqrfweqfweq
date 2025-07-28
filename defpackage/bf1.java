package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: bf1  reason: default package */
public final class bf1 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ cf1 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bf1(cf1 cf1, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                ze1 ze1 = ze1.a;
                this.o = cf1;
                super(9, ze1);
                return;
            default:
                this.o = cf1;
                return;
        }
    }

    public final void L1(Object obj, Object obj2) {
        cqc cqc;
        switch (this.c) {
            case 0:
                pda pda = (pda) obj2;
                if (!hhd.f((pda) obj, pda)) {
                    this.o.getFakePipView().setCustomTheme(pda);
                    return;
                }
                return;
            case 1:
                ze1 ze1 = (ze1) obj2;
                if (((ze1) obj) != ze1) {
                    int ordinal = ze1.ordinal();
                    cf1 cf1 = this.o;
                    if (ordinal == 0) {
                        cqc = pwa.a;
                    } else if (ordinal == 1) {
                        cqc = new owa(cf1, new mv4(5, cf1), cf1.getPipPositionMediator());
                    } else if (ordinal == 2) {
                        cqc = new awa(cf1, new ea6(5, cf1), cf1.getPipPositionMediator());
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    cf1.o = cqc;
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    ewa ewa = (ewa) obj2;
                    ewa ewa2 = (ewa) obj;
                    cf1 cf12 = this.o;
                    cf12.c(cf12.getLeft(), cf12.getTop(), cf12.getRight(), cf12.getBottom());
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bf1(ewa ewa, cf1 cf1) {
        super(9, ewa);
        this.c = 2;
        this.o = cf1;
    }
}
