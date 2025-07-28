package defpackage;

import java.io.File;

/* renamed from: de5  reason: default package */
public final /* synthetic */ class de5 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ le5 b;

    public /* synthetic */ de5(le5 le5, int i) {
        this.a = i;
        this.b = le5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                File file = new File(le5.d((String) this.b.g.getValue(), false));
                xie.k(file);
                return file;
            default:
                return new File(le5.d((String) this.b.g.getValue(), true));
        }
    }
}
