package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: op6  reason: default package */
public final /* synthetic */ class op6 implements pw5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ op6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(lr6 lr6) {
        pw5 pw5;
        switch (this.a) {
            case 0:
                qp6 qp6 = (qp6) ((WeakReference) ((pp6) this.b).X).get();
                if (qp6 != null) {
                    qp6.C0.execute(new oc4(29, qp6));
                    return;
                }
                return;
            default:
                yic yic = (yic) this.b;
                synchronized (yic.a) {
                    try {
                        int i = yic.b - 1;
                        yic.b = i;
                        if (yic.c && i == 0) {
                            yic.close();
                        }
                        pw5 = yic.Y;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                if (pw5 != null) {
                    pw5.a(lr6);
                    return;
                }
                return;
        }
    }
}
