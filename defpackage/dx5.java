package defpackage;

import android.view.View;
import androidx.fragment.app.a;

/* renamed from: dx5  reason: default package */
public final class dx5 extends ek8 {
    public final /* synthetic */ a A0;

    public dx5(a aVar) {
        this.A0 = aVar;
    }

    public final View O(int i) {
        a aVar = this.A0;
        View view = aVar.Y0;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException(me4.h("Fragment ", aVar, " does not have a view"));
    }

    public final boolean P() {
        return this.A0.Y0 != null;
    }
}
