package defpackage;

import androidx.appcompat.widget.Toolbar;

/* renamed from: ole  reason: default package */
public final /* synthetic */ class ole implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ ole(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                rle rle = this.b.e1;
                ul8 ul8 = rle == null ? null : rle.b;
                if (ul8 != null) {
                    ul8.collapseActionView();
                    return;
                }
                return;
            default:
                this.b.n();
                return;
        }
    }
}
