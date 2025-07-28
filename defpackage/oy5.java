package defpackage;

/* renamed from: oy5  reason: default package */
public final /* synthetic */ class oy5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ py5 b;

    public /* synthetic */ oy5(py5 py5, int i) {
        this.a = i;
        this.b = py5;
    }

    public final void run() {
        int i = this.a;
        py5 py5 = this.b;
        switch (i) {
            case 0:
                py5.x0 = false;
                if (py5.Y != null) {
                    py5.Y.stopCapture();
                }
                py5.y0 = false;
                return;
            default:
                py5.x0 = false;
                if (py5.Y != null) {
                    py5.Y.stopCapture();
                }
                py5.Y = null;
                py5.y0 = false;
                if (py5.X != null) {
                    py5.X.dispose();
                }
                py5.X = null;
                return;
        }
    }
}
