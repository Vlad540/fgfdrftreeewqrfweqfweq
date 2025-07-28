package defpackage;

import android.location.Location;
import com.google.android.gms.tasks.Task;

/* renamed from: sa6  reason: default package */
public final /* synthetic */ class sa6 implements hx9, kx9 {
    public final /* synthetic */ za6 a;

    public /* synthetic */ sa6(za6 za6) {
        this.a = za6;
    }

    public void l(Task task) {
        boolean h = task.h();
        za6 za6 = this.a;
        if (!h || task.f() == null) {
            ((km7) za6.a).U0();
            return;
        }
        Location location = (Location) task.f();
        ((km7) za6.a).p1(new dm7(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy(), location.getBearing(), location.getSpeed()));
    }

    public void onFailure(Exception exc) {
        ((km7) this.a.a).U0();
    }
}
