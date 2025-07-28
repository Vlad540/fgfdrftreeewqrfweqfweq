package defpackage;

import android.text.style.StyleSpan;

/* renamed from: so0  reason: default package */
public final class so0 extends StyleSpan implements uu7 {
    public final /* synthetic */ int a;
    public final int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public so0(int i) {
        super(1);
        this.a = i;
        switch (i) {
            case 1:
                super(2);
                this.b = 3;
                return;
            default:
                this.b = 2;
                return;
        }
    }

    public final qt3 copy() {
        switch (this.a) {
            case 0:
                return new so0(0);
            default:
                return new so0(1);
        }
    }

    public final int getType() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }
}
