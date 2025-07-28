package defpackage;

import android.text.InputFilter;

/* renamed from: lda  reason: default package */
public final class lda extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ mda o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lda(mda mda, int i) {
        super(9, (Object) null);
        this.c = i;
        this.o = mda;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!hhd.f(obj, obj2)) {
                    Integer num = (Integer) obj2;
                    Integer num2 = (Integer) obj;
                    s59 s59 = km4.y0;
                    mda mda = this.o;
                    mda.onThemeChanged(s59.r(mda));
                    return;
                }
                return;
            case 1:
                if (!hhd.f(obj, obj2)) {
                    String str = (String) obj;
                    this.o.a.setHint((String) obj2);
                    return;
                }
                return;
            case 2:
                if (!hhd.f(obj, obj2)) {
                    InputFilter[] inputFilterArr = (InputFilter[]) obj;
                    this.o.a.setFilters((InputFilter[]) obj2);
                    return;
                }
                return;
            case 3:
                if (!hhd.f(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    s59 s592 = km4.y0;
                    mda mda2 = this.o;
                    mda2.onThemeChanged(s592.r(mda2));
                    return;
                }
                return;
            case 4:
                if (!hhd.f(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    s59 s593 = km4.y0;
                    mda mda3 = this.o;
                    mda3.onThemeChanged(s593.r(mda3));
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    kda kda = (kda) obj2;
                    kda kda2 = (kda) obj;
                    if (kda != null) {
                        s59 s594 = km4.y0;
                        mda mda4 = this.o;
                        mda4.e(s594.r(mda4), kda);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lda(Object obj, mda mda, int i) {
        super(9, obj);
        this.c = i;
        this.o = mda;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lda(mda mda) {
        super(9, (Object) "");
        this.c = 1;
        this.o = mda;
    }
}
