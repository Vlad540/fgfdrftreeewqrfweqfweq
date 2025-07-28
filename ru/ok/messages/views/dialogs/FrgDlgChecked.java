package ru.ok.messages.views.dialogs;

import androidx.fragment.app.a;
import androidx.fragment.app.b;

public abstract class FrgDlgChecked<T> extends FrgDlgBase {
    public final void m1(r5 r5Var) {
        this.F1 = false;
        b bVar = this.M0;
        if (bVar == null) {
            bVar = c0();
        }
        String str = "activity";
        if (bVar == null) {
            String name = getClass().getName();
            a aVar = this.M0;
            if (aVar != null) {
                str = "fragment";
            }
            throw new IllegalStateException(wn6.l(c3d.j("Class ", name, " should be call from ", str, ", but "), aVar != null ? "getParentFragment()" : "getActivity()", " is null"));
        } else if (!o1().isAssignableFrom(bVar.getClass())) {
            String name2 = getClass().getName();
            if (this.M0 != null) {
                str = "fragment";
            }
            String name3 = o1().getName();
            StringBuilder j = c3d.j("Class ", name2, " must be attach to ", str, " that implements ");
            j.append(name3);
            throw new IllegalStateException(j.toString());
        }
    }

    public abstract Class o1();
}
