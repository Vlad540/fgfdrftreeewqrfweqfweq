package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: ui5  reason: default package */
public final class ui5 {
    public final /* synthetic */ int a;
    public final SparseBooleanArray b;
    public boolean c;

    public ui5(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SparseBooleanArray();
                return;
            default:
                this.b = new SparseBooleanArray();
                return;
        }
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                swb.h(!this.c);
                this.b.append(i, true);
                return;
            default:
                oyb.k(!this.c);
                this.b.append(i, true);
                return;
        }
    }

    public void b(wi5 wi5) {
        for (int i = 0; i < wi5.a.size(); i++) {
            a(wi5.b(i));
        }
    }

    public void c(int... iArr) {
        for (int a2 : iArr) {
            a(a2);
        }
    }

    public vi5 d() {
        swb.h(!this.c);
        this.c = true;
        return new vi5(this.b);
    }

    public wi5 e() {
        oyb.k(!this.c);
        this.c = true;
        return new wi5(this.b);
    }
}
