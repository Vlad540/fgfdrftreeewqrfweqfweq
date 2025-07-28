package defpackage;

import com.google.android.gms.tasks.Task;

/* renamed from: va6  reason: default package */
public final /* synthetic */ class va6 implements hx9, kx9 {
    public final /* synthetic */ om7 a;

    public /* synthetic */ va6(om7 om7) {
        this.a = om7;
    }

    public void l(Task task) {
        boolean h = task.h();
        om7 om7 = this.a;
        if (h) {
            om7.j();
        } else {
            om7.k((Exception) null);
        }
    }

    public void onFailure(Exception exc) {
        this.a.k(exc);
    }
}
