package defpackage;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: ar1  reason: default package */
public final /* synthetic */ class ar1 implements tn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr1 b;

    public /* synthetic */ ar1(lr1 lr1, int i) {
        this.a = i;
        this.b = lr1;
    }

    public String z(sn1 sn1) {
        int i = this.a;
        lr1 lr1 = this.b;
        lr1.getClass();
        switch (i) {
            case 0:
                try {
                    lr1.c.execute(new dr1(lr1, 1, sn1));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    sn1.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            default:
                try {
                    ArrayList arrayList = new ArrayList(lr1.a.s().b().c);
                    arrayList.add((ut1) lr1.M0.Y);
                    arrayList.add(new er1(lr1, sn1));
                    ku1 ku1 = lr1.b;
                    ku1.a.Z(lr1.x0.a, lr1.c, lp.j(arrayList));
                    return "configAndCloseTask";
                } catch (CameraAccessExceptionCompat | SecurityException e) {
                    e.getMessage();
                    lr1.toString();
                    sn1.d(e);
                    return "configAndCloseTask";
                }
        }
    }
}
