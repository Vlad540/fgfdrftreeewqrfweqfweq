package defpackage;

import java.util.List;

/* renamed from: ba1  reason: default package */
public final class ba1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5[] b;

    public /* synthetic */ ba1(pj5[] pj5Arr, int i) {
        this.a = i;
        this.b = pj5Arr;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new tf3[this.b.length];
            case 1:
                return new List[this.b.length];
            case 2:
                return new Object[this.b.length];
            case 3:
                return new tf3[this.b.length];
            case 4:
                return new z4a[this.b.length];
            case 5:
                return new i22[this.b.length];
            default:
                return new kta[this.b.length];
        }
    }
}
